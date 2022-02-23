package com.chargebee.hubble.runtime;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class HubbleRuntimeImplTest {

  @BeforeEach
  void setUp() {}

  @Test
  public void constructionTest() {
    HubbleRuntimeImpl hubbleRuntimeImpl = new HubbleRuntimeImpl(new BindingConfiguration(null));
    Assertions.assertNotNull(hubbleRuntimeImpl);
  }

  @AfterEach
  void tearDown() {}
}
