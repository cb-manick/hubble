package com.chargebee.hubble.runtime;

import io.cloudevents.CloudEvent;

import java.util.Map;

public interface EventListener {
    void process(CloudEvent cloudEvent, Map<String, String> metadata) throws Exception;
}
