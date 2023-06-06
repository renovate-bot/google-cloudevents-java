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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface MembershipFeatureStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.MembershipFeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.gkehub.v1.FeatureState getState();
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.FeatureState state = 1;</code>
   */
  com.google.events.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder();
}