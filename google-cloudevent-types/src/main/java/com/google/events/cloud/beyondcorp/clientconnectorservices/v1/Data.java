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
// source: google/events/cloud/beyondcorp/clientconnectorservices/v1/data.proto

package com.google.events.cloud.beyondcorp.clientconnectorservices.v1;

public final class Data {
  private Data() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/events/cloud/beyondcorp/clientc"
          + "onnectorservices/v1/data.proto\0229google.e"
          + "vents.cloud.beyondcorp.clientconnectorse"
          + "rvices.v1\032\037google/protobuf/timestamp.pro"
          + "to\"\271\n\n\026ClientConnectorService\022\014\n\004name\030\001 "
          + "\001(\t\022/\n\013create_time\030\002 \001(\0132\032.google.protob"
          + "uf.Timestamp\022/\n\013update_time\030\003 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\022\024\n\014display_name\030\004 "
          + "\001(\t\022j\n\007ingress\030\006 \001(\0132Y.google.events.clo"
          + "ud.beyondcorp.clientconnectorservices.v1"
          + ".ClientConnectorService.Ingress\022h\n\006egres"
          + "s\030\007 \001(\0132X.google.events.cloud.beyondcorp"
          + ".clientconnectorservices.v1.ClientConnec"
          + "torService.Egress\022f\n\005state\030\010 \001(\0162W.googl"
          + "e.events.cloud.beyondcorp.clientconnecto"
          + "rservices.v1.ClientConnectorService.Stat"
          + "e\032\263\004\n\007Ingress\022r\n\006config\030\001 \001(\0132`.google.e"
          + "vents.cloud.beyondcorp.clientconnectorse"
          + "rvices.v1.ClientConnectorService.Ingress"
          + ".ConfigH\000\032\241\003\n\006Config\022\216\001\n\022transport_proto"
          + "col\030\001 \001(\0162r.google.events.cloud.beyondco"
          + "rp.clientconnectorservices.v1.ClientConn"
          + "ectorService.Ingress.Config.TransportPro"
          + "tocol\022\215\001\n\022destination_routes\030\002 \003(\0132q.goo"
          + "gle.events.cloud.beyondcorp.clientconnec"
          + "torservices.v1.ClientConnectorService.In"
          + "gress.Config.DestinationRoute\0324\n\020Destina"
          + "tionRoute\022\017\n\007address\030\001 \001(\t\022\017\n\007netmask\030\002 "
          + "\001(\t\"@\n\021TransportProtocol\022\"\n\036TRANSPORT_PR"
          + "OTOCOL_UNSPECIFIED\020\000\022\007\n\003TCP\020\001B\020\n\016ingress"
          + "_config\032\270\001\n\006Egress\022x\n\npeered_vpc\030\001 \001(\0132b"
          + ".google.events.cloud.beyondcorp.clientco"
          + "nnectorservices.v1.ClientConnectorServic"
          + "e.Egress.PeeredVpcH\000\032 \n\tPeeredVpc\022\023\n\013net"
          + "work_vpc\030\001 \001(\tB\022\n\020destination_type\"j\n\005St"
          + "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001"
          + "\022\014\n\010UPDATING\020\002\022\014\n\010DELETING\020\003\022\013\n\007RUNNING\020"
          + "\004\022\010\n\004DOWN\020\005\022\t\n\005ERROR\020\006\"\226\001\n\037ClientConnect"
          + "orServiceEventData\022g\n\007payload\030\001 \001(\0132Q.go"
          + "ogle.events.cloud.beyondcorp.clientconne"
          + "ctorservices.v1.ClientConnectorServiceH\000"
          + "\210\001\001B\n\n\010_payloadB\206\001\n=com.google.events.cl"
          + "oud.beyondcorp.clientconnectorservices.v"
          + "1P\001\252\002BGoogle.Events.Protobuf.Cloud.Beyon"
          + "dCorp.ClientConnectorServices.V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "DisplayName", "Ingress", "Egress", "State",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor =
        internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor,
            new java.lang.String[] {
              "Config", "IngressConfig",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor =
        internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor,
            new java.lang.String[] {
              "TransportProtocol", "DestinationRoutes",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor =
        internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor,
            new java.lang.String[] {
              "Address", "Netmask",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor =
        internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor,
            new java.lang.String[] {
              "PeeredVpc", "DestinationType",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor =
        internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor,
            new java.lang.String[] {
              "NetworkVpc",
            });
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor,
            new java.lang.String[] {
              "Payload", "Payload",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
