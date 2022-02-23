package com.chargebee.hubble.runtime;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BindingConfiguration {

  private final List<BindingConfigElement> bindingConfigElements;

  public BindingConfiguration(List<BindingConfigElement> bindingConfigElements) {
      this.bindingConfigElements = Collections.unmodifiableList(bindingConfigElements);
  }


  public List<BindingConfigElement> getBindingConfigElements() {
    return bindingConfigElements;
  }
}
