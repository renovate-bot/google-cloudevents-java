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

/**
 *
 *
 * <pre>
 * Value for Event Params and UserProperty can be of type string or int or
 * float or double.
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.analytics.v1.AnalyticsValue}
 */
public final class AnalyticsValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.analytics.v1.AnalyticsValue)
    AnalyticsValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnalyticsValue.newBuilder() to construct.
  private AnalyticsValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnalyticsValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AnalyticsValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.firebase.analytics.v1.Data
        .internal_static_google_events_firebase_analytics_v1_AnalyticsValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.firebase.analytics.v1.Data
        .internal_static_google_events_firebase_analytics_v1_AnalyticsValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.firebase.analytics.v1.AnalyticsValue.class,
            com.google.events.firebase.analytics.v1.AnalyticsValue.Builder.class);
  }

  private int paramValueCase_ = 0;
  private java.lang.Object paramValue_;

  public enum ParamValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_VALUE(1),
    INT_VALUE(2),
    FLOAT_VALUE(3),
    DOUBLE_VALUE(4),
    PARAMVALUE_NOT_SET(0);
    private final int value;

    private ParamValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ParamValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ParamValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return STRING_VALUE;
        case 2:
          return INT_VALUE;
        case 3:
          return FLOAT_VALUE;
        case 4:
          return DOUBLE_VALUE;
        case 0:
          return PARAMVALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ParamValueCase getParamValueCase() {
    return ParamValueCase.forNumber(paramValueCase_);
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 1;
  /**
   * <code>string string_value = 1;</code>
   *
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return paramValueCase_ == 1;
  }
  /**
   * <code>string string_value = 1;</code>
   *
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (paramValueCase_ == 1) {
      ref = paramValue_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (paramValueCase_ == 1) {
        paramValue_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string string_value = 1;</code>
   *
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString getStringValueBytes() {
    java.lang.Object ref = "";
    if (paramValueCase_ == 1) {
      ref = paramValue_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (paramValueCase_ == 1) {
        paramValue_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INT_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>int64 int_value = 2;</code>
   *
   * @return Whether the intValue field is set.
   */
  @java.lang.Override
  public boolean hasIntValue() {
    return paramValueCase_ == 2;
  }
  /**
   * <code>int64 int_value = 2;</code>
   *
   * @return The intValue.
   */
  @java.lang.Override
  public long getIntValue() {
    if (paramValueCase_ == 2) {
      return (java.lang.Long) paramValue_;
    }
    return 0L;
  }

  public static final int FLOAT_VALUE_FIELD_NUMBER = 3;
  /**
   * <code>float float_value = 3;</code>
   *
   * @return Whether the floatValue field is set.
   */
  @java.lang.Override
  public boolean hasFloatValue() {
    return paramValueCase_ == 3;
  }
  /**
   * <code>float float_value = 3;</code>
   *
   * @return The floatValue.
   */
  @java.lang.Override
  public float getFloatValue() {
    if (paramValueCase_ == 3) {
      return (java.lang.Float) paramValue_;
    }
    return 0F;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
  /**
   * <code>double double_value = 4;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return paramValueCase_ == 4;
  }
  /**
   * <code>double double_value = 4;</code>
   *
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (paramValueCase_ == 4) {
      return (java.lang.Double) paramValue_;
    }
    return 0D;
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
    if (paramValueCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, paramValue_);
    }
    if (paramValueCase_ == 2) {
      output.writeInt64(2, (long) ((java.lang.Long) paramValue_));
    }
    if (paramValueCase_ == 3) {
      output.writeFloat(3, (float) ((java.lang.Float) paramValue_));
    }
    if (paramValueCase_ == 4) {
      output.writeDouble(4, (double) ((java.lang.Double) paramValue_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (paramValueCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, paramValue_);
    }
    if (paramValueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              2, (long) ((java.lang.Long) paramValue_));
    }
    if (paramValueCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeFloatSize(
              3, (float) ((java.lang.Float) paramValue_));
    }
    if (paramValueCase_ == 4) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              4, (double) ((java.lang.Double) paramValue_));
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
    if (!(obj instanceof com.google.events.firebase.analytics.v1.AnalyticsValue)) {
      return super.equals(obj);
    }
    com.google.events.firebase.analytics.v1.AnalyticsValue other =
        (com.google.events.firebase.analytics.v1.AnalyticsValue) obj;

    if (!getParamValueCase().equals(other.getParamValueCase())) return false;
    switch (paramValueCase_) {
      case 1:
        if (!getStringValue().equals(other.getStringValue())) return false;
        break;
      case 2:
        if (getIntValue() != other.getIntValue()) return false;
        break;
      case 3:
        if (java.lang.Float.floatToIntBits(getFloatValue())
            != java.lang.Float.floatToIntBits(other.getFloatValue())) return false;
        break;
      case 4:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(other.getDoubleValue())) return false;
        break;
      case 0:
      default:
    }
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
    switch (paramValueCase_) {
      case 1:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + INT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIntValue());
        break;
      case 3:
        hash = (37 * hash) + FLOAT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(getFloatValue());
        break;
      case 4:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue parseFrom(
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
      com.google.events.firebase.analytics.v1.AnalyticsValue prototype) {
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
   * Value for Event Params and UserProperty can be of type string or int or
   * float or double.
   * </pre>
   *
   * Protobuf type {@code google.events.firebase.analytics.v1.AnalyticsValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.analytics.v1.AnalyticsValue)
      com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_AnalyticsValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_AnalyticsValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.firebase.analytics.v1.AnalyticsValue.class,
              com.google.events.firebase.analytics.v1.AnalyticsValue.Builder.class);
    }

    // Construct using com.google.events.firebase.analytics.v1.AnalyticsValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      paramValueCase_ = 0;
      paramValue_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_AnalyticsValue_descriptor;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.AnalyticsValue getDefaultInstanceForType() {
      return com.google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.AnalyticsValue build() {
      com.google.events.firebase.analytics.v1.AnalyticsValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.AnalyticsValue buildPartial() {
      com.google.events.firebase.analytics.v1.AnalyticsValue result =
          new com.google.events.firebase.analytics.v1.AnalyticsValue(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.firebase.analytics.v1.AnalyticsValue result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.events.firebase.analytics.v1.AnalyticsValue result) {
      result.paramValueCase_ = paramValueCase_;
      result.paramValue_ = this.paramValue_;
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
      if (other instanceof com.google.events.firebase.analytics.v1.AnalyticsValue) {
        return mergeFrom((com.google.events.firebase.analytics.v1.AnalyticsValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.firebase.analytics.v1.AnalyticsValue other) {
      if (other == com.google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance())
        return this;
      switch (other.getParamValueCase()) {
        case STRING_VALUE:
          {
            paramValueCase_ = 1;
            paramValue_ = other.paramValue_;
            onChanged();
            break;
          }
        case INT_VALUE:
          {
            setIntValue(other.getIntValue());
            break;
          }
        case FLOAT_VALUE:
          {
            setFloatValue(other.getFloatValue());
            break;
          }
        case DOUBLE_VALUE:
          {
            setDoubleValue(other.getDoubleValue());
            break;
          }
        case PARAMVALUE_NOT_SET:
          {
            break;
          }
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                paramValueCase_ = 1;
                paramValue_ = s;
                break;
              } // case 10
            case 16:
              {
                paramValue_ = input.readInt64();
                paramValueCase_ = 2;
                break;
              } // case 16
            case 29:
              {
                paramValue_ = input.readFloat();
                paramValueCase_ = 3;
                break;
              } // case 29
            case 33:
              {
                paramValue_ = input.readDouble();
                paramValueCase_ = 4;
                break;
              } // case 33
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

    private int paramValueCase_ = 0;
    private java.lang.Object paramValue_;

    public ParamValueCase getParamValueCase() {
      return ParamValueCase.forNumber(paramValueCase_);
    }

    public Builder clearParamValue() {
      paramValueCase_ = 0;
      paramValue_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string string_value = 1;</code>
     *
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return paramValueCase_ == 1;
    }
    /**
     * <code>string string_value = 1;</code>
     *
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (paramValueCase_ == 1) {
        ref = paramValue_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (paramValueCase_ == 1) {
          paramValue_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string_value = 1;</code>
     *
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getStringValueBytes() {
      java.lang.Object ref = "";
      if (paramValueCase_ == 1) {
        ref = paramValue_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (paramValueCase_ == 1) {
          paramValue_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_value = 1;</code>
     *
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      paramValueCase_ = 1;
      paramValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (paramValueCase_ == 1) {
        paramValueCase_ = 0;
        paramValue_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string string_value = 1;</code>
     *
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      paramValueCase_ = 1;
      paramValue_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int64 int_value = 2;</code>
     *
     * @return Whether the intValue field is set.
     */
    public boolean hasIntValue() {
      return paramValueCase_ == 2;
    }
    /**
     * <code>int64 int_value = 2;</code>
     *
     * @return The intValue.
     */
    public long getIntValue() {
      if (paramValueCase_ == 2) {
        return (java.lang.Long) paramValue_;
      }
      return 0L;
    }
    /**
     * <code>int64 int_value = 2;</code>
     *
     * @param value The intValue to set.
     * @return This builder for chaining.
     */
    public Builder setIntValue(long value) {

      paramValueCase_ = 2;
      paramValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 int_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIntValue() {
      if (paramValueCase_ == 2) {
        paramValueCase_ = 0;
        paramValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>float float_value = 3;</code>
     *
     * @return Whether the floatValue field is set.
     */
    public boolean hasFloatValue() {
      return paramValueCase_ == 3;
    }
    /**
     * <code>float float_value = 3;</code>
     *
     * @return The floatValue.
     */
    public float getFloatValue() {
      if (paramValueCase_ == 3) {
        return (java.lang.Float) paramValue_;
      }
      return 0F;
    }
    /**
     * <code>float float_value = 3;</code>
     *
     * @param value The floatValue to set.
     * @return This builder for chaining.
     */
    public Builder setFloatValue(float value) {

      paramValueCase_ = 3;
      paramValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float float_value = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFloatValue() {
      if (paramValueCase_ == 3) {
        paramValueCase_ = 0;
        paramValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>double double_value = 4;</code>
     *
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return paramValueCase_ == 4;
    }
    /**
     * <code>double double_value = 4;</code>
     *
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (paramValueCase_ == 4) {
        return (java.lang.Double) paramValue_;
      }
      return 0D;
    }
    /**
     * <code>double double_value = 4;</code>
     *
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {

      paramValueCase_ = 4;
      paramValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double_value = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (paramValueCase_ == 4) {
        paramValueCase_ = 0;
        paramValue_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.events.firebase.analytics.v1.AnalyticsValue)
  }

  // @@protoc_insertion_point(class_scope:google.events.firebase.analytics.v1.AnalyticsValue)
  private static final com.google.events.firebase.analytics.v1.AnalyticsValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.firebase.analytics.v1.AnalyticsValue();
  }

  public static com.google.events.firebase.analytics.v1.AnalyticsValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyticsValue> PARSER =
      new com.google.protobuf.AbstractParser<AnalyticsValue>() {
        @java.lang.Override
        public AnalyticsValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AnalyticsValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyticsValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.firebase.analytics.v1.AnalyticsValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
