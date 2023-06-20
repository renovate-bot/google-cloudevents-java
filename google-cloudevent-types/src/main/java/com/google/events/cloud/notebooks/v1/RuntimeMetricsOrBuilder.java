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
// source: google/events/cloud/notebooks/v1/data.proto

package com.google.events.cloud.notebooks.v1;

public interface RuntimeMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.notebooks.v1.RuntimeMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1;</code>
   */
  int getSystemMetricsCount();
  /**
   *
   *
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1;</code>
   */
  boolean containsSystemMetrics(java.lang.String key);
  /** Use {@link #getSystemMetricsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getSystemMetrics();
  /**
   *
   *
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getSystemMetricsMap();
  /**
   *
   *
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1;</code>
   */
  /* nullable */
  java.lang.String getSystemMetricsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1;</code>
   */
  java.lang.String getSystemMetricsOrThrow(java.lang.String key);
}
