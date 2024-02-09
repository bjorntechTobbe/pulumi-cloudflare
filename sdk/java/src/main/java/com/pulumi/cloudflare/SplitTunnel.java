// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.SplitTunnelArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.SplitTunnelState;
import com.pulumi.cloudflare.outputs.SplitTunnelTunnel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
 * include or exclude lists of routes from the WARP client&#39;s tunnel.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.SplitTunnel;
 * import com.pulumi.cloudflare.SplitTunnelArgs;
 * import com.pulumi.cloudflare.inputs.SplitTunnelTunnelArgs;
 * import com.pulumi.cloudflare.DeviceSettingsPolicy;
 * import com.pulumi.cloudflare.DeviceSettingsPolicyArgs;
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
 *         var exampleSplitTunnelExclude = new SplitTunnel(&#34;exampleSplitTunnelExclude&#34;, SplitTunnelArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .mode(&#34;exclude&#34;)
 *             .tunnels(SplitTunnelTunnelArgs.builder()
 *                 .host(&#34;*.example.com&#34;)
 *                 .description(&#34;example domain&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSplitTunnelIncludeSplitTunnel = new SplitTunnel(&#34;exampleSplitTunnelIncludeSplitTunnel&#34;, SplitTunnelArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .mode(&#34;include&#34;)
 *             .tunnels(SplitTunnelTunnelArgs.builder()
 *                 .host(&#34;*.example.com&#34;)
 *                 .description(&#34;example domain&#34;)
 *                 .build())
 *             .build());
 * 
 *         var developerWarpPolicy = new DeviceSettingsPolicy(&#34;developerWarpPolicy&#34;, DeviceSettingsPolicyArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .name(&#34;Developers&#34;)
 *             .precedence(10)
 *             .match(&#34;any(identity.groups.name[*] in {\&#34;Developers\&#34;})&#34;)
 *             .switchLocked(true)
 *             .build());
 * 
 *         var exampleDeviceSettingsPolicySplitTunnelExclude = new SplitTunnel(&#34;exampleDeviceSettingsPolicySplitTunnelExclude&#34;, SplitTunnelArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .policyId(developerWarpPolicy.id())
 *             .mode(&#34;exclude&#34;)
 *             .tunnels(SplitTunnelTunnelArgs.builder()
 *                 .host(&#34;*.example.com&#34;)
 *                 .description(&#34;example domain&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleSplitTunnelIncludeIndex_splitTunnelSplitTunnel = new SplitTunnel(&#34;exampleSplitTunnelIncludeIndex/splitTunnelSplitTunnel&#34;, SplitTunnelArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .policyId(cloudflare_device_policy.developer_warp_policy().id())
 *             .mode(&#34;include&#34;)
 *             .tunnels(SplitTunnelTunnelArgs.builder()
 *                 .host(&#34;*.example.com&#34;)
 *                 .description(&#34;example domain&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Split Tunnels for default device policies must use &#34;default&#34; as the policy ID.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/splitTunnel:SplitTunnel example &lt;account_id&gt;/&lt;policy_id&gt;/&lt;mode&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/splitTunnel:SplitTunnel")
public class SplitTunnel extends com.pulumi.resources.CustomResource {
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
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return The mode of the split tunnel policy. Available values: `include`, `exclude`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * The settings policy for which to configure this split tunnel policy.
     * 
     */
    @Export(name="policyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyId;

    /**
     * @return The settings policy for which to configure this split tunnel policy.
     * 
     */
    public Output<Optional<String>> policyId() {
        return Codegen.optional(this.policyId);
    }
    /**
     * The value of the tunnel attributes.
     * 
     */
    @Export(name="tunnels", refs={List.class,SplitTunnelTunnel.class}, tree="[0,1]")
    private Output<List<SplitTunnelTunnel>> tunnels;

    /**
     * @return The value of the tunnel attributes.
     * 
     */
    public Output<List<SplitTunnelTunnel>> tunnels() {
        return this.tunnels;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SplitTunnel(String name) {
        this(name, SplitTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SplitTunnel(String name, SplitTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SplitTunnel(String name, SplitTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/splitTunnel:SplitTunnel", name, args == null ? SplitTunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SplitTunnel(String name, Output<String> id, @Nullable SplitTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/splitTunnel:SplitTunnel", name, state, makeResourceOptions(options, id));
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
    public static SplitTunnel get(String name, Output<String> id, @Nullable SplitTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SplitTunnel(name, id, state, options);
    }
}
