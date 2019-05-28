// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare record resource.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * 
 * // Add a record requiring a data map
 * const _sipTls = new cloudflare.Record("_sip_tls", {
 *     data: {
 *         name: "terraform-srv",
 *         port: 443,
 *         priority: 0,
 *         proto: "_tls",
 *         service: "_sip",
 *         target: "example.com",
 *         weight: 0,
 *     },
 *     domain: var_cloudflare_zone,
 *     name: "_sip._tls",
 *     type: "SRV",
 * });
 * // Add a record to the domain
 * const foobar = new cloudflare.Record("foobar", {
 *     domain: var_cloudflare_zone,
 *     name: "terraform",
 *     ttl: 3600,
 *     type: "A",
 *     value: "192.168.0.11",
 * });
 * ```
 */
export class Record extends pulumi.CustomResource {
    /**
     * Get an existing Record resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecordState, opts?: pulumi.CustomResourceOptions): Record {
        return new Record(name, <any>state, { ...opts, id: id });
    }

    /**
     * The RFC3339 timestamp of when the record was created
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     */
    public readonly data!: pulumi.Output<{ algorithm?: number, altitude?: number, certificate?: string, content?: string, digest?: string, digestType?: number, fingerprint?: string, flags?: string, keyTag?: number, latDegrees?: number, latDirection?: string, latMinutes?: number, latSeconds?: number, longDegrees?: number, longDirection?: string, longMinutes?: number, longSeconds?: number, matchingType?: number, name?: string, order?: number, port?: number, precisionHorz?: number, precisionVert?: number, preference?: number, priority?: number, proto?: string, protocol?: number, publicKey?: string, regex?: string, replacement?: string, selector?: number, service?: string, size?: number, target?: string, type?: number, usage?: number, weight?: number } | undefined>;
    /**
     * The DNS zone to add the record to
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * The FQDN of the record
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * A key-value map of string metadata cloudflare associates with the record
     */
    public /*out*/ readonly metadata!: pulumi.Output<{[key: string]: any}>;
    /**
     * The RFC3339 timestamp of when the record was last modified
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The name of the record
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The priority of the record
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Shows whether this record can be proxied, must be true if setting `proxied=true`
     */
    public /*out*/ readonly proxiable!: pulumi.Output<boolean>;
    /**
     * Whether the record gets Cloudflare's origin protection; defaults to `false`.
     */
    public readonly proxied!: pulumi.Output<boolean | undefined>;
    /**
     * The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     */
    public readonly ttl!: pulumi.Output<number>;
    /**
     * The type of the record
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The (string) value of the record. Either this or `data` must be specified
     */
    public readonly value!: pulumi.Output<string>;
    /**
     * The zone id of the record
     */
    public /*out*/ readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Record resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecordArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RecordArgs | RecordState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RecordState | undefined;
            inputs["createdOn"] = state ? state.createdOn : undefined;
            inputs["data"] = state ? state.data : undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["hostname"] = state ? state.hostname : undefined;
            inputs["metadata"] = state ? state.metadata : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["proxiable"] = state ? state.proxiable : undefined;
            inputs["proxied"] = state ? state.proxied : undefined;
            inputs["ttl"] = state ? state.ttl : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["value"] = state ? state.value : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RecordArgs | undefined;
            if (!args || args.domain === undefined) {
                throw new Error("Missing required property 'domain'");
            }
            if (!args || args.name === undefined) {
                throw new Error("Missing required property 'name'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            inputs["data"] = args ? args.data : undefined;
            inputs["domain"] = args ? args.domain : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["proxied"] = args ? args.proxied : undefined;
            inputs["ttl"] = args ? args.ttl : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["value"] = args ? args.value : undefined;
            inputs["createdOn"] = undefined /*out*/;
            inputs["hostname"] = undefined /*out*/;
            inputs["metadata"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
            inputs["proxiable"] = undefined /*out*/;
            inputs["zoneId"] = undefined /*out*/;
        }
        super("cloudflare:index/record:Record", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Record resources.
 */
export interface RecordState {
    /**
     * The RFC3339 timestamp of when the record was created
     */
    readonly createdOn?: pulumi.Input<string>;
    /**
     * Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     */
    readonly data?: pulumi.Input<{ algorithm?: pulumi.Input<number>, altitude?: pulumi.Input<number>, certificate?: pulumi.Input<string>, content?: pulumi.Input<string>, digest?: pulumi.Input<string>, digestType?: pulumi.Input<number>, fingerprint?: pulumi.Input<string>, flags?: pulumi.Input<string>, keyTag?: pulumi.Input<number>, latDegrees?: pulumi.Input<number>, latDirection?: pulumi.Input<string>, latMinutes?: pulumi.Input<number>, latSeconds?: pulumi.Input<number>, longDegrees?: pulumi.Input<number>, longDirection?: pulumi.Input<string>, longMinutes?: pulumi.Input<number>, longSeconds?: pulumi.Input<number>, matchingType?: pulumi.Input<number>, name?: pulumi.Input<string>, order?: pulumi.Input<number>, port?: pulumi.Input<number>, precisionHorz?: pulumi.Input<number>, precisionVert?: pulumi.Input<number>, preference?: pulumi.Input<number>, priority?: pulumi.Input<number>, proto?: pulumi.Input<string>, protocol?: pulumi.Input<number>, publicKey?: pulumi.Input<string>, regex?: pulumi.Input<string>, replacement?: pulumi.Input<string>, selector?: pulumi.Input<number>, service?: pulumi.Input<string>, size?: pulumi.Input<number>, target?: pulumi.Input<string>, type?: pulumi.Input<number>, usage?: pulumi.Input<number>, weight?: pulumi.Input<number> }>;
    /**
     * The DNS zone to add the record to
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * The FQDN of the record
     */
    readonly hostname?: pulumi.Input<string>;
    /**
     * A key-value map of string metadata cloudflare associates with the record
     */
    readonly metadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * The RFC3339 timestamp of when the record was last modified
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * The name of the record
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The priority of the record
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * Shows whether this record can be proxied, must be true if setting `proxied=true`
     */
    readonly proxiable?: pulumi.Input<boolean>;
    /**
     * Whether the record gets Cloudflare's origin protection; defaults to `false`.
     */
    readonly proxied?: pulumi.Input<boolean>;
    /**
     * The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of the record
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The (string) value of the record. Either this or `data` must be specified
     */
    readonly value?: pulumi.Input<string>;
    /**
     * The zone id of the record
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Record resource.
 */
export interface RecordArgs {
    /**
     * Map of attributes that constitute the record value. Primarily used for LOC and SRV record types. Either this or `value` must be specified
     */
    readonly data?: pulumi.Input<{ algorithm?: pulumi.Input<number>, altitude?: pulumi.Input<number>, certificate?: pulumi.Input<string>, content?: pulumi.Input<string>, digest?: pulumi.Input<string>, digestType?: pulumi.Input<number>, fingerprint?: pulumi.Input<string>, flags?: pulumi.Input<string>, keyTag?: pulumi.Input<number>, latDegrees?: pulumi.Input<number>, latDirection?: pulumi.Input<string>, latMinutes?: pulumi.Input<number>, latSeconds?: pulumi.Input<number>, longDegrees?: pulumi.Input<number>, longDirection?: pulumi.Input<string>, longMinutes?: pulumi.Input<number>, longSeconds?: pulumi.Input<number>, matchingType?: pulumi.Input<number>, name?: pulumi.Input<string>, order?: pulumi.Input<number>, port?: pulumi.Input<number>, precisionHorz?: pulumi.Input<number>, precisionVert?: pulumi.Input<number>, preference?: pulumi.Input<number>, priority?: pulumi.Input<number>, proto?: pulumi.Input<string>, protocol?: pulumi.Input<number>, publicKey?: pulumi.Input<string>, regex?: pulumi.Input<string>, replacement?: pulumi.Input<string>, selector?: pulumi.Input<number>, service?: pulumi.Input<string>, size?: pulumi.Input<number>, target?: pulumi.Input<string>, type?: pulumi.Input<number>, usage?: pulumi.Input<number>, weight?: pulumi.Input<number> }>;
    /**
     * The DNS zone to add the record to
     */
    readonly domain: pulumi.Input<string>;
    /**
     * The name of the record
     */
    readonly name: pulumi.Input<string>;
    /**
     * The priority of the record
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * Whether the record gets Cloudflare's origin protection; defaults to `false`.
     */
    readonly proxied?: pulumi.Input<boolean>;
    /**
     * The TTL of the record ([automatic: '1'](https://api.cloudflare.com/#dns-records-for-a-zone-create-dns-record))
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of the record
     */
    readonly type: pulumi.Input<string>;
    /**
     * The (string) value of the record. Either this or `data` must be specified
     */
    readonly value?: pulumi.Input<string>;
}
