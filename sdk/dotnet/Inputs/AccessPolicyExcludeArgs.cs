// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyExcludeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Matches any valid Access service token.
        /// </summary>
        [Input("anyValidServiceToken")]
        public Input<bool>? AnyValidServiceToken { get; set; }

        [Input("authContexts")]
        private InputList<Inputs.AccessPolicyExcludeAuthContextArgs>? _authContexts;
        public InputList<Inputs.AccessPolicyExcludeAuthContextArgs> AuthContexts
        {
            get => _authContexts ?? (_authContexts = new InputList<Inputs.AccessPolicyExcludeAuthContextArgs>());
            set => _authContexts = value;
        }

        /// <summary>
        /// The type of authentication method. Refer to https://datatracker.ietf.org/doc/html/rfc8176#section-2 for possible types.
        /// </summary>
        [Input("authMethod")]
        public Input<string>? AuthMethod { get; set; }

        [Input("azures")]
        private InputList<Inputs.AccessPolicyExcludeAzureArgs>? _azures;

        /// <summary>
        /// Matches an Azure group. Requires an Azure identity provider.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeAzureArgs> Azures
        {
            get => _azures ?? (_azures = new InputList<Inputs.AccessPolicyExcludeAzureArgs>());
            set => _azures = value;
        }

        /// <summary>
        /// Matches any valid client certificate.
        /// </summary>
        [Input("certificate")]
        public Input<bool>? Certificate { get; set; }

        /// <summary>
        /// Matches a valid client certificate common name.
        /// </summary>
        [Input("commonName")]
        public Input<string>? CommonName { get; set; }

        [Input("commonNames")]
        private InputList<string>? _commonNames;

        /// <summary>
        /// Overflow field if you need to have multiple common*name rules in a single policy.  Use in place of the singular common*name field.
        /// </summary>
        public InputList<string> CommonNames
        {
            get => _commonNames ?? (_commonNames = new InputList<string>());
            set => _commonNames = value;
        }

        [Input("devicePostures")]
        private InputList<string>? _devicePostures;

        /// <summary>
        /// The ID of a device posture integration.
        /// </summary>
        public InputList<string> DevicePostures
        {
            get => _devicePostures ?? (_devicePostures = new InputList<string>());
            set => _devicePostures = value;
        }

        [Input("emailDomains")]
        private InputList<string>? _emailDomains;

        /// <summary>
        /// The email domain to match.
        /// </summary>
        public InputList<string> EmailDomains
        {
            get => _emailDomains ?? (_emailDomains = new InputList<string>());
            set => _emailDomains = value;
        }

        [Input("emailLists")]
        private InputList<string>? _emailLists;

        /// <summary>
        /// The ID of a previously created email list.
        /// </summary>
        public InputList<string> EmailLists
        {
            get => _emailLists ?? (_emailLists = new InputList<string>());
            set => _emailLists = value;
        }

        [Input("emails")]
        private InputList<string>? _emails;

        /// <summary>
        /// The email of the user.
        /// </summary>
        public InputList<string> Emails
        {
            get => _emails ?? (_emails = new InputList<string>());
            set => _emails = value;
        }

        /// <summary>
        /// Matches everyone.
        /// </summary>
        [Input("everyone")]
        public Input<bool>? Everyone { get; set; }

        /// <summary>
        /// Create Allow or Block policies which evaluate the user based on custom criteria. https://developers.cloudflare.com/cloudflare-one/policies/access/external-evaluation/.
        /// </summary>
        [Input("externalEvaluation")]
        public Input<Inputs.AccessPolicyExcludeExternalEvaluationArgs>? ExternalEvaluation { get; set; }

        [Input("geos")]
        private InputList<string>? _geos;

        /// <summary>
        /// Matches a specific country.
        /// </summary>
        public InputList<string> Geos
        {
            get => _geos ?? (_geos = new InputList<string>());
            set => _geos = value;
        }

        [Input("githubs")]
        private InputList<Inputs.AccessPolicyExcludeGithubArgs>? _githubs;

        /// <summary>
        /// Matches a Github organization. Requires a Github identity provider.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeGithubArgs> Githubs
        {
            get => _githubs ?? (_githubs = new InputList<Inputs.AccessPolicyExcludeGithubArgs>());
            set => _githubs = value;
        }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// The ID of a previously created Access group.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("gsuites")]
        private InputList<Inputs.AccessPolicyExcludeGsuiteArgs>? _gsuites;

        /// <summary>
        /// Matches a group in Google Workspace. Requires a Google Workspace identity provider.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeGsuiteArgs> Gsuites
        {
            get => _gsuites ?? (_gsuites = new InputList<Inputs.AccessPolicyExcludeGsuiteArgs>());
            set => _gsuites = value;
        }

        [Input("ipLists")]
        private InputList<string>? _ipLists;

        /// <summary>
        /// The ID of a previously created IP list.
        /// </summary>
        public InputList<string> IpLists
        {
            get => _ipLists ?? (_ipLists = new InputList<string>());
            set => _ipLists = value;
        }

        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// An IPv4 or IPv6 CIDR block.
        /// </summary>
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        [Input("loginMethods")]
        private InputList<string>? _loginMethods;

        /// <summary>
        /// The ID of a configured identity provider.
        /// </summary>
        public InputList<string> LoginMethods
        {
            get => _loginMethods ?? (_loginMethods = new InputList<string>());
            set => _loginMethods = value;
        }

        [Input("oktas")]
        private InputList<Inputs.AccessPolicyExcludeOktaArgs>? _oktas;

        /// <summary>
        /// Matches an Okta group. Requires an Okta identity provider.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeOktaArgs> Oktas
        {
            get => _oktas ?? (_oktas = new InputList<Inputs.AccessPolicyExcludeOktaArgs>());
            set => _oktas = value;
        }

        [Input("samls")]
        private InputList<Inputs.AccessPolicyExcludeSamlArgs>? _samls;

        /// <summary>
        /// Matches a SAML group. Requires a SAML identity provider.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeSamlArgs> Samls
        {
            get => _samls ?? (_samls = new InputList<Inputs.AccessPolicyExcludeSamlArgs>());
            set => _samls = value;
        }

        [Input("serviceTokens")]
        private InputList<string>? _serviceTokens;

        /// <summary>
        /// The ID of an Access service token.
        /// </summary>
        public InputList<string> ServiceTokens
        {
            get => _serviceTokens ?? (_serviceTokens = new InputList<string>());
            set => _serviceTokens = value;
        }

        public AccessPolicyExcludeArgs()
        {
        }
        public static new AccessPolicyExcludeArgs Empty => new AccessPolicyExcludeArgs();
    }
}
