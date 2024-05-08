// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Filter expressions that can be referenced across multiple features,
 * e.g. Firewall Rules. See [what is a filter](https://developers.cloudflare.com/firewall/api/cf-filters/what-is-a-filter/)
 * for more details and available fields and operators.
 *
 * > `cloudflare.Filter` is in a deprecation phase that will last for 14 months
 *   (July 1st, 2024). During this time period, this resource is still fully
 *   supported but you are strongly advised to move to the
 *   `cloudflare.Ruleset` resource. Full details can be found in the
 *   developer documentation.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const wordpress = new cloudflare.Filter("wordpress", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     description: "Wordpress break-in attempts that are outside of the office",
 *     expression: "(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/filter:Filter example <zone_id>/<filter_id>
 * ```
 */
export class Filter extends pulumi.CustomResource {
    /**
     * Get an existing Filter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FilterState, opts?: pulumi.CustomResourceOptions): Filter {
        return new Filter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/filter:Filter';

    /**
     * Returns true if the given object is an instance of Filter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Filter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Filter.__pulumiType;
    }

    /**
     * A note that you can use to describe the purpose of the filter.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The filter expression to be used.
     */
    public readonly expression!: pulumi.Output<string>;
    /**
     * Whether this filter is currently paused.
     */
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * Short reference tag to quickly select related rules.
     */
    public readonly ref!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Filter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FilterArgs | FilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FilterState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expression"] = state ? state.expression : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["ref"] = state ? state.ref : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as FilterArgs | undefined;
            if ((!args || args.expression === undefined) && !opts.urn) {
                throw new Error("Missing required property 'expression'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expression"] = args ? args.expression : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["ref"] = args ? args.ref : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Filter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Filter resources.
 */
export interface FilterState {
    /**
     * A note that you can use to describe the purpose of the filter.
     */
    description?: pulumi.Input<string>;
    /**
     * The filter expression to be used.
     */
    expression?: pulumi.Input<string>;
    /**
     * Whether this filter is currently paused.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * Short reference tag to quickly select related rules.
     */
    ref?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Filter resource.
 */
export interface FilterArgs {
    /**
     * A note that you can use to describe the purpose of the filter.
     */
    description?: pulumi.Input<string>;
    /**
     * The filter expression to be used.
     */
    expression: pulumi.Input<string>;
    /**
     * Whether this filter is currently paused.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * Short reference tag to quickly select related rules.
     */
    ref?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
