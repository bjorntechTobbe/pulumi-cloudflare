// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this datasource to lookup a tunnel in an account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getTunnel({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "my-tunnel",
 * });
 * ```
 */
export function getTunnel(args: GetTunnelArgs, opts?: pulumi.InvokeOptions): Promise<GetTunnelResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getTunnel:getTunnel", {
        "accountId": args.accountId,
        "isDeleted": args.isDeleted,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getTunnel.
 */
export interface GetTunnelArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: string;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    isDeleted?: boolean;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    name: string;
}

/**
 * A collection of values returned by getTunnel.
 */
export interface GetTunnelResult {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    readonly accountId: string;
    /**
     * ID of the tunnel.
     */
    readonly id: string;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    readonly isDeleted?: boolean;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    readonly name: string;
    /**
     * Whether the tunnel can be configured remotely from the Zero Trust dashboard.
     */
    readonly remoteConfig: boolean;
    /**
     * The status of the tunnel. Available values: `inactive`, `degraded`, `healthy`, `down`.
     */
    readonly status: string;
    /**
     * The type of the tunnel. Available values: `cfdTunnel`, `warpConnector`.
     */
    readonly tunnelType: string;
}
/**
 * Use this datasource to lookup a tunnel in an account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getTunnel({
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "my-tunnel",
 * });
 * ```
 */
export function getTunnelOutput(args: GetTunnelOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTunnelResult> {
    return pulumi.output(args).apply((a: any) => getTunnel(a, opts))
}

/**
 * A collection of arguments for invoking getTunnel.
 */
export interface GetTunnelOutputArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * If true, only include deleted tunnels. If false, exclude deleted tunnels. If empty, all tunnels will be included. **Modifying this attribute will force creation of a new resource.**
     */
    isDeleted?: pulumi.Input<boolean>;
    /**
     * Name of the tunnel. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
}
