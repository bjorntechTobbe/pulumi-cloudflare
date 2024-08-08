// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WaitingRoomSettingsArgs;
import com.pulumi.cloudflare.inputs.WaitingRoomSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configure zone-wide settings for Cloudflare waiting rooms.
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
 * import com.pulumi.cloudflare.WaitingRoomSettings;
 * import com.pulumi.cloudflare.WaitingRoomSettingsArgs;
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
 *         var example = new WaitingRoomSettings("example", WaitingRoomSettingsArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .searchEngineCrawlerBypass(true)
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
 * $ pulumi import cloudflare:index/waitingRoomSettings:WaitingRoomSettings example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/waitingRoomSettings:WaitingRoomSettings")
public class WaitingRoomSettings extends com.pulumi.resources.CustomResource {
    /**
     * Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
     * 
     */
    @Export(name="searchEngineCrawlerBypass", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> searchEngineCrawlerBypass;

    /**
     * @return Whether to allow verified search engine crawlers to bypass all waiting rooms on this zone. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> searchEngineCrawlerBypass() {
        return Codegen.optional(this.searchEngineCrawlerBypass);
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
    public WaitingRoomSettings(java.lang.String name) {
        this(name, WaitingRoomSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WaitingRoomSettings(java.lang.String name, WaitingRoomSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WaitingRoomSettings(java.lang.String name, WaitingRoomSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WaitingRoomSettings(java.lang.String name, Output<java.lang.String> id, @Nullable WaitingRoomSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/waitingRoomSettings:WaitingRoomSettings", name, state, makeResourceOptions(options, id), false);
    }

    private static WaitingRoomSettingsArgs makeArgs(WaitingRoomSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WaitingRoomSettingsArgs.Empty : args;
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
    public static WaitingRoomSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable WaitingRoomSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WaitingRoomSettings(name, id, state, options);
    }
}
