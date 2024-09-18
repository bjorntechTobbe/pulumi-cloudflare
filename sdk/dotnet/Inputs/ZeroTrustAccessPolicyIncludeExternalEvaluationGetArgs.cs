// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyIncludeExternalEvaluationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API endpoint containing your business logic.
        /// </summary>
        [Input("evaluateUrl")]
        public Input<string>? EvaluateUrl { get; set; }

        /// <summary>
        /// The API endpoint containing the key that Access uses to verify that the response came from your API.
        /// </summary>
        [Input("keysUrl")]
        public Input<string>? KeysUrl { get; set; }

        public ZeroTrustAccessPolicyIncludeExternalEvaluationGetArgs()
        {
        }
        public static new ZeroTrustAccessPolicyIncludeExternalEvaluationGetArgs Empty => new ZeroTrustAccessPolicyIncludeExternalEvaluationGetArgs();
    }
}
