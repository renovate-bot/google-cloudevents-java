/*
 * Copyright 2024 Google LLC
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

public interface RuntimeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   *
   * @return Whether the kubernetes field is set.
   */
  boolean hasKubernetes();

  /**
   *
   *
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   *
   * @return The kubernetes.
   */
  com.google.events.cloud.deploy.v1.KubernetesConfig getKubernetes();

  /**
   *
   *
   * <pre>
   * Kubernetes runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.KubernetesConfig kubernetes = 1;</code>
   */
  com.google.events.cloud.deploy.v1.KubernetesConfigOrBuilder getKubernetesOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   *
   * @return Whether the cloudRun field is set.
   */
  boolean hasCloudRun();

  /**
   *
   *
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   *
   * @return The cloudRun.
   */
  com.google.events.cloud.deploy.v1.CloudRunConfig getCloudRun();

  /**
   *
   *
   * <pre>
   * Cloud Run runtime configuration.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.CloudRunConfig cloud_run = 2;</code>
   */
  com.google.events.cloud.deploy.v1.CloudRunConfigOrBuilder getCloudRunOrBuilder();

  public com.google.events.cloud.deploy.v1.RuntimeConfig.RuntimeConfigCase getRuntimeConfigCase();
}