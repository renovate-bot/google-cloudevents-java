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
// source: google/events/cloud/iot/v1/data.proto

package com.google.events.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The supported formats for the public key.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.iot.v1.PublicKeyFormat}
 */
public enum PublicKeyFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_FORMAT = 0;</code>
   */
  UNSPECIFIED_PUBLIC_KEY_FORMAT(0),
  /**
   *
   *
   * <pre>
   * An RSA public key encoded in base64, and wrapped by
   * `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC KEY-----`. This can be
   * used to verify `RS256` signatures in JWT tokens ([RFC7518](
   * https://www.ietf.org/rfc/rfc7518.txt)).
   * </pre>
   *
   * <code>RSA_PEM = 3;</code>
   */
  RSA_PEM(3),
  /**
   *
   *
   * <pre>
   * As RSA_PEM, but wrapped in an X.509v3 certificate ([RFC5280](
   * https://www.ietf.org/rfc/rfc5280.txt)), encoded in base64, and wrapped by
   * `-----BEGIN CERTIFICATE-----` and `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>RSA_X509_PEM = 1;</code>
   */
  RSA_X509_PEM(1),
  /**
   *
   *
   * <pre>
   * Public key for the ECDSA algorithm using P-256 and SHA-256, encoded in
   * base64, and wrapped by `-----BEGIN PUBLIC KEY-----` and `-----END
   * PUBLIC KEY-----`. This can be used to verify JWT tokens with the `ES256`
   * algorithm ([RFC7518](https://www.ietf.org/rfc/rfc7518.txt)). This curve is
   * defined in [OpenSSL](https://www.openssl.org/) as the `prime256v1` curve.
   * </pre>
   *
   * <code>ES256_PEM = 2;</code>
   */
  ES256_PEM(2),
  /**
   *
   *
   * <pre>
   * As ES256_PEM, but wrapped in an X.509v3 certificate ([RFC5280](
   * https://www.ietf.org/rfc/rfc5280.txt)), encoded in base64, and wrapped by
   * `-----BEGIN CERTIFICATE-----` and `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>ES256_X509_PEM = 4;</code>
   */
  ES256_X509_PEM(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_FORMAT = 0;</code>
   */
  public static final int UNSPECIFIED_PUBLIC_KEY_FORMAT_VALUE = 0;
  /**
   *
   *
   * <pre>
   * An RSA public key encoded in base64, and wrapped by
   * `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC KEY-----`. This can be
   * used to verify `RS256` signatures in JWT tokens ([RFC7518](
   * https://www.ietf.org/rfc/rfc7518.txt)).
   * </pre>
   *
   * <code>RSA_PEM = 3;</code>
   */
  public static final int RSA_PEM_VALUE = 3;
  /**
   *
   *
   * <pre>
   * As RSA_PEM, but wrapped in an X.509v3 certificate ([RFC5280](
   * https://www.ietf.org/rfc/rfc5280.txt)), encoded in base64, and wrapped by
   * `-----BEGIN CERTIFICATE-----` and `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>RSA_X509_PEM = 1;</code>
   */
  public static final int RSA_X509_PEM_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Public key for the ECDSA algorithm using P-256 and SHA-256, encoded in
   * base64, and wrapped by `-----BEGIN PUBLIC KEY-----` and `-----END
   * PUBLIC KEY-----`. This can be used to verify JWT tokens with the `ES256`
   * algorithm ([RFC7518](https://www.ietf.org/rfc/rfc7518.txt)). This curve is
   * defined in [OpenSSL](https://www.openssl.org/) as the `prime256v1` curve.
   * </pre>
   *
   * <code>ES256_PEM = 2;</code>
   */
  public static final int ES256_PEM_VALUE = 2;
  /**
   *
   *
   * <pre>
   * As ES256_PEM, but wrapped in an X.509v3 certificate ([RFC5280](
   * https://www.ietf.org/rfc/rfc5280.txt)), encoded in base64, and wrapped by
   * `-----BEGIN CERTIFICATE-----` and `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>ES256_X509_PEM = 4;</code>
   */
  public static final int ES256_X509_PEM_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PublicKeyFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PublicKeyFormat forNumber(int value) {
    switch (value) {
      case 0:
        return UNSPECIFIED_PUBLIC_KEY_FORMAT;
      case 3:
        return RSA_PEM;
      case 1:
        return RSA_X509_PEM;
      case 2:
        return ES256_PEM;
      case 4:
        return ES256_X509_PEM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PublicKeyFormat> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PublicKeyFormat> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PublicKeyFormat>() {
        public PublicKeyFormat findValueByNumber(int number) {
          return PublicKeyFormat.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.events.cloud.iot.v1.Data.getDescriptor().getEnumTypes().get(6);
  }

  private static final PublicKeyFormat[] VALUES = values();

  public static PublicKeyFormat valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PublicKeyFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.iot.v1.PublicKeyFormat)
}
