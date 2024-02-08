// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AuthenticatedOriginPullsArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AuthenticatedOriginPullsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Authenticated Origin Pulls resource. A `cloudflare.AuthenticatedOriginPulls`
 * resource is required to use Per-Zone or Per-Hostname Authenticated
 * Origin Pulls.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AuthenticatedOriginPulls;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsArgs;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificate;
 * import com.pulumi.cloudflare.AuthenticatedOriginPullsCertificateArgs;
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
 *         var myAop = new AuthenticatedOriginPulls(&#34;myAop&#34;, AuthenticatedOriginPullsArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *         var myPerZoneAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerZoneAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-zone&#34;)
 *             .build());
 * 
 *         var myPerZoneAop = new AuthenticatedOriginPulls(&#34;myPerZoneAop&#34;, AuthenticatedOriginPullsArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .authenticatedOriginPullsCertificate(myPerZoneAopCert.id())
 *             .enabled(true)
 *             .build());
 * 
 *         var myPerHostnameAopCert = new AuthenticatedOriginPullsCertificate(&#34;myPerHostnameAopCert&#34;, AuthenticatedOriginPullsCertificateArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .certificate(&#34;-----INSERT CERTIFICATE-----&#34;)
 *             .privateKey(&#34;-----INSERT PRIVATE KEY-----&#34;)
 *             .type(&#34;per-hostname&#34;)
 *             .build());
 * 
 *         var myPerHostnameAop = new AuthenticatedOriginPulls(&#34;myPerHostnameAop&#34;, AuthenticatedOriginPullsArgs.builder()        
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .authenticatedOriginPullsCertificate(myPerHostnameAopCert.id())
 *             .hostname(&#34;aop.example.com&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * global
 * 
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;
 * ```
 * 
 *  per zone
 * 
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;/&lt;certificate_id&gt;
 * ```
 * 
 *  per hostname
 * 
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;/&lt;certificate_id&gt;/&lt;hostname&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls")
public class AuthenticatedOriginPulls extends com.pulumi.resources.CustomResource {
    /**
     * The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     * 
     */
    @Export(name="authenticatedOriginPullsCertificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authenticatedOriginPullsCertificate;

    /**
     * @return The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     * 
     */
    public Output<Optional<String>> authenticatedOriginPullsCertificate() {
        return Codegen.optional(this.authenticatedOriginPullsCertificate);
    }
    /**
     * Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostname;

    /**
     * @return Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     * 
     */
    public Output<Optional<String>> hostname() {
        return Codegen.optional(this.hostname);
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthenticatedOriginPulls(String name) {
        this(name, AuthenticatedOriginPullsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthenticatedOriginPulls(String name, AuthenticatedOriginPullsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthenticatedOriginPulls(String name, AuthenticatedOriginPullsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, args == null ? AuthenticatedOriginPullsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthenticatedOriginPulls(String name, Output<String> id, @Nullable AuthenticatedOriginPullsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static AuthenticatedOriginPulls get(String name, Output<String> id, @Nullable AuthenticatedOriginPullsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthenticatedOriginPulls(name, id, state, options);
    }
}
