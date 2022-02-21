package com.chargebee.hubble.client;

import com.chargebee.hubble.model.PublishEventRequest;

import java.util.Map;

public class AbstractHubbleClient implements HubbleClient{
    @Override
    public void publishEvent(String pubsubName, String topicName, Object data) {

    }

    @Override
    public void publishEvent(String pubsubName, String topicName, Object data, Map<String, String> metadata) {

    }

    @Override
    public void publishEvent(PublishEventRequest request) {

    }

    @Override
    public <T> T invokeMethod(String capabilityId,TenantContext tenantContext, String methodName, Object data, HttpExtension httpExtension, Map<String, String> metadata) {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
