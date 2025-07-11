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
 * RenderMetadata includes information associated with a `Release` render.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.deploy.v1.RenderMetadata}
 */
public final class RenderMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.deploy.v1.RenderMetadata)
    RenderMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RenderMetadata.newBuilder() to construct.
  private RenderMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RenderMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RenderMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_RenderMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_RenderMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.deploy.v1.RenderMetadata.class,
            com.google.events.cloud.deploy.v1.RenderMetadata.Builder.class);
  }

  public static final int CLOUD_RUN_FIELD_NUMBER = 1;
  private com.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloudRun_;

  /**
   *
   *
   * <pre>
   * Output only. Metadata associated with rendering for Cloud Run.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
   *
   * @return Whether the cloudRun field is set.
   */
  @java.lang.Override
  public boolean hasCloudRun() {
    return cloudRun_ != null;
  }

  /**
   *
   *
   * <pre>
   * Output only. Metadata associated with rendering for Cloud Run.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
   *
   * @return The cloudRun.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.CloudRunRenderMetadata getCloudRun() {
    return cloudRun_ == null
        ? com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.getDefaultInstance()
        : cloudRun_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Metadata associated with rendering for Cloud Run.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.CloudRunRenderMetadataOrBuilder getCloudRunOrBuilder() {
    return cloudRun_ == null
        ? com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.getDefaultInstance()
        : cloudRun_;
  }

  public static final int CUSTOM_FIELD_NUMBER = 2;
  private com.google.events.cloud.deploy.v1.CustomMetadata custom_;

  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user-defined render operation.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
   *
   * @return Whether the custom field is set.
   */
  @java.lang.Override
  public boolean hasCustom() {
    return custom_ != null;
  }

  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user-defined render operation.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
   *
   * @return The custom.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.CustomMetadata getCustom() {
    return custom_ == null
        ? com.google.events.cloud.deploy.v1.CustomMetadata.getDefaultInstance()
        : custom_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Custom metadata provided by user-defined render operation.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.CustomMetadataOrBuilder getCustomOrBuilder() {
    return custom_ == null
        ? com.google.events.cloud.deploy.v1.CustomMetadata.getDefaultInstance()
        : custom_;
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
    if (cloudRun_ != null) {
      output.writeMessage(1, getCloudRun());
    }
    if (custom_ != null) {
      output.writeMessage(2, getCustom());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cloudRun_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCloudRun());
    }
    if (custom_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCustom());
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
    if (!(obj instanceof com.google.events.cloud.deploy.v1.RenderMetadata)) {
      return super.equals(obj);
    }
    com.google.events.cloud.deploy.v1.RenderMetadata other =
        (com.google.events.cloud.deploy.v1.RenderMetadata) obj;

    if (hasCloudRun() != other.hasCloudRun()) return false;
    if (hasCloudRun()) {
      if (!getCloudRun().equals(other.getCloudRun())) return false;
    }
    if (hasCustom() != other.hasCustom()) return false;
    if (hasCustom()) {
      if (!getCustom().equals(other.getCustom())) return false;
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
    if (hasCloudRun()) {
      hash = (37 * hash) + CLOUD_RUN_FIELD_NUMBER;
      hash = (53 * hash) + getCloudRun().hashCode();
    }
    if (hasCustom()) {
      hash = (37 * hash) + CUSTOM_FIELD_NUMBER;
      hash = (53 * hash) + getCustom().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.deploy.v1.RenderMetadata prototype) {
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
   * RenderMetadata includes information associated with a `Release` render.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.deploy.v1.RenderMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.deploy.v1.RenderMetadata)
      com.google.events.cloud.deploy.v1.RenderMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RenderMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RenderMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.deploy.v1.RenderMetadata.class,
              com.google.events.cloud.deploy.v1.RenderMetadata.Builder.class);
    }

    // Construct using com.google.events.cloud.deploy.v1.RenderMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cloudRun_ = null;
      if (cloudRunBuilder_ != null) {
        cloudRunBuilder_.dispose();
        cloudRunBuilder_ = null;
      }
      custom_ = null;
      if (customBuilder_ != null) {
        customBuilder_.dispose();
        customBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RenderMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RenderMetadata getDefaultInstanceForType() {
      return com.google.events.cloud.deploy.v1.RenderMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RenderMetadata build() {
      com.google.events.cloud.deploy.v1.RenderMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RenderMetadata buildPartial() {
      com.google.events.cloud.deploy.v1.RenderMetadata result =
          new com.google.events.cloud.deploy.v1.RenderMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.deploy.v1.RenderMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudRun_ = cloudRunBuilder_ == null ? cloudRun_ : cloudRunBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.custom_ = customBuilder_ == null ? custom_ : customBuilder_.build();
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
      if (other instanceof com.google.events.cloud.deploy.v1.RenderMetadata) {
        return mergeFrom((com.google.events.cloud.deploy.v1.RenderMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.deploy.v1.RenderMetadata other) {
      if (other == com.google.events.cloud.deploy.v1.RenderMetadata.getDefaultInstance())
        return this;
      if (other.hasCloudRun()) {
        mergeCloudRun(other.getCloudRun());
      }
      if (other.hasCustom()) {
        mergeCustom(other.getCustom());
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
                input.readMessage(getCloudRunFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCustomFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloudRun_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadata,
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.Builder,
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadataOrBuilder>
        cloudRunBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     *
     * @return Whether the cloudRun field is set.
     */
    public boolean hasCloudRun() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     *
     * @return The cloudRun.
     */
    public com.google.events.cloud.deploy.v1.CloudRunRenderMetadata getCloudRun() {
      if (cloudRunBuilder_ == null) {
        return cloudRun_ == null
            ? com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.getDefaultInstance()
            : cloudRun_;
      } else {
        return cloudRunBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public Builder setCloudRun(com.google.events.cloud.deploy.v1.CloudRunRenderMetadata value) {
      if (cloudRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cloudRun_ = value;
      } else {
        cloudRunBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public Builder setCloudRun(
        com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.Builder builderForValue) {
      if (cloudRunBuilder_ == null) {
        cloudRun_ = builderForValue.build();
      } else {
        cloudRunBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public Builder mergeCloudRun(com.google.events.cloud.deploy.v1.CloudRunRenderMetadata value) {
      if (cloudRunBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && cloudRun_ != null
            && cloudRun_
                != com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.getDefaultInstance()) {
          getCloudRunBuilder().mergeFrom(value);
        } else {
          cloudRun_ = value;
        }
      } else {
        cloudRunBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public Builder clearCloudRun() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cloudRun_ = null;
      if (cloudRunBuilder_ != null) {
        cloudRunBuilder_.dispose();
        cloudRunBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.Builder getCloudRunBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCloudRunFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    public com.google.events.cloud.deploy.v1.CloudRunRenderMetadataOrBuilder
        getCloudRunOrBuilder() {
      if (cloudRunBuilder_ != null) {
        return cloudRunBuilder_.getMessageOrBuilder();
      } else {
        return cloudRun_ == null
            ? com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.getDefaultInstance()
            : cloudRun_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Metadata associated with rendering for Cloud Run.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CloudRunRenderMetadata cloud_run = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadata,
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.Builder,
            com.google.events.cloud.deploy.v1.CloudRunRenderMetadataOrBuilder>
        getCloudRunFieldBuilder() {
      if (cloudRunBuilder_ == null) {
        cloudRunBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.CloudRunRenderMetadata,
                com.google.events.cloud.deploy.v1.CloudRunRenderMetadata.Builder,
                com.google.events.cloud.deploy.v1.CloudRunRenderMetadataOrBuilder>(
                getCloudRun(), getParentForChildren(), isClean());
        cloudRun_ = null;
      }
      return cloudRunBuilder_;
    }

    private com.google.events.cloud.deploy.v1.CustomMetadata custom_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.CustomMetadata,
            com.google.events.cloud.deploy.v1.CustomMetadata.Builder,
            com.google.events.cloud.deploy.v1.CustomMetadataOrBuilder>
        customBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     *
     * @return Whether the custom field is set.
     */
    public boolean hasCustom() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     *
     * @return The custom.
     */
    public com.google.events.cloud.deploy.v1.CustomMetadata getCustom() {
      if (customBuilder_ == null) {
        return custom_ == null
            ? com.google.events.cloud.deploy.v1.CustomMetadata.getDefaultInstance()
            : custom_;
      } else {
        return customBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public Builder setCustom(com.google.events.cloud.deploy.v1.CustomMetadata value) {
      if (customBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        custom_ = value;
      } else {
        customBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public Builder setCustom(
        com.google.events.cloud.deploy.v1.CustomMetadata.Builder builderForValue) {
      if (customBuilder_ == null) {
        custom_ = builderForValue.build();
      } else {
        customBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public Builder mergeCustom(com.google.events.cloud.deploy.v1.CustomMetadata value) {
      if (customBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && custom_ != null
            && custom_ != com.google.events.cloud.deploy.v1.CustomMetadata.getDefaultInstance()) {
          getCustomBuilder().mergeFrom(value);
        } else {
          custom_ = value;
        }
      } else {
        customBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public Builder clearCustom() {
      bitField0_ = (bitField0_ & ~0x00000002);
      custom_ = null;
      if (customBuilder_ != null) {
        customBuilder_.dispose();
        customBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public com.google.events.cloud.deploy.v1.CustomMetadata.Builder getCustomBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCustomFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    public com.google.events.cloud.deploy.v1.CustomMetadataOrBuilder getCustomOrBuilder() {
      if (customBuilder_ != null) {
        return customBuilder_.getMessageOrBuilder();
      } else {
        return custom_ == null
            ? com.google.events.cloud.deploy.v1.CustomMetadata.getDefaultInstance()
            : custom_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Custom metadata provided by user-defined render operation.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.CustomMetadata custom = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.CustomMetadata,
            com.google.events.cloud.deploy.v1.CustomMetadata.Builder,
            com.google.events.cloud.deploy.v1.CustomMetadataOrBuilder>
        getCustomFieldBuilder() {
      if (customBuilder_ == null) {
        customBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.CustomMetadata,
                com.google.events.cloud.deploy.v1.CustomMetadata.Builder,
                com.google.events.cloud.deploy.v1.CustomMetadataOrBuilder>(
                getCustom(), getParentForChildren(), isClean());
        custom_ = null;
      }
      return customBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.deploy.v1.RenderMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.deploy.v1.RenderMetadata)
  private static final com.google.events.cloud.deploy.v1.RenderMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.deploy.v1.RenderMetadata();
  }

  public static com.google.events.cloud.deploy.v1.RenderMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RenderMetadata> PARSER =
      new com.google.protobuf.AbstractParser<RenderMetadata>() {
        @java.lang.Override
        public RenderMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RenderMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RenderMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.deploy.v1.RenderMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
