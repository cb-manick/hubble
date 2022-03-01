package com.chargebee.hubble.runtime.http;

import com.chargebee.hubble.runtime.*;
import com.chargebee.hubble.runtime.http.utils.HttpMetaData;
import com.chargebee.hubble.runtime.http.utils.HttpMetaDataParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.util.List;
import java.util.Map;

public class HttpOutputBinding implements OutputBinding {
  private Map<String, String> metadata;
  private static final String FORMATTED_PATH = "PATH";
  private static final String BASE_PATH = "BASE_PATH";
  private static final String FORMATTED_QUERY = "QUERY";
  private static final String HOST = "HOST";
  private final OkHttpClient client = new OkHttpClient();
  private String hostUri;
  private String relativePath;

  public HttpOutputBinding() {}

  @Override
  public void init(Map<String, String> metadata) {
    this.metadata = metadata;
    this.hostUri = metadata.get(HOST);
    this.relativePath = metadata.get(BASE_PATH);
  }

  @Override
  public InvokeResponse invoke(InvokeRequest invokeRequest) {
    byte[] payload = invokeRequest.getData();
    HttpMetaData metaData = HttpMetaDataParser.parse(invokeRequest.getMetadata());
    Request request = new Request.Builder()
            .url(hostUri + relativePath).build();
    return invoke(request,payload, metaData, invokeRequest.getOperation());
  }

  public InvokeResponse invoke(Request request,byte[] payload, HttpMetaData metaData, String operation) {
    return null;
  }

  @Override
  public List<String> getOperations() {
    return null;
  }
}
