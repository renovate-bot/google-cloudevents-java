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
 * Lifetime Value information about this user.
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.analytics.v1.LtvInfo}
 */
public final class LtvInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.firebase.analytics.v1.LtvInfo)
    LtvInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LtvInfo.newBuilder() to construct.
  private LtvInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LtvInfo() {
    currency_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LtvInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.firebase.analytics.v1.Data
        .internal_static_google_events_firebase_analytics_v1_LtvInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.firebase.analytics.v1.Data
        .internal_static_google_events_firebase_analytics_v1_LtvInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.firebase.analytics.v1.LtvInfo.class,
            com.google.events.firebase.analytics.v1.LtvInfo.Builder.class);
  }

  public static final int REVENUE_FIELD_NUMBER = 1;
  private double revenue_ = 0D;
  /**
   *
   *
   * <pre>
   * The Lifetime Value revenue of this user.
   * </pre>
   *
   * <code>double revenue = 1;</code>
   *
   * @return The revenue.
   */
  @java.lang.Override
  public double getRevenue() {
    return revenue_;
  }

  public static final int CURRENCY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object currency_ = "";
  /**
   *
   *
   * <pre>
   * The currency corresponding to the revenue.
   * </pre>
   *
   * <code>string currency = 2;</code>
   *
   * @return The currency.
   */
  @java.lang.Override
  public java.lang.String getCurrency() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currency_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The currency corresponding to the revenue.
   * </pre>
   *
   * <code>string currency = 2;</code>
   *
   * @return The bytes for currency.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCurrencyBytes() {
    java.lang.Object ref = currency_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      currency_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (java.lang.Double.doubleToRawLongBits(revenue_) != 0) {
      output.writeDouble(1, revenue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currency_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, currency_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(revenue_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, revenue_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currency_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, currency_);
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
    if (!(obj instanceof com.google.events.firebase.analytics.v1.LtvInfo)) {
      return super.equals(obj);
    }
    com.google.events.firebase.analytics.v1.LtvInfo other =
        (com.google.events.firebase.analytics.v1.LtvInfo) obj;

    if (java.lang.Double.doubleToLongBits(getRevenue())
        != java.lang.Double.doubleToLongBits(other.getRevenue())) return false;
    if (!getCurrency().equals(other.getCurrency())) return false;
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
    hash = (37 * hash) + REVENUE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getRevenue()));
    hash = (37 * hash) + CURRENCY_FIELD_NUMBER;
    hash = (53 * hash) + getCurrency().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo parseFrom(
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

  public static Builder newBuilder(com.google.events.firebase.analytics.v1.LtvInfo prototype) {
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
   * Lifetime Value information about this user.
   * </pre>
   *
   * Protobuf type {@code google.events.firebase.analytics.v1.LtvInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.firebase.analytics.v1.LtvInfo)
      com.google.events.firebase.analytics.v1.LtvInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_LtvInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_LtvInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.firebase.analytics.v1.LtvInfo.class,
              com.google.events.firebase.analytics.v1.LtvInfo.Builder.class);
    }

    // Construct using com.google.events.firebase.analytics.v1.LtvInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      revenue_ = 0D;
      currency_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.firebase.analytics.v1.Data
          .internal_static_google_events_firebase_analytics_v1_LtvInfo_descriptor;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.LtvInfo getDefaultInstanceForType() {
      return com.google.events.firebase.analytics.v1.LtvInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.LtvInfo build() {
      com.google.events.firebase.analytics.v1.LtvInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.LtvInfo buildPartial() {
      com.google.events.firebase.analytics.v1.LtvInfo result =
          new com.google.events.firebase.analytics.v1.LtvInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.firebase.analytics.v1.LtvInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.revenue_ = revenue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.currency_ = currency_;
      }
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
      if (other instanceof com.google.events.firebase.analytics.v1.LtvInfo) {
        return mergeFrom((com.google.events.firebase.analytics.v1.LtvInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.firebase.analytics.v1.LtvInfo other) {
      if (other == com.google.events.firebase.analytics.v1.LtvInfo.getDefaultInstance())
        return this;
      if (other.getRevenue() != 0D) {
        setRevenue(other.getRevenue());
      }
      if (!other.getCurrency().isEmpty()) {
        currency_ = other.currency_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 9:
              {
                revenue_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 18:
              {
                currency_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private int bitField0_;

    private double revenue_;
    /**
     *
     *
     * <pre>
     * The Lifetime Value revenue of this user.
     * </pre>
     *
     * <code>double revenue = 1;</code>
     *
     * @return The revenue.
     */
    @java.lang.Override
    public double getRevenue() {
      return revenue_;
    }
    /**
     *
     *
     * <pre>
     * The Lifetime Value revenue of this user.
     * </pre>
     *
     * <code>double revenue = 1;</code>
     *
     * @param value The revenue to set.
     * @return This builder for chaining.
     */
    public Builder setRevenue(double value) {

      revenue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Lifetime Value revenue of this user.
     * </pre>
     *
     * <code>double revenue = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRevenue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      revenue_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object currency_ = "";
    /**
     *
     *
     * <pre>
     * The currency corresponding to the revenue.
     * </pre>
     *
     * <code>string currency = 2;</code>
     *
     * @return The currency.
     */
    public java.lang.String getCurrency() {
      java.lang.Object ref = currency_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currency_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The currency corresponding to the revenue.
     * </pre>
     *
     * <code>string currency = 2;</code>
     *
     * @return The bytes for currency.
     */
    public com.google.protobuf.ByteString getCurrencyBytes() {
      java.lang.Object ref = currency_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        currency_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The currency corresponding to the revenue.
     * </pre>
     *
     * <code>string currency = 2;</code>
     *
     * @param value The currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrency(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      currency_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The currency corresponding to the revenue.
     * </pre>
     *
     * <code>string currency = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCurrency() {
      currency_ = getDefaultInstance().getCurrency();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The currency corresponding to the revenue.
     * </pre>
     *
     * <code>string currency = 2;</code>
     *
     * @param value The bytes for currency to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      currency_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.events.firebase.analytics.v1.LtvInfo)
  }

  // @@protoc_insertion_point(class_scope:google.events.firebase.analytics.v1.LtvInfo)
  private static final com.google.events.firebase.analytics.v1.LtvInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.firebase.analytics.v1.LtvInfo();
  }

  public static com.google.events.firebase.analytics.v1.LtvInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LtvInfo> PARSER =
      new com.google.protobuf.AbstractParser<LtvInfo>() {
        @java.lang.Override
        public LtvInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<LtvInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LtvInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.firebase.analytics.v1.LtvInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
