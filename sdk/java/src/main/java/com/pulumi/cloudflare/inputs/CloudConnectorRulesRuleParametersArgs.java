// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CloudConnectorRulesRuleParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudConnectorRulesRuleParametersArgs Empty = new CloudConnectorRulesRuleParametersArgs();

    /**
     * Host parameter for cloud connector rule
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return Host parameter for cloud connector rule
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    private CloudConnectorRulesRuleParametersArgs() {}

    private CloudConnectorRulesRuleParametersArgs(CloudConnectorRulesRuleParametersArgs $) {
        this.host = $.host;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudConnectorRulesRuleParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudConnectorRulesRuleParametersArgs $;

        public Builder() {
            $ = new CloudConnectorRulesRuleParametersArgs();
        }

        public Builder(CloudConnectorRulesRuleParametersArgs defaults) {
            $ = new CloudConnectorRulesRuleParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Host parameter for cloud connector rule
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host parameter for cloud connector rule
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        public CloudConnectorRulesRuleParametersArgs build() {
            if ($.host == null) {
                throw new MissingRequiredPropertyException("CloudConnectorRulesRuleParametersArgs", "host");
            }
            return $;
        }
    }

}
