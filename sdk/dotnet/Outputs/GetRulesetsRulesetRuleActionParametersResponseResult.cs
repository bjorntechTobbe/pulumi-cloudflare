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
    public sealed class GetRulesetsRulesetRuleActionParametersResponseResult
    {
        /// <summary>
        /// Body content to include in the response.
        /// </summary>
        public readonly string? Content;
        /// <summary>
        /// HTTP content type to send in the response.
        /// </summary>
        public readonly string? ContentType;
        /// <summary>
        /// HTTP status code to send in the response.
        /// </summary>
        public readonly int? StatusCode;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersResponseResult(
            string? content,

            string? contentType,

            int? statusCode)
        {
            Content = content;
            ContentType = contentType;
            StatusCode = statusCode;
        }
    }
}
