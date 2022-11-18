package com.nils.grpc.scoresegment;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: score-segment.proto")
public final class ScoreSegmentServiceGrpc {

  private ScoreSegmentServiceGrpc() {}

  public static final String SERVICE_NAME = "scoresegment.ScoreSegmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nils.grpc.scoresegment.ScoreSegmentRequest,
      com.nils.grpc.scoresegment.ScoreSegmentResponse> getCalculateScoreSegmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateScoreSegment",
      requestType = com.nils.grpc.scoresegment.ScoreSegmentRequest.class,
      responseType = com.nils.grpc.scoresegment.ScoreSegmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nils.grpc.scoresegment.ScoreSegmentRequest,
      com.nils.grpc.scoresegment.ScoreSegmentResponse> getCalculateScoreSegmentMethod() {
    io.grpc.MethodDescriptor<com.nils.grpc.scoresegment.ScoreSegmentRequest, com.nils.grpc.scoresegment.ScoreSegmentResponse> getCalculateScoreSegmentMethod;
    if ((getCalculateScoreSegmentMethod = ScoreSegmentServiceGrpc.getCalculateScoreSegmentMethod) == null) {
      synchronized (ScoreSegmentServiceGrpc.class) {
        if ((getCalculateScoreSegmentMethod = ScoreSegmentServiceGrpc.getCalculateScoreSegmentMethod) == null) {
          ScoreSegmentServiceGrpc.getCalculateScoreSegmentMethod = getCalculateScoreSegmentMethod = 
              io.grpc.MethodDescriptor.<com.nils.grpc.scoresegment.ScoreSegmentRequest, com.nils.grpc.scoresegment.ScoreSegmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "scoresegment.ScoreSegmentService", "calculateScoreSegment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nils.grpc.scoresegment.ScoreSegmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nils.grpc.scoresegment.ScoreSegmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ScoreSegmentServiceMethodDescriptorSupplier("calculateScoreSegment"))
                  .build();
          }
        }
     }
     return getCalculateScoreSegmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScoreSegmentServiceStub newStub(io.grpc.Channel channel) {
    return new ScoreSegmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScoreSegmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScoreSegmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScoreSegmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScoreSegmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ScoreSegmentServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void calculateScoreSegment(com.nils.grpc.scoresegment.ScoreSegmentRequest request,
        io.grpc.stub.StreamObserver<com.nils.grpc.scoresegment.ScoreSegmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateScoreSegmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateScoreSegmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nils.grpc.scoresegment.ScoreSegmentRequest,
                com.nils.grpc.scoresegment.ScoreSegmentResponse>(
                  this, METHODID_CALCULATE_SCORE_SEGMENT)))
          .build();
    }
  }

  /**
   */
  public static final class ScoreSegmentServiceStub extends io.grpc.stub.AbstractStub<ScoreSegmentServiceStub> {
    private ScoreSegmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreSegmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreSegmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreSegmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public void calculateScoreSegment(com.nils.grpc.scoresegment.ScoreSegmentRequest request,
        io.grpc.stub.StreamObserver<com.nils.grpc.scoresegment.ScoreSegmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateScoreSegmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ScoreSegmentServiceBlockingStub extends io.grpc.stub.AbstractStub<ScoreSegmentServiceBlockingStub> {
    private ScoreSegmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreSegmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreSegmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreSegmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.nils.grpc.scoresegment.ScoreSegmentResponse calculateScoreSegment(com.nils.grpc.scoresegment.ScoreSegmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateScoreSegmentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ScoreSegmentServiceFutureStub extends io.grpc.stub.AbstractStub<ScoreSegmentServiceFutureStub> {
    private ScoreSegmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreSegmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreSegmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreSegmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nils.grpc.scoresegment.ScoreSegmentResponse> calculateScoreSegment(
        com.nils.grpc.scoresegment.ScoreSegmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateScoreSegmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_SCORE_SEGMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScoreSegmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScoreSegmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_SCORE_SEGMENT:
          serviceImpl.calculateScoreSegment((com.nils.grpc.scoresegment.ScoreSegmentRequest) request,
              (io.grpc.stub.StreamObserver<com.nils.grpc.scoresegment.ScoreSegmentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ScoreSegmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScoreSegmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nils.grpc.scoresegment.ScoreSegment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScoreSegmentService");
    }
  }

  private static final class ScoreSegmentServiceFileDescriptorSupplier
      extends ScoreSegmentServiceBaseDescriptorSupplier {
    ScoreSegmentServiceFileDescriptorSupplier() {}
  }

  private static final class ScoreSegmentServiceMethodDescriptorSupplier
      extends ScoreSegmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScoreSegmentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ScoreSegmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScoreSegmentServiceFileDescriptorSupplier())
              .addMethod(getCalculateScoreSegmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
