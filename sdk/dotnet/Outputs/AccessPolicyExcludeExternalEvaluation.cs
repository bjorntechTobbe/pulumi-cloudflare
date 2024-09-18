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
    public sealed class AccessPolicyExcludeExternalEvaluation
    {
        /// <summary>
        /// The API endpoint containing your business logic.
        /// </summary>
        public readonly string? EvaluateUrl;
        /// <summary>
        /// The API endpoint containing the key that Access uses to verify that the response came from your API.
        /// </summary>
        public readonly string? KeysUrl;

        [OutputConstructor]
        private AccessPolicyExcludeExternalEvaluation(
            string? evaluateUrl,

            string? keysUrl)
        {
            EvaluateUrl = evaluateUrl;
            KeysUrl = keysUrl;
        }
    }
}
