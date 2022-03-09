package com.chargebee.hubble.runtime;

public class HubbleRuntimeImpl implements HubbleRuntime {
    private BindingConfiguration bindings;
    public HubbleRuntimeImpl(BindingConfiguration bindings) {
        this.bindings = bindings;
    }
}
