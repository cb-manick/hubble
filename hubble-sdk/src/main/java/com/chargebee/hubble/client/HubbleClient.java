package com.chargebee.hubble.client;

import com.chargebee.hubble.model.PublishEventRequest;

import java.util.Map;

/// Interface defines the Hubble client
public interface HubbleClient extends AutoCloseable {
    /**
     *
     * @param pubsubName
     * @param topicName
     * @param data
     */
    void publishEvent(String pubsubName, String topicName, Object data);

     /**
     * Publish an event.
     *
     * @param pubsubName the pubsub name we will publish the event to
     * @param topicName    the topicName where the event will be published.
     * @param data    the event's data to be published, use byte[] for skipping serialization.
     * @param metadata The metadata for the published event.
     */
    void publishEvent(String pubsubName, String topicName, Object data, Map<String, String> metadata);

    /**
     * Publish an event.
     *
     * @param request the request for the publish event.
     */
    void publishEvent(PublishEventRequest request);


}
