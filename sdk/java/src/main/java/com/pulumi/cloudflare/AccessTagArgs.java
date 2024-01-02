// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessTagArgs Empty = new AccessTagArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Number of apps associated with the tag.
     * 
     */
    @Import(name="appCount")
    private @Nullable Output<Integer> appCount;

    /**
     * @return Number of apps associated with the tag.
     * 
     */
    public Optional<Output<Integer>> appCount() {
        return Optional.ofNullable(this.appCount);
    }

    /**
     * Friendly name of the Access Tag.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Friendly name of the Access Tag.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessTagArgs() {}

    private AccessTagArgs(AccessTagArgs $) {
        this.accountId = $.accountId;
        this.appCount = $.appCount;
        this.name = $.name;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessTagArgs $;

        public Builder() {
            $ = new AccessTagArgs();
        }

        public Builder(AccessTagArgs defaults) {
            $ = new AccessTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param appCount Number of apps associated with the tag.
         * 
         * @return builder
         * 
         */
        public Builder appCount(@Nullable Output<Integer> appCount) {
            $.appCount = appCount;
            return this;
        }

        /**
         * @param appCount Number of apps associated with the tag.
         * 
         * @return builder
         * 
         */
        public Builder appCount(Integer appCount) {
            return appCount(Output.of(appCount));
        }

        /**
         * @param name Friendly name of the Access Tag.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Tag.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessTagArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("AccessTagArgs", "name");
            }
            return $;
        }
    }

}
