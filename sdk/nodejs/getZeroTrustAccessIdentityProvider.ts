// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to lookup a single [Access Identity Provider](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration) by name.
 */
export function getZeroTrustAccessIdentityProvider(args: GetZeroTrustAccessIdentityProviderArgs, opts?: pulumi.InvokeOptions): Promise<GetZeroTrustAccessIdentityProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZeroTrustAccessIdentityProvider:getZeroTrustAccessIdentityProvider", {
        "accountId": args.accountId,
        "name": args.name,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustAccessIdentityProvider.
 */
export interface GetZeroTrustAccessIdentityProviderArgs {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    accountId?: string;
    /**
     * Access Identity Provider name to search for.
     */
    name: string;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getZeroTrustAccessIdentityProvider.
 */
export interface GetZeroTrustAccessIdentityProviderResult {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    readonly accountId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Access Identity Provider name to search for.
     */
    readonly name: string;
    /**
     * Access Identity Provider Type.
     */
    readonly type: string;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    readonly zoneId?: string;
}
/**
 * Use this data source to lookup a single [Access Identity Provider](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration) by name.
 */
export function getZeroTrustAccessIdentityProviderOutput(args: GetZeroTrustAccessIdentityProviderOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZeroTrustAccessIdentityProviderResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZeroTrustAccessIdentityProvider:getZeroTrustAccessIdentityProvider", {
        "accountId": args.accountId,
        "name": args.name,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getZeroTrustAccessIdentityProvider.
 */
export interface GetZeroTrustAccessIdentityProviderOutputArgs {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Access Identity Provider name to search for.
     */
    name: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
