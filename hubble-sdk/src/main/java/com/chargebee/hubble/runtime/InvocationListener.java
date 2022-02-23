package com.chargebee.hubble.runtime;

import java.util.Map;

public interface InvocationListener {
    byte[] process(byte[] data, Map<String, String> metadata) throws Exception;
}
