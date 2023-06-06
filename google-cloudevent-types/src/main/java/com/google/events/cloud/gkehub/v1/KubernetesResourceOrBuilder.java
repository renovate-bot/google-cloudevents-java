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
// source: google/events/cloud/gkehub/v1/data.proto

package com.google.events.cloud.gkehub.v1;

public interface KubernetesResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.gkehub.v1.KubernetesResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the
   * cluster after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest membership_resources = 2;</code>
   */
  java.util.List<com.google.events.cloud.gkehub.v1.ResourceManifest> getMembershipResourcesList();
  /**
   *
   *
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the
   * cluster after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest membership_resources = 2;</code>
   */
  com.google.events.cloud.gkehub.v1.ResourceManifest getMembershipResources(int index);
  /**
   *
   *
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the
   * cluster after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest membership_resources = 2;</code>
   */
  int getMembershipResourcesCount();
  /**
   *
   *
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the
   * cluster after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest membership_resources = 2;</code>
   */
  java.util.List<? extends com.google.events.cloud.gkehub.v1.ResourceManifestOrBuilder>
      getMembershipResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Additional Kubernetes resources that need to be applied to the
   * cluster after Membership creation, and after every update.
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest membership_resources = 2;</code>
   */
  com.google.events.cloud.gkehub.v1.ResourceManifestOrBuilder getMembershipResourcesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest connect_resources = 3;</code>
   */
  java.util.List<com.google.events.cloud.gkehub.v1.ResourceManifest> getConnectResourcesList();
  /**
   *
   *
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest connect_resources = 3;</code>
   */
  com.google.events.cloud.gkehub.v1.ResourceManifest getConnectResources(int index);
  /**
   *
   *
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest connect_resources = 3;</code>
   */
  int getConnectResourcesCount();
  /**
   *
   *
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest connect_resources = 3;</code>
   */
  java.util.List<? extends com.google.events.cloud.gkehub.v1.ResourceManifestOrBuilder>
      getConnectResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The Kubernetes resources for installing the GKE Connect agent
   * This field is only populated in the Membership returned from a successful
   * long-running operation from CreateMembership or UpdateMembership. It is not
   * populated during normal GetMembership or ListMemberships requests. To get
   * the resource manifest after the initial registration, the caller should
   * make a UpdateMembership call with an empty field mask.
   * </pre>
   *
   * <code>repeated .google.events.cloud.gkehub.v1.ResourceManifest connect_resources = 3;</code>
   */
  com.google.events.cloud.gkehub.v1.ResourceManifestOrBuilder getConnectResourcesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ResourceOptions resource_options = 4;</code>
   *
   * @return Whether the resourceOptions field is set.
   */
  boolean hasResourceOptions();
  /**
   *
   *
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ResourceOptions resource_options = 4;</code>
   *
   * @return The resourceOptions.
   */
  com.google.events.cloud.gkehub.v1.ResourceOptions getResourceOptions();
  /**
   *
   *
   * <pre>
   * Optional. Options for Kubernetes resource generation.
   * </pre>
   *
   * <code>.google.events.cloud.gkehub.v1.ResourceOptions resource_options = 4;</code>
   */
  com.google.events.cloud.gkehub.v1.ResourceOptionsOrBuilder getResourceOptionsOrBuilder();
}