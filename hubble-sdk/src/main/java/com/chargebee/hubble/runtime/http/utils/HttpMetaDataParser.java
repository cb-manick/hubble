package com.chargebee.hubble.runtime.http.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HttpMetaDataParser {
    private static final String PATH_PREFIX="p_";
    private static final String QUERY_PREFIX = "q_";
    private static final String HEADER_PREFIX = "h_";
    private static final int PARAM_BEGINS_WITH_INDEX = PATH_PREFIX.length();

    public static HttpMetaData parse(Map<String,String> metaData) {
       Map<String,String> path = new HashMap<>();
       Map<String,String> query = new HashMap<>();
       Map<String,String> header = new HashMap<>();
        final Set<String> keys = metaData.keySet();
        for (String key:keys) {
           if (key.startsWith(PATH_PREFIX)) {
               path.put(key.substring(PARAM_BEGINS_WITH_INDEX),metaData.get(key));
           } else if (key.startsWith(QUERY_PREFIX)) {
               query.put(key.substring(PARAM_BEGINS_WITH_INDEX),metaData.get(key));
            } else if (key.startsWith(HEADER_PREFIX)) {
               header.put(key.substring(PARAM_BEGINS_WITH_INDEX),metaData.get(key));
           }
       }

       return new HttpMetaData(query,path,header);
    }
}
