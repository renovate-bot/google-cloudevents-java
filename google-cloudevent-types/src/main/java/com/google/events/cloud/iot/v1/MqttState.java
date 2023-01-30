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

/**
 *
 *
 * <pre>
 * Indicates whether an MQTT connection is enabled or disabled. See the field
 * description for details.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.iot.v1.MqttState}
 */
public enum MqttState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No MQTT state specified. If not specified, MQTT will be enabled by default.
   * </pre>
   *
   * <code>MQTT_STATE_UNSPECIFIED = 0;</code>
   */
  MQTT_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Enables a MQTT connection.
   * </pre>
   *
   * <code>MQTT_ENABLED = 1;</code>
   */
  MQTT_ENABLED(1),
  /**
   *
   *
   * <pre>
   * Disables a MQTT connection.
   * </pre>
   *
   * <code>MQTT_DISABLED = 2;</code>
   */
  MQTT_DISABLED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No MQTT state specified. If not specified, MQTT will be enabled by default.
   * </pre>
   *
   * <code>MQTT_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int MQTT_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Enables a MQTT connection.
   * </pre>
   *
   * <code>MQTT_ENABLED = 1;</code>
   */
  public static final int MQTT_ENABLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Disables a MQTT connection.
   * </pre>
   *
   * <code>MQTT_DISABLED = 2;</code>
   */
  public static final int MQTT_DISABLED_VALUE = 2;

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
  public static MqttState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MqttState forNumber(int value) {
    switch (value) {
      case 0:
        return MQTT_STATE_UNSPECIFIED;
      case 1:
        return MQTT_ENABLED;
      case 2:
        return MQTT_DISABLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MqttState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<MqttState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<MqttState>() {
        public MqttState findValueByNumber(int number) {
          return MqttState.forNumber(number);
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
    return com.google.events.cloud.iot.v1.Data.getDescriptor().getEnumTypes().get(0);
  }

  private static final MqttState[] VALUES = values();

  public static MqttState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MqttState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.iot.v1.MqttState)
}
