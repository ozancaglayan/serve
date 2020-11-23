// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: management.proto

package org.pytorch.serve.grpc.management;

public interface ListModelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.pytorch.serve.grpc.management.ListModelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Use this parameter to specify the maximum number of items to return. When this value is present, TorchServe does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 1000, inclusive. If you do not include a value, it defaults to 100.
   * </pre>
   *
   * <code>int32 limit = 1;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * The token to retrieve the next set of results. TorchServe provides the token when the response from a previous call has more results than the maximum page size.
   * </pre>
   *
   * <code>int32 next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  int getNextPageToken();
}
