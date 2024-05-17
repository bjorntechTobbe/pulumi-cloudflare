// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.TunnelConfigArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.TunnelConfigState;
import com.pulumi.cloudflare.outputs.TunnelConfigConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Tunnel configuration resource.
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
 * import com.pulumi.cloudflare.Tunnel;
 * import com.pulumi.cloudflare.TunnelArgs;
 * import com.pulumi.cloudflare.TunnelConfig;
 * import com.pulumi.cloudflare.TunnelConfigArgs;
 * import com.pulumi.cloudflare.inputs.TunnelConfigConfigArgs;
 * import com.pulumi.cloudflare.inputs.TunnelConfigConfigWarpRoutingArgs;
 * import com.pulumi.cloudflare.inputs.TunnelConfigConfigOriginRequestArgs;
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
 *         var exampleTunnel = new Tunnel("exampleTunnel", TunnelArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example_tunnel")
 *             .secret("<32 character secret>")
 *             .build());
 * 
 *         var exampleConfig = new TunnelConfig("exampleConfig", TunnelConfigArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .tunnelId(exampleTunnel.id())
 *             .config(TunnelConfigConfigArgs.builder()
 *                 .warpRouting(TunnelConfigConfigWarpRoutingArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .originRequest(TunnelConfigConfigOriginRequestArgs.builder()
 *                     .connectTimeout("1m0s")
 *                     .tlsTimeout("1m0s")
 *                     .tcpKeepAlive("1m0s")
 *                     .noHappyEyeballs(false)
 *                     .keepAliveConnections(1024)
 *                     .keepAliveTimeout("1m0s")
 *                     .httpHostHeader("baz")
 *                     .originServerName("foobar")
 *                     .caPool("/path/to/unsigned/ca/pool")
 *                     .noTlsVerify(false)
 *                     .disableChunkedEncoding(false)
 *                     .bastionMode(false)
 *                     .proxyAddress("10.0.0.1")
 *                     .proxyPort("8123")
 *                     .proxyType("socks")
 *                     .ipRules(TunnelConfigConfigOriginRequestIpRuleArgs.builder()
 *                         .prefix("/web")
 *                         .ports(                        
 *                             80,
 *                             443)
 *                         .allow(false)
 *                         .build())
 *                     .build())
 *                 .ingressRules(                
 *                     TunnelConfigConfigIngressRuleArgs.builder()
 *                         .hostname("foo")
 *                         .path("/bar")
 *                         .service("http://10.0.0.2:8080")
 *                         .originRequest(TunnelConfigConfigIngressRuleOriginRequestArgs.builder()
 *                             .connectTimeout("2m0s")
 *                             .access(TunnelConfigConfigIngressRuleOriginRequestAccessArgs.builder()
 *                                 .required(true)
 *                                 .teamName("terraform")
 *                                 .audTags("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
 *                                 .build())
 *                             .build())
 *                         .build(),
 *                     TunnelConfigConfigIngressRuleArgs.builder()
 *                         .service("https://10.0.0.3:8081")
 *                         .build())
 *                 .build())
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
 * $ pulumi import cloudflare:index/tunnelConfig:TunnelConfig example &lt;account_id&gt;/&lt;tunnel_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/tunnelConfig:TunnelConfig")
public class TunnelConfig extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Configuration block for Tunnel Configuration.
     * 
     */
    @Export(name="config", refs={TunnelConfigConfig.class}, tree="[0]")
    private Output<TunnelConfigConfig> config;

    /**
     * @return Configuration block for Tunnel Configuration.
     * 
     */
    public Output<TunnelConfigConfig> config() {
        return this.config;
    }
    /**
     * Identifier of the Tunnel to target for this configuration.
     * 
     */
    @Export(name="tunnelId", refs={String.class}, tree="[0]")
    private Output<String> tunnelId;

    /**
     * @return Identifier of the Tunnel to target for this configuration.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TunnelConfig(String name) {
        this(name, TunnelConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TunnelConfig(String name, TunnelConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TunnelConfig(String name, TunnelConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnelConfig:TunnelConfig", name, args == null ? TunnelConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TunnelConfig(String name, Output<String> id, @Nullable TunnelConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/tunnelConfig:TunnelConfig", name, state, makeResourceOptions(options, id));
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
    public static TunnelConfig get(String name, Output<String> id, @Nullable TunnelConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TunnelConfig(name, id, state, options);
    }
}
