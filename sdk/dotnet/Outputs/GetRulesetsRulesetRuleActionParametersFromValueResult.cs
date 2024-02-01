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
    public sealed class GetRulesetsRulesetRuleActionParametersFromValueResult
    {
        /// <summary>
        /// Preserve query string for redirect URL.
        /// </summary>
        public readonly bool? PreserveQueryString;
        /// <summary>
        /// Status code for redirect.
        /// </summary>
        public readonly int? StatusCode;
        /// <summary>
        /// Target URL for redirect.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersFromValueTargetUrlResult? TargetUrl;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersFromValueResult(
            bool? preserveQueryString,

            int? statusCode,

            Outputs.GetRulesetsRulesetRuleActionParametersFromValueTargetUrlResult? targetUrl)
        {
            PreserveQueryString = preserveQueryString;
            StatusCode = statusCode;
            TargetUrl = targetUrl;
        }
    }
}
