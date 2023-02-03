// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.LogpullRetention("example", {
 *     enabled: true,
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/logpullRetention:LogpullRetention example <zone_id>
 * ```
 */
export class LogpullRetention extends pulumi.CustomResource {
    /**
     * Get an existing LogpullRetention resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogpullRetentionState, opts?: pulumi.CustomResourceOptions): LogpullRetention {
        return new LogpullRetention(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/logpullRetention:LogpullRetention';

    /**
     * Returns true if the given object is an instance of LogpullRetention.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogpullRetention {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogpullRetention.__pulumiType;
    }

    /**
     * Whether you wish to retain logs or not.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a LogpullRetention resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogpullRetentionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogpullRetentionArgs | LogpullRetentionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogpullRetentionState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LogpullRetentionArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogpullRetention.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogpullRetention resources.
 */
export interface LogpullRetentionState {
    /**
     * Whether you wish to retain logs or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogpullRetention resource.
 */
export interface LogpullRetentionArgs {
    /**
     * Whether you wish to retain logs or not.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
