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
 * A public key format and data.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.iot.v1.PublicKeyCredential}
 */
public final class PublicKeyCredential extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.iot.v1.PublicKeyCredential)
    PublicKeyCredentialOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PublicKeyCredential.newBuilder() to construct.
  private PublicKeyCredential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PublicKeyCredential() {
    format_ = 0;
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PublicKeyCredential();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.iot.v1.Data
        .internal_static_google_events_cloud_iot_v1_PublicKeyCredential_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.iot.v1.Data
        .internal_static_google_events_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.iot.v1.PublicKeyCredential.class,
            com.google.events.cloud.iot.v1.PublicKeyCredential.Builder.class);
  }

  public static final int FORMAT_FIELD_NUMBER = 1;
  private int format_ = 0;
  /**
   *
   *
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  @java.lang.Override
  public int getFormatValue() {
    return format_;
  }
  /**
   *
   *
   * <pre>
   * The format of the key.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
   *
   * @return The format.
   */
  @java.lang.Override
  public com.google.events.cloud.iot.v1.PublicKeyFormat getFormat() {
    com.google.events.cloud.iot.v1.PublicKeyFormat result =
        com.google.events.cloud.iot.v1.PublicKeyFormat.forNumber(format_);
    return result == null ? com.google.events.cloud.iot.v1.PublicKeyFormat.UNRECOGNIZED : result;
  }

  public static final int KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   *
   *
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The key data.
   * </pre>
   *
   * <code>string key = 2;</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
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
    if (format_
        != com.google.events.cloud.iot.v1.PublicKeyFormat.UNSPECIFIED_PUBLIC_KEY_FORMAT
            .getNumber()) {
      output.writeEnum(1, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (format_
        != com.google.events.cloud.iot.v1.PublicKeyFormat.UNSPECIFIED_PUBLIC_KEY_FORMAT
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, format_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, key_);
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
    if (!(obj instanceof com.google.events.cloud.iot.v1.PublicKeyCredential)) {
      return super.equals(obj);
    }
    com.google.events.cloud.iot.v1.PublicKeyCredential other =
        (com.google.events.cloud.iot.v1.PublicKeyCredential) obj;

    if (format_ != other.format_) return false;
    if (!getKey().equals(other.getKey())) return false;
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
    hash = (37 * hash) + FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + format_;
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.iot.v1.PublicKeyCredential prototype) {
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
   * A public key format and data.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.iot.v1.PublicKeyCredential}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.iot.v1.PublicKeyCredential)
      com.google.events.cloud.iot.v1.PublicKeyCredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_PublicKeyCredential_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_PublicKeyCredential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.iot.v1.PublicKeyCredential.class,
              com.google.events.cloud.iot.v1.PublicKeyCredential.Builder.class);
    }

    // Construct using com.google.events.cloud.iot.v1.PublicKeyCredential.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      format_ = 0;
      key_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_PublicKeyCredential_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyCredential getDefaultInstanceForType() {
      return com.google.events.cloud.iot.v1.PublicKeyCredential.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyCredential build() {
      com.google.events.cloud.iot.v1.PublicKeyCredential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyCredential buildPartial() {
      com.google.events.cloud.iot.v1.PublicKeyCredential result =
          new com.google.events.cloud.iot.v1.PublicKeyCredential(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.iot.v1.PublicKeyCredential result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.format_ = format_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.key_ = key_;
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
      if (other instanceof com.google.events.cloud.iot.v1.PublicKeyCredential) {
        return mergeFrom((com.google.events.cloud.iot.v1.PublicKeyCredential) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.iot.v1.PublicKeyCredential other) {
      if (other == com.google.events.cloud.iot.v1.PublicKeyCredential.getDefaultInstance())
        return this;
      if (other.format_ != 0) {
        setFormatValue(other.getFormatValue());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
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
            case 8:
              {
                format_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                key_ = input.readStringRequireUtf8();
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

    private int format_ = 0;
    /**
     *
     *
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     *
     * @return The enum numeric value on the wire for format.
     */
    @java.lang.Override
    public int getFormatValue() {
      return format_;
    }
    /**
     *
     *
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     *
     * @param value The enum numeric value on the wire for format to set.
     * @return This builder for chaining.
     */
    public Builder setFormatValue(int value) {
      format_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     *
     * @return The format.
     */
    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyFormat getFormat() {
      com.google.events.cloud.iot.v1.PublicKeyFormat result =
          com.google.events.cloud.iot.v1.PublicKeyFormat.forNumber(format_);
      return result == null ? com.google.events.cloud.iot.v1.PublicKeyFormat.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     *
     * @param value The format to set.
     * @return This builder for chaining.
     */
    public Builder setFormat(com.google.events.cloud.iot.v1.PublicKeyFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The format of the key.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyFormat format = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFormat() {
      bitField0_ = (bitField0_ & ~0x00000001);
      format_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The key data.
     * </pre>
     *
     * <code>string key = 2;</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.iot.v1.PublicKeyCredential)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.iot.v1.PublicKeyCredential)
  private static final com.google.events.cloud.iot.v1.PublicKeyCredential DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.iot.v1.PublicKeyCredential();
  }

  public static com.google.events.cloud.iot.v1.PublicKeyCredential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicKeyCredential> PARSER =
      new com.google.protobuf.AbstractParser<PublicKeyCredential>() {
        @java.lang.Override
        public PublicKeyCredential parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicKeyCredential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicKeyCredential> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.iot.v1.PublicKeyCredential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
