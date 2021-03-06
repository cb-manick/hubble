package com.chargebee.hubble.runtime.http;

import com.chargebee.hubble.runtime.InvokeRequest;
import com.chargebee.hubble.runtime.InvokeResponse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HttpOutputBindingTest {

    private static final String PATHPREFIX = "p_";

    @Test
    public void constructionTest(){
        HttpOutputBinding httpOutputBinding = new HttpOutputBinding();
        Map<String,String> metaData = new HashMap<>();
        httpOutputBinding.init(metaData);
        Assertions.assertNotNull(httpOutputBinding);
    }

    @Test
    public void simpleGetTest() {
        HttpOutputBinding httpOutputBinding = new HttpOutputBinding();
        Map<String,String> metaData = new HashMap<>();
        metaData.put("HOST","http://localhost:8082/") ;
        metaData.put("BASE_PATH","");
        httpOutputBinding.init(metaData);
        Map<String,String> invocationMetaData = new HashMap<>();
        InvokeRequest request = new InvokeRequest(null,invocationMetaData,"operation1");
        Assertions.assertNotNull(request);
        InvokeResponse response = httpOutputBinding.invoke(request);
        Assertions.assertNotNull(response);
    }


}