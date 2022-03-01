package com.chargebee.hubble.runtime.http.utils;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import org.junit.Test;
import com.squareup.okhttp.Request;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;

public class OkHttpSpikeTest {
  private final  String BASE_URL="http://localhost:8082/";
  private final  OkHttpClient client = new OkHttpClient();


    @Test
    public void getTest(){
        Request request = new Request.Builder()
                .url(BASE_URL + "/get")
                .build();
        Call call = client.newCall(request);
        Response response = null;
        try {
            response = call.execute();
           System.out.println(response.body().string());
       //    System.out.println(response.body().bytes().length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(response.code(), 200);
    }


}
