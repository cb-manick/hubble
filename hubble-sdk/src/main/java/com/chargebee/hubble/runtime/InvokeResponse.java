package com.chargebee.hubble.runtime;

import java.util.Collections;
import java.util.Map;

public class InvokeResponse {
  private byte[] data;
  private Map<String, String> metadata;
  private String contentType;

  public InvokeResponse(byte[] data, Map<String, String> metadata, String contentType) {
    this.data = data;
    this.metadata = Collections.unmodifiableMap(metadata);
    this.contentType = contentType;
  }

  public byte[] getData() {
    return data;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public String getContentType() {
    return contentType;
  }
}
