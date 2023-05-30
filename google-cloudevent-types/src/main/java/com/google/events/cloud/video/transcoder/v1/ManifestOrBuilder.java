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
// source: google/events/cloud/video/transcoder/v1/data.proto

package com.google.events.cloud.video.transcoder.v1;

public interface ManifestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.video.transcoder.v1.Manifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the generated file. The default is `manifest` with the
   * extension suffix corresponding to the `Manifest.type`.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   *
   *
   * <pre>
   * The name of the generated file. The default is `manifest` with the
   * extension suffix corresponding to the `Manifest.type`.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Type of the manifest.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.Manifest.ManifestType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of the manifest.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.Manifest.ManifestType type = 2;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.video.transcoder.v1.Manifest.ManifestType getType();

  /**
   *
   *
   * <pre>
   * Required. List of user given `MuxStream.key`s that should appear in this
   * manifest.
   * When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key`
   * and `.m3u8` extension is generated for each element of the
   * `Manifest.mux_streams`.
   * </pre>
   *
   * <code>repeated string mux_streams = 3;</code>
   *
   * @return A list containing the muxStreams.
   */
  java.util.List<java.lang.String> getMuxStreamsList();
  /**
   *
   *
   * <pre>
   * Required. List of user given `MuxStream.key`s that should appear in this
   * manifest.
   * When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key`
   * and `.m3u8` extension is generated for each element of the
   * `Manifest.mux_streams`.
   * </pre>
   *
   * <code>repeated string mux_streams = 3;</code>
   *
   * @return The count of muxStreams.
   */
  int getMuxStreamsCount();
  /**
   *
   *
   * <pre>
   * Required. List of user given `MuxStream.key`s that should appear in this
   * manifest.
   * When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key`
   * and `.m3u8` extension is generated for each element of the
   * `Manifest.mux_streams`.
   * </pre>
   *
   * <code>repeated string mux_streams = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The muxStreams at the given index.
   */
  java.lang.String getMuxStreams(int index);
  /**
   *
   *
   * <pre>
   * Required. List of user given `MuxStream.key`s that should appear in this
   * manifest.
   * When `Manifest.type` is `HLS`, a media manifest with name `MuxStream.key`
   * and `.m3u8` extension is generated for each element of the
   * `Manifest.mux_streams`.
   * </pre>
   *
   * <code>repeated string mux_streams = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the muxStreams at the given index.
   */
  com.google.protobuf.ByteString getMuxStreamsBytes(int index);
}