// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: score-segment.proto

package com.nils.grpc.scoresegment;

public interface ScoreSegmentExceptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scoresegment.ScoreSegmentExceptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <code>.scoresegment.ScoreSegmentErrorCode error_code = 2;</code>
   */
  int getErrorCodeValue();
  /**
   * <code>.scoresegment.ScoreSegmentErrorCode error_code = 2;</code>
   */
  com.nils.grpc.scoresegment.ScoreSegmentErrorCode getErrorCode();
}