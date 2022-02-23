package com.chargebee.hubble.runtime.http;

import com.chargebee.hubble.runtime.*;

import java.util.List;
import java.util.Map;

public class HttpBinding implements OutputBinding {
    private Map<String,String> metadata;
    public HttpBinding() {

    }
    @Override
    public void init(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public InvokeResponse invoke(InvokeRequest invokeRequest) {
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
