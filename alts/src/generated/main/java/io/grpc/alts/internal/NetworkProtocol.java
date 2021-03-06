// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/gcp/handshaker.proto

package io.grpc.alts.internal;

/**
 * Protobuf enum {@code grpc.gcp.NetworkProtocol}
 */
public enum NetworkProtocol
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NETWORK_PROTOCOL_UNSPECIFIED = 0;</code>
   */
  NETWORK_PROTOCOL_UNSPECIFIED(0),
  /**
   * <code>TCP = 1;</code>
   */
  TCP(1),
  /**
   * <code>UDP = 2;</code>
   */
  UDP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NETWORK_PROTOCOL_UNSPECIFIED = 0;</code>
   */
  public static final int NETWORK_PROTOCOL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>TCP = 1;</code>
   */
  public static final int TCP_VALUE = 1;
  /**
   * <code>UDP = 2;</code>
   */
  public static final int UDP_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NetworkProtocol valueOf(int value) {
    return forNumber(value);
  }

  public static NetworkProtocol forNumber(int value) {
    switch (value) {
      case 0: return NETWORK_PROTOCOL_UNSPECIFIED;
      case 1: return TCP;
      case 2: return UDP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NetworkProtocol>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NetworkProtocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NetworkProtocol>() {
          public NetworkProtocol findValueByNumber(int number) {
            return NetworkProtocol.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grpc.alts.internal.HandshakerProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final NetworkProtocol[] VALUES = values();

  public static NetworkProtocol valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NetworkProtocol(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc.gcp.NetworkProtocol)
}

