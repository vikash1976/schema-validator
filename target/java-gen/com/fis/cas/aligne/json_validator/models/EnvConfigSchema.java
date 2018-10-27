
package com.fis.cas.aligne.json_validator.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Product
 * <p>
 * A product from the catalog
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "version",
    "referenceDeployment",
    "deploymentProperties",
    "envProperties"
})
public class EnvConfigSchema {

    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;
    @JsonProperty("referenceDeployment")
    private ReferenceDeployment referenceDeployment;
    @JsonProperty("deploymentProperties")
    private List<DeploymentProperty> deploymentProperties = new ArrayList<DeploymentProperty>();
    @JsonProperty("envProperties")
    private List<DeploymentProperty> envProperties = new ArrayList<DeploymentProperty>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("referenceDeployment")
    public ReferenceDeployment getReferenceDeployment() {
        return referenceDeployment;
    }

    @JsonProperty("referenceDeployment")
    public void setReferenceDeployment(ReferenceDeployment referenceDeployment) {
        this.referenceDeployment = referenceDeployment;
    }

    @JsonProperty("deploymentProperties")
    public List<DeploymentProperty> getDeploymentProperties() {
        return deploymentProperties;
    }

    @JsonProperty("deploymentProperties")
    public void setDeploymentProperties(List<DeploymentProperty> deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
    }

    @JsonProperty("envProperties")
    public List<DeploymentProperty> getEnvProperties() {
        return envProperties;
    }

    @JsonProperty("envProperties")
    public void setEnvProperties(List<DeploymentProperty> envProperties) {
        this.envProperties = envProperties;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("version", version).append("referenceDeployment", referenceDeployment).append("deploymentProperties", deploymentProperties).append("envProperties", envProperties).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(envProperties).append(referenceDeployment).append(name).append(additionalProperties).append(version).append(deploymentProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvConfigSchema) == false) {
            return false;
        }
        EnvConfigSchema rhs = ((EnvConfigSchema) other);
        return new EqualsBuilder().append(envProperties, rhs.envProperties).append(referenceDeployment, rhs.referenceDeployment).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).append(version, rhs.version).append(deploymentProperties, rhs.deploymentProperties).isEquals();
    }

}
