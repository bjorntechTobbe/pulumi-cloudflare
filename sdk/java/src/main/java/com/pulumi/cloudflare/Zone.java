// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZoneArgs;
import com.pulumi.cloudflare.inputs.ZoneState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Zone resource. Zone is the basic resource for
 * working with Cloudflare and is roughly equivalent to a domain name
 * that the user purchases.
 * 
 * &gt; If you are attempting to sign up a subdomain of a zone you must first have Subdomain Support entitlement for your account.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.Zone;
 * import com.pulumi.cloudflare.ZoneArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Zone("example", ZoneArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .zone("example.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/zone:Zone example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zone:Zone")
public class Zone extends com.pulumi.resources.CustomResource {
    /**
     * Account ID to manage the zone resource in.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account ID to manage the zone resource in.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    @Export(name="jumpStart", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> jumpStart;

    /**
     * @return Whether to scan for DNS records on creation. Ignored after zone is created.
     * 
     */
    public Output<Optional<Boolean>> jumpStart() {
        return Codegen.optional(this.jumpStart);
    }
    @Export(name="meta", refs={Map.class,String.class,Boolean.class}, tree="[0,1,2]")
    private Output<Map<String,Boolean>> meta;

    public Output<Map<String,Boolean>> meta() {
        return this.meta;
    }
    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     * 
     */
    @Export(name="nameServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> nameServers;

    /**
     * @return Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> paused;

    /**
     * @return Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }
    /**
     * Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`, `secondary`. Defaults to `full`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`, `secondary`. Defaults to `full`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * List of Vanity Nameservers (if set).
     * 
     */
    @Export(name="vanityNameServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vanityNameServers;

    /**
     * @return List of Vanity Nameservers (if set).
     * 
     */
    public Output<List<String>> vanityNameServers() {
        return this.vanityNameServers;
    }
    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     * 
     */
    @Export(name="verificationKey", refs={String.class}, tree="[0]")
    private Output<String> verificationKey;

    /**
     * @return Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     * 
     */
    public Output<String> verificationKey() {
        return this.verificationKey;
    }
    /**
     * The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(java.lang.String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(java.lang.String name, ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(java.lang.String name, ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zone:Zone", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Zone(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zone:Zone", name, state, makeResourceOptions(options, id), false);
    }

    private static ZoneArgs makeArgs(ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZoneArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Zone get(java.lang.String name, Output<java.lang.String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, state, options);
    }
}
