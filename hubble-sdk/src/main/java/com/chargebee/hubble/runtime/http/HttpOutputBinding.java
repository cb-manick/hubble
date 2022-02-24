package com.chargebee.hubble.runtime.http;

import com.chargebee.hubble.runtime.*;
import com.chargebee.hubble.runtime.http.utils.HttpMetaData;
import com.chargebee.hubble.runtime.http.utils.HttpMetaDataParser;

import java.util.List;
import java.util.Map;

public class HttpOutputBinding implements OutputBinding {
  private Map<String, String> metadata;
  private static final String FORMATTED_PATH = "PATH";
  private static final String FORMATTED_QUERY = "QUERY";
  private static final String HOST = "HOST";

  public HttpOutputBinding() {}

  @Override
  public void init(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public InvokeResponse invoke(InvokeRequest invokeRequest) {
    byte[] payload = invokeRequest.getData();
    HttpMetaData metaData = HttpMetaDataParser.parse(invokeRequest.getMetadata());
    return invoke(payload, metaData, invokeRequest.getOperation());
  }

  public InvokeResponse invoke(byte[] payload, HttpMetaData metaData, String operation) {
    return null;
  }

  @Override
  public List<String> getOperations() {
    return null;
  }
}
