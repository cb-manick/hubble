package com.chargebee.hubble.client;

import com.chargebee.hubble.model.CallingContext;
import com.chargebee.hubble.model.PublishEventRequest;

import java.util.Map;

public class AbstractHubbleClient implements HubbleClient{


    @Override
    public void publishEvent(PublishEventRequest request) {

    }

    @Override
    public <T> T invokeMethod(String appId, String methodName, Object data, HttpExtension httpExtension, Map<String, String> metadata) {
        return null;
    }


    @Override
    public void close() throws Exception {

    }
}
