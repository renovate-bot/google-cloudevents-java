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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Enum describing all possible types of a stream annotation.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.visionai.v1.StreamAnnotationType}
 */
public enum StreamAnnotationType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Type UNSPECIFIED.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_UNSPECIFIED = 0;</code>
   */
  STREAM_ANNOTATION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * active_zone annotation defines a polygon on top of the content from an
   * image/video based stream, following processing will only focus on the
   * content inside the active zone.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_ACTIVE_ZONE = 1;</code>
   */
  STREAM_ANNOTATION_TYPE_ACTIVE_ZONE(1),
  /**
   *
   *
   * <pre>
   * crossing_line annotation defines a polyline on top of the content from an
   * image/video based Vision AI stream, events happening across the line will
   * be captured. For example, the counts of people who goes acroos the line
   * in Occupancy Analytic Processor.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_CROSSING_LINE = 2;</code>
   */
  STREAM_ANNOTATION_TYPE_CROSSING_LINE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Type UNSPECIFIED.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int STREAM_ANNOTATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * active_zone annotation defines a polygon on top of the content from an
   * image/video based stream, following processing will only focus on the
   * content inside the active zone.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_ACTIVE_ZONE = 1;</code>
   */
  public static final int STREAM_ANNOTATION_TYPE_ACTIVE_ZONE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * crossing_line annotation defines a polyline on top of the content from an
   * image/video based Vision AI stream, events happening across the line will
   * be captured. For example, the counts of people who goes acroos the line
   * in Occupancy Analytic Processor.
   * </pre>
   *
   * <code>STREAM_ANNOTATION_TYPE_CROSSING_LINE = 2;</code>
   */
  public static final int STREAM_ANNOTATION_TYPE_CROSSING_LINE_VALUE = 2;

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
  public static StreamAnnotationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StreamAnnotationType forNumber(int value) {
    switch (value) {
      case 0:
        return STREAM_ANNOTATION_TYPE_UNSPECIFIED;
      case 1:
        return STREAM_ANNOTATION_TYPE_ACTIVE_ZONE;
      case 2:
        return STREAM_ANNOTATION_TYPE_CROSSING_LINE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StreamAnnotationType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<StreamAnnotationType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<StreamAnnotationType>() {
            public StreamAnnotationType findValueByNumber(int number) {
              return StreamAnnotationType.forNumber(number);
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
    return com.google.events.cloud.visionai.v1.Data.getDescriptor().getEnumTypes().get(0);
  }

  private static final StreamAnnotationType[] VALUES = values();

  public static StreamAnnotationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StreamAnnotationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.visionai.v1.StreamAnnotationType)
}