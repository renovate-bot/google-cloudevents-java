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
// source: google/events/firebase/testlab/v1/data.proto

package com.google.events.firebase.testlab.v1;

public interface TestMatrixEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.firebase.testlab.v1.TestMatrixEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time the test matrix was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Time the test matrix was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Time the test matrix was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * State of the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.TestState state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * State of the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.TestState state = 2;</code>
   *
   * @return The state.
   */
  com.google.events.firebase.testlab.v1.TestState getState();

  /**
   *
   *
   * <pre>
   * Code that describes why the test matrix is considered invalid. Only set for
   * matrices in the INVALID state.
   * </pre>
   *
   * <code>string invalid_matrix_details = 3;</code>
   *
   * @return The invalidMatrixDetails.
   */
  java.lang.String getInvalidMatrixDetails();
  /**
   *
   *
   * <pre>
   * Code that describes why the test matrix is considered invalid. Only set for
   * matrices in the INVALID state.
   * </pre>
   *
   * <code>string invalid_matrix_details = 3;</code>
   *
   * @return The bytes for invalidMatrixDetails.
   */
  com.google.protobuf.ByteString getInvalidMatrixDetailsBytes();

  /**
   *
   *
   * <pre>
   * Outcome summary of the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.OutcomeSummary outcome_summary = 4;</code>
   *
   * @return The enum numeric value on the wire for outcomeSummary.
   */
  int getOutcomeSummaryValue();
  /**
   *
   *
   * <pre>
   * Outcome summary of the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.OutcomeSummary outcome_summary = 4;</code>
   *
   * @return The outcomeSummary.
   */
  com.google.events.firebase.testlab.v1.OutcomeSummary getOutcomeSummary();

  /**
   *
   *
   * <pre>
   * Locations where test results are stored.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ResultStorage result_storage = 5;</code>
   *
   * @return Whether the resultStorage field is set.
   */
  boolean hasResultStorage();
  /**
   *
   *
   * <pre>
   * Locations where test results are stored.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ResultStorage result_storage = 5;</code>
   *
   * @return The resultStorage.
   */
  com.google.events.firebase.testlab.v1.ResultStorage getResultStorage();
  /**
   *
   *
   * <pre>
   * Locations where test results are stored.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ResultStorage result_storage = 5;</code>
   */
  com.google.events.firebase.testlab.v1.ResultStorageOrBuilder getResultStorageOrBuilder();

  /**
   *
   *
   * <pre>
   * Information provided by the client that created the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ClientInfo client_info = 6;</code>
   *
   * @return Whether the clientInfo field is set.
   */
  boolean hasClientInfo();
  /**
   *
   *
   * <pre>
   * Information provided by the client that created the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ClientInfo client_info = 6;</code>
   *
   * @return The clientInfo.
   */
  com.google.events.firebase.testlab.v1.ClientInfo getClientInfo();
  /**
   *
   *
   * <pre>
   * Information provided by the client that created the test matrix.
   * </pre>
   *
   * <code>.google.events.firebase.testlab.v1.ClientInfo client_info = 6;</code>
   */
  com.google.events.firebase.testlab.v1.ClientInfoOrBuilder getClientInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * ID of the test matrix this event belongs to.
   * </pre>
   *
   * <code>string test_matrix_id = 7;</code>
   *
   * @return The testMatrixId.
   */
  java.lang.String getTestMatrixId();
  /**
   *
   *
   * <pre>
   * ID of the test matrix this event belongs to.
   * </pre>
   *
   * <code>string test_matrix_id = 7;</code>
   *
   * @return The bytes for testMatrixId.
   */
  com.google.protobuf.ByteString getTestMatrixIdBytes();
}
