
package io.hubble.model;

import java.net.URI;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Hubble Context Models
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tenantContext",
    "capabilityContext"
})
@Generated("jsonschema2pojo")
public class HubbleCore {

    /**
     * Tenant Context Identifier
     * 
     */
    @JsonProperty("tenantContext")
    @JsonPropertyDescription("Tenant Context Identifier")
    private URI tenantContext;
    @JsonProperty("capabilityContext")
    private CapabilityContext capabilityContext;

    /**
     * Tenant Context Identifier
     * 
     */
    @JsonProperty("tenantContext")
    public URI getTenantContext() {
        return tenantContext;
    }

    /**
     * Tenant Context Identifier
     * 
     */
    @JsonProperty("tenantContext")
    public void setTenantContext(URI tenantContext) {
        this.tenantContext = tenantContext;
    }

    @JsonProperty("capabilityContext")
    public CapabilityContext getCapabilityContext() {
        return capabilityContext;
    }

    @JsonProperty("capabilityContext")
    public void setCapabilityContext(CapabilityContext capabilityContext) {
        this.capabilityContext = capabilityContext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HubbleCore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tenantContext");
        sb.append('=');
        sb.append(((this.tenantContext == null)?"<null>":this.tenantContext));
        sb.append(',');
        sb.append("capabilityContext");
        sb.append('=');
        sb.append(((this.capabilityContext == null)?"<null>":this.capabilityContext));
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
        result = ((result* 31)+((this.tenantContext == null)? 0 :this.tenantContext.hashCode()));
        result = ((result* 31)+((this.capabilityContext == null)? 0 :this.capabilityContext.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HubbleCore) == false) {
            return false;
        }
        HubbleCore rhs = ((HubbleCore) other);
        return (((this.tenantContext == rhs.tenantContext)||((this.tenantContext!= null)&&this.tenantContext.equals(rhs.tenantContext)))&&((this.capabilityContext == rhs.capabilityContext)||((this.capabilityContext!= null)&&this.capabilityContext.equals(rhs.capabilityContext))));
    }

}
