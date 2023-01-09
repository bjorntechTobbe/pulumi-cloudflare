// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TieredCacheArgs extends com.pulumi.resources.ResourceArgs {

    public static final TieredCacheArgs Empty = new TieredCacheArgs();

    /**
     * The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
     * 
     */
    @Import(name="cacheType", required=true)
    private Output<String> cacheType;

    /**
     * @return The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
     * 
     */
    public Output<String> cacheType() {
        return this.cacheType;
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private TieredCacheArgs() {}

    private TieredCacheArgs(TieredCacheArgs $) {
        this.cacheType = $.cacheType;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TieredCacheArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TieredCacheArgs $;

        public Builder() {
            $ = new TieredCacheArgs();
        }

        public Builder(TieredCacheArgs defaults) {
            $ = new TieredCacheArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheType The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder cacheType(Output<String> cacheType) {
            $.cacheType = cacheType;
            return this;
        }

        /**
         * @param cacheType The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
         * 
         * @return builder
         * 
         */
        public Builder cacheType(String cacheType) {
            return cacheType(Output.of(cacheType));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public TieredCacheArgs build() {
            $.cacheType = Objects.requireNonNull($.cacheType, "expected parameter 'cacheType' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
