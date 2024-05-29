// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RiskBehaviorBehavior {
    /**
     * @return Whether this risk behavior type is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return Name of this risk behavior type
     * 
     */
    private String name;
    /**
     * @return Risk level. Available values: `low`, `medium`, `high`
     * 
     */
    private String riskLevel;

    private RiskBehaviorBehavior() {}
    /**
     * @return Whether this risk behavior type is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Name of this risk behavior type
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Risk level. Available values: `low`, `medium`, `high`
     * 
     */
    public String riskLevel() {
        return this.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RiskBehaviorBehavior defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String name;
        private String riskLevel;
        public Builder() {}
        public Builder(RiskBehaviorBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.name = defaults.name;
    	      this.riskLevel = defaults.riskLevel;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("RiskBehaviorBehavior", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("RiskBehaviorBehavior", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder riskLevel(String riskLevel) {
            if (riskLevel == null) {
              throw new MissingRequiredPropertyException("RiskBehaviorBehavior", "riskLevel");
            }
            this.riskLevel = riskLevel;
            return this;
        }
        public RiskBehaviorBehavior build() {
            final var _resultValue = new RiskBehaviorBehavior();
            _resultValue.enabled = enabled;
            _resultValue.name = name;
            _resultValue.riskLevel = riskLevel;
            return _resultValue;
        }
    }
}
