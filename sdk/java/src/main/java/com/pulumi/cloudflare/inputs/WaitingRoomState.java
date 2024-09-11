// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.WaitingRoomAdditionalRouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WaitingRoomState extends com.pulumi.resources.ResourceArgs {

    public static final WaitingRoomState Empty = new WaitingRoomState();

    /**
     * A list of additional hostname and paths combination to be applied on the waiting room.
     * 
     */
    @Import(name="additionalRoutes")
    private @Nullable Output<List<WaitingRoomAdditionalRouteArgs>> additionalRoutes;

    /**
     * @return A list of additional hostname and paths combination to be applied on the waiting room.
     * 
     */
    public Optional<Output<List<WaitingRoomAdditionalRouteArgs>>> additionalRoutes() {
        return Optional.ofNullable(this.additionalRoutes);
    }

    /**
     * A cookie suffix to be appended to the Cloudflare waiting room cookie name.
     * 
     */
    @Import(name="cookieSuffix")
    private @Nullable Output<String> cookieSuffix;

    /**
     * @return A cookie suffix to be appended to the Cloudflare waiting room cookie name.
     * 
     */
    public Optional<Output<String>> cookieSuffix() {
        return Optional.ofNullable(this.cookieSuffix);
    }

    /**
     * This is a templated html file that will be rendered at the edge.
     * 
     */
    @Import(name="customPageHtml")
    private @Nullable Output<String> customPageHtml;

    /**
     * @return This is a templated html file that will be rendered at the edge.
     * 
     */
    public Optional<Output<String>> customPageHtml() {
        return Optional.ofNullable(this.customPageHtml);
    }

    /**
     * The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
     * 
     */
    @Import(name="defaultTemplateLanguage")
    private @Nullable Output<String> defaultTemplateLanguage;

    /**
     * @return The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
     * 
     */
    public Optional<Output<String>> defaultTemplateLanguage() {
        return Optional.ofNullable(this.defaultTemplateLanguage);
    }

    /**
     * A description to add more details about the waiting room.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description to add more details about the waiting room.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Disables automatic renewal of session cookies.
     * 
     */
    @Import(name="disableSessionRenewal")
    private @Nullable Output<Boolean> disableSessionRenewal;

    /**
     * @return Disables automatic renewal of session cookies.
     * 
     */
    public Optional<Output<Boolean>> disableSessionRenewal() {
        return Optional.ofNullable(this.disableSessionRenewal);
    }

    /**
     * The list of enabled origin commands for the waiting room. Available values: `revoke`
     * 
     */
    @Import(name="enabledOriginCommands")
    private @Nullable Output<List<String>> enabledOriginCommands;

    /**
     * @return The list of enabled origin commands for the waiting room. Available values: `revoke`
     * 
     */
    public Optional<Output<List<String>>> enabledOriginCommands() {
        return Optional.ofNullable(this.enabledOriginCommands);
    }

    /**
     * Host name for which the waiting room will be applied (no wildcards).
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Host name for which the waiting room will be applied (no wildcards).
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     * 
     */
    @Import(name="jsonResponseEnabled")
    private @Nullable Output<Boolean> jsonResponseEnabled;

    /**
     * @return If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
     * 
     */
    public Optional<Output<Boolean>> jsonResponseEnabled() {
        return Optional.ofNullable(this.jsonResponseEnabled);
    }

    /**
     * A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of new users that will be let into the route every minute.
     * 
     */
    @Import(name="newUsersPerMinute")
    private @Nullable Output<Integer> newUsersPerMinute;

    /**
     * @return The number of new users that will be let into the route every minute.
     * 
     */
    public Optional<Output<Integer>> newUsersPerMinute() {
        return Optional.ofNullable(this.newUsersPerMinute);
    }

    /**
     * The path within the host to enable the waiting room on. Defaults to `/`.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path within the host to enable the waiting room on. Defaults to `/`.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * If queue_all is true, then all traffic will be sent to the waiting room.
     * 
     */
    @Import(name="queueAll")
    private @Nullable Output<Boolean> queueAll;

    /**
     * @return If queue_all is true, then all traffic will be sent to the waiting room.
     * 
     */
    public Optional<Output<Boolean>> queueAll() {
        return Optional.ofNullable(this.queueAll);
    }

    /**
     * The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     * 
     */
    @Import(name="queueingMethod")
    private @Nullable Output<String> queueingMethod;

    /**
     * @return The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
     * 
     */
    public Optional<Output<String>> queueingMethod() {
        return Optional.ofNullable(this.queueingMethod);
    }

    /**
     * HTTP status code returned to a user while in the queue. Defaults to `200`.
     * 
     */
    @Import(name="queueingStatusCode")
    private @Nullable Output<Integer> queueingStatusCode;

    /**
     * @return HTTP status code returned to a user while in the queue. Defaults to `200`.
     * 
     */
    public Optional<Output<Integer>> queueingStatusCode() {
        return Optional.ofNullable(this.queueingStatusCode);
    }

    /**
     * Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     * 
     */
    @Import(name="sessionDuration")
    private @Nullable Output<Integer> sessionDuration;

    /**
     * @return Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
     * 
     */
    public Optional<Output<Integer>> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }

    /**
     * Suspends the waiting room.
     * 
     */
    @Import(name="suspended")
    private @Nullable Output<Boolean> suspended;

    /**
     * @return Suspends the waiting room.
     * 
     */
    public Optional<Output<Boolean>> suspended() {
        return Optional.ofNullable(this.suspended);
    }

    /**
     * The total number of active user sessions on the route at a point in time.
     * 
     */
    @Import(name="totalActiveUsers")
    private @Nullable Output<Integer> totalActiveUsers;

    /**
     * @return The total number of active user sessions on the route at a point in time.
     * 
     */
    public Optional<Output<Integer>> totalActiveUsers() {
        return Optional.ofNullable(this.totalActiveUsers);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private WaitingRoomState() {}

    private WaitingRoomState(WaitingRoomState $) {
        this.additionalRoutes = $.additionalRoutes;
        this.cookieSuffix = $.cookieSuffix;
        this.customPageHtml = $.customPageHtml;
        this.defaultTemplateLanguage = $.defaultTemplateLanguage;
        this.description = $.description;
        this.disableSessionRenewal = $.disableSessionRenewal;
        this.enabledOriginCommands = $.enabledOriginCommands;
        this.host = $.host;
        this.jsonResponseEnabled = $.jsonResponseEnabled;
        this.name = $.name;
        this.newUsersPerMinute = $.newUsersPerMinute;
        this.path = $.path;
        this.queueAll = $.queueAll;
        this.queueingMethod = $.queueingMethod;
        this.queueingStatusCode = $.queueingStatusCode;
        this.sessionDuration = $.sessionDuration;
        this.suspended = $.suspended;
        this.totalActiveUsers = $.totalActiveUsers;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WaitingRoomState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WaitingRoomState $;

        public Builder() {
            $ = new WaitingRoomState();
        }

        public Builder(WaitingRoomState defaults) {
            $ = new WaitingRoomState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalRoutes A list of additional hostname and paths combination to be applied on the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder additionalRoutes(@Nullable Output<List<WaitingRoomAdditionalRouteArgs>> additionalRoutes) {
            $.additionalRoutes = additionalRoutes;
            return this;
        }

        /**
         * @param additionalRoutes A list of additional hostname and paths combination to be applied on the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder additionalRoutes(List<WaitingRoomAdditionalRouteArgs> additionalRoutes) {
            return additionalRoutes(Output.of(additionalRoutes));
        }

        /**
         * @param additionalRoutes A list of additional hostname and paths combination to be applied on the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder additionalRoutes(WaitingRoomAdditionalRouteArgs... additionalRoutes) {
            return additionalRoutes(List.of(additionalRoutes));
        }

        /**
         * @param cookieSuffix A cookie suffix to be appended to the Cloudflare waiting room cookie name.
         * 
         * @return builder
         * 
         */
        public Builder cookieSuffix(@Nullable Output<String> cookieSuffix) {
            $.cookieSuffix = cookieSuffix;
            return this;
        }

        /**
         * @param cookieSuffix A cookie suffix to be appended to the Cloudflare waiting room cookie name.
         * 
         * @return builder
         * 
         */
        public Builder cookieSuffix(String cookieSuffix) {
            return cookieSuffix(Output.of(cookieSuffix));
        }

        /**
         * @param customPageHtml This is a templated html file that will be rendered at the edge.
         * 
         * @return builder
         * 
         */
        public Builder customPageHtml(@Nullable Output<String> customPageHtml) {
            $.customPageHtml = customPageHtml;
            return this;
        }

        /**
         * @param customPageHtml This is a templated html file that will be rendered at the edge.
         * 
         * @return builder
         * 
         */
        public Builder customPageHtml(String customPageHtml) {
            return customPageHtml(Output.of(customPageHtml));
        }

        /**
         * @param defaultTemplateLanguage The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTemplateLanguage(@Nullable Output<String> defaultTemplateLanguage) {
            $.defaultTemplateLanguage = defaultTemplateLanguage;
            return this;
        }

        /**
         * @param defaultTemplateLanguage The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`, `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`, `ru-RU`, `fa-IR`. Defaults to `en-US`.
         * 
         * @return builder
         * 
         */
        public Builder defaultTemplateLanguage(String defaultTemplateLanguage) {
            return defaultTemplateLanguage(Output.of(defaultTemplateLanguage));
        }

        /**
         * @param description A description to add more details about the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description to add more details about the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disableSessionRenewal Disables automatic renewal of session cookies.
         * 
         * @return builder
         * 
         */
        public Builder disableSessionRenewal(@Nullable Output<Boolean> disableSessionRenewal) {
            $.disableSessionRenewal = disableSessionRenewal;
            return this;
        }

        /**
         * @param disableSessionRenewal Disables automatic renewal of session cookies.
         * 
         * @return builder
         * 
         */
        public Builder disableSessionRenewal(Boolean disableSessionRenewal) {
            return disableSessionRenewal(Output.of(disableSessionRenewal));
        }

        /**
         * @param enabledOriginCommands The list of enabled origin commands for the waiting room. Available values: `revoke`
         * 
         * @return builder
         * 
         */
        public Builder enabledOriginCommands(@Nullable Output<List<String>> enabledOriginCommands) {
            $.enabledOriginCommands = enabledOriginCommands;
            return this;
        }

        /**
         * @param enabledOriginCommands The list of enabled origin commands for the waiting room. Available values: `revoke`
         * 
         * @return builder
         * 
         */
        public Builder enabledOriginCommands(List<String> enabledOriginCommands) {
            return enabledOriginCommands(Output.of(enabledOriginCommands));
        }

        /**
         * @param enabledOriginCommands The list of enabled origin commands for the waiting room. Available values: `revoke`
         * 
         * @return builder
         * 
         */
        public Builder enabledOriginCommands(String... enabledOriginCommands) {
            return enabledOriginCommands(List.of(enabledOriginCommands));
        }

        /**
         * @param host Host name for which the waiting room will be applied (no wildcards).
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host name for which the waiting room will be applied (no wildcards).
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param jsonResponseEnabled If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
         * 
         * @return builder
         * 
         */
        public Builder jsonResponseEnabled(@Nullable Output<Boolean> jsonResponseEnabled) {
            $.jsonResponseEnabled = jsonResponseEnabled;
            return this;
        }

        /**
         * @param jsonResponseEnabled If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
         * 
         * @return builder
         * 
         */
        public Builder jsonResponseEnabled(Boolean jsonResponseEnabled) {
            return jsonResponseEnabled(Output.of(jsonResponseEnabled));
        }

        /**
         * @param name A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name to identify the waiting room. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newUsersPerMinute The number of new users that will be let into the route every minute.
         * 
         * @return builder
         * 
         */
        public Builder newUsersPerMinute(@Nullable Output<Integer> newUsersPerMinute) {
            $.newUsersPerMinute = newUsersPerMinute;
            return this;
        }

        /**
         * @param newUsersPerMinute The number of new users that will be let into the route every minute.
         * 
         * @return builder
         * 
         */
        public Builder newUsersPerMinute(Integer newUsersPerMinute) {
            return newUsersPerMinute(Output.of(newUsersPerMinute));
        }

        /**
         * @param path The path within the host to enable the waiting room on. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path within the host to enable the waiting room on. Defaults to `/`.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param queueAll If queue_all is true, then all traffic will be sent to the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder queueAll(@Nullable Output<Boolean> queueAll) {
            $.queueAll = queueAll;
            return this;
        }

        /**
         * @param queueAll If queue_all is true, then all traffic will be sent to the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder queueAll(Boolean queueAll) {
            return queueAll(Output.of(queueAll));
        }

        /**
         * @param queueingMethod The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
         * 
         * @return builder
         * 
         */
        public Builder queueingMethod(@Nullable Output<String> queueingMethod) {
            $.queueingMethod = queueingMethod;
            return this;
        }

        /**
         * @param queueingMethod The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`. Defaults to `fifo`.
         * 
         * @return builder
         * 
         */
        public Builder queueingMethod(String queueingMethod) {
            return queueingMethod(Output.of(queueingMethod));
        }

        /**
         * @param queueingStatusCode HTTP status code returned to a user while in the queue. Defaults to `200`.
         * 
         * @return builder
         * 
         */
        public Builder queueingStatusCode(@Nullable Output<Integer> queueingStatusCode) {
            $.queueingStatusCode = queueingStatusCode;
            return this;
        }

        /**
         * @param queueingStatusCode HTTP status code returned to a user while in the queue. Defaults to `200`.
         * 
         * @return builder
         * 
         */
        public Builder queueingStatusCode(Integer queueingStatusCode) {
            return queueingStatusCode(Output.of(queueingStatusCode));
        }

        /**
         * @param sessionDuration Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(@Nullable Output<Integer> sessionDuration) {
            $.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * @param sessionDuration Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(Integer sessionDuration) {
            return sessionDuration(Output.of(sessionDuration));
        }

        /**
         * @param suspended Suspends the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            $.suspended = suspended;
            return this;
        }

        /**
         * @param suspended Suspends the waiting room.
         * 
         * @return builder
         * 
         */
        public Builder suspended(Boolean suspended) {
            return suspended(Output.of(suspended));
        }

        /**
         * @param totalActiveUsers The total number of active user sessions on the route at a point in time.
         * 
         * @return builder
         * 
         */
        public Builder totalActiveUsers(@Nullable Output<Integer> totalActiveUsers) {
            $.totalActiveUsers = totalActiveUsers;
            return this;
        }

        /**
         * @param totalActiveUsers The total number of active user sessions on the route at a point in time.
         * 
         * @return builder
         * 
         */
        public Builder totalActiveUsers(Integer totalActiveUsers) {
            return totalActiveUsers(Output.of(totalActiveUsers));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public WaitingRoomState build() {
            return $;
        }
    }

}
