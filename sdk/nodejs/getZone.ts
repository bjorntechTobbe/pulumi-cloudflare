// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
 * info. This is the singular alternative to `cloudflare.getZones`.
 *
 * > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
 * accounts to have the same zone created but in different states. If you are
 * using this setup, it is advised to use the `accountId` attribute on this
 * resource or swap to `cloudflare.getZones` to further filter the results.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getZone({
 *     name: "example.com",
 * });
 * const exampleRecord = new cloudflare.Record("example", {
 *     zoneId: example.then(example => example.id),
 *     name: "www",
 *     content: "203.0.113.1",
 *     type: "A",
 *     proxied: true,
 * });
 * ```
 */
export function getZone(args?: GetZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZone:getZone", {
        "accountId": args.accountId,
        "name": args.name,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZone.
 */
export interface GetZoneArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: string;
    /**
     * The name of the zone. Must provide only one of `zoneId`, `name`.
     */
    name?: string;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getZone.
 */
export interface GetZoneResult {
    /**
     * The account identifier to target for the resource.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the zone. Must provide only one of `zoneId`, `name`.
     */
    readonly name: string;
    /**
     * Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    readonly nameServers: string[];
    /**
     * Whether the zone is paused on Cloudflare.
     */
    readonly paused: boolean;
    /**
     * The name of the plan associated with the zone.
     */
    readonly plan: string;
    /**
     * Status of the zone.
     */
    readonly status: string;
    /**
     * List of Vanity Nameservers (if set).
     */
    readonly vanityNameServers: string[];
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
     */
    readonly zoneId: string;
}
/**
 * Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
 * info. This is the singular alternative to `cloudflare.getZones`.
 *
 * > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
 * accounts to have the same zone created but in different states. If you are
 * using this setup, it is advised to use the `accountId` attribute on this
 * resource or swap to `cloudflare.getZones` to further filter the results.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getZone({
 *     name: "example.com",
 * });
 * const exampleRecord = new cloudflare.Record("example", {
 *     zoneId: example.then(example => example.id),
 *     name: "www",
 *     content: "203.0.113.1",
 *     type: "A",
 *     proxied: true,
 * });
 * ```
 */
export function getZoneOutput(args?: GetZoneOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZoneResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZone:getZone", {
        "accountId": args.accountId,
        "name": args.name,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZone.
 */
export interface GetZoneOutputArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the zone. Must provide only one of `zoneId`, `name`.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
     */
    zoneId?: pulumi.Input<string>;
}
