// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustGatewayCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustGatewayCertificateArgs Empty = new ZeroTrustGatewayCertificateArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
     * 
     */
    @Import(name="activate")
    private @Nullable Output<Boolean> activate;

    /**
     * @return Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> activate() {
        return Optional.ofNullable(this.activate);
    }

    /**
     * The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
     * 
     */
    @Import(name="custom")
    private @Nullable Output<Boolean> custom;

    /**
     * @return The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
     * 
     */
    public Optional<Output<Boolean>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
     * 
     */
    @Import(name="gatewayManaged")
    private @Nullable Output<Boolean> gatewayManaged;

    /**
     * @return The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
     * 
     */
    public Optional<Output<Boolean>> gatewayManaged() {
        return Optional.ofNullable(this.gatewayManaged);
    }

    /**
     * Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="validityPeriodDays")
    private @Nullable Output<Integer> validityPeriodDays;

    /**
     * @return Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<Integer>> validityPeriodDays() {
        return Optional.ofNullable(this.validityPeriodDays);
    }

    private ZeroTrustGatewayCertificateArgs() {}

    private ZeroTrustGatewayCertificateArgs(ZeroTrustGatewayCertificateArgs $) {
        this.accountId = $.accountId;
        this.activate = $.activate;
        this.custom = $.custom;
        this.gatewayManaged = $.gatewayManaged;
        this.validityPeriodDays = $.validityPeriodDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustGatewayCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustGatewayCertificateArgs $;

        public Builder() {
            $ = new ZeroTrustGatewayCertificateArgs();
        }

        public Builder(ZeroTrustGatewayCertificateArgs defaults) {
            $ = new ZeroTrustGatewayCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param activate Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder activate(@Nullable Output<Boolean> activate) {
            $.activate = activate;
            return this;
        }

        /**
         * @param activate Whether or not to activate a certificate. A certificate must be activated to use in Gateway certificate settings. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder activate(Boolean activate) {
            return activate(Output.of(activate));
        }

        /**
         * @param custom The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
         * 
         * @return builder
         * 
         */
        public Builder custom(@Nullable Output<Boolean> custom) {
            $.custom = custom;
            return this;
        }

        /**
         * @param custom The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
         * 
         * @return builder
         * 
         */
        public Builder custom(Boolean custom) {
            return custom(Output.of(custom));
        }

        /**
         * @param gatewayManaged The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayManaged(@Nullable Output<Boolean> gatewayManaged) {
            $.gatewayManaged = gatewayManaged;
            return this;
        }

        /**
         * @param gatewayManaged The type of certificate (custom or Gateway-managed). Must provide only one of `custom`, `gateway_managed`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayManaged(Boolean gatewayManaged) {
            return gatewayManaged(Output.of(gatewayManaged));
        }

        /**
         * @param validityPeriodDays Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder validityPeriodDays(@Nullable Output<Integer> validityPeriodDays) {
            $.validityPeriodDays = validityPeriodDays;
            return this;
        }

        /**
         * @param validityPeriodDays Number of days the generated certificate will be valid, minimum 1 day and maximum 30 years. Defaults to 5 years. Defaults to `1826`. Required when using `gateway_managed`. Conflicts with `custom`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder validityPeriodDays(Integer validityPeriodDays) {
            return validityPeriodDays(Output.of(validityPeriodDays));
        }

        public ZeroTrustGatewayCertificateArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("ZeroTrustGatewayCertificateArgs", "accountId");
            }
            return $;
        }
    }

}
