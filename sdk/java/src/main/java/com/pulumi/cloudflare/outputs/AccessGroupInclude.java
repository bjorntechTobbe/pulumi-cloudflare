// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.AccessGroupIncludeAuthContext;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeAzure;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeExternalEvaluation;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeGithub;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeGsuite;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeOkta;
import com.pulumi.cloudflare.outputs.AccessGroupIncludeSaml;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessGroupInclude {
    private @Nullable Boolean anyValidServiceToken;
    private @Nullable List<AccessGroupIncludeAuthContext> authContexts;
    private @Nullable String authMethod;
    private @Nullable List<AccessGroupIncludeAzure> azures;
    private @Nullable Boolean certificate;
    private @Nullable String commonName;
    private @Nullable List<String> devicePostures;
    private @Nullable List<String> emailDomains;
    private @Nullable List<String> emails;
    private @Nullable Boolean everyone;
    private @Nullable AccessGroupIncludeExternalEvaluation externalEvaluation;
    private @Nullable List<String> geos;
    private @Nullable List<AccessGroupIncludeGithub> githubs;
    private @Nullable List<String> groups;
    private @Nullable List<AccessGroupIncludeGsuite> gsuites;
    /**
     * @return The ID of an existing IP list to reference.
     * 
     */
    private @Nullable List<String> ipLists;
    /**
     * @return An IPv4 or IPv6 CIDR block.
     * 
     */
    private @Nullable List<String> ips;
    private @Nullable List<String> loginMethods;
    private @Nullable List<AccessGroupIncludeOkta> oktas;
    private @Nullable List<AccessGroupIncludeSaml> samls;
    private @Nullable List<String> serviceTokens;

    private AccessGroupInclude() {}
    public Optional<Boolean> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }
    public List<AccessGroupIncludeAuthContext> authContexts() {
        return this.authContexts == null ? List.of() : this.authContexts;
    }
    public Optional<String> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }
    public List<AccessGroupIncludeAzure> azures() {
        return this.azures == null ? List.of() : this.azures;
    }
    public Optional<Boolean> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    public Optional<String> commonName() {
        return Optional.ofNullable(this.commonName);
    }
    public List<String> devicePostures() {
        return this.devicePostures == null ? List.of() : this.devicePostures;
    }
    public List<String> emailDomains() {
        return this.emailDomains == null ? List.of() : this.emailDomains;
    }
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    public Optional<Boolean> everyone() {
        return Optional.ofNullable(this.everyone);
    }
    public Optional<AccessGroupIncludeExternalEvaluation> externalEvaluation() {
        return Optional.ofNullable(this.externalEvaluation);
    }
    public List<String> geos() {
        return this.geos == null ? List.of() : this.geos;
    }
    public List<AccessGroupIncludeGithub> githubs() {
        return this.githubs == null ? List.of() : this.githubs;
    }
    public List<String> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public List<AccessGroupIncludeGsuite> gsuites() {
        return this.gsuites == null ? List.of() : this.gsuites;
    }
    /**
     * @return The ID of an existing IP list to reference.
     * 
     */
    public List<String> ipLists() {
        return this.ipLists == null ? List.of() : this.ipLists;
    }
    /**
     * @return An IPv4 or IPv6 CIDR block.
     * 
     */
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }
    public List<String> loginMethods() {
        return this.loginMethods == null ? List.of() : this.loginMethods;
    }
    public List<AccessGroupIncludeOkta> oktas() {
        return this.oktas == null ? List.of() : this.oktas;
    }
    public List<AccessGroupIncludeSaml> samls() {
        return this.samls == null ? List.of() : this.samls;
    }
    public List<String> serviceTokens() {
        return this.serviceTokens == null ? List.of() : this.serviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessGroupInclude defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean anyValidServiceToken;
        private @Nullable List<AccessGroupIncludeAuthContext> authContexts;
        private @Nullable String authMethod;
        private @Nullable List<AccessGroupIncludeAzure> azures;
        private @Nullable Boolean certificate;
        private @Nullable String commonName;
        private @Nullable List<String> devicePostures;
        private @Nullable List<String> emailDomains;
        private @Nullable List<String> emails;
        private @Nullable Boolean everyone;
        private @Nullable AccessGroupIncludeExternalEvaluation externalEvaluation;
        private @Nullable List<String> geos;
        private @Nullable List<AccessGroupIncludeGithub> githubs;
        private @Nullable List<String> groups;
        private @Nullable List<AccessGroupIncludeGsuite> gsuites;
        private @Nullable List<String> ipLists;
        private @Nullable List<String> ips;
        private @Nullable List<String> loginMethods;
        private @Nullable List<AccessGroupIncludeOkta> oktas;
        private @Nullable List<AccessGroupIncludeSaml> samls;
        private @Nullable List<String> serviceTokens;
        public Builder() {}
        public Builder(AccessGroupInclude defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anyValidServiceToken = defaults.anyValidServiceToken;
    	      this.authContexts = defaults.authContexts;
    	      this.authMethod = defaults.authMethod;
    	      this.azures = defaults.azures;
    	      this.certificate = defaults.certificate;
    	      this.commonName = defaults.commonName;
    	      this.devicePostures = defaults.devicePostures;
    	      this.emailDomains = defaults.emailDomains;
    	      this.emails = defaults.emails;
    	      this.everyone = defaults.everyone;
    	      this.externalEvaluation = defaults.externalEvaluation;
    	      this.geos = defaults.geos;
    	      this.githubs = defaults.githubs;
    	      this.groups = defaults.groups;
    	      this.gsuites = defaults.gsuites;
    	      this.ipLists = defaults.ipLists;
    	      this.ips = defaults.ips;
    	      this.loginMethods = defaults.loginMethods;
    	      this.oktas = defaults.oktas;
    	      this.samls = defaults.samls;
    	      this.serviceTokens = defaults.serviceTokens;
        }

        @CustomType.Setter
        public Builder anyValidServiceToken(@Nullable Boolean anyValidServiceToken) {

            this.anyValidServiceToken = anyValidServiceToken;
            return this;
        }
        @CustomType.Setter
        public Builder authContexts(@Nullable List<AccessGroupIncludeAuthContext> authContexts) {

            this.authContexts = authContexts;
            return this;
        }
        public Builder authContexts(AccessGroupIncludeAuthContext... authContexts) {
            return authContexts(List.of(authContexts));
        }
        @CustomType.Setter
        public Builder authMethod(@Nullable String authMethod) {

            this.authMethod = authMethod;
            return this;
        }
        @CustomType.Setter
        public Builder azures(@Nullable List<AccessGroupIncludeAzure> azures) {

            this.azures = azures;
            return this;
        }
        public Builder azures(AccessGroupIncludeAzure... azures) {
            return azures(List.of(azures));
        }
        @CustomType.Setter
        public Builder certificate(@Nullable Boolean certificate) {

            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(@Nullable String commonName) {

            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder devicePostures(@Nullable List<String> devicePostures) {

            this.devicePostures = devicePostures;
            return this;
        }
        public Builder devicePostures(String... devicePostures) {
            return devicePostures(List.of(devicePostures));
        }
        @CustomType.Setter
        public Builder emailDomains(@Nullable List<String> emailDomains) {

            this.emailDomains = emailDomains;
            return this;
        }
        public Builder emailDomains(String... emailDomains) {
            return emailDomains(List.of(emailDomains));
        }
        @CustomType.Setter
        public Builder emails(@Nullable List<String> emails) {

            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder everyone(@Nullable Boolean everyone) {

            this.everyone = everyone;
            return this;
        }
        @CustomType.Setter
        public Builder externalEvaluation(@Nullable AccessGroupIncludeExternalEvaluation externalEvaluation) {

            this.externalEvaluation = externalEvaluation;
            return this;
        }
        @CustomType.Setter
        public Builder geos(@Nullable List<String> geos) {

            this.geos = geos;
            return this;
        }
        public Builder geos(String... geos) {
            return geos(List.of(geos));
        }
        @CustomType.Setter
        public Builder githubs(@Nullable List<AccessGroupIncludeGithub> githubs) {

            this.githubs = githubs;
            return this;
        }
        public Builder githubs(AccessGroupIncludeGithub... githubs) {
            return githubs(List.of(githubs));
        }
        @CustomType.Setter
        public Builder groups(@Nullable List<String> groups) {

            this.groups = groups;
            return this;
        }
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }
        @CustomType.Setter
        public Builder gsuites(@Nullable List<AccessGroupIncludeGsuite> gsuites) {

            this.gsuites = gsuites;
            return this;
        }
        public Builder gsuites(AccessGroupIncludeGsuite... gsuites) {
            return gsuites(List.of(gsuites));
        }
        @CustomType.Setter
        public Builder ipLists(@Nullable List<String> ipLists) {

            this.ipLists = ipLists;
            return this;
        }
        public Builder ipLists(String... ipLists) {
            return ipLists(List.of(ipLists));
        }
        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {

            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder loginMethods(@Nullable List<String> loginMethods) {

            this.loginMethods = loginMethods;
            return this;
        }
        public Builder loginMethods(String... loginMethods) {
            return loginMethods(List.of(loginMethods));
        }
        @CustomType.Setter
        public Builder oktas(@Nullable List<AccessGroupIncludeOkta> oktas) {

            this.oktas = oktas;
            return this;
        }
        public Builder oktas(AccessGroupIncludeOkta... oktas) {
            return oktas(List.of(oktas));
        }
        @CustomType.Setter
        public Builder samls(@Nullable List<AccessGroupIncludeSaml> samls) {

            this.samls = samls;
            return this;
        }
        public Builder samls(AccessGroupIncludeSaml... samls) {
            return samls(List.of(samls));
        }
        @CustomType.Setter
        public Builder serviceTokens(@Nullable List<String> serviceTokens) {

            this.serviceTokens = serviceTokens;
            return this;
        }
        public Builder serviceTokens(String... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }
        public AccessGroupInclude build() {
            final var _resultValue = new AccessGroupInclude();
            _resultValue.anyValidServiceToken = anyValidServiceToken;
            _resultValue.authContexts = authContexts;
            _resultValue.authMethod = authMethod;
            _resultValue.azures = azures;
            _resultValue.certificate = certificate;
            _resultValue.commonName = commonName;
            _resultValue.devicePostures = devicePostures;
            _resultValue.emailDomains = emailDomains;
            _resultValue.emails = emails;
            _resultValue.everyone = everyone;
            _resultValue.externalEvaluation = externalEvaluation;
            _resultValue.geos = geos;
            _resultValue.githubs = githubs;
            _resultValue.groups = groups;
            _resultValue.gsuites = gsuites;
            _resultValue.ipLists = ipLists;
            _resultValue.ips = ips;
            _resultValue.loginMethods = loginMethods;
            _resultValue.oktas = oktas;
            _resultValue.samls = samls;
            _resultValue.serviceTokens = serviceTokens;
            return _resultValue;
        }
    }
}
