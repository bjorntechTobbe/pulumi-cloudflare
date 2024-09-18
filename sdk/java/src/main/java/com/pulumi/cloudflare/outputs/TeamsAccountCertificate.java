// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TeamsAccountCertificate {
    /**
     * @return ID of certificate for TLS interception.
     * 
     */
    private String id;

    private TeamsAccountCertificate() {}
    /**
     * @return ID of certificate for TLS interception.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(TeamsAccountCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("TeamsAccountCertificate", "id");
            }
            this.id = id;
            return this;
        }
        public TeamsAccountCertificate build() {
            final var _resultValue = new TeamsAccountCertificate();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
