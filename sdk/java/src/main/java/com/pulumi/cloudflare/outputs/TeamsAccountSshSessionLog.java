// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TeamsAccountSshSessionLog {
    /**
     * @return Public key used to encrypt ssh session.
     * 
     */
    private String publicKey;

    private TeamsAccountSshSessionLog() {}
    /**
     * @return Public key used to encrypt ssh session.
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountSshSessionLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String publicKey;
        public Builder() {}
        public Builder(TeamsAccountSshSessionLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
        }

        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            if (publicKey == null) {
              throw new MissingRequiredPropertyException("TeamsAccountSshSessionLog", "publicKey");
            }
            this.publicKey = publicKey;
            return this;
        }
        public TeamsAccountSshSessionLog build() {
            final var _resultValue = new TeamsAccountSshSessionLog();
            _resultValue.publicKey = publicKey;
            return _resultValue;
        }
    }
}
