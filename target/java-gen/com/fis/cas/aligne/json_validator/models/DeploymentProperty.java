
package com.fis.cas.aligne.json_validator.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propertyKey",
    "description",
    "alias",
    "category",
    "value",
    "required",
    "overWriteValue",
    "deprecated",
    "defaultValue",
    "sequence",
    "active",
    "manualEntry",
    "status"
})
public class DeploymentProperty {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyKey")
    private String propertyKey;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description;
    @JsonProperty("alias")
    private String alias;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    private DeploymentProperty.Category category;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;
    @JsonProperty("required")
    private DeploymentProperty.Required required;
    @JsonProperty("overWriteValue")
    private String overWriteValue;
    @JsonProperty("deprecated")
    private Boolean deprecated;
    @JsonProperty("defaultValue")
    private String defaultValue;
    @JsonProperty("sequence")
    private Double sequence;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("manualEntry")
    private Boolean manualEntry;
    @JsonProperty("status")
    private Double status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyKey")
    public String getPropertyKey() {
        return propertyKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("propertyKey")
    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public DeploymentProperty.Category getCategory() {
        return category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(DeploymentProperty.Category category) {
        this.category = category;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("required")
    public DeploymentProperty.Required getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(DeploymentProperty.Required required) {
        this.required = required;
    }

    @JsonProperty("overWriteValue")
    public String getOverWriteValue() {
        return overWriteValue;
    }

    @JsonProperty("overWriteValue")
    public void setOverWriteValue(String overWriteValue) {
        this.overWriteValue = overWriteValue;
    }

    @JsonProperty("deprecated")
    public Boolean getDeprecated() {
        return deprecated;
    }

    @JsonProperty("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    @JsonProperty("defaultValue")
    public String getDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonProperty("sequence")
    public Double getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Double sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("manualEntry")
    public Boolean getManualEntry() {
        return manualEntry;
    }

    @JsonProperty("manualEntry")
    public void setManualEntry(Boolean manualEntry) {
        this.manualEntry = manualEntry;
    }

    @JsonProperty("status")
    public Double getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Double status) {
        this.status = status;
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
        return new ToStringBuilder(this).append("propertyKey", propertyKey).append("description", description).append("alias", alias).append("category", category).append("value", value).append("required", required).append("overWriteValue", overWriteValue).append("deprecated", deprecated).append("defaultValue", defaultValue).append("sequence", sequence).append("active", active).append("manualEntry", manualEntry).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(propertyKey).append(manualEntry).append(defaultValue).append(deprecated).append(description).append(active).append(required).append(sequence).append(alias).append(overWriteValue).append(additionalProperties).append(category).append(value).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentProperty) == false) {
            return false;
        }
        DeploymentProperty rhs = ((DeploymentProperty) other);
        return new EqualsBuilder().append(propertyKey, rhs.propertyKey).append(manualEntry, rhs.manualEntry).append(defaultValue, rhs.defaultValue).append(deprecated, rhs.deprecated).append(description, rhs.description).append(active, rhs.active).append(required, rhs.required).append(sequence, rhs.sequence).append(alias, rhs.alias).append(overWriteValue, rhs.overWriteValue).append(additionalProperties, rhs.additionalProperties).append(category, rhs.category).append(value, rhs.value).append(status, rhs.status).isEquals();
    }

    public enum Category {

        DATABASE("DATABASE"),
        MESSAGING("MESSAGING"),
        JCR("JCR"),
        WEBSSO("WEBSSO"),
        PASSWORD("PASSWORD"),
        JVM_PARAM("JVM_PARAM"),
        GENERAL("GENERAL");
        private final String value;
        private final static Map<String, DeploymentProperty.Category> CONSTANTS = new HashMap<String, DeploymentProperty.Category>();

        static {
            for (DeploymentProperty.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Category(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static DeploymentProperty.Category fromValue(String value) {
            DeploymentProperty.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Required {

        _0(0.0D),
        _1(1.0D);
        private final Double value;
        private final static Map<Double, DeploymentProperty.Required> CONSTANTS = new HashMap<Double, DeploymentProperty.Required>();

        static {
            for (DeploymentProperty.Required c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Required(Double value) {
            this.value = value;
        }

        @JsonValue
        public Double value() {
            return this.value;
        }

        @JsonCreator
        public static DeploymentProperty.Required fromValue(Double value) {
            DeploymentProperty.Required constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
