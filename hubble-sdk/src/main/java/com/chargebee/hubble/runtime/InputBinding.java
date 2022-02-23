package com.chargebee.hubble.runtime;

import java.util.Map;

public interface InputBinding {
    void init(Map<String, String> metadata);
    void read(EventListener eventListener);
}
