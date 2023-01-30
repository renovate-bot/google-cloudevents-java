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
// source: google/events/cloud/certificatemanager/v1/data.proto

package com.google.events.cloud.certificatemanager.v1;

public interface DnsAuthorizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.certificatemanager.v1.DnsAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the dns authorization. DnsAuthorization names must
   * be unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;dnsAuthorizations/&#42;`.
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
   * A user-defined name of the dns authorization. DnsAuthorization names must
   * be unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;dnsAuthorizations/&#42;`.
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
   * Output only. The creation timestamp of a DnsAuthorization.
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
   * Output only. The creation timestamp of a DnsAuthorization.
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
   * Output only. The creation timestamp of a DnsAuthorization.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a DnsAuthorization.
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
   * Output only. The last update timestamp of a DnsAuthorization.
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
   * Output only. The last update timestamp of a DnsAuthorization.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a DnsAuthorization.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Set of labels associated with a DnsAuthorization.
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
   * Set of labels associated with a DnsAuthorization.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Set of labels associated with a DnsAuthorization.
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
   * Set of labels associated with a DnsAuthorization.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of a DnsAuthorization.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of a DnsAuthorization.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. A domain that is being authorized. A DnsAuthorization resource covers a
   * single domain and its wildcard, e.g. authorization for `example.com` can
   * be used to issue certificates for `example.com` and `*.example.com`.
   * </pre>
   *
   * <code>string domain = 6;</code>
   *
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   *
   *
   * <pre>
   * Required. Immutable. A domain that is being authorized. A DnsAuthorization resource covers a
   * single domain and its wildcard, e.g. authorization for `example.com` can
   * be used to issue certificates for `example.com` and `*.example.com`.
   * </pre>
   *
   * <code>string domain = 6;</code>
   *
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString getDomainBytes();

  /**
   *
   *
   * <pre>
   * Output only. DNS Resource Record that needs to be added to DNS configuration.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.DnsAuthorization.DnsResourceRecord dns_resource_record = 10;
   * </code>
   *
   * @return Whether the dnsResourceRecord field is set.
   */
  boolean hasDnsResourceRecord();
  /**
   *
   *
   * <pre>
   * Output only. DNS Resource Record that needs to be added to DNS configuration.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.DnsAuthorization.DnsResourceRecord dns_resource_record = 10;
   * </code>
   *
   * @return The dnsResourceRecord.
   */
  com.google.events.cloud.certificatemanager.v1.DnsAuthorization.DnsResourceRecord
      getDnsResourceRecord();
  /**
   *
   *
   * <pre>
   * Output only. DNS Resource Record that needs to be added to DNS configuration.
   * </pre>
   *
   * <code>
   * .google.events.cloud.certificatemanager.v1.DnsAuthorization.DnsResourceRecord dns_resource_record = 10;
   * </code>
   */
  com.google.events.cloud.certificatemanager.v1.DnsAuthorization.DnsResourceRecordOrBuilder
      getDnsResourceRecordOrBuilder();
}
