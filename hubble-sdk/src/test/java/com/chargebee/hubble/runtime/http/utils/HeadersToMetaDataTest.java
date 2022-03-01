package com.chargebee.hubble.runtime.http.utils;

import com.squareup.okhttp.Headers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class HeadersToMetaDataTest {
  @Test
  public void testGetHeadersToMetaData() {
    Headers.Builder builder = new Headers.Builder();
    builder.add("x-auth", "awt");
    builder.add("x-buth", "jwt");
    Headers headersMeta = builder.build();
    Map<String, String> headers = HeadersToMetaData.getMetaData(headersMeta);
    Assert.assertEquals(headersMeta.size(), headers.size());
    Set<String> keys = headers.keySet();
    for (int i = 0; i < headersMeta.size(); i++) {
      String headerMetaKey = headersMeta.name(i);
      Assert.assertTrue(keys.contains(headerMetaKey));
      Assert.assertTrue(headersMeta.value(i).equals(headers.get(headerMetaKey)));
    }
  }
}
