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
// source: google/events/cloud/certificatemanager/v1/data.proto

package com.google.events.cloud.certificatemanager.v1;

/**
 *
 *
 * <pre>
 * Defines set of serving states associated with a resource.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.certificatemanager.v1.ServingState}
 */
public enum ServingState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The status is undefined.
   * </pre>
   *
   * <code>SERVING_STATE_UNSPECIFIED = 0;</code>
   */
  SERVING_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The configuration is serving.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   *
   *
   * <pre>
   * Update is in progress. Some frontends may serve this configuration.
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  PENDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The status is undefined.
   * </pre>
   *
   * <code>SERVING_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int SERVING_STATE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The configuration is serving.
   * </pre>
   *
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Update is in progress. Some frontends may serve this configuration.
   * </pre>
   *
   * <code>PENDING = 2;</code>
   */
  public static final int PENDING_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ServingState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServingState forNumber(int value) {
    switch (value) {
      case 0:
        return SERVING_STATE_UNSPECIFIED;
      case 1:
        return ACTIVE;
      case 2:
        return PENDING;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServingState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ServingState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ServingState>() {
        public ServingState findValueByNumber(int number) {
          return ServingState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.events.cloud.certificatemanager.v1.Data.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServingState[] VALUES = values();

  public static ServingState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServingState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.certificatemanager.v1.ServingState)
}
