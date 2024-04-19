// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides the ability to manage Cloudflare Workers KV Namespace features.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.WorkersKvNamespace("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     title: "test-namespace",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example <account_id>/<namespace_id>
 * ```
 */
export class WorkersKvNamespace extends pulumi.CustomResource {
    /**
     * Get an existing WorkersKvNamespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersKvNamespaceState, opts?: pulumi.CustomResourceOptions): WorkersKvNamespace {
        return new WorkersKvNamespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersKvNamespace:WorkersKvNamespace';

    /**
     * Returns true if the given object is an instance of WorkersKvNamespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersKvNamespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersKvNamespace.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Title value of the Worker KV Namespace.
     */
    public readonly title!: pulumi.Output<string>;

    /**
     * Create a WorkersKvNamespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkersKvNamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkersKvNamespaceArgs | WorkersKvNamespaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersKvNamespaceState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["title"] = state ? state.title : undefined;
        } else {
            const args = argsOrState as WorkersKvNamespaceArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["title"] = args ? args.title : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkersKvNamespace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersKvNamespace resources.
 */
export interface WorkersKvNamespaceState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Title value of the Worker KV Namespace.
     */
    title?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkersKvNamespace resource.
 */
export interface WorkersKvNamespaceArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Title value of the Worker KV Namespace.
     */
    title: pulumi.Input<string>;
}
