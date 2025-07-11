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
// source: google/events/firebase/remoteconfig/v1/data.proto

package com.google.events.firebase.remoteconfig.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigEventData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigUser_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/events/firebase/remoteconfig/v1"
          + "/data.proto\022&google.events.firebase.remo"
          + "teconfig.v1\032\037google/protobuf/timestamp.p"
          + "roto\"\213\003\n\025RemoteConfigEventData\022\026\n\016versio"
          + "n_number\030\001 \001(\003\022/\n\013update_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022M\n\013update_user\030\003"
          + " \001(\01328.google.events.firebase.remoteconf"
          + "ig.v1.RemoteConfigUser\022\023\n\013description\030\004 "
          + "\001(\t\022W\n\rupdate_origin\030\005 \001(\0162@.google.even"
          + "ts.firebase.remoteconfig.v1.RemoteConfig"
          + "UpdateOrigin\022S\n\013update_type\030\006 \001(\0162>.goog"
          + "le.events.firebase.remoteconfig.v1.Remot"
          + "eConfigUpdateType\022\027\n\017rollback_source\030\007 \001"
          + "(\003\"B\n\020RemoteConfigUser\022\014\n\004name\030\001 \001(\t\022\r\n\005"
          + "email\030\002 \001(\t\022\021\n\timage_url\030\003 \001(\t*v\n\030Remote"
          + "ConfigUpdateOrigin\022+\n\'REMOTE_CONFIG_UPDA"
          + "TE_ORIGIN_UNSPECIFIED\020\000\022\013\n\007CONSOLE\020\001\022\014\n\010"
          + "REST_API\020\002\022\022\n\016ADMIN_SDK_NODE\020\003*|\n\026Remote"
          + "ConfigUpdateType\022)\n%REMOTE_CONFIG_UPDATE"
          + "_TYPE_UNSPECIFIED\020\000\022\026\n\022INCREMENTAL_UPDAT"
          + "E\020\001\022\021\n\rFORCED_UPDATE\020\002\022\014\n\010ROLLBACK\020\003B\266\001\n"
          + "*com.google.events.firebase.remoteconfig"
          + ".v1P\001\252\002/Google.Events.Protobuf.Firebase."
          + "RemoteConfig.V1\312\002&Google\\Events\\Firebase"
          + "\\RemoteConfig\\V1\352\002*Google::Events::Fireb"
          + "ase::RemoteConfig::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigEventData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigEventData_descriptor,
            new java.lang.String[] {
              "VersionNumber",
              "UpdateTime",
              "UpdateUser",
              "Description",
              "UpdateOrigin",
              "UpdateType",
              "RollbackSource",
            });
    internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigUser_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigUser_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_firebase_remoteconfig_v1_RemoteConfigUser_descriptor,
            new java.lang.String[] {
              "Name", "Email", "ImageUrl",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
