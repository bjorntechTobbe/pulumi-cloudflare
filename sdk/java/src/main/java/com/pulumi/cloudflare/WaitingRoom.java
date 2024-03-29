// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WaitingRoomArgs;
import com.pulumi.cloudflare.inputs.WaitingRoomState;
import com.pulumi.cloudflare.outputs.WaitingRoomAdditionalRoute;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Waiting Room resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.WaitingRoom;
 * import com.pulumi.cloudflare.WaitingRoomArgs;
 * import com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs;
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
 *         // Waiting Room
 *         var example = new WaitingRoom(&#34;example&#34;, WaitingRoomArgs.builder()        
 *             .additionalRoutes(            
 *                 WaitingRoomAdditionalRouteArgs.builder()
 *                     .host(&#34;shop1.example.com&#34;)
 *                     .path(&#34;/example-path&#34;)
 *                     .build(),
 *                 WaitingRoomAdditionalRouteArgs.builder()
 *                     .host(&#34;shop2.example.com&#34;)
 *                     .build())
 *             .cookieSuffix(&#34;queue1&#34;)
 *             .host(&#34;foo.example.com&#34;)
 *             .name(&#34;foo&#34;)
 *             .newUsersPerMinute(200)
 *             .path(&#34;/&#34;)
 *             .queueingStatusCode(200)
 *             .totalActiveUsers(200)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Use the Zone ID and Waiting Room ID to import.
 * 
 * ```sh
 * $ pulumi import cloudflare:index/waitingRoom:WaitingRoom default &lt;zone_id&gt;/&lt;waiting_room_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/waitingRoom:WaitingRoom")
public class WaitingRoom extends com.pulumi.resources.CustomResource {
    /**
     * A list of additional hostname and paths combination to be applied on the waiting room.
     * 
     */
    @Export(name="additionalRoutes", refs={List.class,WaitingRoomAdditionalRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WaitingRoomAdditionalRoute>> additionalRoutes;

    /**
     * @return A list of additional hostname and paths combination to be applied on the waiting room.
     * 
     */
    public Output<Optional<List<WaitingRoomAdditionalRoute>>> additionalRoutes() {
        return Codegen.optional(this.additionalRoutes);
    }
    /**
     * A cookie suffix to be appended to the Cloudflare waiting room cookie name.
     * 
     */
    @Export(name="cookieSuffix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cookieSuffix;

    /**
     * @return A cookie suffix to be appended to the Cloudflare waiting room cookie name.
     * 
     */
    public Output<Optional<String>> cookieSuffix() {
        return Codegen.optional(this.cookieSuffix);
    }
    /**
     * This is a templated html file that will be rendered at the edge.
     * 
     */
    @Export(name="customPageHtml", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customPageHtml;

    /**
     * @return This is a templated html file that will be rendered at the edge.
     * 
     */
    public Output<Optional<String>> customPageHtml() {
        return Codegen.optional(this.customPageHtml);
    }
    /**
     * The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
     * 
     */
    @Export(name="defaultTemplateLanguage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultTemplateLanguage;

    /**
     * @return The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
     * 
     */
    public Output<Optional<String>> defaultTemplateLanguage() {
        return Codegen.optional(this.defaultTemplateLanguage);
    }
    /**
     * A description to add more details about the waiting room.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description to add more details about the waiting room.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Disables automatic renewal of session cookies.
     * 
     */
    @Export(name="disableSessionRenewal", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableSessionRenewal;

    /**
     * @return Disables automatic renewal of session cookies.
     * 
     */
    public Output<Optional<Boolean>> disableSessionRenewal() {
        return Codegen.optional(this.disableSessionRenewal);
    }
    /**
     * The additional host name for which the waiting room to be applied on (no wildcards).
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output<String> host;

    /**
     * @return The additional host name for which the waiting room to be applied on (no wildcards).
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     * 
     */
    @Export(name="jsonResponseEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> jsonResponseEnabled;

    /**
     * @return If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     * 
     */
    public Output<Optional<Boolean>> jsonResponseEnabled() {
        return Codegen.optional(this.jsonResponseEnabled);
    }
    /**
     * A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of new users that will be let into the route every minute.
     * 
     */
    @Export(name="newUsersPerMinute", refs={Integer.class}, tree="[0]")
    private Output<Integer> newUsersPerMinute;

    /**
     * @return The number of new users that will be let into the route every minute.
     * 
     */
    public Output<Integer> newUsersPerMinute() {
        return this.newUsersPerMinute;
    }
    /**
     * The path within the additional host to enable the waiting room on. Defaults to `/`.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> path;

    /**
     * @return The path within the additional host to enable the waiting room on. Defaults to `/`.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * If queue_all is true, then all traffic will be sent to the waiting room.
     * 
     */
    @Export(name="queueAll", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> queueAll;

    /**
     * @return If queue_all is true, then all traffic will be sent to the waiting room.
     * 
     */
    public Output<Optional<Boolean>> queueAll() {
        return Codegen.optional(this.queueAll);
    }
    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     * 
     */
    @Export(name="queueingMethod", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> queueingMethod;

    /**
     * @return The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     * 
     */
    public Output<Optional<String>> queueingMethod() {
        return Codegen.optional(this.queueingMethod);
    }
    /**
     * HTTP status code returned to a user while in the queue. Defaults to `200`.
     * 
     */
    @Export(name="queueingStatusCode", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> queueingStatusCode;

    /**
     * @return HTTP status code returned to a user while in the queue. Defaults to `200`.
     * 
     */
    public Output<Optional<Integer>> queueingStatusCode() {
        return Codegen.optional(this.queueingStatusCode);
    }
    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     * 
     */
    @Export(name="sessionDuration", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> sessionDuration;

    /**
     * @return Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     * 
     */
    public Output<Optional<Integer>> sessionDuration() {
        return Codegen.optional(this.sessionDuration);
    }
    /**
     * Suspends the waiting room.
     * 
     */
    @Export(name="suspended", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suspended;

    /**
     * @return Suspends the waiting room.
     * 
     */
    public Output<Optional<Boolean>> suspended() {
        return Codegen.optional(this.suspended);
    }
    /**
     * The total number of active user sessions on the route at a point in time.
     * 
     */
    @Export(name="totalActiveUsers", refs={Integer.class}, tree="[0]")
    private Output<Integer> totalActiveUsers;

    /**
     * @return The total number of active user sessions on the route at a point in time.
     * 
     */
    public Output<Integer> totalActiveUsers() {
        return this.totalActiveUsers;
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
    public WaitingRoom(String name) {
        this(name, WaitingRoomArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WaitingRoom(String name, WaitingRoomArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WaitingRoom(String name, WaitingRoomArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/waitingRoom:WaitingRoom", name, args == null ? WaitingRoomArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WaitingRoom(String name, Output<String> id, @Nullable WaitingRoomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/waitingRoom:WaitingRoom", name, state, makeResourceOptions(options, id));
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
    public static WaitingRoom get(String name, Output<String> id, @Nullable WaitingRoomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WaitingRoom(name, id, state, options);
    }
}
