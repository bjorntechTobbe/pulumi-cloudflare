// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.AccessApplicationCorsHeaderArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationFooterLinkArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationLandingPageDesignArgs;
import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationArgs Empty = new AccessApplicationArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
     * 
     */
    @Import(name="allowAuthenticateViaWarp")
    private @Nullable Output<Boolean> allowAuthenticateViaWarp;

    /**
     * @return When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
     * 
     */
    public Optional<Output<Boolean>> allowAuthenticateViaWarp() {
        return Optional.ofNullable(this.allowAuthenticateViaWarp);
    }

    /**
     * The identity providers selected for the application.
     * 
     */
    @Import(name="allowedIdps")
    private @Nullable Output<List<String>> allowedIdps;

    /**
     * @return The identity providers selected for the application.
     * 
     */
    public Optional<Output<List<String>>> allowedIdps() {
        return Optional.ofNullable(this.allowedIdps);
    }

    /**
     * The logo URL of the app launcher.
     * 
     */
    @Import(name="appLauncherLogoUrl")
    private @Nullable Output<String> appLauncherLogoUrl;

    /**
     * @return The logo URL of the app launcher.
     * 
     */
    public Optional<Output<String>> appLauncherLogoUrl() {
        return Optional.ofNullable(this.appLauncherLogoUrl);
    }

    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     * 
     */
    @Import(name="appLauncherVisible")
    private @Nullable Output<Boolean> appLauncherVisible;

    /**
     * @return Option to show/hide applications in App Launcher. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> appLauncherVisible() {
        return Optional.ofNullable(this.appLauncherVisible);
    }

    /**
     * Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
     * 
     */
    @Import(name="autoRedirectToIdentity")
    private @Nullable Output<Boolean> autoRedirectToIdentity;

    /**
     * @return Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> autoRedirectToIdentity() {
        return Optional.ofNullable(this.autoRedirectToIdentity);
    }

    /**
     * The background color of the app launcher.
     * 
     */
    @Import(name="bgColor")
    private @Nullable Output<String> bgColor;

    /**
     * @return The background color of the app launcher.
     * 
     */
    public Optional<Output<String>> bgColor() {
        return Optional.ofNullable(this.bgColor);
    }

    /**
     * CORS configuration for the Access Application. See below for reference structure.
     * 
     */
    @Import(name="corsHeaders")
    private @Nullable Output<List<AccessApplicationCorsHeaderArgs>> corsHeaders;

    /**
     * @return CORS configuration for the Access Application. See below for reference structure.
     * 
     */
    public Optional<Output<List<AccessApplicationCorsHeaderArgs>>> corsHeaders() {
        return Optional.ofNullable(this.corsHeaders);
    }

    /**
     * Option that returns a custom error message when a user is denied access to the application.
     * 
     */
    @Import(name="customDenyMessage")
    private @Nullable Output<String> customDenyMessage;

    /**
     * @return Option that returns a custom error message when a user is denied access to the application.
     * 
     */
    public Optional<Output<String>> customDenyMessage() {
        return Optional.ofNullable(this.customDenyMessage);
    }

    /**
     * Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     * 
     */
    @Import(name="customDenyUrl")
    private @Nullable Output<String> customDenyUrl;

    /**
     * @return Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     * 
     */
    public Optional<Output<String>> customDenyUrl() {
        return Optional.ofNullable(this.customDenyUrl);
    }

    /**
     * Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     * 
     */
    @Import(name="customNonIdentityDenyUrl")
    private @Nullable Output<String> customNonIdentityDenyUrl;

    /**
     * @return Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     * 
     */
    public Optional<Output<String>> customNonIdentityDenyUrl() {
        return Optional.ofNullable(this.customNonIdentityDenyUrl);
    }

    /**
     * The custom pages selected for the application.
     * 
     */
    @Import(name="customPages")
    private @Nullable Output<List<String>> customPages;

    /**
     * @return The custom pages selected for the application.
     * 
     */
    public Optional<Output<List<String>>> customPages() {
        return Optional.ofNullable(this.customPages);
    }

    /**
     * The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
     * 
     */
    @Import(name="enableBindingCookie")
    private @Nullable Output<Boolean> enableBindingCookie;

    /**
     * @return Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBindingCookie() {
        return Optional.ofNullable(this.enableBindingCookie);
    }

    /**
     * The footer links of the app launcher.
     * 
     */
    @Import(name="footerLinks")
    private @Nullable Output<List<AccessApplicationFooterLinkArgs>> footerLinks;

    /**
     * @return The footer links of the app launcher.
     * 
     */
    public Optional<Output<List<AccessApplicationFooterLinkArgs>>> footerLinks() {
        return Optional.ofNullable(this.footerLinks);
    }

    /**
     * The background color of the header bar in the app launcher.
     * 
     */
    @Import(name="headerBgColor")
    private @Nullable Output<String> headerBgColor;

    /**
     * @return The background color of the header bar in the app launcher.
     * 
     */
    public Optional<Output<String>> headerBgColor() {
        return Optional.ofNullable(this.headerBgColor);
    }

    /**
     * Option to add the `HttpOnly` cookie flag to access tokens.
     * 
     */
    @Import(name="httpOnlyCookieAttribute")
    private @Nullable Output<Boolean> httpOnlyCookieAttribute;

    /**
     * @return Option to add the `HttpOnly` cookie flag to access tokens.
     * 
     */
    public Optional<Output<Boolean>> httpOnlyCookieAttribute() {
        return Optional.ofNullable(this.httpOnlyCookieAttribute);
    }

    /**
     * The landing page design of the app launcher.
     * 
     */
    @Import(name="landingPageDesign")
    private @Nullable Output<AccessApplicationLandingPageDesignArgs> landingPageDesign;

    /**
     * @return The landing page design of the app launcher.
     * 
     */
    public Optional<Output<AccessApplicationLandingPageDesignArgs>> landingPageDesign() {
        return Optional.ofNullable(this.landingPageDesign);
    }

    /**
     * Image URL for the logo shown in the app launcher dashboard.
     * 
     */
    @Import(name="logoUrl")
    private @Nullable Output<String> logoUrl;

    /**
     * @return Image URL for the logo shown in the app launcher dashboard.
     * 
     */
    public Optional<Output<String>> logoUrl() {
        return Optional.ofNullable(this.logoUrl);
    }

    /**
     * Friendly name of the Access Application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name of the Access Application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * SaaS configuration for the Access Application.
     * 
     */
    @Import(name="saasApp")
    private @Nullable Output<AccessApplicationSaasAppArgs> saasApp;

    /**
     * @return SaaS configuration for the Access Application.
     * 
     */
    public Optional<Output<AccessApplicationSaasAppArgs>> saasApp() {
        return Optional.ofNullable(this.saasApp);
    }

    /**
     * Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     * 
     */
    @Import(name="sameSiteCookieAttribute")
    private @Nullable Output<String> sameSiteCookieAttribute;

    /**
     * @return Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     * 
     */
    public Optional<Output<String>> sameSiteCookieAttribute() {
        return Optional.ofNullable(this.sameSiteCookieAttribute);
    }

    /**
     * List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     * 
     */
    @Import(name="selfHostedDomains")
    private @Nullable Output<List<String>> selfHostedDomains;

    /**
     * @return List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     * 
     */
    public Optional<Output<List<String>>> selfHostedDomains() {
        return Optional.ofNullable(this.selfHostedDomains);
    }

    /**
     * Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     * 
     */
    @Import(name="serviceAuth401Redirect")
    private @Nullable Output<Boolean> serviceAuth401Redirect;

    /**
     * @return Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> serviceAuth401Redirect() {
        return Optional.ofNullable(this.serviceAuth401Redirect);
    }

    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     * 
     */
    @Import(name="sessionDuration")
    private @Nullable Output<String> sessionDuration;

    /**
     * @return How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     * 
     */
    public Optional<Output<String>> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }

    /**
     * Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     * 
     */
    @Import(name="skipInterstitial")
    private @Nullable Output<Boolean> skipInterstitial;

    /**
     * @return Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> skipInterstitial() {
        return Optional.ofNullable(this.skipInterstitial);
    }

    /**
     * The itags associated with the application.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The itags associated with the application.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessApplicationArgs() {}

    private AccessApplicationArgs(AccessApplicationArgs $) {
        this.accountId = $.accountId;
        this.allowAuthenticateViaWarp = $.allowAuthenticateViaWarp;
        this.allowedIdps = $.allowedIdps;
        this.appLauncherLogoUrl = $.appLauncherLogoUrl;
        this.appLauncherVisible = $.appLauncherVisible;
        this.autoRedirectToIdentity = $.autoRedirectToIdentity;
        this.bgColor = $.bgColor;
        this.corsHeaders = $.corsHeaders;
        this.customDenyMessage = $.customDenyMessage;
        this.customDenyUrl = $.customDenyUrl;
        this.customNonIdentityDenyUrl = $.customNonIdentityDenyUrl;
        this.customPages = $.customPages;
        this.domain = $.domain;
        this.enableBindingCookie = $.enableBindingCookie;
        this.footerLinks = $.footerLinks;
        this.headerBgColor = $.headerBgColor;
        this.httpOnlyCookieAttribute = $.httpOnlyCookieAttribute;
        this.landingPageDesign = $.landingPageDesign;
        this.logoUrl = $.logoUrl;
        this.name = $.name;
        this.saasApp = $.saasApp;
        this.sameSiteCookieAttribute = $.sameSiteCookieAttribute;
        this.selfHostedDomains = $.selfHostedDomains;
        this.serviceAuth401Redirect = $.serviceAuth401Redirect;
        this.sessionDuration = $.sessionDuration;
        this.skipInterstitial = $.skipInterstitial;
        this.tags = $.tags;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationArgs $;

        public Builder() {
            $ = new AccessApplicationArgs();
        }

        public Builder(AccessApplicationArgs defaults) {
            $ = new AccessApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowAuthenticateViaWarp When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(@Nullable Output<Boolean> allowAuthenticateViaWarp) {
            $.allowAuthenticateViaWarp = allowAuthenticateViaWarp;
            return this;
        }

        /**
         * @param allowAuthenticateViaWarp When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
         * 
         * @return builder
         * 
         */
        public Builder allowAuthenticateViaWarp(Boolean allowAuthenticateViaWarp) {
            return allowAuthenticateViaWarp(Output.of(allowAuthenticateViaWarp));
        }

        /**
         * @param allowedIdps The identity providers selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder allowedIdps(@Nullable Output<List<String>> allowedIdps) {
            $.allowedIdps = allowedIdps;
            return this;
        }

        /**
         * @param allowedIdps The identity providers selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder allowedIdps(List<String> allowedIdps) {
            return allowedIdps(Output.of(allowedIdps));
        }

        /**
         * @param allowedIdps The identity providers selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder allowedIdps(String... allowedIdps) {
            return allowedIdps(List.of(allowedIdps));
        }

        /**
         * @param appLauncherLogoUrl The logo URL of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherLogoUrl(@Nullable Output<String> appLauncherLogoUrl) {
            $.appLauncherLogoUrl = appLauncherLogoUrl;
            return this;
        }

        /**
         * @param appLauncherLogoUrl The logo URL of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherLogoUrl(String appLauncherLogoUrl) {
            return appLauncherLogoUrl(Output.of(appLauncherLogoUrl));
        }

        /**
         * @param appLauncherVisible Option to show/hide applications in App Launcher. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherVisible(@Nullable Output<Boolean> appLauncherVisible) {
            $.appLauncherVisible = appLauncherVisible;
            return this;
        }

        /**
         * @param appLauncherVisible Option to show/hide applications in App Launcher. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherVisible(Boolean appLauncherVisible) {
            return appLauncherVisible(Output.of(appLauncherVisible));
        }

        /**
         * @param autoRedirectToIdentity Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(@Nullable Output<Boolean> autoRedirectToIdentity) {
            $.autoRedirectToIdentity = autoRedirectToIdentity;
            return this;
        }

        /**
         * @param autoRedirectToIdentity Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRedirectToIdentity(Boolean autoRedirectToIdentity) {
            return autoRedirectToIdentity(Output.of(autoRedirectToIdentity));
        }

        /**
         * @param bgColor The background color of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder bgColor(@Nullable Output<String> bgColor) {
            $.bgColor = bgColor;
            return this;
        }

        /**
         * @param bgColor The background color of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder bgColor(String bgColor) {
            return bgColor(Output.of(bgColor));
        }

        /**
         * @param corsHeaders CORS configuration for the Access Application. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder corsHeaders(@Nullable Output<List<AccessApplicationCorsHeaderArgs>> corsHeaders) {
            $.corsHeaders = corsHeaders;
            return this;
        }

        /**
         * @param corsHeaders CORS configuration for the Access Application. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder corsHeaders(List<AccessApplicationCorsHeaderArgs> corsHeaders) {
            return corsHeaders(Output.of(corsHeaders));
        }

        /**
         * @param corsHeaders CORS configuration for the Access Application. See below for reference structure.
         * 
         * @return builder
         * 
         */
        public Builder corsHeaders(AccessApplicationCorsHeaderArgs... corsHeaders) {
            return corsHeaders(List.of(corsHeaders));
        }

        /**
         * @param customDenyMessage Option that returns a custom error message when a user is denied access to the application.
         * 
         * @return builder
         * 
         */
        public Builder customDenyMessage(@Nullable Output<String> customDenyMessage) {
            $.customDenyMessage = customDenyMessage;
            return this;
        }

        /**
         * @param customDenyMessage Option that returns a custom error message when a user is denied access to the application.
         * 
         * @return builder
         * 
         */
        public Builder customDenyMessage(String customDenyMessage) {
            return customDenyMessage(Output.of(customDenyMessage));
        }

        /**
         * @param customDenyUrl Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
         * 
         * @return builder
         * 
         */
        public Builder customDenyUrl(@Nullable Output<String> customDenyUrl) {
            $.customDenyUrl = customDenyUrl;
            return this;
        }

        /**
         * @param customDenyUrl Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
         * 
         * @return builder
         * 
         */
        public Builder customDenyUrl(String customDenyUrl) {
            return customDenyUrl(Output.of(customDenyUrl));
        }

        /**
         * @param customNonIdentityDenyUrl Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
         * 
         * @return builder
         * 
         */
        public Builder customNonIdentityDenyUrl(@Nullable Output<String> customNonIdentityDenyUrl) {
            $.customNonIdentityDenyUrl = customNonIdentityDenyUrl;
            return this;
        }

        /**
         * @param customNonIdentityDenyUrl Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
         * 
         * @return builder
         * 
         */
        public Builder customNonIdentityDenyUrl(String customNonIdentityDenyUrl) {
            return customNonIdentityDenyUrl(Output.of(customNonIdentityDenyUrl));
        }

        /**
         * @param customPages The custom pages selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder customPages(@Nullable Output<List<String>> customPages) {
            $.customPages = customPages;
            return this;
        }

        /**
         * @param customPages The custom pages selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder customPages(List<String> customPages) {
            return customPages(Output.of(customPages));
        }

        /**
         * @param customPages The custom pages selected for the application.
         * 
         * @return builder
         * 
         */
        public Builder customPages(String... customPages) {
            return customPages(List.of(customPages));
        }

        /**
         * @param domain The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param enableBindingCookie Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBindingCookie(@Nullable Output<Boolean> enableBindingCookie) {
            $.enableBindingCookie = enableBindingCookie;
            return this;
        }

        /**
         * @param enableBindingCookie Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional &#34;binding&#34; cookie on requests. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBindingCookie(Boolean enableBindingCookie) {
            return enableBindingCookie(Output.of(enableBindingCookie));
        }

        /**
         * @param footerLinks The footer links of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder footerLinks(@Nullable Output<List<AccessApplicationFooterLinkArgs>> footerLinks) {
            $.footerLinks = footerLinks;
            return this;
        }

        /**
         * @param footerLinks The footer links of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder footerLinks(List<AccessApplicationFooterLinkArgs> footerLinks) {
            return footerLinks(Output.of(footerLinks));
        }

        /**
         * @param footerLinks The footer links of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder footerLinks(AccessApplicationFooterLinkArgs... footerLinks) {
            return footerLinks(List.of(footerLinks));
        }

        /**
         * @param headerBgColor The background color of the header bar in the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder headerBgColor(@Nullable Output<String> headerBgColor) {
            $.headerBgColor = headerBgColor;
            return this;
        }

        /**
         * @param headerBgColor The background color of the header bar in the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder headerBgColor(String headerBgColor) {
            return headerBgColor(Output.of(headerBgColor));
        }

        /**
         * @param httpOnlyCookieAttribute Option to add the `HttpOnly` cookie flag to access tokens.
         * 
         * @return builder
         * 
         */
        public Builder httpOnlyCookieAttribute(@Nullable Output<Boolean> httpOnlyCookieAttribute) {
            $.httpOnlyCookieAttribute = httpOnlyCookieAttribute;
            return this;
        }

        /**
         * @param httpOnlyCookieAttribute Option to add the `HttpOnly` cookie flag to access tokens.
         * 
         * @return builder
         * 
         */
        public Builder httpOnlyCookieAttribute(Boolean httpOnlyCookieAttribute) {
            return httpOnlyCookieAttribute(Output.of(httpOnlyCookieAttribute));
        }

        /**
         * @param landingPageDesign The landing page design of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder landingPageDesign(@Nullable Output<AccessApplicationLandingPageDesignArgs> landingPageDesign) {
            $.landingPageDesign = landingPageDesign;
            return this;
        }

        /**
         * @param landingPageDesign The landing page design of the app launcher.
         * 
         * @return builder
         * 
         */
        public Builder landingPageDesign(AccessApplicationLandingPageDesignArgs landingPageDesign) {
            return landingPageDesign(Output.of(landingPageDesign));
        }

        /**
         * @param logoUrl Image URL for the logo shown in the app launcher dashboard.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(@Nullable Output<String> logoUrl) {
            $.logoUrl = logoUrl;
            return this;
        }

        /**
         * @param logoUrl Image URL for the logo shown in the app launcher dashboard.
         * 
         * @return builder
         * 
         */
        public Builder logoUrl(String logoUrl) {
            return logoUrl(Output.of(logoUrl));
        }

        /**
         * @param name Friendly name of the Access Application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name of the Access Application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param saasApp SaaS configuration for the Access Application.
         * 
         * @return builder
         * 
         */
        public Builder saasApp(@Nullable Output<AccessApplicationSaasAppArgs> saasApp) {
            $.saasApp = saasApp;
            return this;
        }

        /**
         * @param saasApp SaaS configuration for the Access Application.
         * 
         * @return builder
         * 
         */
        public Builder saasApp(AccessApplicationSaasAppArgs saasApp) {
            return saasApp(Output.of(saasApp));
        }

        /**
         * @param sameSiteCookieAttribute Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
         * 
         * @return builder
         * 
         */
        public Builder sameSiteCookieAttribute(@Nullable Output<String> sameSiteCookieAttribute) {
            $.sameSiteCookieAttribute = sameSiteCookieAttribute;
            return this;
        }

        /**
         * @param sameSiteCookieAttribute Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
         * 
         * @return builder
         * 
         */
        public Builder sameSiteCookieAttribute(String sameSiteCookieAttribute) {
            return sameSiteCookieAttribute(Output.of(sameSiteCookieAttribute));
        }

        /**
         * @param selfHostedDomains List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
         * 
         * @return builder
         * 
         */
        public Builder selfHostedDomains(@Nullable Output<List<String>> selfHostedDomains) {
            $.selfHostedDomains = selfHostedDomains;
            return this;
        }

        /**
         * @param selfHostedDomains List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
         * 
         * @return builder
         * 
         */
        public Builder selfHostedDomains(List<String> selfHostedDomains) {
            return selfHostedDomains(Output.of(selfHostedDomains));
        }

        /**
         * @param selfHostedDomains List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
         * 
         * @return builder
         * 
         */
        public Builder selfHostedDomains(String... selfHostedDomains) {
            return selfHostedDomains(List.of(selfHostedDomains));
        }

        /**
         * @param serviceAuth401Redirect Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAuth401Redirect(@Nullable Output<Boolean> serviceAuth401Redirect) {
            $.serviceAuth401Redirect = serviceAuth401Redirect;
            return this;
        }

        /**
         * @param serviceAuth401Redirect Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder serviceAuth401Redirect(Boolean serviceAuth401Redirect) {
            return serviceAuth401Redirect(Output.of(serviceAuth401Redirect));
        }

        /**
         * @param sessionDuration How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(@Nullable Output<String> sessionDuration) {
            $.sessionDuration = sessionDuration;
            return this;
        }

        /**
         * @param sessionDuration How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
         * 
         * @return builder
         * 
         */
        public Builder sessionDuration(String sessionDuration) {
            return sessionDuration(Output.of(sessionDuration));
        }

        /**
         * @param skipInterstitial Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipInterstitial(@Nullable Output<Boolean> skipInterstitial) {
            $.skipInterstitial = skipInterstitial;
            return this;
        }

        /**
         * @param skipInterstitial Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipInterstitial(Boolean skipInterstitial) {
            return skipInterstitial(Output.of(skipInterstitial));
        }

        /**
         * @param tags The itags associated with the application.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The itags associated with the application.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The itags associated with the application.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessApplicationArgs build() {
            return $;
        }
    }

}
