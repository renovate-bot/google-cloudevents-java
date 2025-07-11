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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

/**
 *
 *
 * <pre>
 * MembershipBindingLifecycleState describes the state of a Binding resource.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.gkehub.v1.MembershipBindingLifecycleState}
 */
public final class MembershipBindingLifecycleState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.gkehub.v1.MembershipBindingLifecycleState)
    MembershipBindingLifecycleStateOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MembershipBindingLifecycleState.newBuilder() to construct.
  private MembershipBindingLifecycleState(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MembershipBindingLifecycleState() {
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MembershipBindingLifecycleState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.gkehub.v1.Data
        .internal_static_google_events_cloud_gkehub_v1_MembershipBindingLifecycleState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.gkehub.v1.Data
        .internal_static_google_events_cloud_gkehub_v1_MembershipBindingLifecycleState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.class,
            com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Code describes the state of a MembershipBinding resource.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code}
   */
  public enum Code implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The code is not set.
     * </pre>
     *
     * <code>CODE_UNSPECIFIED = 0;</code>
     */
    CODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The membershipbinding is being created.
     * </pre>
     *
     * <code>CREATING = 1;</code>
     */
    CREATING(1),
    /**
     *
     *
     * <pre>
     * The membershipbinding active.
     * </pre>
     *
     * <code>READY = 2;</code>
     */
    READY(2),
    /**
     *
     *
     * <pre>
     * The membershipbinding is being deleted.
     * </pre>
     *
     * <code>DELETING = 3;</code>
     */
    DELETING(3),
    /**
     *
     *
     * <pre>
     * The membershipbinding is being updated.
     * </pre>
     *
     * <code>UPDATING = 4;</code>
     */
    UPDATING(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The code is not set.
     * </pre>
     *
     * <code>CODE_UNSPECIFIED = 0;</code>
     */
    public static final int CODE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * The membershipbinding is being created.
     * </pre>
     *
     * <code>CREATING = 1;</code>
     */
    public static final int CREATING_VALUE = 1;

    /**
     *
     *
     * <pre>
     * The membershipbinding active.
     * </pre>
     *
     * <code>READY = 2;</code>
     */
    public static final int READY_VALUE = 2;

    /**
     *
     *
     * <pre>
     * The membershipbinding is being deleted.
     * </pre>
     *
     * <code>DELETING = 3;</code>
     */
    public static final int DELETING_VALUE = 3;

    /**
     *
     *
     * <pre>
     * The membershipbinding is being updated.
     * </pre>
     *
     * <code>UPDATING = 4;</code>
     */
    public static final int UPDATING_VALUE = 4;

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
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Code forNumber(int value) {
      switch (value) {
        case 0:
          return CODE_UNSPECIFIED;
        case 1:
          return CREATING;
        case 2:
          return READY;
        case 3:
          return DELETING;
        case 4:
          return UPDATING;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
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
      return com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Code[] VALUES = values();

    public static Code valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code)
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The current state of the MembershipBinding resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override
  public int getCodeValue() {
    return code_;
  }

  /**
   *
   *
   * <pre>
   * Output only. The current state of the MembershipBinding resource.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
   *
   * @return The code.
   */
  @java.lang.Override
  public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code getCode() {
    com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code result =
        com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.forNumber(code_);
    return result == null
        ? com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.UNRECOGNIZED
        : result;
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
    if (code_
        != com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.CODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, code_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_
        != com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.CODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, code_);
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
    if (!(obj instanceof com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState)) {
      return super.equals(obj);
    }
    com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState other =
        (com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState) obj;

    if (code_ != other.code_) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState parseFrom(
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
      com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState prototype) {
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
   * MembershipBindingLifecycleState describes the state of a Binding resource.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.gkehub.v1.MembershipBindingLifecycleState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.gkehub.v1.MembershipBindingLifecycleState)
      com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.gkehub.v1.Data
          .internal_static_google_events_cloud_gkehub_v1_MembershipBindingLifecycleState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.gkehub.v1.Data
          .internal_static_google_events_cloud_gkehub_v1_MembershipBindingLifecycleState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.class,
              com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Builder.class);
    }

    // Construct using
    // com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.gkehub.v1.Data
          .internal_static_google_events_cloud_gkehub_v1_MembershipBindingLifecycleState_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
        getDefaultInstanceForType() {
      return com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState build() {
      com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState buildPartial() {
      com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState result =
          new com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
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
      if (other instanceof com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState) {
        return mergeFrom((com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState other) {
      if (other
          == com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.getDefaultInstance())
        return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
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
                code_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int code_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. The current state of the MembershipBinding resource.
     * </pre>
     *
     * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
     *
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override
    public int getCodeValue() {
      return code_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the MembershipBinding resource.
     * </pre>
     *
     * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
     *
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the MembershipBinding resource.
     * </pre>
     *
     * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
     *
     * @return The code.
     */
    @java.lang.Override
    public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code getCode() {
      com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code result =
          com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.forNumber(code_);
      return result == null
          ? com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the MembershipBinding resource.
     * </pre>
     *
     * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
     *
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      code_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the MembershipBinding resource.
     * </pre>
     *
     * <code>.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState.Code code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.gkehub.v1.MembershipBindingLifecycleState)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.gkehub.v1.MembershipBindingLifecycleState)
  private static final com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState();
  }

  public static com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipBindingLifecycleState> PARSER =
      new com.google.protobuf.AbstractParser<MembershipBindingLifecycleState>() {
        @java.lang.Override
        public MembershipBindingLifecycleState parsePartialFrom(
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

  public static com.google.protobuf.Parser<MembershipBindingLifecycleState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipBindingLifecycleState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.gkehub.v1.MembershipBindingLifecycleState
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
