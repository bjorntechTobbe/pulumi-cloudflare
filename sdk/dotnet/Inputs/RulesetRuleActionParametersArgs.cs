// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalCacheablePorts")]
        private InputList<int>? _additionalCacheablePorts;

        /// <summary>
        /// Specifies uncommon ports to allow cacheable assets to be served from.
        /// </summary>
        public InputList<int> AdditionalCacheablePorts
        {
            get => _additionalCacheablePorts ?? (_additionalCacheablePorts = new InputList<int>());
            set => _additionalCacheablePorts = value;
        }

        [Input("algorithms")]
        private InputList<Inputs.RulesetRuleActionParametersAlgorithmArgs>? _algorithms;

        /// <summary>
        /// Compression algorithms to use in order of preference.
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersAlgorithmArgs> Algorithms
        {
            get => _algorithms ?? (_algorithms = new InputList<Inputs.RulesetRuleActionParametersAlgorithmArgs>());
            set => _algorithms = value;
        }

        /// <summary>
        /// Turn on or off Cloudflare Automatic HTTPS rewrites.
        /// </summary>
        [Input("automaticHttpsRewrites")]
        public Input<bool>? AutomaticHttpsRewrites { get; set; }

        [Input("autominifies")]
        private InputList<Inputs.RulesetRuleActionParametersAutominifyArgs>? _autominifies;

        /// <summary>
        /// Indicate which file extensions to minify automatically.
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersAutominifyArgs> Autominifies
        {
            get => _autominifies ?? (_autominifies = new InputList<Inputs.RulesetRuleActionParametersAutominifyArgs>());
            set => _autominifies = value;
        }

        /// <summary>
        /// Inspect the visitor's browser for headers commonly associated with spammers and certain bots.
        /// </summary>
        [Input("bic")]
        public Input<bool>? Bic { get; set; }

        /// <summary>
        /// List of browser TTL parameters to apply to the request.
        /// </summary>
        [Input("browserTtl")]
        public Input<Inputs.RulesetRuleActionParametersBrowserTtlArgs>? BrowserTtl { get; set; }

        /// <summary>
        /// Whether to cache if expression matches.
        /// </summary>
        [Input("cache")]
        public Input<bool>? Cache { get; set; }

        /// <summary>
        /// List of cache key parameters to apply to the request.
        /// </summary>
        [Input("cacheKey")]
        public Input<Inputs.RulesetRuleActionParametersCacheKeyArgs>? CacheKey { get; set; }

        /// <summary>
        /// Content of the custom error response.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Content-Type of the custom error response.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        [Input("cookieFields")]
        private InputList<string>? _cookieFields;

        /// <summary>
        /// List of cookie values to include as part of custom fields logging.
        /// </summary>
        public InputList<string> CookieFields
        {
            get => _cookieFields ?? (_cookieFields = new InputList<string>());
            set => _cookieFields = value;
        }

        /// <summary>
        /// Turn off all active Cloudflare Apps.
        /// </summary>
        [Input("disableApps")]
        public Input<bool>? DisableApps { get; set; }

        /// <summary>
        /// Turn off railgun feature of the Cloudflare Speed app.
        /// </summary>
        [Input("disableRailgun")]
        public Input<bool>? DisableRailgun { get; set; }

        /// <summary>
        /// Turn off RUM feature.
        /// </summary>
        [Input("disableRum")]
        public Input<bool>? DisableRum { get; set; }

        /// <summary>
        /// Turn off zaraz feature.
        /// </summary>
        [Input("disableZaraz")]
        public Input<bool>? DisableZaraz { get; set; }

        /// <summary>
        /// List of edge TTL parameters to apply to the request.
        /// </summary>
        [Input("edgeTtl")]
        public Input<Inputs.RulesetRuleActionParametersEdgeTtlArgs>? EdgeTtl { get; set; }

        /// <summary>
        /// Turn on or off the Cloudflare Email Obfuscation feature of the Cloudflare Scrape Shield app.
        /// </summary>
        [Input("emailObfuscation")]
        public Input<bool>? EmailObfuscation { get; set; }

        /// <summary>
        /// Toggle fonts.
        /// </summary>
        [Input("fonts")]
        public Input<bool>? Fonts { get; set; }

        /// <summary>
        /// Use a list to lookup information for the action.
        /// </summary>
        [Input("fromList")]
        public Input<Inputs.RulesetRuleActionParametersFromListArgs>? FromList { get; set; }

        /// <summary>
        /// Use a value to lookup information for the action.
        /// </summary>
        [Input("fromValue")]
        public Input<Inputs.RulesetRuleActionParametersFromValueArgs>? FromValue { get; set; }

        [Input("headers")]
        private InputList<Inputs.RulesetRuleActionParametersHeaderArgs>? _headers;

        /// <summary>
        /// List of HTTP header modifications to perform in the ruleset rule. Note: Headers are order dependent and must be provided sorted alphabetically ascending based on the `name` value.
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.RulesetRuleActionParametersHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// Host Header that request origin receives.
        /// </summary>
        [Input("hostHeader")]
        public Input<string>? HostHeader { get; set; }

        /// <summary>
        /// Turn on or off the hotlink protection feature.
        /// </summary>
        [Input("hotlinkProtection")]
        public Input<bool>? HotlinkProtection { get; set; }

        /// <summary>
        /// Identifier of the action parameter to modify.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("increment")]
        public Input<int>? Increment { get; set; }

        /// <summary>
        /// List of properties to configure WAF payload logging.
        /// </summary>
        [Input("matchedData")]
        public Input<Inputs.RulesetRuleActionParametersMatchedDataArgs>? MatchedData { get; set; }

        /// <summary>
        /// Turn on or off Cloudflare Mirage of the Cloudflare Speed app.
        /// </summary>
        [Input("mirage")]
        public Input<bool>? Mirage { get; set; }

        /// <summary>
        /// Turn on or off the Cloudflare Opportunistic Encryption feature of the Edge Certificates tab in the Cloudflare SSL/TLS app.
        /// </summary>
        [Input("opportunisticEncryption")]
        public Input<bool>? OpportunisticEncryption { get; set; }

        /// <summary>
        /// List of properties to change request origin.
        /// </summary>
        [Input("origin")]
        public Input<Inputs.RulesetRuleActionParametersOriginArgs>? Origin { get; set; }

        /// <summary>
        /// Enable or disable the use of a more compliant Cache Control parsing mechanism, enabled by default for most zones.
        /// </summary>
        [Input("originCacheControl")]
        public Input<bool>? OriginCacheControl { get; set; }

        /// <summary>
        /// Pass-through error page for origin.
        /// </summary>
        [Input("originErrorPagePassthru")]
        public Input<bool>? OriginErrorPagePassthru { get; set; }

        /// <summary>
        /// List of override configurations to apply to the ruleset.
        /// </summary>
        [Input("overrides")]
        public Input<Inputs.RulesetRuleActionParametersOverridesArgs>? Overrides { get; set; }

        [Input("phases")]
        private InputList<string>? _phases;

        /// <summary>
        /// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_config_settings`, `http_custom_errors`, `http_log_custom_fields`, `http_ratelimit`, `http_request_cache_settings`, `http_request_dynamic_redirect`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_origin`, `http_request_redirect`, `http_request_sanitize`, `http_request_sbfm`, `http_request_transform`, `http_response_compression`, `http_response_firewall_managed`, `http_response_headers_transform`, `magic_transit`.
        /// </summary>
        public InputList<string> Phases
        {
            get => _phases ?? (_phases = new InputList<string>());
            set => _phases = value;
        }

        /// <summary>
        /// Apply options from the Polish feature of the Cloudflare Speed app.
        /// </summary>
        [Input("polish")]
        public Input<string>? Polish { get; set; }

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// Products to target with the actions. Available values: `bic`, `hot`, `ratelimit`, `securityLevel`, `uablock`, `waf`, `zonelockdown`.
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        /// <summary>
        /// Specifies a maximum timeout for reading content from an origin server.
        /// </summary>
        [Input("readTimeout")]
        public Input<int>? ReadTimeout { get; set; }

        [Input("requestFields")]
        private InputList<string>? _requestFields;

        /// <summary>
        /// List of request headers to include as part of custom fields logging, in lowercase.
        /// </summary>
        public InputList<string> RequestFields
        {
            get => _requestFields ?? (_requestFields = new InputList<string>());
            set => _requestFields = value;
        }

        /// <summary>
        /// Respect strong ETags.
        /// </summary>
        [Input("respectStrongEtags")]
        public Input<bool>? RespectStrongEtags { get; set; }

        [Input("responseFields")]
        private InputList<string>? _responseFields;

        /// <summary>
        /// List of response headers to include as part of custom fields logging, in lowercase.
        /// </summary>
        public InputList<string> ResponseFields
        {
            get => _responseFields ?? (_responseFields = new InputList<string>());
            set => _responseFields = value;
        }

        [Input("responses")]
        private InputList<Inputs.RulesetRuleActionParametersResponseArgs>? _responses;

        /// <summary>
        /// List of parameters that configure the response given to end users.
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParametersResponseArgs> Responses
        {
            get => _responses ?? (_responses = new InputList<Inputs.RulesetRuleActionParametersResponseArgs>());
            set => _responses = value;
        }

        /// <summary>
        /// Turn on or off Cloudflare Rocket Loader in the Cloudflare Speed app.
        /// </summary>
        [Input("rocketLoader")]
        public Input<bool>? RocketLoader { get; set; }

        [Input("rules")]
        private InputMap<string>? _rules;

        /// <summary>
        /// Map of managed WAF rule ID to comma-delimited string of ruleset rule IDs. Example: `rules = { "efb7b8c949ac4650a09736fc376e9aee" = "5de7edfa648c4d6891dc3e7f84534ffa,e3a567afc347477d9702d9047e97d760" }`.
        /// </summary>
        public InputMap<string> Rules
        {
            get => _rules ?? (_rules = new InputMap<string>());
            set => _rules = value;
        }

        /// <summary>
        /// Which ruleset ID to target.
        /// </summary>
        [Input("ruleset")]
        public Input<string>? Ruleset { get; set; }

        [Input("rulesets")]
        private InputList<string>? _rulesets;

        /// <summary>
        /// List of managed WAF rule IDs to target. Only valid when the `"action"` is set to skip.
        /// </summary>
        public InputList<string> Rulesets
        {
            get => _rulesets ?? (_rulesets = new InputList<string>());
            set => _rulesets = value;
        }

        /// <summary>
        /// Control options for the Security Level feature from the Security app.
        /// </summary>
        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        /// <summary>
        /// List of serve stale parameters to apply to the request.
        /// </summary>
        [Input("serveStale")]
        public Input<Inputs.RulesetRuleActionParametersServeStaleArgs>? ServeStale { get; set; }

        /// <summary>
        /// Turn on or off the Server Side Excludes feature of the Cloudflare Scrape Shield app.
        /// </summary>
        [Input("serverSideExcludes")]
        public Input<bool>? ServerSideExcludes { get; set; }

        /// <summary>
        /// List of properties to manange Server Name Indication.
        /// </summary>
        [Input("sni")]
        public Input<Inputs.RulesetRuleActionParametersSniArgs>? Sni { get; set; }

        /// <summary>
        /// Control options for the SSL feature of the Edge Certificates tab in the Cloudflare SSL/TLS app.
        /// </summary>
        [Input("ssl")]
        public Input<string>? Ssl { get; set; }

        /// <summary>
        /// HTTP status code of the custom error response.
        /// </summary>
        [Input("statusCode")]
        public Input<int>? StatusCode { get; set; }

        /// <summary>
        /// Turn on or off the SXG feature.
        /// </summary>
        [Input("sxg")]
        public Input<bool>? Sxg { get; set; }

        /// <summary>
        /// List of URI properties to configure for the ruleset rule when performing URL rewrite transformations.
        /// </summary>
        [Input("uri")]
        public Input<Inputs.RulesetRuleActionParametersUriArgs>? Uri { get; set; }

        /// <summary>
        /// Version of the ruleset to deploy.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public RulesetRuleActionParametersArgs()
        {
        }
        public static new RulesetRuleActionParametersArgs Empty => new RulesetRuleActionParametersArgs();
    }
}
