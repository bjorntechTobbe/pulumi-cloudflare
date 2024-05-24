// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.BotManagementArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.BotManagementState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to configure Bot Management.
 * 
 * Specifically, this resource can be used to manage:
 * 
 * - **Bot Fight Mode**
 * - **Super Bot Fight Mode**
 * - **Bot Management for Enterprise**
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
 * import com.pulumi.cloudflare.BotManagement;
 * import com.pulumi.cloudflare.BotManagementArgs;
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
 *         var example = new BotManagement("example", BotManagementArgs.builder()
 *             .zoneId("0da42c8d2132a9ddaf714f9e7c920711")
 *             .enableJs(true)
 *             .sbfmDefinitelyAutomated("block")
 *             .sbfmLikelyAutomated("managed_challenge")
 *             .sbfmVerifiedBots("allow")
 *             .sbfmStaticResourceProtection(false)
 *             .optimizeWordpress(true)
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
 * $ pulumi import cloudflare:index/botManagement:BotManagement example &lt;zone_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/botManagement:BotManagement")
public class BotManagement extends com.pulumi.resources.CustomResource {
    /**
     * Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
     * 
     */
    @Export(name="autoUpdateModel", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoUpdateModel;

    /**
     * @return Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
     * 
     */
    public Output<Optional<Boolean>> autoUpdateModel() {
        return Codegen.optional(this.autoUpdateModel);
    }
    /**
     * Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     * 
     */
    @Export(name="enableJs", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableJs;

    /**
     * @return Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
     * 
     */
    public Output<Optional<Boolean>> enableJs() {
        return Codegen.optional(this.enableJs);
    }
    /**
     * Whether to enable Bot Fight Mode.
     * 
     */
    @Export(name="fightMode", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fightMode;

    /**
     * @return Whether to enable Bot Fight Mode.
     * 
     */
    public Output<Optional<Boolean>> fightMode() {
        return Codegen.optional(this.fightMode);
    }
    /**
     * Whether to optimize Super Bot Fight Mode protections for Wordpress.
     * 
     */
    @Export(name="optimizeWordpress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> optimizeWordpress;

    /**
     * @return Whether to optimize Super Bot Fight Mode protections for Wordpress.
     * 
     */
    public Output<Optional<Boolean>> optimizeWordpress() {
        return Codegen.optional(this.optimizeWordpress);
    }
    /**
     * Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     * 
     */
    @Export(name="sbfmDefinitelyAutomated", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sbfmDefinitelyAutomated;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
     * 
     */
    public Output<Optional<String>> sbfmDefinitelyAutomated() {
        return Codegen.optional(this.sbfmDefinitelyAutomated);
    }
    /**
     * Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     * 
     */
    @Export(name="sbfmLikelyAutomated", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sbfmLikelyAutomated;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on likely automated requests.
     * 
     */
    public Output<Optional<String>> sbfmLikelyAutomated() {
        return Codegen.optional(this.sbfmLikelyAutomated);
    }
    /**
     * Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
     * 
     */
    @Export(name="sbfmStaticResourceProtection", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sbfmStaticResourceProtection;

    /**
     * @return Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
     * 
     */
    public Output<Optional<Boolean>> sbfmStaticResourceProtection() {
        return Codegen.optional(this.sbfmStaticResourceProtection);
    }
    /**
     * Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     * 
     */
    @Export(name="sbfmVerifiedBots", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sbfmVerifiedBots;

    /**
     * @return Super Bot Fight Mode (SBFM) action to take on verified bots requests.
     * 
     */
    public Output<Optional<String>> sbfmVerifiedBots() {
        return Codegen.optional(this.sbfmVerifiedBots);
    }
    /**
     * Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     * 
     */
    @Export(name="suppressSessionScore", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suppressSessionScore;

    /**
     * @return Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
     * 
     */
    public Output<Optional<Boolean>> suppressSessionScore() {
        return Codegen.optional(this.suppressSessionScore);
    }
    /**
     * A read-only field that indicates whether the zone currently is running the latest ML model.
     * 
     */
    @Export(name="usingLatestModel", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> usingLatestModel;

    /**
     * @return A read-only field that indicates whether the zone currently is running the latest ML model.
     * 
     */
    public Output<Boolean> usingLatestModel() {
        return this.usingLatestModel;
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
    public BotManagement(String name) {
        this(name, BotManagementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotManagement(String name, BotManagementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotManagement(String name, BotManagementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/botManagement:BotManagement", name, args == null ? BotManagementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BotManagement(String name, Output<String> id, @Nullable BotManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/botManagement:BotManagement", name, state, makeResourceOptions(options, id));
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
    public static BotManagement get(String name, Output<String> id, @Nullable BotManagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotManagement(name, id, state, options);
    }
}
