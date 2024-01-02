// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class TeamsRuleRuleSettingsPayloadLog {
    /**
     * @return Enable notification settings.
     * 
     */
    private Boolean enabled;

    private TeamsRuleRuleSettingsPayloadLog() {}
    /**
     * @return Enable notification settings.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsRuleRuleSettingsPayloadLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(TeamsRuleRuleSettingsPayloadLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("TeamsRuleRuleSettingsPayloadLog", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        public TeamsRuleRuleSettingsPayloadLog build() {
            final var _resultValue = new TeamsRuleRuleSettingsPayloadLog();
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
