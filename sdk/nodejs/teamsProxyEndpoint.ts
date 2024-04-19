// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Teams Proxy Endpoint resource. Teams Proxy
 * Endpoints are used for pointing proxy clients at Cloudflare Secure
 * Gateway.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TeamsProxyEndpoint("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "office",
 *     ips: ["192.0.2.0/24"],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint example <account_id>/<proxy_endpoint_id>
 * ```
 */
export class TeamsProxyEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing TeamsProxyEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamsProxyEndpointState, opts?: pulumi.CustomResourceOptions): TeamsProxyEndpoint {
        return new TeamsProxyEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint';

    /**
     * Returns true if the given object is an instance of TeamsProxyEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamsProxyEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamsProxyEndpoint.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The networks CIDRs that will be allowed to initiate proxy connections.
     */
    public readonly ips!: pulumi.Output<string[]>;
    /**
     * Name of the teams proxy endpoint.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The FQDN that proxy clients should be pointed at.
     */
    public /*out*/ readonly subdomain!: pulumi.Output<string>;

    /**
     * Create a TeamsProxyEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamsProxyEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamsProxyEndpointArgs | TeamsProxyEndpointState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsProxyEndpointState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["ips"] = state ? state.ips : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subdomain"] = state ? state.subdomain : undefined;
        } else {
            const args = argsOrState as TeamsProxyEndpointArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.ips === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ips'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["ips"] = args ? args.ips : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subdomain"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamsProxyEndpoint.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamsProxyEndpoint resources.
 */
export interface TeamsProxyEndpointState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The networks CIDRs that will be allowed to initiate proxy connections.
     */
    ips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the teams proxy endpoint.
     */
    name?: pulumi.Input<string>;
    /**
     * The FQDN that proxy clients should be pointed at.
     */
    subdomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeamsProxyEndpoint resource.
 */
export interface TeamsProxyEndpointArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The networks CIDRs that will be allowed to initiate proxy connections.
     */
    ips: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the teams proxy endpoint.
     */
    name: pulumi.Input<string>;
}
