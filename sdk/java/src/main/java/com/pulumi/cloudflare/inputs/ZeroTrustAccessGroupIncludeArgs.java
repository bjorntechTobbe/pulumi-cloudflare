// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAuthContextArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeAzureArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeExternalEvaluationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGithubArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeGsuiteArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeOktaArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessGroupIncludeSamlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessGroupIncludeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessGroupIncludeArgs Empty = new ZeroTrustAccessGroupIncludeArgs();

    /**
     * Matches any valid Access service token.
     * 
     */
    @Import(name="anyValidServiceToken")
    private @Nullable Output<Boolean> anyValidServiceToken;

    /**
     * @return Matches any valid Access service token.
     * 
     */
    public Optional<Output<Boolean>> anyValidServiceToken() {
        return Optional.ofNullable(this.anyValidServiceToken);
    }

    @Import(name="authContexts")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeAuthContextArgs>> authContexts;

    public Optional<Output<List<ZeroTrustAccessGroupIncludeAuthContextArgs>>> authContexts() {
        return Optional.ofNullable(this.authContexts);
    }

    /**
     * The type of authentication method. Refer to https://datatracker.ietf.org/doc/html/rfc8176#section-2 for possible types.
     * 
     */
    @Import(name="authMethod")
    private @Nullable Output<String> authMethod;

    /**
     * @return The type of authentication method. Refer to https://datatracker.ietf.org/doc/html/rfc8176#section-2 for possible types.
     * 
     */
    public Optional<Output<String>> authMethod() {
        return Optional.ofNullable(this.authMethod);
    }

    /**
     * Matches an Azure group. Requires an Azure identity provider.
     * 
     */
    @Import(name="azures")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeAzureArgs>> azures;

    /**
     * @return Matches an Azure group. Requires an Azure identity provider.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeAzureArgs>>> azures() {
        return Optional.ofNullable(this.azures);
    }

    /**
     * Matches any valid client certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<Boolean> certificate;

    /**
     * @return Matches any valid client certificate.
     * 
     */
    public Optional<Output<Boolean>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Matches a valid client certificate common name.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return Matches a valid client certificate common name.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
     * 
     */
    @Import(name="commonNames")
    private @Nullable Output<List<String>> commonNames;

    /**
     * @return Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
     * 
     */
    public Optional<Output<List<String>>> commonNames() {
        return Optional.ofNullable(this.commonNames);
    }

    /**
     * The ID of a device posture integration.
     * 
     */
    @Import(name="devicePostures")
    private @Nullable Output<List<String>> devicePostures;

    /**
     * @return The ID of a device posture integration.
     * 
     */
    public Optional<Output<List<String>>> devicePostures() {
        return Optional.ofNullable(this.devicePostures);
    }

    /**
     * The email domain to match.
     * 
     */
    @Import(name="emailDomains")
    private @Nullable Output<List<String>> emailDomains;

    /**
     * @return The email domain to match.
     * 
     */
    public Optional<Output<List<String>>> emailDomains() {
        return Optional.ofNullable(this.emailDomains);
    }

    /**
     * The ID of a previously created email list.
     * 
     */
    @Import(name="emailLists")
    private @Nullable Output<List<String>> emailLists;

    /**
     * @return The ID of a previously created email list.
     * 
     */
    public Optional<Output<List<String>>> emailLists() {
        return Optional.ofNullable(this.emailLists);
    }

    /**
     * The email of the user.
     * 
     */
    @Import(name="emails")
    private @Nullable Output<List<String>> emails;

    /**
     * @return The email of the user.
     * 
     */
    public Optional<Output<List<String>>> emails() {
        return Optional.ofNullable(this.emails);
    }

    /**
     * Matches everyone.
     * 
     */
    @Import(name="everyone")
    private @Nullable Output<Boolean> everyone;

    /**
     * @return Matches everyone.
     * 
     */
    public Optional<Output<Boolean>> everyone() {
        return Optional.ofNullable(this.everyone);
    }

    /**
     * Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
     * 
     */
    @Import(name="externalEvaluations")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeExternalEvaluationArgs>> externalEvaluations;

    /**
     * @return Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeExternalEvaluationArgs>>> externalEvaluations() {
        return Optional.ofNullable(this.externalEvaluations);
    }

    /**
     * Matches a specific country.
     * 
     */
    @Import(name="geos")
    private @Nullable Output<List<String>> geos;

    /**
     * @return Matches a specific country.
     * 
     */
    public Optional<Output<List<String>>> geos() {
        return Optional.ofNullable(this.geos);
    }

    /**
     * Matches a Github organization. Requires a Github identity provider.
     * 
     */
    @Import(name="githubs")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeGithubArgs>> githubs;

    /**
     * @return Matches a Github organization. Requires a Github identity provider.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeGithubArgs>>> githubs() {
        return Optional.ofNullable(this.githubs);
    }

    /**
     * The ID of a previously created Access group.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return The ID of a previously created Access group.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Matches a group in Google Workspace. Requires a Google Workspace identity provider.
     * 
     */
    @Import(name="gsuites")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeGsuiteArgs>> gsuites;

    /**
     * @return Matches a group in Google Workspace. Requires a Google Workspace identity provider.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeGsuiteArgs>>> gsuites() {
        return Optional.ofNullable(this.gsuites);
    }

    /**
     * The ID of a previously created IP list.
     * 
     */
    @Import(name="ipLists")
    private @Nullable Output<List<String>> ipLists;

    /**
     * @return The ID of a previously created IP list.
     * 
     */
    public Optional<Output<List<String>>> ipLists() {
        return Optional.ofNullable(this.ipLists);
    }

    /**
     * An IPv4 or IPv6 CIDR block.
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<String>> ips;

    /**
     * @return An IPv4 or IPv6 CIDR block.
     * 
     */
    public Optional<Output<List<String>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    /**
     * The ID of a configured identity provider.
     * 
     */
    @Import(name="loginMethods")
    private @Nullable Output<List<String>> loginMethods;

    /**
     * @return The ID of a configured identity provider.
     * 
     */
    public Optional<Output<List<String>>> loginMethods() {
        return Optional.ofNullable(this.loginMethods);
    }

    /**
     * Matches an Okta group. Requires an Okta identity provider.
     * 
     */
    @Import(name="oktas")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeOktaArgs>> oktas;

    /**
     * @return Matches an Okta group. Requires an Okta identity provider.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeOktaArgs>>> oktas() {
        return Optional.ofNullable(this.oktas);
    }

    /**
     * Matches a SAML group. Requires a SAML identity provider.
     * 
     */
    @Import(name="samls")
    private @Nullable Output<List<ZeroTrustAccessGroupIncludeSamlArgs>> samls;

    /**
     * @return Matches a SAML group. Requires a SAML identity provider.
     * 
     */
    public Optional<Output<List<ZeroTrustAccessGroupIncludeSamlArgs>>> samls() {
        return Optional.ofNullable(this.samls);
    }

    /**
     * The ID of an Access service token.
     * 
     */
    @Import(name="serviceTokens")
    private @Nullable Output<List<String>> serviceTokens;

    /**
     * @return The ID of an Access service token.
     * 
     */
    public Optional<Output<List<String>>> serviceTokens() {
        return Optional.ofNullable(this.serviceTokens);
    }

    private ZeroTrustAccessGroupIncludeArgs() {}

    private ZeroTrustAccessGroupIncludeArgs(ZeroTrustAccessGroupIncludeArgs $) {
        this.anyValidServiceToken = $.anyValidServiceToken;
        this.authContexts = $.authContexts;
        this.authMethod = $.authMethod;
        this.azures = $.azures;
        this.certificate = $.certificate;
        this.commonName = $.commonName;
        this.commonNames = $.commonNames;
        this.devicePostures = $.devicePostures;
        this.emailDomains = $.emailDomains;
        this.emailLists = $.emailLists;
        this.emails = $.emails;
        this.everyone = $.everyone;
        this.externalEvaluations = $.externalEvaluations;
        this.geos = $.geos;
        this.githubs = $.githubs;
        this.groups = $.groups;
        this.gsuites = $.gsuites;
        this.ipLists = $.ipLists;
        this.ips = $.ips;
        this.loginMethods = $.loginMethods;
        this.oktas = $.oktas;
        this.samls = $.samls;
        this.serviceTokens = $.serviceTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessGroupIncludeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessGroupIncludeArgs $;

        public Builder() {
            $ = new ZeroTrustAccessGroupIncludeArgs();
        }

        public Builder(ZeroTrustAccessGroupIncludeArgs defaults) {
            $ = new ZeroTrustAccessGroupIncludeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param anyValidServiceToken Matches any valid Access service token.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(@Nullable Output<Boolean> anyValidServiceToken) {
            $.anyValidServiceToken = anyValidServiceToken;
            return this;
        }

        /**
         * @param anyValidServiceToken Matches any valid Access service token.
         * 
         * @return builder
         * 
         */
        public Builder anyValidServiceToken(Boolean anyValidServiceToken) {
            return anyValidServiceToken(Output.of(anyValidServiceToken));
        }

        public Builder authContexts(@Nullable Output<List<ZeroTrustAccessGroupIncludeAuthContextArgs>> authContexts) {
            $.authContexts = authContexts;
            return this;
        }

        public Builder authContexts(List<ZeroTrustAccessGroupIncludeAuthContextArgs> authContexts) {
            return authContexts(Output.of(authContexts));
        }

        public Builder authContexts(ZeroTrustAccessGroupIncludeAuthContextArgs... authContexts) {
            return authContexts(List.of(authContexts));
        }

        /**
         * @param authMethod The type of authentication method. Refer to https://datatracker.ietf.org/doc/html/rfc8176#section-2 for possible types.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(@Nullable Output<String> authMethod) {
            $.authMethod = authMethod;
            return this;
        }

        /**
         * @param authMethod The type of authentication method. Refer to https://datatracker.ietf.org/doc/html/rfc8176#section-2 for possible types.
         * 
         * @return builder
         * 
         */
        public Builder authMethod(String authMethod) {
            return authMethod(Output.of(authMethod));
        }

        /**
         * @param azures Matches an Azure group. Requires an Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder azures(@Nullable Output<List<ZeroTrustAccessGroupIncludeAzureArgs>> azures) {
            $.azures = azures;
            return this;
        }

        /**
         * @param azures Matches an Azure group. Requires an Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder azures(List<ZeroTrustAccessGroupIncludeAzureArgs> azures) {
            return azures(Output.of(azures));
        }

        /**
         * @param azures Matches an Azure group. Requires an Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder azures(ZeroTrustAccessGroupIncludeAzureArgs... azures) {
            return azures(List.of(azures));
        }

        /**
         * @param certificate Matches any valid client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<Boolean> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate Matches any valid client certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(Boolean certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param commonName Matches a valid client certificate common name.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName Matches a valid client certificate common name.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(@Nullable Output<List<String>> commonNames) {
            $.commonNames = commonNames;
            return this;
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(List<String> commonNames) {
            return commonNames(Output.of(commonNames));
        }

        /**
         * @param commonNames Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
         * 
         * @return builder
         * 
         */
        public Builder commonNames(String... commonNames) {
            return commonNames(List.of(commonNames));
        }

        /**
         * @param devicePostures The ID of a device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder devicePostures(@Nullable Output<List<String>> devicePostures) {
            $.devicePostures = devicePostures;
            return this;
        }

        /**
         * @param devicePostures The ID of a device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder devicePostures(List<String> devicePostures) {
            return devicePostures(Output.of(devicePostures));
        }

        /**
         * @param devicePostures The ID of a device posture integration.
         * 
         * @return builder
         * 
         */
        public Builder devicePostures(String... devicePostures) {
            return devicePostures(List.of(devicePostures));
        }

        /**
         * @param emailDomains The email domain to match.
         * 
         * @return builder
         * 
         */
        public Builder emailDomains(@Nullable Output<List<String>> emailDomains) {
            $.emailDomains = emailDomains;
            return this;
        }

        /**
         * @param emailDomains The email domain to match.
         * 
         * @return builder
         * 
         */
        public Builder emailDomains(List<String> emailDomains) {
            return emailDomains(Output.of(emailDomains));
        }

        /**
         * @param emailDomains The email domain to match.
         * 
         * @return builder
         * 
         */
        public Builder emailDomains(String... emailDomains) {
            return emailDomains(List.of(emailDomains));
        }

        /**
         * @param emailLists The ID of a previously created email list.
         * 
         * @return builder
         * 
         */
        public Builder emailLists(@Nullable Output<List<String>> emailLists) {
            $.emailLists = emailLists;
            return this;
        }

        /**
         * @param emailLists The ID of a previously created email list.
         * 
         * @return builder
         * 
         */
        public Builder emailLists(List<String> emailLists) {
            return emailLists(Output.of(emailLists));
        }

        /**
         * @param emailLists The ID of a previously created email list.
         * 
         * @return builder
         * 
         */
        public Builder emailLists(String... emailLists) {
            return emailLists(List.of(emailLists));
        }

        /**
         * @param emails The email of the user.
         * 
         * @return builder
         * 
         */
        public Builder emails(@Nullable Output<List<String>> emails) {
            $.emails = emails;
            return this;
        }

        /**
         * @param emails The email of the user.
         * 
         * @return builder
         * 
         */
        public Builder emails(List<String> emails) {
            return emails(Output.of(emails));
        }

        /**
         * @param emails The email of the user.
         * 
         * @return builder
         * 
         */
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        /**
         * @param everyone Matches everyone.
         * 
         * @return builder
         * 
         */
        public Builder everyone(@Nullable Output<Boolean> everyone) {
            $.everyone = everyone;
            return this;
        }

        /**
         * @param everyone Matches everyone.
         * 
         * @return builder
         * 
         */
        public Builder everyone(Boolean everyone) {
            return everyone(Output.of(everyone));
        }

        /**
         * @param externalEvaluations Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
         * 
         * @return builder
         * 
         */
        public Builder externalEvaluations(@Nullable Output<List<ZeroTrustAccessGroupIncludeExternalEvaluationArgs>> externalEvaluations) {
            $.externalEvaluations = externalEvaluations;
            return this;
        }

        /**
         * @param externalEvaluations Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
         * 
         * @return builder
         * 
         */
        public Builder externalEvaluations(List<ZeroTrustAccessGroupIncludeExternalEvaluationArgs> externalEvaluations) {
            return externalEvaluations(Output.of(externalEvaluations));
        }

        /**
         * @param externalEvaluations Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
         * 
         * @return builder
         * 
         */
        public Builder externalEvaluations(ZeroTrustAccessGroupIncludeExternalEvaluationArgs... externalEvaluations) {
            return externalEvaluations(List.of(externalEvaluations));
        }

        /**
         * @param geos Matches a specific country.
         * 
         * @return builder
         * 
         */
        public Builder geos(@Nullable Output<List<String>> geos) {
            $.geos = geos;
            return this;
        }

        /**
         * @param geos Matches a specific country.
         * 
         * @return builder
         * 
         */
        public Builder geos(List<String> geos) {
            return geos(Output.of(geos));
        }

        /**
         * @param geos Matches a specific country.
         * 
         * @return builder
         * 
         */
        public Builder geos(String... geos) {
            return geos(List.of(geos));
        }

        /**
         * @param githubs Matches a Github organization. Requires a Github identity provider.
         * 
         * @return builder
         * 
         */
        public Builder githubs(@Nullable Output<List<ZeroTrustAccessGroupIncludeGithubArgs>> githubs) {
            $.githubs = githubs;
            return this;
        }

        /**
         * @param githubs Matches a Github organization. Requires a Github identity provider.
         * 
         * @return builder
         * 
         */
        public Builder githubs(List<ZeroTrustAccessGroupIncludeGithubArgs> githubs) {
            return githubs(Output.of(githubs));
        }

        /**
         * @param githubs Matches a Github organization. Requires a Github identity provider.
         * 
         * @return builder
         * 
         */
        public Builder githubs(ZeroTrustAccessGroupIncludeGithubArgs... githubs) {
            return githubs(List.of(githubs));
        }

        /**
         * @param groups The ID of a previously created Access group.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups The ID of a previously created Access group.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups The ID of a previously created Access group.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param gsuites Matches a group in Google Workspace. Requires a Google Workspace identity provider.
         * 
         * @return builder
         * 
         */
        public Builder gsuites(@Nullable Output<List<ZeroTrustAccessGroupIncludeGsuiteArgs>> gsuites) {
            $.gsuites = gsuites;
            return this;
        }

        /**
         * @param gsuites Matches a group in Google Workspace. Requires a Google Workspace identity provider.
         * 
         * @return builder
         * 
         */
        public Builder gsuites(List<ZeroTrustAccessGroupIncludeGsuiteArgs> gsuites) {
            return gsuites(Output.of(gsuites));
        }

        /**
         * @param gsuites Matches a group in Google Workspace. Requires a Google Workspace identity provider.
         * 
         * @return builder
         * 
         */
        public Builder gsuites(ZeroTrustAccessGroupIncludeGsuiteArgs... gsuites) {
            return gsuites(List.of(gsuites));
        }

        /**
         * @param ipLists The ID of a previously created IP list.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(@Nullable Output<List<String>> ipLists) {
            $.ipLists = ipLists;
            return this;
        }

        /**
         * @param ipLists The ID of a previously created IP list.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(List<String> ipLists) {
            return ipLists(Output.of(ipLists));
        }

        /**
         * @param ipLists The ID of a previously created IP list.
         * 
         * @return builder
         * 
         */
        public Builder ipLists(String... ipLists) {
            return ipLists(List.of(ipLists));
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<String>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<String> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips An IPv4 or IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param loginMethods The ID of a configured identity provider.
         * 
         * @return builder
         * 
         */
        public Builder loginMethods(@Nullable Output<List<String>> loginMethods) {
            $.loginMethods = loginMethods;
            return this;
        }

        /**
         * @param loginMethods The ID of a configured identity provider.
         * 
         * @return builder
         * 
         */
        public Builder loginMethods(List<String> loginMethods) {
            return loginMethods(Output.of(loginMethods));
        }

        /**
         * @param loginMethods The ID of a configured identity provider.
         * 
         * @return builder
         * 
         */
        public Builder loginMethods(String... loginMethods) {
            return loginMethods(List.of(loginMethods));
        }

        /**
         * @param oktas Matches an Okta group. Requires an Okta identity provider.
         * 
         * @return builder
         * 
         */
        public Builder oktas(@Nullable Output<List<ZeroTrustAccessGroupIncludeOktaArgs>> oktas) {
            $.oktas = oktas;
            return this;
        }

        /**
         * @param oktas Matches an Okta group. Requires an Okta identity provider.
         * 
         * @return builder
         * 
         */
        public Builder oktas(List<ZeroTrustAccessGroupIncludeOktaArgs> oktas) {
            return oktas(Output.of(oktas));
        }

        /**
         * @param oktas Matches an Okta group. Requires an Okta identity provider.
         * 
         * @return builder
         * 
         */
        public Builder oktas(ZeroTrustAccessGroupIncludeOktaArgs... oktas) {
            return oktas(List.of(oktas));
        }

        /**
         * @param samls Matches a SAML group. Requires a SAML identity provider.
         * 
         * @return builder
         * 
         */
        public Builder samls(@Nullable Output<List<ZeroTrustAccessGroupIncludeSamlArgs>> samls) {
            $.samls = samls;
            return this;
        }

        /**
         * @param samls Matches a SAML group. Requires a SAML identity provider.
         * 
         * @return builder
         * 
         */
        public Builder samls(List<ZeroTrustAccessGroupIncludeSamlArgs> samls) {
            return samls(Output.of(samls));
        }

        /**
         * @param samls Matches a SAML group. Requires a SAML identity provider.
         * 
         * @return builder
         * 
         */
        public Builder samls(ZeroTrustAccessGroupIncludeSamlArgs... samls) {
            return samls(List.of(samls));
        }

        /**
         * @param serviceTokens The ID of an Access service token.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(@Nullable Output<List<String>> serviceTokens) {
            $.serviceTokens = serviceTokens;
            return this;
        }

        /**
         * @param serviceTokens The ID of an Access service token.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(List<String> serviceTokens) {
            return serviceTokens(Output.of(serviceTokens));
        }

        /**
         * @param serviceTokens The ID of an Access service token.
         * 
         * @return builder
         * 
         */
        public Builder serviceTokens(String... serviceTokens) {
            return serviceTokens(List.of(serviceTokens));
        }

        public ZeroTrustAccessGroupIncludeArgs build() {
            return $;
        }
    }

}
