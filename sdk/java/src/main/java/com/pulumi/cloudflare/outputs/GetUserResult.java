// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    /**
     * @return The user&#39;s email address.
     * 
     */
    private String email;
    /**
     * @return The user&#39;s unique identifier.
     * 
     */
    private String id;
    /**
     * @return The user&#39;s username.
     * 
     */
    private String username;

    private GetUserResult() {}
    /**
     * @return The user&#39;s email address.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The user&#39;s unique identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The user&#39;s username.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        private String username;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetUserResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetUserResult build() {
            final var _resultValue = new GetUserResult();
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
