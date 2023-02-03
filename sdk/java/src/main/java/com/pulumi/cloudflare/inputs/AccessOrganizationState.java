// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessOrganizationState extends com.pulumi.resources.ResourceArgs {

    public static final AccessOrganizationState Empty = new AccessOrganizationState();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    @Import(name="authDomain")
    private @Nullable Output<String> authDomain;

    /**
     * @return The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    public Optional<Output<String>> authDomain() {
        return Optional.ofNullable(this.authDomain);
    }

    /**
     * When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    @Import(name="isUiReadOnly")
    private @Nullable Output<Boolean> isUiReadOnly;

    /**
     * @return When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    public Optional<Output<Boolean>> isUiReadOnly() {
        return Optional.ofNullable(this.isUiReadOnly);
    }

    @Import(name="loginDesigns")
    private @Nullable Output<List<AccessOrganizationLoginDesignArgs>> loginDesigns;

    public Optional<Output<List<AccessOrganizationLoginDesignArgs>>> loginDesigns() {
        return Optional.ofNullable(this.loginDesigns);
    }

    /**
     * The name of your Zero Trust organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of your Zero Trust organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    @Import(name="userSeatExpirationInactiveTime")
    private @Nullable Output<String> userSeatExpirationInactiveTime;

    /**
     * @return The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    public Optional<Output<String>> userSeatExpirationInactiveTime() {
        return Optional.ofNullable(this.userSeatExpirationInactiveTime);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessOrganizationState() {}

    private AccessOrganizationState(AccessOrganizationState $) {
        this.accountId = $.accountId;
        this.authDomain = $.authDomain;
        this.isUiReadOnly = $.isUiReadOnly;
        this.loginDesigns = $.loginDesigns;
        this.name = $.name;
        this.userSeatExpirationInactiveTime = $.userSeatExpirationInactiveTime;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessOrganizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessOrganizationState $;

        public Builder() {
            $ = new AccessOrganizationState();
        }

        public Builder(AccessOrganizationState defaults) {
            $ = new AccessOrganizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(@Nullable Output<String> authDomain) {
            $.authDomain = authDomain;
            return this;
        }

        /**
         * @param authDomain The unique subdomain assigned to your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder authDomain(String authDomain) {
            return authDomain(Output.of(authDomain));
        }

        /**
         * @param isUiReadOnly When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder isUiReadOnly(@Nullable Output<Boolean> isUiReadOnly) {
            $.isUiReadOnly = isUiReadOnly;
            return this;
        }

        /**
         * @param isUiReadOnly When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
         * 
         * @return builder
         * 
         */
        public Builder isUiReadOnly(Boolean isUiReadOnly) {
            return isUiReadOnly(Output.of(isUiReadOnly));
        }

        public Builder loginDesigns(@Nullable Output<List<AccessOrganizationLoginDesignArgs>> loginDesigns) {
            $.loginDesigns = loginDesigns;
            return this;
        }

        public Builder loginDesigns(List<AccessOrganizationLoginDesignArgs> loginDesigns) {
            return loginDesigns(Output.of(loginDesigns));
        }

        public Builder loginDesigns(AccessOrganizationLoginDesignArgs... loginDesigns) {
            return loginDesigns(List.of(loginDesigns));
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of your Zero Trust organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(@Nullable Output<String> userSeatExpirationInactiveTime) {
            $.userSeatExpirationInactiveTime = userSeatExpirationInactiveTime;
            return this;
        }

        /**
         * @param userSeatExpirationInactiveTime The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
         * 
         * @return builder
         * 
         */
        public Builder userSeatExpirationInactiveTime(String userSeatExpirationInactiveTime) {
            return userSeatExpirationInactiveTime(Output.of(userSeatExpirationInactiveTime));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessOrganizationState build() {
            return $;
        }
    }

}
