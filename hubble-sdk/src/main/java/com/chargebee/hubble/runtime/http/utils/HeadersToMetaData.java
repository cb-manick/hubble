package com.chargebee.hubble.runtime.http.utils;

import com.squareup.okhttp.Headers;

import java.util.HashMap;
import java.util.Map;

public class HeadersToMetaData {

  public static Map<String, String> getMetaData(Headers headersMeta) {
    Map<String, String> headers = new HashMap<>();
    for (int i = 0; i < headersMeta.size(); i++) {
      String name = headersMeta.name(i);
      String value = headersMeta.value(i);
      headers.put(name, value);
    }
    return headers;
  }
}
