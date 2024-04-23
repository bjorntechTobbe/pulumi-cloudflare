// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPolicyIncludeGithub {
    private @Nullable String identityProviderId;
    private @Nullable String name;
    private @Nullable List<String> teams;

    private AccessPolicyIncludeGithub() {}
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> teams() {
        return this.teams == null ? List.of() : this.teams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIncludeGithub defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identityProviderId;
        private @Nullable String name;
        private @Nullable List<String> teams;
        public Builder() {}
        public Builder(AccessPolicyIncludeGithub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.name = defaults.name;
    	      this.teams = defaults.teams;
        }

        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {

            this.identityProviderId = identityProviderId;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder teams(@Nullable List<String> teams) {

            this.teams = teams;
            return this;
        }
        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }
        public AccessPolicyIncludeGithub build() {
            final var _resultValue = new AccessPolicyIncludeGithub();
            _resultValue.identityProviderId = identityProviderId;
            _resultValue.name = name;
            _resultValue.teams = teams;
            return _resultValue;
        }
    }
}
