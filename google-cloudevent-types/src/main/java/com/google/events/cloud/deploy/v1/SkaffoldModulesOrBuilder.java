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

public interface SkaffoldModulesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.deploy.v1.SkaffoldModules)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1;</code>
   *
   * @return A list containing the configs.
   */
  java.util.List<java.lang.String> getConfigsList();

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1;</code>
   *
   * @return The count of configs.
   */
  int getConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The configs at the given index.
   */
  java.lang.String getConfigs(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the configs at the given index.
   */
  com.google.protobuf.ByteString getConfigsBytes(int index);

  /**
   *
   *
   * <pre>
   * Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2;</code>
   *
   * @return Whether the git field is set.
   */
  boolean hasGit();

  /**
   *
   *
   * <pre>
   * Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2;</code>
   *
   * @return The git.
   */
  com.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource getGit();

  /**
   *
   *
   * <pre>
   * Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2;</code>
   */
  com.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSourceOrBuilder getGitOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3;
   * </code>
   *
   * @return Whether the googleCloudStorage field is set.
   */
  boolean hasGoogleCloudStorage();

  /**
   *
   *
   * <pre>
   * Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3;
   * </code>
   *
   * @return The googleCloudStorage.
   */
  com.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource getGoogleCloudStorage();

  /**
   *
   *
   * <pre>
   * Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3;
   * </code>
   */
  com.google.events.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSourceOrBuilder
      getGoogleCloudStorageOrBuilder();

  public com.google.events.cloud.deploy.v1.SkaffoldModules.SourceCase getSourceCase();
}