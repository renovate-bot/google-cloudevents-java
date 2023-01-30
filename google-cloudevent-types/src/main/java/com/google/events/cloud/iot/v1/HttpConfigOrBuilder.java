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
// source: google/events/cloud/iot/v1/data.proto

package com.google.events.cloud.iot.v1;

public interface HttpConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.iot.v1.HttpConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If enabled, allows devices to use DeviceService via the HTTP protocol.
   * Otherwise, any requests to DeviceService will fail for this registry.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.HttpState http_enabled_state = 1;</code>
   *
   * @return The enum numeric value on the wire for httpEnabledState.
   */
  int getHttpEnabledStateValue();
  /**
   *
   *
   * <pre>
   * If enabled, allows devices to use DeviceService via the HTTP protocol.
   * Otherwise, any requests to DeviceService will fail for this registry.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.HttpState http_enabled_state = 1;</code>
   *
   * @return The httpEnabledState.
   */
  com.google.events.cloud.iot.v1.HttpState getHttpEnabledState();
}
