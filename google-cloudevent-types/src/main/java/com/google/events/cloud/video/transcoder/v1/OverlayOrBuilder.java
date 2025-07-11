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
// source: google/events/cloud/video/transcoder/v1/data.proto

package com.google.events.cloud.video.transcoder.v1;

public interface OverlayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.video.transcoder.v1.Overlay)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Image overlay.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.Overlay.Image image = 1;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();

  /**
   *
   *
   * <pre>
   * Image overlay.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.Overlay.Image image = 1;</code>
   *
   * @return The image.
   */
  com.google.events.cloud.video.transcoder.v1.Overlay.Image getImage();

  /**
   *
   *
   * <pre>
   * Image overlay.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.Overlay.Image image = 1;</code>
   */
  com.google.events.cloud.video.transcoder.v1.Overlay.ImageOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * List of Animations. The list should be chronological, without any time
   * overlap.
   * </pre>
   *
   * <code>repeated .google.events.cloud.video.transcoder.v1.Overlay.Animation animations = 2;
   * </code>
   */
  java.util.List<com.google.events.cloud.video.transcoder.v1.Overlay.Animation> getAnimationsList();

  /**
   *
   *
   * <pre>
   * List of Animations. The list should be chronological, without any time
   * overlap.
   * </pre>
   *
   * <code>repeated .google.events.cloud.video.transcoder.v1.Overlay.Animation animations = 2;
   * </code>
   */
  com.google.events.cloud.video.transcoder.v1.Overlay.Animation getAnimations(int index);

  /**
   *
   *
   * <pre>
   * List of Animations. The list should be chronological, without any time
   * overlap.
   * </pre>
   *
   * <code>repeated .google.events.cloud.video.transcoder.v1.Overlay.Animation animations = 2;
   * </code>
   */
  int getAnimationsCount();

  /**
   *
   *
   * <pre>
   * List of Animations. The list should be chronological, without any time
   * overlap.
   * </pre>
   *
   * <code>repeated .google.events.cloud.video.transcoder.v1.Overlay.Animation animations = 2;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.video.transcoder.v1.Overlay.AnimationOrBuilder>
      getAnimationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of Animations. The list should be chronological, without any time
   * overlap.
   * </pre>
   *
   * <code>repeated .google.events.cloud.video.transcoder.v1.Overlay.Animation animations = 2;
   * </code>
   */
  com.google.events.cloud.video.transcoder.v1.Overlay.AnimationOrBuilder getAnimationsOrBuilder(
      int index);
}
