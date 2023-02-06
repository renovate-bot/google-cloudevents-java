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
// source: google/events/firebase/database/v1/data.proto

package com.google.events.firebase.database.v1;

public interface ReferenceEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.database.v1.ReferenceEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The original data for the reference.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 1;</code>
   *
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   *
   *
   * <pre>
   * The original data for the reference.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 1;</code>
   *
   * @return The data.
   */
  com.google.protobuf.Value getData();
  /**
   *
   *
   * <pre>
   * The original data for the reference.
   * </pre>
   *
   * <code>.google.protobuf.Value data = 1;</code>
   */
  com.google.protobuf.ValueOrBuilder getDataOrBuilder();

  /**
   *
   *
   * <pre>
   * The change in the reference data.
   * </pre>
   *
   * <code>.google.protobuf.Value delta = 2;</code>
   *
   * @return Whether the delta field is set.
   */
  boolean hasDelta();
  /**
   *
   *
   * <pre>
   * The change in the reference data.
   * </pre>
   *
   * <code>.google.protobuf.Value delta = 2;</code>
   *
   * @return The delta.
   */
  com.google.protobuf.Value getDelta();
  /**
   *
   *
   * <pre>
   * The change in the reference data.
   * </pre>
   *
   * <code>.google.protobuf.Value delta = 2;</code>
   */
  com.google.protobuf.ValueOrBuilder getDeltaOrBuilder();
}