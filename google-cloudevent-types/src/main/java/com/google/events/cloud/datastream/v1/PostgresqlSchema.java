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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * PostgreSQL schema.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.datastream.v1.PostgresqlSchema}
 */
public final class PostgresqlSchema extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.datastream.v1.PostgresqlSchema)
    PostgresqlSchemaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PostgresqlSchema.newBuilder() to construct.
  private PostgresqlSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PostgresqlSchema() {
    schema_ = "";
    postgresqlTables_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PostgresqlSchema();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_PostgresqlSchema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_PostgresqlSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.datastream.v1.PostgresqlSchema.class,
            com.google.events.cloud.datastream.v1.PostgresqlSchema.Builder.class);
  }

  public static final int SCHEMA_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object schema_ = "";
  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   *
   * @return The schema.
   */
  @java.lang.Override
  public java.lang.String getSchema() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schema_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   *
   * @return The bytes for schema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSchemaBytes() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      schema_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTGRESQL_TABLES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.events.cloud.datastream.v1.PostgresqlTable> postgresqlTables_;
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.events.cloud.datastream.v1.PostgresqlTable>
      getPostgresqlTablesList() {
    return postgresqlTables_;
  }
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder>
      getPostgresqlTablesOrBuilderList() {
    return postgresqlTables_;
  }
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  @java.lang.Override
  public int getPostgresqlTablesCount() {
    return postgresqlTables_.size();
  }
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.PostgresqlTable getPostgresqlTables(int index) {
    return postgresqlTables_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder
      getPostgresqlTablesOrBuilder(int index) {
    return postgresqlTables_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, schema_);
    }
    for (int i = 0; i < postgresqlTables_.size(); i++) {
      output.writeMessage(2, postgresqlTables_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, schema_);
    }
    for (int i = 0; i < postgresqlTables_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, postgresqlTables_.get(i));
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
    if (!(obj instanceof com.google.events.cloud.datastream.v1.PostgresqlSchema)) {
      return super.equals(obj);
    }
    com.google.events.cloud.datastream.v1.PostgresqlSchema other =
        (com.google.events.cloud.datastream.v1.PostgresqlSchema) obj;

    if (!getSchema().equals(other.getSchema())) return false;
    if (!getPostgresqlTablesList().equals(other.getPostgresqlTablesList())) return false;
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
    hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getSchema().hashCode();
    if (getPostgresqlTablesCount() > 0) {
      hash = (37 * hash) + POSTGRESQL_TABLES_FIELD_NUMBER;
      hash = (53 * hash) + getPostgresqlTablesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema parseFrom(
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
      com.google.events.cloud.datastream.v1.PostgresqlSchema prototype) {
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
   * PostgreSQL schema.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.datastream.v1.PostgresqlSchema}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.datastream.v1.PostgresqlSchema)
      com.google.events.cloud.datastream.v1.PostgresqlSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_PostgresqlSchema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_PostgresqlSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.datastream.v1.PostgresqlSchema.class,
              com.google.events.cloud.datastream.v1.PostgresqlSchema.Builder.class);
    }

    // Construct using com.google.events.cloud.datastream.v1.PostgresqlSchema.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schema_ = "";
      if (postgresqlTablesBuilder_ == null) {
        postgresqlTables_ = java.util.Collections.emptyList();
      } else {
        postgresqlTables_ = null;
        postgresqlTablesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_PostgresqlSchema_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.PostgresqlSchema getDefaultInstanceForType() {
      return com.google.events.cloud.datastream.v1.PostgresqlSchema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.PostgresqlSchema build() {
      com.google.events.cloud.datastream.v1.PostgresqlSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.PostgresqlSchema buildPartial() {
      com.google.events.cloud.datastream.v1.PostgresqlSchema result =
          new com.google.events.cloud.datastream.v1.PostgresqlSchema(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.datastream.v1.PostgresqlSchema result) {
      if (postgresqlTablesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          postgresqlTables_ = java.util.Collections.unmodifiableList(postgresqlTables_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.postgresqlTables_ = postgresqlTables_;
      } else {
        result.postgresqlTables_ = postgresqlTablesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.events.cloud.datastream.v1.PostgresqlSchema result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schema_ = schema_;
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
      if (other instanceof com.google.events.cloud.datastream.v1.PostgresqlSchema) {
        return mergeFrom((com.google.events.cloud.datastream.v1.PostgresqlSchema) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.datastream.v1.PostgresqlSchema other) {
      if (other == com.google.events.cloud.datastream.v1.PostgresqlSchema.getDefaultInstance())
        return this;
      if (!other.getSchema().isEmpty()) {
        schema_ = other.schema_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (postgresqlTablesBuilder_ == null) {
        if (!other.postgresqlTables_.isEmpty()) {
          if (postgresqlTables_.isEmpty()) {
            postgresqlTables_ = other.postgresqlTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePostgresqlTablesIsMutable();
            postgresqlTables_.addAll(other.postgresqlTables_);
          }
          onChanged();
        }
      } else {
        if (!other.postgresqlTables_.isEmpty()) {
          if (postgresqlTablesBuilder_.isEmpty()) {
            postgresqlTablesBuilder_.dispose();
            postgresqlTablesBuilder_ = null;
            postgresqlTables_ = other.postgresqlTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
            postgresqlTablesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPostgresqlTablesFieldBuilder()
                    : null;
          } else {
            postgresqlTablesBuilder_.addAllMessages(other.postgresqlTables_);
          }
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
                schema_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.events.cloud.datastream.v1.PostgresqlTable m =
                    input.readMessage(
                        com.google.events.cloud.datastream.v1.PostgresqlTable.parser(),
                        extensionRegistry);
                if (postgresqlTablesBuilder_ == null) {
                  ensurePostgresqlTablesIsMutable();
                  postgresqlTables_.add(m);
                } else {
                  postgresqlTablesBuilder_.addMessage(m);
                }
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

    private java.lang.Object schema_ = "";
    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return The schema.
     */
    public java.lang.String getSchema() {
      java.lang.Object ref = schema_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schema_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return The bytes for schema.
     */
    public com.google.protobuf.ByteString getSchemaBytes() {
      java.lang.Object ref = schema_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @param value The schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchema(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchema() {
      schema_ = getDefaultInstance().getSchema();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @param value The bytes for schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.events.cloud.datastream.v1.PostgresqlTable>
        postgresqlTables_ = java.util.Collections.emptyList();

    private void ensurePostgresqlTablesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        postgresqlTables_ =
            new java.util.ArrayList<com.google.events.cloud.datastream.v1.PostgresqlTable>(
                postgresqlTables_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.PostgresqlTable,
            com.google.events.cloud.datastream.v1.PostgresqlTable.Builder,
            com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder>
        postgresqlTablesBuilder_;

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.PostgresqlTable>
        getPostgresqlTablesList() {
      if (postgresqlTablesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(postgresqlTables_);
      } else {
        return postgresqlTablesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public int getPostgresqlTablesCount() {
      if (postgresqlTablesBuilder_ == null) {
        return postgresqlTables_.size();
      } else {
        return postgresqlTablesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public com.google.events.cloud.datastream.v1.PostgresqlTable getPostgresqlTables(int index) {
      if (postgresqlTablesBuilder_ == null) {
        return postgresqlTables_.get(index);
      } else {
        return postgresqlTablesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder setPostgresqlTables(
        int index, com.google.events.cloud.datastream.v1.PostgresqlTable value) {
      if (postgresqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.set(index, value);
        onChanged();
      } else {
        postgresqlTablesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder setPostgresqlTables(
        int index, com.google.events.cloud.datastream.v1.PostgresqlTable.Builder builderForValue) {
      if (postgresqlTablesBuilder_ == null) {
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.set(index, builderForValue.build());
        onChanged();
      } else {
        postgresqlTablesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder addPostgresqlTables(
        com.google.events.cloud.datastream.v1.PostgresqlTable value) {
      if (postgresqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.add(value);
        onChanged();
      } else {
        postgresqlTablesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder addPostgresqlTables(
        int index, com.google.events.cloud.datastream.v1.PostgresqlTable value) {
      if (postgresqlTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.add(index, value);
        onChanged();
      } else {
        postgresqlTablesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder addPostgresqlTables(
        com.google.events.cloud.datastream.v1.PostgresqlTable.Builder builderForValue) {
      if (postgresqlTablesBuilder_ == null) {
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.add(builderForValue.build());
        onChanged();
      } else {
        postgresqlTablesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder addPostgresqlTables(
        int index, com.google.events.cloud.datastream.v1.PostgresqlTable.Builder builderForValue) {
      if (postgresqlTablesBuilder_ == null) {
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.add(index, builderForValue.build());
        onChanged();
      } else {
        postgresqlTablesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder addAllPostgresqlTables(
        java.lang.Iterable<? extends com.google.events.cloud.datastream.v1.PostgresqlTable>
            values) {
      if (postgresqlTablesBuilder_ == null) {
        ensurePostgresqlTablesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, postgresqlTables_);
        onChanged();
      } else {
        postgresqlTablesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder clearPostgresqlTables() {
      if (postgresqlTablesBuilder_ == null) {
        postgresqlTables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        postgresqlTablesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public Builder removePostgresqlTables(int index) {
      if (postgresqlTablesBuilder_ == null) {
        ensurePostgresqlTablesIsMutable();
        postgresqlTables_.remove(index);
        onChanged();
      } else {
        postgresqlTablesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public com.google.events.cloud.datastream.v1.PostgresqlTable.Builder getPostgresqlTablesBuilder(
        int index) {
      return getPostgresqlTablesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder
        getPostgresqlTablesOrBuilder(int index) {
      if (postgresqlTablesBuilder_ == null) {
        return postgresqlTables_.get(index);
      } else {
        return postgresqlTablesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public java.util.List<? extends com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder>
        getPostgresqlTablesOrBuilderList() {
      if (postgresqlTablesBuilder_ != null) {
        return postgresqlTablesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(postgresqlTables_);
      }
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public com.google.events.cloud.datastream.v1.PostgresqlTable.Builder
        addPostgresqlTablesBuilder() {
      return getPostgresqlTablesFieldBuilder()
          .addBuilder(com.google.events.cloud.datastream.v1.PostgresqlTable.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public com.google.events.cloud.datastream.v1.PostgresqlTable.Builder addPostgresqlTablesBuilder(
        int index) {
      return getPostgresqlTablesFieldBuilder()
          .addBuilder(
              index, com.google.events.cloud.datastream.v1.PostgresqlTable.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.PostgresqlTable postgresql_tables = 2;
     * </code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.PostgresqlTable.Builder>
        getPostgresqlTablesBuilderList() {
      return getPostgresqlTablesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.PostgresqlTable,
            com.google.events.cloud.datastream.v1.PostgresqlTable.Builder,
            com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder>
        getPostgresqlTablesFieldBuilder() {
      if (postgresqlTablesBuilder_ == null) {
        postgresqlTablesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.events.cloud.datastream.v1.PostgresqlTable,
                com.google.events.cloud.datastream.v1.PostgresqlTable.Builder,
                com.google.events.cloud.datastream.v1.PostgresqlTableOrBuilder>(
                postgresqlTables_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        postgresqlTables_ = null;
      }
      return postgresqlTablesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.datastream.v1.PostgresqlSchema)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.datastream.v1.PostgresqlSchema)
  private static final com.google.events.cloud.datastream.v1.PostgresqlSchema DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.datastream.v1.PostgresqlSchema();
  }

  public static com.google.events.cloud.datastream.v1.PostgresqlSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostgresqlSchema> PARSER =
      new com.google.protobuf.AbstractParser<PostgresqlSchema>() {
        @java.lang.Override
        public PostgresqlSchema parsePartialFrom(
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

  public static com.google.protobuf.Parser<PostgresqlSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostgresqlSchema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.datastream.v1.PostgresqlSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
