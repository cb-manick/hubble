package com.chargebee.hubble.runtime.http.utils;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HttpMetaDataParserTest {

  @Test
  public void testHttpMetaData() {
    Map<String, String> httpMetaData = new HashMap<>();
    httpMetaData.put("h_ID", "Auth-X");
    httpMetaData.put("p_ID", "Auth-X");
    httpMetaData.put("q_ID", "Auth-X");
    httpMetaData.put("D", "Auth-X");
    HttpMetaData parsedMetaData = HttpMetaDataParser.parse(httpMetaData);
    Assertions.assertTrue(parsedMetaData.getPath().size() == 1);
    Assertions.assertTrue(parsedMetaData.getQuery().size() == 1);
    Assertions.assertTrue(parsedMetaData.getHeader().size() == 1);
  }
}
