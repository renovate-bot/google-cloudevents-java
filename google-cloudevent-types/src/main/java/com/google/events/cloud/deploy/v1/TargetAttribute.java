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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Contains criteria for selecting Targets.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.deploy.v1.TargetAttribute}
 */
public final class TargetAttribute extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.deploy.v1.TargetAttribute)
    TargetAttributeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TargetAttribute.newBuilder() to construct.
  private TargetAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TargetAttribute() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TargetAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_TargetAttribute_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetLabels();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_TargetAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.deploy.v1.TargetAttribute.class,
            com.google.events.cloud.deploy.v1.TargetAttribute.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";

  /**
   *
   *
   * <pre>
   * ID of the `Target`. The value of this field could be one of the
   * following:
   * * The last segment of a target name. It only needs the ID to determine
   * which target is being referred to
   * * "*", all targets in a location.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * ID of the `Target`. The value of this field could be one of the
   * following:
   * * The last segment of a target name. It only needs the ID to determine
   * which target is being referred to
   * * "*", all targets in a location.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 2;

  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.events.cloud.deploy.v1.Data
                .internal_static_google_events_cloud_deploy_v1_TargetAttribute_LabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }

  /**
   *
   *
   * <pre>
   * Target labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public boolean containsLabels(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLabels().getMap().containsKey(key);
  }

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }

  /**
   *
   *
   * <pre>
   * Target labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }

  /**
   *
   *
   * <pre>
   * Target labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   *
   *
   * <pre>
   * Target labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
          LabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, labels__);
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
    if (!(obj instanceof com.google.events.cloud.deploy.v1.TargetAttribute)) {
      return super.equals(obj);
    }
    com.google.events.cloud.deploy.v1.TargetAttribute other =
        (com.google.events.cloud.deploy.v1.TargetAttribute) obj;

    if (!getId().equals(other.getId())) return false;
    if (!internalGetLabels().equals(other.internalGetLabels())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.deploy.v1.TargetAttribute prototype) {
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
   * Contains criteria for selecting Targets.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.deploy.v1.TargetAttribute}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.deploy.v1.TargetAttribute)
      com.google.events.cloud.deploy.v1.TargetAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_TargetAttribute_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_TargetAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.deploy.v1.TargetAttribute.class,
              com.google.events.cloud.deploy.v1.TargetAttribute.Builder.class);
    }

    // Construct using com.google.events.cloud.deploy.v1.TargetAttribute.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_TargetAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.TargetAttribute getDefaultInstanceForType() {
      return com.google.events.cloud.deploy.v1.TargetAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.TargetAttribute build() {
      com.google.events.cloud.deploy.v1.TargetAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.TargetAttribute buildPartial() {
      com.google.events.cloud.deploy.v1.TargetAttribute result =
          new com.google.events.cloud.deploy.v1.TargetAttribute(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.deploy.v1.TargetAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.labels_ = internalGetLabels();
        result.labels_.makeImmutable();
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
      if (other instanceof com.google.events.cloud.deploy.v1.TargetAttribute) {
        return mergeFrom((com.google.events.cloud.deploy.v1.TargetAttribute) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.deploy.v1.TargetAttribute other) {
      if (other == com.google.events.cloud.deploy.v1.TargetAttribute.getDefaultInstance())
        return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(other.internalGetLabels());
      bitField0_ |= 0x00000002;
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
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
                    input.readMessage(
                        LabelsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableLabels()
                    .getMutableMap()
                    .put(labels__.getKey(), labels__.getValue());
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

    private java.lang.Object id_ = "";

    /**
     *
     *
     * <pre>
     * ID of the `Target`. The value of this field could be one of the
     * following:
     * * The last segment of a target name. It only needs the ID to determine
     * which target is being referred to
     * * "*", all targets in a location.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * ID of the `Target`. The value of this field could be one of the
     * following:
     * * The last segment of a target name. It only needs the ID to determine
     * which target is being referred to
     * * "*", all targets in a location.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * ID of the `Target`. The value of this field could be one of the
     * following:
     * * The last segment of a target name. It only needs the ID to determine
     * which target is being referred to
     * * "*", all targets in a location.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * ID of the `Target`. The value of this field could be one of the
     * following:
     * * The last segment of a target name. It only needs the ID to determine
     * which target is being referred to
     * * "*", all targets in a location.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * ID of the `Target`. The value of this field could be one of the
     * following:
     * * The last segment of a target name. It only needs the ID to determine
     * which target is being referred to
     * * "*", all targets in a location.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public boolean containsLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLabels().getMap().containsKey(key);
    }

    /** Use {@link #getLabelsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLabelsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableLabels().getMutableMap().clear();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder removeLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLabels().getMutableMap().remove(key);
      return this;
    }

    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabels() {
      bitField0_ |= 0x00000002;
      return internalGetMutableLabels().getMutableMap();
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLabels().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Target labels.
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 2;</code>
     */
    public Builder putAllLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.deploy.v1.TargetAttribute)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.deploy.v1.TargetAttribute)
  private static final com.google.events.cloud.deploy.v1.TargetAttribute DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.deploy.v1.TargetAttribute();
  }

  public static com.google.events.cloud.deploy.v1.TargetAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TargetAttribute> PARSER =
      new com.google.protobuf.AbstractParser<TargetAttribute>() {
        @java.lang.Override
        public TargetAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<TargetAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TargetAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.deploy.v1.TargetAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
