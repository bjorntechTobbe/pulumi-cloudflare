// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this datasource to lookup Rulesets in an account or zone.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getRulesets({
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     filter: {
 *         name: ".*OWASP.*",
 *     },
 * });
 * ```
 */
export function getRulesets(args?: GetRulesetsArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesetsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getRulesets:getRulesets", {
        "accountId": args.accountId,
        "filter": args.filter,
        "includeRules": args.includeRules,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRulesets.
 */
export interface GetRulesetsArgs {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    accountId?: string;
    filter?: inputs.GetRulesetsFilter;
    /**
     * Include rule data in response.
     */
    includeRules?: boolean;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getRulesets.
 */
export interface GetRulesetsResult {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    readonly accountId?: string;
    readonly filter?: outputs.GetRulesetsFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Include rule data in response.
     */
    readonly includeRules?: boolean;
    readonly rulesets: outputs.GetRulesetsRuleset[];
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    readonly zoneId?: string;
}
/**
 * Use this datasource to lookup Rulesets in an account or zone.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = cloudflare.getRulesets({
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     filter: {
 *         name: ".*OWASP.*",
 *     },
 * });
 * ```
 */
export function getRulesetsOutput(args?: GetRulesetsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRulesetsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getRulesets:getRulesets", {
        "accountId": args.accountId,
        "filter": args.filter,
        "includeRules": args.includeRules,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRulesets.
 */
export interface GetRulesetsOutputArgs {
    /**
     * The account identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    accountId?: pulumi.Input<string>;
    filter?: pulumi.Input<inputs.GetRulesetsFilterArgs>;
    /**
     * Include rule data in response.
     */
    includeRules?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. Must provide only one of `zoneId`, `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
