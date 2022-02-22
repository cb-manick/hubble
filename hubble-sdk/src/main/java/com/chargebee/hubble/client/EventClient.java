package com.chargebee.hubble.client;

import com.chargebee.hubble.model.PublishEventRequest;

public interface EventClient {

    void publishEvent(PublishEventRequest request);
}
