package com.chargebee.hubble.runtime;

import java.util.List;
import java.util.Map;

public interface OutputBinding {
  void init(Map<String,String> metadata);
  InvokeResponse invoke(InvokeRequest invokeRequest);
  List<String> getOperations();
}
