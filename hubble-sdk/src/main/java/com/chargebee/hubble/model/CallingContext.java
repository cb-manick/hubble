package com.chargebee.hubble.model;

/** */
public class CallingContext {
    private String entityId;
    private String merchantId;
    private String capabilityId;
    private String operationName;

    public CallingContext(String entityId, String merchantId, String capabilityId, String operationName){
        this.entityId = entityId;
        this.merchantId = merchantId;
        this.capabilityId = capabilityId;
        this.operationName = operationName;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

}
