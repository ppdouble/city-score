// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: score-segment.proto

package com.nils.grpc.scoresegment;

/**
 * Protobuf enum {@code scoresegment.ScoreSegmentErrorCode}
 */
public enum ScoreSegmentErrorCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INVALID_ID_NUMBER_VALUE = 0;</code>
   */
  INVALID_ID_NUMBER_VALUE(0),
  /**
   * <code>ID_NUMBER_CANNOT_BE_NULL = 1;</code>
   */
  ID_NUMBER_CANNOT_BE_NULL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INVALID_ID_NUMBER_VALUE = 0;</code>
   */
  public static final int INVALID_ID_NUMBER_VALUE_VALUE = 0;
  /**
   * <code>ID_NUMBER_CANNOT_BE_NULL = 1;</code>
   */
  public static final int ID_NUMBER_CANNOT_BE_NULL_VALUE = 1;


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
  public static ScoreSegmentErrorCode valueOf(int value) {
    return forNumber(value);
  }

  public static ScoreSegmentErrorCode forNumber(int value) {
    switch (value) {
      case 0: return INVALID_ID_NUMBER_VALUE;
      case 1: return ID_NUMBER_CANNOT_BE_NULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ScoreSegmentErrorCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ScoreSegmentErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ScoreSegmentErrorCode>() {
          public ScoreSegmentErrorCode findValueByNumber(int number) {
            return ScoreSegmentErrorCode.forNumber(number);
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
    return com.nils.grpc.scoresegment.ScoreSegment.getDescriptor().getEnumTypes().get(0);
  }

  private static final ScoreSegmentErrorCode[] VALUES = values();

  public static ScoreSegmentErrorCode valueOf(
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

  private ScoreSegmentErrorCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:scoresegment.ScoreSegmentErrorCode)
}

