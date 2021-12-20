// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to look up [zone] info. This is the singular alternative
 * to `cloudflare.getZones`.
 *
 * > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
 *   accounts to have the same zone created but in different states. If you are
 *   using this setup, it is advised to use the `accountId` attribute on this
 *   resource or swap to `cloudflare.getZones` to further filter the results.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // You can also lookup by zone_id if you prefer.
 * const example = pulumi.output(cloudflare.getZone({
 *     zoneId: "0b6d347b01d437a092be84c2edfce72c",
 * }));
 * ```
 * ### Example usage with other resources
 *
 * The example below fetches the zone information for example.com and then is
 * referenced in the `cloudflare.Record` section.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleZone = cloudflare.getZone({
 *     name: "example.com",
 * });
 * const exampleRecord = new cloudflare.Record("exampleRecord", {
 *     zoneId: exampleZone.then(exampleZone => exampleZone.id),
 *     name: "www",
 *     value: "203.0.113.1",
 *     type: "A",
 *     proxied: true,
 * });
 * ```
 */
export function getZone(args?: GetZoneArgs, opts?: pulumi.InvokeOptions): Promise<GetZoneResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
     * The account ID associated with the zone.
     */
    accountId?: string;
    /**
     * The name of the zone. Conflicts with `"zoneId"`.
     */
    name?: string;
    /**
     * The zone ID. Conflicts with `"name"`.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getZone.
 */
export interface GetZoneResult {
    /**
     * The account ID associated with the zone.
     */
    readonly accountId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the zone.
     */
    readonly name: string;
    /**
     * Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    readonly nameServers: string[];
    /**
     * `true` if cloudflare is enabled on the zone, otherwise `false`.
     */
    readonly paused: boolean;
    /**
     * The name of the plan associated with the zone.
     */
    readonly plan: string;
    /**
     * Status of the zone. Values can be: `"active"`, `"pending"`, `"initializing"`, `"moved"`, `"deleted"`,
     * or `"deactivated"`.
     */
    readonly status: string;
    /**
     * List of Vanity Nameservers (if set).
     */
    readonly vanityNameServers: string[];
    readonly zoneId: string;
}

export function getZoneOutput(args?: GetZoneOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZoneResult> {
    return pulumi.output(args).apply(a => getZone(a, opts))
}

/**
 * A collection of arguments for invoking getZone.
 */
export interface GetZoneOutputArgs {
    /**
     * The account ID associated with the zone.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the zone. Conflicts with `"zoneId"`.
     */
    name?: pulumi.Input<string>;
    /**
     * The zone ID. Conflicts with `"name"`.
     */
    zoneId?: pulumi.Input<string>;
}
