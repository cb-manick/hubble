
package io.hubble.model;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "capabilityIdentifier",
    "operationId",
    "version"
})
@Generated("jsonschema2pojo")
public class CapabilityContext {

    /**
     * Unique Uri of the capability
     * 
     */
    @JsonProperty("capabilityIdentifier")
    @JsonPropertyDescription("Unique Uri of the capability")
    private URI capabilityIdentifier;
    /**
     * Operation Id that is invoked in the capability
     * 
     */
    @JsonProperty("operationId")
    @JsonPropertyDescription("Operation Id that is invoked in the capability")
    private String operationId;
    /**
     * Version for capability
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version for capability")
    private String version;

    /**
     * Unique Uri of the capability
     * 
     */
    @JsonProperty("capabilityIdentifier")
    public URI getCapabilityIdentifier() {
        return capabilityIdentifier;
    }

    /**
     * Unique Uri of the capability
     * 
     */
    @JsonProperty("capabilityIdentifier")
    public void setCapabilityIdentifier(URI capabilityIdentifier) {
        this.capabilityIdentifier = capabilityIdentifier;
    }

    /**
     * Operation Id that is invoked in the capability
     * 
     */
    @JsonProperty("operationId")
    public String getOperationId() {
        return operationId;
    }

    /**
     * Operation Id that is invoked in the capability
     * 
     */
    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * Version for capability
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Version for capability
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CapabilityContext.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("capabilityIdentifier");
        sb.append('=');
        sb.append(((this.capabilityIdentifier == null)?"<null>":this.capabilityIdentifier));
        sb.append(',');
        sb.append("operationId");
        sb.append('=');
        sb.append(((this.operationId == null)?"<null>":this.operationId));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.operationId == null)? 0 :this.operationId.hashCode()));
        result = ((result* 31)+((this.capabilityIdentifier == null)? 0 :this.capabilityIdentifier.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapabilityContext) == false) {
            return false;
        }
        CapabilityContext rhs = ((CapabilityContext) other);
        return ((((this.operationId == rhs.operationId)||((this.operationId!= null)&&this.operationId.equals(rhs.operationId)))&&((this.capabilityIdentifier == rhs.capabilityIdentifier)||((this.capabilityIdentifier!= null)&&this.capabilityIdentifier.equals(rhs.capabilityIdentifier))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))));
    }

}
