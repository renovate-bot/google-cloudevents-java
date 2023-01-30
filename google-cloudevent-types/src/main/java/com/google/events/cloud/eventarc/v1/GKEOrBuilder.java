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
// source: google/events/cloud/eventarc/v1/data.proto

package com.google.events.cloud.eventarc.v1;

public interface GKEOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.eventarc.v1.GKE)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the cluster the GKE service is running in. The
   * cluster must be running in the same project as the trigger being created.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   *
   *
   * <pre>
   * Required. The name of the cluster the GKE service is running in. The
   * cluster must be running in the same project as the trigger being created.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the Google Compute Engine in which the cluster
   * resides, which can either be compute zone (for example, us-central1-a) for
   * the zonal clusters or region (for example, us-central1) for regional
   * clusters.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Required. The name of the Google Compute Engine in which the cluster
   * resides, which can either be compute zone (for example, us-central1-a) for
   * the zonal clusters or region (for example, us-central1) for regional
   * clusters.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Required. The namespace the GKE service is running in.
   * </pre>
   *
   * <code>string namespace = 3;</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();
  /**
   *
   *
   * <pre>
   * Required. The namespace the GKE service is running in.
   * </pre>
   *
   * <code>string namespace = 3;</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the GKE service.
   * </pre>
   *
   * <code>string service = 4;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Required. Name of the GKE service.
   * </pre>
   *
   * <code>string service = 4;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The relative path on the GKE service the events should be sent
   * to.
   * The value must conform to the definition of a URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 5;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Optional. The relative path on the GKE service the events should be sent
   * to.
   * The value must conform to the definition of a URI path segment (section 3.3
   * of RFC2396). Examples: "/route", "route", "route/subroute".
   * </pre>
   *
   * <code>string path = 5;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();
}
