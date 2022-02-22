package com.chargebee.hubble.client;

import com.chargebee.hubble.model.PublishEventRequest;

import java.util.Map;

/// Interface defines the Hubble client
public interface HubbleClient extends AutoCloseable {
     /**
     * Publish an event.
     *
     * @param request the request for the publish event.
     */
    void publishEvent(PublishEventRequest request);

    /***
     * Invoke Client Method
     * @param appId
     * @param methodName
     * @param data
     * @param httpExtension
     * @param metadata
     * @param <T>
     * @return
     */
    <T> T invokeMethod(String appId, String methodName, Object data, HttpExtension httpExtension,
                             Map<String, String> metadata);


}
