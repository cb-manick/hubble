package com.chargebee.hubble.runtime.http;

import com.chargebee.hubble.runtime.*;

import java.util.List;
import java.util.Map;

public class HttpBinding implements OutputBinding {
    private Map<String,String> metadata;
    private static final String FORMATTED_PATH = "PATH";
    private static final String FORMATTED_QUERY = "QUERY";
    private static final String HOST = "HOST";

    public HttpBinding() {

    }
    @Override
    public void init(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public InvokeResponse invoke(InvokeRequest invokeRequest) {
        byte[] data = invokeRequest.getData();

        return null;
    }

    @Override
    public List<String> getOperations() {
        return null;
    }

    @Override
    public void read(EventListener eventListener) {

    }
}
