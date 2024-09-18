// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetRulesetsRulesetRuleActionParametersResult
    {
        /// <summary>
        /// Allows for the ability to support caching on non-standard ports.
        /// </summary>
        public readonly ImmutableArray<int> AdditionalCacheablePorts;
        /// <summary>
        /// Turn on or off Cloudflare Automatic HTTPS rewrites.
        /// </summary>
        public readonly bool? AutomaticHttpsRewrites;
        /// <summary>
        /// Indicate which file extensions to minify automatically.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersAutominifyResult> Autominifies;
        /// <summary>
        /// Inspect the visitor's browser for headers commonly associated with spammers and certain bots.
        /// </summary>
        public readonly bool? Bic;
        /// <summary>
        /// List of browser TTL parameters to apply to the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersBrowserTtlResult? BrowserTtl;
        /// <summary>
        /// Whether to cache if expression matches.
        /// </summary>
        public readonly bool? Cache;
        /// <summary>
        /// List of cache key parameters to apply to the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersCacheKeyResult? CacheKey;
        /// <summary>
        /// List of cache reserve parameters to apply to the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersCacheReserveResult? CacheReserve;
        /// <summary>
        /// Content of the custom error response
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// Content-Type of the custom error response
        /// </summary>
        public readonly string? ContentType;
        /// <summary>
        /// List of cookie values to include as part of custom fields logging.
        /// </summary>
        public readonly ImmutableArray<string> CookieFields;
        /// <summary>
        /// Turn off all active Cloudflare Apps.
        /// </summary>
        public readonly bool? DisableApps;
        /// <summary>
        /// Turn off railgun feature of the Cloudflare Speed app.
        /// </summary>
        public readonly bool? DisableRailgun;
        /// <summary>
        /// Turn off zaraz feature.
        /// </summary>
        public readonly bool? DisableZaraz;
        /// <summary>
        /// List of edge TTL parameters to apply to the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersEdgeTtlResult? EdgeTtl;
        /// <summary>
        /// Turn on or off the Cloudflare Email Obfuscation feature of the Cloudflare Scrape Shield app.
        /// </summary>
        public readonly bool? EmailObfuscation;
        /// <summary>
        /// Use a list to lookup information for the action.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersFromListResult? FromList;
        /// <summary>
        /// Use a value to lookup information for the action.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersFromValueResult? FromValue;
        /// <summary>
        /// List of HTTP header modifications to perform in the ruleset rule.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersHeaderResult> Headers;
        /// <summary>
        /// Host Header that request origin receives.
        /// </summary>
        public readonly string? HostHeader;
        /// <summary>
        /// Turn on or off the hotlink protection feature.
        /// </summary>
        public readonly bool? HotlinkProtection;
        /// <summary>
        /// Identifier of the action parameter to modify.
        /// </summary>
        public readonly string? Id;
        public readonly int? Increment;
        /// <summary>
        /// List of properties to configure WAF payload logging.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersMatchedDataResult? MatchedData;
        /// <summary>
        /// Turn on or off Cloudflare Mirage of the Cloudflare Speed app.
        /// </summary>
        public readonly bool? Mirage;
        /// <summary>
        /// Turn on or off the Cloudflare Opportunistic Encryption feature of the Edge Certificates tab in the Cloudflare SSL/TLS app.
        /// </summary>
        public readonly bool? OpportunisticEncryption;
        /// <summary>
        /// List of properties to change request origin.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersOriginResult? Origin;
        /// <summary>
        /// Sets a more compliant mode for parsing Cache Control headers
        /// </summary>
        public readonly bool? OriginCacheControl;
        /// <summary>
        /// Pass-through error page for origin.
        /// </summary>
        public readonly bool? OriginErrorPagePassthru;
        /// <summary>
        /// List of override configurations to apply to the ruleset.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersOverridesResult? Overrides;
        /// <summary>
        /// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_config_settings`, `http_custom_errors`, `http_log_custom_fields`, `http_ratelimit`, `http_request_cache_settings`, `http_request_dynamic_redirect`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_origin`, `http_request_redirect`, `http_request_sanitize`, `http_request_sbfm`, `http_request_transform`, `http_response_compression`, `http_response_firewall_managed`, `http_response_headers_transform`, `magic_transit`
        /// </summary>
        public readonly ImmutableArray<string> Phases;
        /// <summary>
        /// Apply options from the Polish feature of the Cloudflare Speed app.
        /// </summary>
        public readonly string? Polish;
        /// <summary>
        /// Products to target with the actions. Available values: `bic`, `hot`, `ratelimit`, `securityLevel`, `uablock`, `waf`, `zonelockdown`
        /// </summary>
        public readonly ImmutableArray<string> Products;
        /// <summary>
        /// Sets the timeout value for reading content from an origin server.
        /// </summary>
        public readonly int? ReadTimeout;
        /// <summary>
        /// List of request headers to include as part of custom fields logging, in lowercase.
        /// </summary>
        public readonly ImmutableArray<string> RequestFields;
        /// <summary>
        /// Respect strong ETags.
        /// </summary>
        public readonly bool? RespectStrongEtags;
        /// <summary>
        /// List of response headers to include as part of custom fields logging, in lowercase.
        /// </summary>
        public readonly ImmutableArray<string> ResponseFields;
        /// <summary>
        /// List of parameters that configure the response given to end users
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersResponseResult> Responses;
        /// <summary>
        /// Turn on or off Cloudflare Rocket Loader in the Cloudflare Speed app.
        /// </summary>
        public readonly bool? RocketLoader;
        /// <summary>
        /// Map of managed WAF rule ID to comma-delimited string of ruleset rule IDs. Example: `rules = { "efb7b8c949ac4650a09736fc376e9aee" = "5de7edfa648c4d6891dc3e7f84534ffa,e3a567afc347477d9702d9047e97d760" }`
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Rules;
        /// <summary>
        /// Which ruleset ID to target.
        /// </summary>
        public readonly string? Ruleset;
        /// <summary>
        /// List of managed WAF rule IDs to target. Only valid when the `"action"` is set to skip
        /// </summary>
        public readonly ImmutableArray<string> Rulesets;
        /// <summary>
        /// Control options for the Security Level feature from the Security app.
        /// </summary>
        public readonly string? SecurityLevel;
        /// <summary>
        /// List of serve stale parameters to apply to the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersServeStaleResult? ServeStale;
        /// <summary>
        /// Turn on or off the Server Side Excludes feature of the Cloudflare Scrape Shield app.
        /// </summary>
        public readonly bool? ServerSideExcludes;
        /// <summary>
        /// List of properties to manange Server Name Indication.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersSniResult? Sni;
        /// <summary>
        /// Control options for the SSL feature of the Edge Certificates tab in the Cloudflare SSL/TLS app.
        /// </summary>
        public readonly string? Ssl;
        /// <summary>
        /// HTTP status code of the custom error response
        /// </summary>
        public readonly int? StatusCode;
        /// <summary>
        /// Turn on or off the SXG feature.
        /// </summary>
        public readonly bool? Sxg;
        /// <summary>
        /// List of URI properties to configure for the ruleset rule when performing URL rewrite transformations.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersUriResult? Uri;
        /// <summary>
        /// Version of the ruleset to deploy.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersResult(
            ImmutableArray<int> additionalCacheablePorts,

            bool? automaticHttpsRewrites,

            ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersAutominifyResult> autominifies,

            bool? bic,

            Outputs.GetRulesetsRulesetRuleActionParametersBrowserTtlResult? browserTtl,

            bool? cache,

            Outputs.GetRulesetsRulesetRuleActionParametersCacheKeyResult? cacheKey,

            Outputs.GetRulesetsRulesetRuleActionParametersCacheReserveResult? cacheReserve,

            string? content,

            string? contentType,

            ImmutableArray<string> cookieFields,

            bool? disableApps,

            bool? disableRailgun,

            bool? disableZaraz,

            Outputs.GetRulesetsRulesetRuleActionParametersEdgeTtlResult? edgeTtl,

            bool? emailObfuscation,

            Outputs.GetRulesetsRulesetRuleActionParametersFromListResult? fromList,

            Outputs.GetRulesetsRulesetRuleActionParametersFromValueResult? fromValue,

            ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersHeaderResult> headers,

            string? hostHeader,

            bool? hotlinkProtection,

            string? id,

            int? increment,

            Outputs.GetRulesetsRulesetRuleActionParametersMatchedDataResult? matchedData,

            bool? mirage,

            bool? opportunisticEncryption,

            Outputs.GetRulesetsRulesetRuleActionParametersOriginResult? origin,

            bool? originCacheControl,

            bool? originErrorPagePassthru,

            Outputs.GetRulesetsRulesetRuleActionParametersOverridesResult? overrides,

            ImmutableArray<string> phases,

            string? polish,

            ImmutableArray<string> products,

            int? readTimeout,

            ImmutableArray<string> requestFields,

            bool? respectStrongEtags,

            ImmutableArray<string> responseFields,

            ImmutableArray<Outputs.GetRulesetsRulesetRuleActionParametersResponseResult> responses,

            bool? rocketLoader,

            ImmutableDictionary<string, string>? rules,

            string? ruleset,

            ImmutableArray<string> rulesets,

            string? securityLevel,

            Outputs.GetRulesetsRulesetRuleActionParametersServeStaleResult? serveStale,

            bool? serverSideExcludes,

            Outputs.GetRulesetsRulesetRuleActionParametersSniResult? sni,

            string? ssl,

            int? statusCode,

            bool? sxg,

            Outputs.GetRulesetsRulesetRuleActionParametersUriResult? uri,

            string version)
        {
            AdditionalCacheablePorts = additionalCacheablePorts;
            AutomaticHttpsRewrites = automaticHttpsRewrites;
            Autominifies = autominifies;
            Bic = bic;
            BrowserTtl = browserTtl;
            Cache = cache;
            CacheKey = cacheKey;
            CacheReserve = cacheReserve;
            Content = content;
            ContentType = contentType;
            CookieFields = cookieFields;
            DisableApps = disableApps;
            DisableRailgun = disableRailgun;
            DisableZaraz = disableZaraz;
            EdgeTtl = edgeTtl;
            EmailObfuscation = emailObfuscation;
            FromList = fromList;
            FromValue = fromValue;
            Headers = headers;
            HostHeader = hostHeader;
            HotlinkProtection = hotlinkProtection;
            Id = id;
            Increment = increment;
            MatchedData = matchedData;
            Mirage = mirage;
            OpportunisticEncryption = opportunisticEncryption;
            Origin = origin;
            OriginCacheControl = originCacheControl;
            OriginErrorPagePassthru = originErrorPagePassthru;
            Overrides = overrides;
            Phases = phases;
            Polish = polish;
            Products = products;
            ReadTimeout = readTimeout;
            RequestFields = requestFields;
            RespectStrongEtags = respectStrongEtags;
            ResponseFields = responseFields;
            Responses = responses;
            RocketLoader = rocketLoader;
            Rules = rules;
            Ruleset = ruleset;
            Rulesets = rulesets;
            SecurityLevel = securityLevel;
            ServeStale = serveStale;
            ServerSideExcludes = serverSideExcludes;
            Sni = sni;
            Ssl = ssl;
            StatusCode = statusCode;
            Sxg = sxg;
            Uri = uri;
            Version = version;
        }
    }
}
