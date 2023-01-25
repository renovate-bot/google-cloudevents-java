#!/usr/bin/env bash

# Copyright 2023 Google LLC.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Build the Java library from Protobuf source:
# https://github.com/googleapis/google-cloudevents

set -e # Must be set for script to fail

if [[ -z "${DATA_SOURCE_PATH}" ]]
then
  echo "Use \$DATA_SOURCE_PATH to set the location of the google-cloudevents repo."
  exit 1
fi

# Set Data Source Path ($DATA_SOURCE_PATH should be set to google-cloudevents repo)
PROTOBUF_SRC="${DATA_SOURCE_PATH}/proto"
THIRDPARTY="${DATA_SOURCE_PATH}/third_party/googleapis"

# Set Library Path
LIBRARY_SRC="google-cloudevent-types"
PROTOC_OUT="${LIBRARY_SRC}/src/main/java/"
TEST_GEN_OUT="${LIBRARY_SRC}/src/test/java/"

# Set protoc Path
PROTOC_PATH="${PROTOC_PATH:-protoc}"

# Clean up previously generated files
rm -rf $PROTOC_OUT
mkdir -p $PROTOC_OUT
rm -rf $TEST_GEN_OUT
mkdir -p $TEST_GEN_OUT

# Ensure clean source for local builds
BUILD_LOCALLY="${BUILD_LOCALLY:-false}"
if [[ "$BUILD_LOCALLY" == "true" ]]; then
    MACOS='.bak'
    current=$(pwd)
    cd $DATA_SOURCE_PATH
    git restore --staged $PROTOBUF_SRC $THIRDPARTY
    git restore $PROTOBUF_SRC $THIRDPARTY
    git clean -f
    cd $current
fi 

# Assemble protoc plugin to generate tests
mvn clean package assembly:single -f protoc-gen-java-snowpea/

# Setup monitored resource proto with Java options
MonitoredResourceProto=$(find $THIRDPARTY -name "monitored_resource.proto")
echo -en "\noption java_multiple_files = true;" >> $MonitoredResourceProto
echo -en "\noption java_outer_classname = \"MonitoredResourceProto\";" >> $MonitoredResourceProto
echo -en "\noption java_package = \"com.google.api\";" >> $MonitoredResourceProto

_generate() {
    proto_src=$1
    echo
    echo "########################################################"
    echo "# Generating from $proto_src"

    # Comment out preset Java options
    sed -i $MACOS 's/option java/\/\/option java/' $proto_src
    # Set Java option: multiple files
    echo -en "\noption java_multiple_files = true;" >> $proto_src
    # Set Java option: package name
    awk '/^package/,/;/' $proto_src > PROTO_PACKAGE; # Ex. package google.events.cloud.pubsub.v1; => google.events.cloud.pubsub.v1
    sed -i $MACOS 's/package /option java_package = \"com./' PROTO_PACKAGE
    sed -i $MACOS 's/;/"/'  PROTO_PACKAGE
    echo -en "\n$(cat PROTO_PACKAGE);" >> $proto_src

    echo "# - proto bindings"
    $PROTOC_PATH \
        -I=$PROTOBUF_SRC \
        -I=$THIRDPARTY \
        --java_out=$PROTOC_OUT \
        $proto_src

    echo "# - validation tests"
    # Note: --java-snowpea_opt is a list tests to skip due to imcompatibility 
    $PROTOC_PATH \
        --plugin=protoc-gen-java-snowpea=protoc-gen-java-snowpea/startup-script.sh \
        --java-snowpea_out $TEST_GEN_OUT \
        --java-snowpea_opt "MessagePublishedData,LogEntryData#strict" \
        -I $PROTOBUF_SRC \
        -I $THIRDPARTY \
        --experimental_allow_proto3_optional \
        $proto_src
}

for i in $(find "${PROTOBUF_SRC}" -type f -name data.proto); do
  _generate $i
done

YEAR=$(date +'%Y')
LICENSE="/\*\n \* Copyright $YEAR Google LLC\n \*\n \* Licensed under the Apache License, Version 2.0 (the \"License\");\n \* you may not use this file except in compliance with the License.\n \* You may obtain a copy of the License at\n \*\n \*      https://www.apache.org/licenses/LICENSE-2.0\n \*\n \* Unless required by applicable law or agreed to in writing, software\n \* distributed under the License is distributed on an \"AS IS\" BASIS,\n \* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n \* See the License for the specific language governing permissions and\n \* limitations under the License.\n \*/"
FILE_HEAD="// Generated by the protocol buffer compiler."

for i in $(find "${PROTOC_OUT}" -type f -name "*.java"); do
  echo
  echo "########################################################"
  echo "# Generating license header $i"
  sed -i $MACOS "s|$FILE_HEAD|$LICENSE\n$FILE_HEAD|" $i
done

echo
echo "########################################################"
echo "# Formatting generated code files..."
mvn com.coveo:fmt-maven-plugin:format -f google-cloudevent-types

echo
echo "########################################################"
echo "# Running library tests..."
mvn verify

# echo
# echo "########################################################"
# echo "# Running sample tests..."
# mvn install -DskipTests
# mvn verify -f samples/gcf
# mvn verify -f samples/springboot
# mvn verify -f samples/springboot-proto
