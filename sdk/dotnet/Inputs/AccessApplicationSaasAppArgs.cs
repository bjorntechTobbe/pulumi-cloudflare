// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessApplicationSaasAppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The service provider's endpoint that is responsible for receiving and parsing a SAML assertion.
        /// </summary>
        [Input("consumerServiceUrl", required: true)]
        public Input<string> ConsumerServiceUrl { get; set; } = null!;

        [Input("customAttributes")]
        private InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs>? _customAttributes;

        /// <summary>
        /// Custom attribute mapped from IDPs.
        /// </summary>
        public InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs> CustomAttributes
        {
            get => _customAttributes ?? (_customAttributes = new InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs>());
            set => _customAttributes = value;
        }

        /// <summary>
        /// The relay state used if not provided by the identity provider.
        /// </summary>
        [Input("defaultRelayState")]
        public Input<string>? DefaultRelayState { get; set; }

        /// <summary>
        /// The unique identifier for the SaaS application.
        /// </summary>
        [Input("idpEntityId")]
        public Input<string>? IdpEntityId { get; set; }

        /// <summary>
        /// The format of the name identifier sent to the SaaS application. Defaults to `email`.
        /// </summary>
        [Input("nameIdFormat")]
        public Input<string>? NameIdFormat { get; set; }

        /// <summary>
        /// The public certificate that will be used to verify identities.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        /// <summary>
        /// A globally unique name for an identity or service provider.
        /// </summary>
        [Input("spEntityId", required: true)]
        public Input<string> SpEntityId { get; set; } = null!;

        /// <summary>
        /// The endpoint where the SaaS application will send login requests.
        /// </summary>
        [Input("ssoEndpoint")]
        public Input<string>? SsoEndpoint { get; set; }

        public AccessApplicationSaasAppArgs()
        {
        }
        public static new AccessApplicationSaasAppArgs Empty => new AccessApplicationSaasAppArgs();
    }
}
