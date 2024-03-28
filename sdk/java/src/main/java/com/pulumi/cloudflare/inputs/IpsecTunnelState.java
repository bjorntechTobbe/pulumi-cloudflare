// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelState extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelState Empty = new IpsecTunnelState();

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     * 
     */
    @Import(name="allowNullCipher")
    private @Nullable Output<Boolean> allowNullCipher;

    /**
     * @return Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> allowNullCipher() {
        return Optional.ofNullable(this.allowNullCipher);
    }

    /**
     * IP address assigned to the Cloudflare side of the IPsec tunnel.
     * 
     */
    @Import(name="cloudflareEndpoint")
    private @Nullable Output<String> cloudflareEndpoint;

    /**
     * @return IP address assigned to the Cloudflare side of the IPsec tunnel.
     * 
     */
    public Optional<Output<String>> cloudflareEndpoint() {
        return Optional.ofNullable(this.cloudflareEndpoint);
    }

    /**
     * IP address assigned to the customer side of the IPsec tunnel.
     * 
     */
    @Import(name="customerEndpoint")
    private @Nullable Output<String> customerEndpoint;

    /**
     * @return IP address assigned to the customer side of the IPsec tunnel.
     * 
     */
    public Optional<Output<String>> customerEndpoint() {
        return Optional.ofNullable(this.customerEndpoint);
    }

    /**
     * An optional description of the IPsec tunnel.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the IPsec tunnel.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * `remote_id` in the form of a fqdn. This value is generated by cloudflare.
     * 
     */
    @Import(name="fqdnId")
    private @Nullable Output<String> fqdnId;

    /**
     * @return `remote_id` in the form of a fqdn. This value is generated by cloudflare.
     * 
     */
    public Optional<Output<String>> fqdnId() {
        return Optional.ofNullable(this.fqdnId);
    }

    /**
     * Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
     * 
     */
    @Import(name="healthCheckDirection")
    private @Nullable Output<String> healthCheckDirection;

    /**
     * @return Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
     * 
     */
    public Optional<Output<String>> healthCheckDirection() {
        return Optional.ofNullable(this.healthCheckDirection);
    }

    /**
     * Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     * 
     */
    @Import(name="healthCheckEnabled")
    private @Nullable Output<Boolean> healthCheckEnabled;

    /**
     * @return Specifies if ICMP tunnel health checks are enabled. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> healthCheckEnabled() {
        return Optional.ofNullable(this.healthCheckEnabled);
    }

    /**
     * Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
     * 
     */
    @Import(name="healthCheckRate")
    private @Nullable Output<String> healthCheckRate;

    /**
     * @return Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
     * 
     */
    public Optional<Output<String>> healthCheckRate() {
        return Optional.ofNullable(this.healthCheckRate);
    }

    /**
     * The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    @Import(name="healthCheckTarget")
    private @Nullable Output<String> healthCheckTarget;

    /**
     * @return The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
     * 
     */
    public Optional<Output<String>> healthCheckTarget() {
        return Optional.ofNullable(this.healthCheckTarget);
    }

    /**
     * Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     * 
     */
    @Import(name="healthCheckType")
    private @Nullable Output<String> healthCheckType;

    /**
     * @return Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
     * 
     */
    public Optional<Output<String>> healthCheckType() {
        return Optional.ofNullable(this.healthCheckType);
    }

    /**
     * `remote_id` as a hex string. This value is generated by cloudflare.
     * 
     */
    @Import(name="hexId")
    private @Nullable Output<String> hexId;

    /**
     * @return `remote_id` as a hex string. This value is generated by cloudflare.
     * 
     */
    public Optional<Output<String>> hexId() {
        return Optional.ofNullable(this.hexId);
    }

    /**
     * 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    @Import(name="interfaceAddress")
    private @Nullable Output<String> interfaceAddress;

    /**
     * @return 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
     * 
     */
    public Optional<Output<String>> interfaceAddress() {
        return Optional.ofNullable(this.interfaceAddress);
    }

    /**
     * Name of the IPsec tunnel.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the IPsec tunnel.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     * 
     */
    @Import(name="psk")
    private @Nullable Output<String> psk;

    /**
     * @return Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
     * 
     */
    public Optional<Output<String>> psk() {
        return Optional.ofNullable(this.psk);
    }

    /**
     * ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     * 
     */
    @Import(name="remoteId")
    private @Nullable Output<String> remoteId;

    /**
     * @return ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
     * 
     */
    public Optional<Output<String>> remoteId() {
        return Optional.ofNullable(this.remoteId);
    }

    /**
     * `remote_id` in the form of an email address. This value is generated by cloudflare.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return `remote_id` in the form of an email address. This value is generated by cloudflare.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private IpsecTunnelState() {}

    private IpsecTunnelState(IpsecTunnelState $) {
        this.accountId = $.accountId;
        this.allowNullCipher = $.allowNullCipher;
        this.cloudflareEndpoint = $.cloudflareEndpoint;
        this.customerEndpoint = $.customerEndpoint;
        this.description = $.description;
        this.fqdnId = $.fqdnId;
        this.healthCheckDirection = $.healthCheckDirection;
        this.healthCheckEnabled = $.healthCheckEnabled;
        this.healthCheckRate = $.healthCheckRate;
        this.healthCheckTarget = $.healthCheckTarget;
        this.healthCheckType = $.healthCheckType;
        this.hexId = $.hexId;
        this.interfaceAddress = $.interfaceAddress;
        this.name = $.name;
        this.psk = $.psk;
        this.remoteId = $.remoteId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelState $;

        public Builder() {
            $ = new IpsecTunnelState();
        }

        public Builder(IpsecTunnelState defaults) {
            $ = new IpsecTunnelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowNullCipher Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowNullCipher(@Nullable Output<Boolean> allowNullCipher) {
            $.allowNullCipher = allowNullCipher;
            return this;
        }

        /**
         * @param allowNullCipher Specifies if this tunnel may use a null cipher (ENCR_NULL) in Phase 2. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder allowNullCipher(Boolean allowNullCipher) {
            return allowNullCipher(Output.of(allowNullCipher));
        }

        /**
         * @param cloudflareEndpoint IP address assigned to the Cloudflare side of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cloudflareEndpoint(@Nullable Output<String> cloudflareEndpoint) {
            $.cloudflareEndpoint = cloudflareEndpoint;
            return this;
        }

        /**
         * @param cloudflareEndpoint IP address assigned to the Cloudflare side of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder cloudflareEndpoint(String cloudflareEndpoint) {
            return cloudflareEndpoint(Output.of(cloudflareEndpoint));
        }

        /**
         * @param customerEndpoint IP address assigned to the customer side of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerEndpoint(@Nullable Output<String> customerEndpoint) {
            $.customerEndpoint = customerEndpoint;
            return this;
        }

        /**
         * @param customerEndpoint IP address assigned to the customer side of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder customerEndpoint(String customerEndpoint) {
            return customerEndpoint(Output.of(customerEndpoint));
        }

        /**
         * @param description An optional description of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fqdnId `remote_id` in the form of a fqdn. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder fqdnId(@Nullable Output<String> fqdnId) {
            $.fqdnId = fqdnId;
            return this;
        }

        /**
         * @param fqdnId `remote_id` in the form of a fqdn. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder fqdnId(String fqdnId) {
            return fqdnId(Output.of(fqdnId));
        }

        /**
         * @param healthCheckDirection Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckDirection(@Nullable Output<String> healthCheckDirection) {
            $.healthCheckDirection = healthCheckDirection;
            return this;
        }

        /**
         * @param healthCheckDirection Specifies the direction for the health check. Available values: `unidirectional`, `bidirectional` Default: `unidirectional`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckDirection(String healthCheckDirection) {
            return healthCheckDirection(Output.of(healthCheckDirection));
        }

        /**
         * @param healthCheckEnabled Specifies if ICMP tunnel health checks are enabled. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckEnabled(@Nullable Output<Boolean> healthCheckEnabled) {
            $.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * @param healthCheckEnabled Specifies if ICMP tunnel health checks are enabled. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            return healthCheckEnabled(Output.of(healthCheckEnabled));
        }

        /**
         * @param healthCheckRate Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRate(@Nullable Output<String> healthCheckRate) {
            $.healthCheckRate = healthCheckRate;
            return this;
        }

        /**
         * @param healthCheckRate Specifies the ICMP rate for the health check. Available values: `low`, `mid`, `high` Default: `mid`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckRate(String healthCheckRate) {
            return healthCheckRate(Output.of(healthCheckRate));
        }

        /**
         * @param healthCheckTarget The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTarget(@Nullable Output<String> healthCheckTarget) {
            $.healthCheckTarget = healthCheckTarget;
            return this;
        }

        /**
         * @param healthCheckTarget The IP address of the customer endpoint that will receive tunnel health checks. Default: `&lt;customer_gre_endpoint&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTarget(String healthCheckTarget) {
            return healthCheckTarget(Output.of(healthCheckTarget));
        }

        /**
         * @param healthCheckType Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(@Nullable Output<String> healthCheckType) {
            $.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * @param healthCheckType Specifies the ICMP echo type for the health check (`request` or `reply`). Available values: `request`, `reply` Default: `reply`.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckType(String healthCheckType) {
            return healthCheckType(Output.of(healthCheckType));
        }

        /**
         * @param hexId `remote_id` as a hex string. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder hexId(@Nullable Output<String> hexId) {
            $.hexId = hexId;
            return this;
        }

        /**
         * @param hexId `remote_id` as a hex string. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder hexId(String hexId) {
            return hexId(Output.of(hexId));
        }

        /**
         * @param interfaceAddress 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder interfaceAddress(@Nullable Output<String> interfaceAddress) {
            $.interfaceAddress = interfaceAddress;
            return this;
        }

        /**
         * @param interfaceAddress 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
         * 
         * @return builder
         * 
         */
        public Builder interfaceAddress(String interfaceAddress) {
            return interfaceAddress(Output.of(interfaceAddress));
        }

        /**
         * @param name Name of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the IPsec tunnel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param psk Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
         * 
         * @return builder
         * 
         */
        public Builder psk(@Nullable Output<String> psk) {
            $.psk = psk;
            return this;
        }

        /**
         * @param psk Pre shared key to be used with the IPsec tunnel. If left unset, it will be autogenerated.
         * 
         * @return builder
         * 
         */
        public Builder psk(String psk) {
            return psk(Output.of(psk));
        }

        /**
         * @param remoteId ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder remoteId(@Nullable Output<String> remoteId) {
            $.remoteId = remoteId;
            return this;
        }

        /**
         * @param remoteId ID to be used while setting up the IPsec tunnel. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder remoteId(String remoteId) {
            return remoteId(Output.of(remoteId));
        }

        /**
         * @param userId `remote_id` in the form of an email address. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId `remote_id` in the form of an email address. This value is generated by cloudflare.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public IpsecTunnelState build() {
            return $;
        }
    }

}
