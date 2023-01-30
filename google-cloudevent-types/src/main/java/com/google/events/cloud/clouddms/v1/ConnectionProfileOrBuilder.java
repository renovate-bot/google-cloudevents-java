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
// source: google/events/cloud/clouddms/v1/data.proto

package com.google.events.cloud.clouddms.v1;

public interface ConnectionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.clouddms.v1.ConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this connection profile resource in the form of
   * projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of this connection profile resource in the form of
   * projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was last updated.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was last updated.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was last updated.
   * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds.
   * Example: "2014-10-02T15:01:23.045123456Z".
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource labels for connection profile to use to annotate any related
   * underlying resources such as Compute Engine VMs. An object containing a
   * list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The resource labels for connection profile to use to annotate any related
   * underlying resources such as Compute Engine VMs. An object containing a
   * list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The resource labels for connection profile to use to annotate any related
   * underlying resources such as Compute Engine VMs. An object containing a
   * list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The resource labels for connection profile to use to annotate any related
   * underlying resources such as Compute Engine VMs. An object containing a
   * list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The resource labels for connection profile to use to annotate any related
   * underlying resources such as Compute Engine VMs. An object containing a
   * list of "key": "value" pairs.
   * Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The current connection profile state (e.g. DRAFT, READY, or FAILED).
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.ConnectionProfile.State state = 5;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current connection profile state (e.g. DRAFT, READY, or FAILED).
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.ConnectionProfile.State state = 5;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.clouddms.v1.ConnectionProfile.State getState();

  /**
   *
   *
   * <pre>
   * The connection profile display name.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The connection profile display name.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.MySqlConnectionProfile mysql = 100;</code>
   *
   * @return Whether the mysql field is set.
   */
  boolean hasMysql();
  /**
   *
   *
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.MySqlConnectionProfile mysql = 100;</code>
   *
   * @return The mysql.
   */
  com.google.events.cloud.clouddms.v1.MySqlConnectionProfile getMysql();
  /**
   *
   *
   * <pre>
   * A MySQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.MySqlConnectionProfile mysql = 100;</code>
   */
  com.google.events.cloud.clouddms.v1.MySqlConnectionProfileOrBuilder getMysqlOrBuilder();

  /**
   *
   *
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   *
   * @return Whether the postgresql field is set.
   */
  boolean hasPostgresql();
  /**
   *
   *
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   *
   * @return The postgresql.
   */
  com.google.events.cloud.clouddms.v1.PostgreSqlConnectionProfile getPostgresql();
  /**
   *
   *
   * <pre>
   * A PostgreSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.PostgreSqlConnectionProfile postgresql = 101;</code>
   */
  com.google.events.cloud.clouddms.v1.PostgreSqlConnectionProfileOrBuilder getPostgresqlOrBuilder();

  /**
   *
   *
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   *
   * @return Whether the cloudsql field is set.
   */
  boolean hasCloudsql();
  /**
   *
   *
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   *
   * @return The cloudsql.
   */
  com.google.events.cloud.clouddms.v1.CloudSqlConnectionProfile getCloudsql();
  /**
   *
   *
   * <pre>
   * A CloudSQL database connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.CloudSqlConnectionProfile cloudsql = 102;</code>
   */
  com.google.events.cloud.clouddms.v1.CloudSqlConnectionProfileOrBuilder getCloudsqlOrBuilder();

  /**
   *
   *
   * <pre>
   * An AlloyDB cluster connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile alloydb = 105;</code>
   *
   * @return Whether the alloydb field is set.
   */
  boolean hasAlloydb();
  /**
   *
   *
   * <pre>
   * An AlloyDB cluster connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile alloydb = 105;</code>
   *
   * @return The alloydb.
   */
  com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile getAlloydb();
  /**
   *
   *
   * <pre>
   * An AlloyDB cluster connection profile.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.AlloyDbConnectionProfile alloydb = 105;</code>
   */
  com.google.events.cloud.clouddms.v1.AlloyDbConnectionProfileOrBuilder getAlloydbOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 7;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 7;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. The error details in case of state FAILED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 7;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 8;</code>
   *
   * @return The enum numeric value on the wire for provider.
   */
  int getProviderValue();
  /**
   *
   *
   * <pre>
   * The database provider.
   * </pre>
   *
   * <code>.google.events.cloud.clouddms.v1.DatabaseProvider provider = 8;</code>
   *
   * @return The provider.
   */
  com.google.events.cloud.clouddms.v1.DatabaseProvider getProvider();

  public com.google.events.cloud.clouddms.v1.ConnectionProfile.ConnectionProfileCase
      getConnectionProfileCase();
}
