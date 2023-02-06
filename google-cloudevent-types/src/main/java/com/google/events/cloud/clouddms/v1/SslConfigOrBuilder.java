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
// source: google/events/cloud/clouddms/v1/data.proto

package com.google.events.cloud.clouddms.v1;

public interface SslConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.clouddms.v1.SslConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The ssl config type according to 'client_key',
   * 'client_certificate' and 'ca_certificate'.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.SslConfig.SslType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The ssl config type according to 'client_key',
   * 'client_certificate' and 'ca_certificate'.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.SslConfig.SslType type = 1;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.clouddms.v1.SslConfig.SslType getType();
}
