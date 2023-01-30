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
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

public interface ExportBundleInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.analytics.v1.ExportBundleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Monotonically increasing index for each bundle set by SDK.
   * </pre>
   *
   * <code>int32 bundle_sequence_id = 1;</code>
   *
   * @return The bundleSequenceId.
   */
  int getBundleSequenceId();

  /**
   *
   *
   * <pre>
   * Timestamp offset between collection time and upload time.
   * </pre>
   *
   * <code>int64 server_timestamp_offset_micros = 2;</code>
   *
   * @return The serverTimestampOffsetMicros.
   */
  long getServerTimestampOffsetMicros();
}
