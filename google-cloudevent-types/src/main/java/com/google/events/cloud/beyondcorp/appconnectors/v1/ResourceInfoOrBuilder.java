/*
 * Copyright 2023 Google LLC
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
// source: google/events/cloud/beyondcorp/appconnectors/v1/data.proto

package com.google.events.cloud.beyondcorp.appconnectors.v1;

public interface ResourceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique Id for the resource.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. Unique Id for the resource.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Overall health status. Overall status is derived based on the status of
   * each sub level resources.
   * </pre>
   *
   * <code>.google.events.cloud.beyondcorp.appconnectors.v1.HealthStatus status = 2;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Overall health status. Overall status is derived based on the status of
   * each sub level resources.
   * </pre>
   *
   * <code>.google.events.cloud.beyondcorp.appconnectors.v1.HealthStatus status = 2;</code>
   *
   * @return The status.
   */
  com.google.events.cloud.beyondcorp.appconnectors.v1.HealthStatus getStatus();

  /**
   *
   *
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   *
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   *
   *
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   *
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   *
   *
   * <pre>
   * The timestamp to collect the info. It is suggested to be set by
   * the topmost level resource only.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  java.util.List<com.google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo> getSubList();
  /**
   *
   *
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  com.google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo getSub(int index);
  /**
   *
   *
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  int getSubCount();
  /**
   *
   *
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  java.util.List<
          ? extends com.google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfoOrBuilder>
      getSubOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of Info for the sub level resources.
   * </pre>
   *
   * <code>repeated .google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfo sub = 5;</code>
   */
  com.google.events.cloud.beyondcorp.appconnectors.v1.ResourceInfoOrBuilder getSubOrBuilder(
      int index);
}
