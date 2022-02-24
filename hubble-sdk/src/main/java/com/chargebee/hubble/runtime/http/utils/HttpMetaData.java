package com.chargebee.hubble.runtime.http.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HttpMetaData {
  public final Map<String, String> query;
  public final Map<String, String> path;
  public final Map<String, String> header;

  public HttpMetaData(
      Map<String, String> query, Map<String, String> path, Map<String, String> header) {
    this.query = Collections.unmodifiableMap(query);
    this.path = Collections.unmodifiableMap(path);
    this.header = Collections.unmodifiableMap(header);
  }

  public Map<String, String> getQuery() {
    return query;
  }

  public Map<String, String> getPath() {
    return path;
  }

  public Map<String, String> getHeader() {
    return header;
  }
}
