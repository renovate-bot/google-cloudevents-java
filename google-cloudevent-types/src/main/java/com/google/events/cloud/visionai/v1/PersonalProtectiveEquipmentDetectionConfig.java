/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Message describing PersonalProtectiveEquipmentDetectionConfig.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig}
 */
public final class PersonalProtectiveEquipmentDetectionConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig)
    PersonalProtectiveEquipmentDetectionConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PersonalProtectiveEquipmentDetectionConfig.newBuilder() to construct.
  private PersonalProtectiveEquipmentDetectionConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PersonalProtectiveEquipmentDetectionConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PersonalProtectiveEquipmentDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_PersonalProtectiveEquipmentDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_PersonalProtectiveEquipmentDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig.class,
            com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig.Builder
                .class);
  }

  public static final int ENABLE_FACE_COVERAGE_DETECTION_FIELD_NUMBER = 1;
  private boolean enableFaceCoverageDetection_ = false;

  /**
   *
   *
   * <pre>
   * Whether to enable face coverage detection.
   * </pre>
   *
   * <code>bool enable_face_coverage_detection = 1;</code>
   *
   * @return The enableFaceCoverageDetection.
   */
  @java.lang.Override
  public boolean getEnableFaceCoverageDetection() {
    return enableFaceCoverageDetection_;
  }

  public static final int ENABLE_HEAD_COVERAGE_DETECTION_FIELD_NUMBER = 2;
  private boolean enableHeadCoverageDetection_ = false;

  /**
   *
   *
   * <pre>
   * Whether to enable head coverage detection.
   * </pre>
   *
   * <code>bool enable_head_coverage_detection = 2;</code>
   *
   * @return The enableHeadCoverageDetection.
   */
  @java.lang.Override
  public boolean getEnableHeadCoverageDetection() {
    return enableHeadCoverageDetection_;
  }

  public static final int ENABLE_HANDS_COVERAGE_DETECTION_FIELD_NUMBER = 3;
  private boolean enableHandsCoverageDetection_ = false;

  /**
   *
   *
   * <pre>
   * Whether to enable hands coverage detection.
   * </pre>
   *
   * <code>bool enable_hands_coverage_detection = 3;</code>
   *
   * @return The enableHandsCoverageDetection.
   */
  @java.lang.Override
  public boolean getEnableHandsCoverageDetection() {
    return enableHandsCoverageDetection_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (enableFaceCoverageDetection_ != false) {
      output.writeBool(1, enableFaceCoverageDetection_);
    }
    if (enableHeadCoverageDetection_ != false) {
      output.writeBool(2, enableHeadCoverageDetection_);
    }
    if (enableHandsCoverageDetection_ != false) {
      output.writeBool(3, enableHandsCoverageDetection_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableFaceCoverageDetection_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableFaceCoverageDetection_);
    }
    if (enableHeadCoverageDetection_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(2, enableHeadCoverageDetection_);
    }
    if (enableHandsCoverageDetection_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(3, enableHandsCoverageDetection_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof
        com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig other =
        (com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig) obj;

    if (getEnableFaceCoverageDetection() != other.getEnableFaceCoverageDetection()) return false;
    if (getEnableHeadCoverageDetection() != other.getEnableHeadCoverageDetection()) return false;
    if (getEnableHandsCoverageDetection() != other.getEnableHandsCoverageDetection()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENABLE_FACE_COVERAGE_DETECTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableFaceCoverageDetection());
    hash = (37 * hash) + ENABLE_HEAD_COVERAGE_DETECTION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableHeadCoverageDetection());
    hash = (37 * hash) + ENABLE_HANDS_COVERAGE_DETECTION_FIELD_NUMBER;
    hash =
        (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableHandsCoverageDetection());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Message describing PersonalProtectiveEquipmentDetectionConfig.
   * </pre>
   *
   * Protobuf type {@code
   * google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig)
      com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonalProtectiveEquipmentDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonalProtectiveEquipmentDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig.class,
              com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableFaceCoverageDetection_ = false;
      enableHeadCoverageDetection_ = false;
      enableHandsCoverageDetection_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_PersonalProtectiveEquipmentDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
        getDefaultInstanceForType() {
      return com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig build() {
      com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
        buildPartial() {
      com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig result =
          new com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableFaceCoverageDetection_ = enableFaceCoverageDetection_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableHeadCoverageDetection_ = enableHeadCoverageDetection_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enableHandsCoverageDetection_ = enableHandsCoverageDetection_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other
          instanceof
          com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig) {
        return mergeFrom(
            (com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig other) {
      if (other
          == com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
              .getDefaultInstance()) return this;
      if (other.getEnableFaceCoverageDetection() != false) {
        setEnableFaceCoverageDetection(other.getEnableFaceCoverageDetection());
      }
      if (other.getEnableHeadCoverageDetection() != false) {
        setEnableHeadCoverageDetection(other.getEnableHeadCoverageDetection());
      }
      if (other.getEnableHandsCoverageDetection() != false) {
        setEnableHandsCoverageDetection(other.getEnableHandsCoverageDetection());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                enableFaceCoverageDetection_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                enableHeadCoverageDetection_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                enableHandsCoverageDetection_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private boolean enableFaceCoverageDetection_;

    /**
     *
     *
     * <pre>
     * Whether to enable face coverage detection.
     * </pre>
     *
     * <code>bool enable_face_coverage_detection = 1;</code>
     *
     * @return The enableFaceCoverageDetection.
     */
    @java.lang.Override
    public boolean getEnableFaceCoverageDetection() {
      return enableFaceCoverageDetection_;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable face coverage detection.
     * </pre>
     *
     * <code>bool enable_face_coverage_detection = 1;</code>
     *
     * @param value The enableFaceCoverageDetection to set.
     * @return This builder for chaining.
     */
    public Builder setEnableFaceCoverageDetection(boolean value) {

      enableFaceCoverageDetection_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable face coverage detection.
     * </pre>
     *
     * <code>bool enable_face_coverage_detection = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableFaceCoverageDetection() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableFaceCoverageDetection_ = false;
      onChanged();
      return this;
    }

    private boolean enableHeadCoverageDetection_;

    /**
     *
     *
     * <pre>
     * Whether to enable head coverage detection.
     * </pre>
     *
     * <code>bool enable_head_coverage_detection = 2;</code>
     *
     * @return The enableHeadCoverageDetection.
     */
    @java.lang.Override
    public boolean getEnableHeadCoverageDetection() {
      return enableHeadCoverageDetection_;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable head coverage detection.
     * </pre>
     *
     * <code>bool enable_head_coverage_detection = 2;</code>
     *
     * @param value The enableHeadCoverageDetection to set.
     * @return This builder for chaining.
     */
    public Builder setEnableHeadCoverageDetection(boolean value) {

      enableHeadCoverageDetection_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable head coverage detection.
     * </pre>
     *
     * <code>bool enable_head_coverage_detection = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableHeadCoverageDetection() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableHeadCoverageDetection_ = false;
      onChanged();
      return this;
    }

    private boolean enableHandsCoverageDetection_;

    /**
     *
     *
     * <pre>
     * Whether to enable hands coverage detection.
     * </pre>
     *
     * <code>bool enable_hands_coverage_detection = 3;</code>
     *
     * @return The enableHandsCoverageDetection.
     */
    @java.lang.Override
    public boolean getEnableHandsCoverageDetection() {
      return enableHandsCoverageDetection_;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable hands coverage detection.
     * </pre>
     *
     * <code>bool enable_hands_coverage_detection = 3;</code>
     *
     * @param value The enableHandsCoverageDetection to set.
     * @return This builder for chaining.
     */
    public Builder setEnableHandsCoverageDetection(boolean value) {

      enableHandsCoverageDetection_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether to enable hands coverage detection.
     * </pre>
     *
     * <code>bool enable_hands_coverage_detection = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableHandsCoverageDetection() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enableHandsCoverageDetection_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig)
  private static final com.google.events.cloud.visionai.v1
          .PersonalProtectiveEquipmentDetectionConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig();
  }

  public static com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonalProtectiveEquipmentDetectionConfig>
      PARSER =
          new com.google.protobuf.AbstractParser<PersonalProtectiveEquipmentDetectionConfig>() {
            @java.lang.Override
            public PersonalProtectiveEquipmentDetectionConfig parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<PersonalProtectiveEquipmentDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonalProtectiveEquipmentDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
