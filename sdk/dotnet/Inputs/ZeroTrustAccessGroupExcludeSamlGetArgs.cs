// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessGroupExcludeSamlGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the SAML attribute.
        /// </summary>
        [Input("attributeName")]
        public Input<string>? AttributeName { get; set; }

        /// <summary>
        /// The SAML attribute value to look for.
        /// </summary>
        [Input("attributeValue")]
        public Input<string>? AttributeValue { get; set; }

        /// <summary>
        /// The ID of your SAML identity provider.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        public ZeroTrustAccessGroupExcludeSamlGetArgs()
        {
        }
        public static new ZeroTrustAccessGroupExcludeSamlGetArgs Empty => new ZeroTrustAccessGroupExcludeSamlGetArgs();
    }
}
