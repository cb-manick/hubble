package com.chargebee.hubble.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PublishEventRequest {
  private final String pubsubName;

  private final String topic;

  private final Object data;

  private String contentType;

  private Map<String, String> metadata = new HashMap<>();

  public PublishEventRequest(String pubsubName, String topic, Object data) {
    this.pubsubName = pubsubName;
    this.topic = topic;
    this.data = data;
  }

    public String getContentType() {
        return contentType;
    }

    public PublishEventRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public PublishEventRequest setMetadata(Map<String, String> metadata) {
        this.metadata = Collections.unmodifiableMap(metadata);
        return this;
    }
}
