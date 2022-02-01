package io.hubble.model;

public @interface CapabilityContext {
  String capabilityIdentifier() default "";

  String operationIdentifier() default "";
}
