package com.chargebee.hubble.runtime;

import java.util.Arrays;
import java.util.Map;

public class InvokeRequest {
  private byte[] data;
  private Map<String, String> metadata;
  private String operation;

  public InvokeRequest(byte[] data, Map<String, String> metadata, String operation) {
    this.data = data;
    this.metadata = metadata;
    this.operation = operation;

  }

  public byte[] getData() {
    return data;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public String getOperation() {
    return operation;
  }
}
