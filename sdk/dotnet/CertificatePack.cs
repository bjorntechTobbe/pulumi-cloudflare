// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var dedicatedCustomExample = new Cloudflare.CertificatePack("dedicatedCustomExample", new Cloudflare.CertificatePackArgs
    ///         {
    ///             Hosts = 
    ///             {
    ///                 "example.com",
    ///                 "sub.example.com",
    ///             },
    ///             Type = "dedicated_custom",
    ///             ZoneId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///         });
    ///         // Advanced certificate manager for DigiCert
    ///         var advancedExampleForDigicert = new Cloudflare.CertificatePack("advancedExampleForDigicert", new Cloudflare.CertificatePackArgs
    ///         {
    ///             CertificateAuthority = "digicert",
    ///             CloudflareBranding = false,
    ///             Hosts = 
    ///             {
    ///                 "example.com",
    ///                 "sub.example.com",
    ///             },
    ///             Type = "advanced",
    ///             ValidationMethod = "txt",
    ///             ValidityDays = 30,
    ///             ZoneId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///         });
    ///         // Advanced certificate manager for Let's Encrypt
    ///         var advancedExampleForLetsEncrypt = new Cloudflare.CertificatePack("advancedExampleForLetsEncrypt", new Cloudflare.CertificatePackArgs
    ///         {
    ///             CertificateAuthority = "lets_encrypt",
    ///             CloudflareBranding = false,
    ///             Hosts = 
    ///             {
    ///                 "example.com",
    ///                 "*.example.com",
    ///             },
    ///             Type = "advanced",
    ///             ValidationMethod = "http",
    ///             ValidityDays = 90,
    ///             ZoneId = "1d5fdc9e88c8a8c4518b068cd94331fe",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Certificate packs can be imported using a composite ID of the zone ID and certificate pack ID. This isn't recommended and it is advised to replace the certificate entirely instead.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/certificatePack:CertificatePack example cb029e245cfdd66dc8d2e570d5dd3322/8fda82e2-6af9-4eb2-992a-5ab65b792ef1
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/certificatePack:CertificatePack")]
    public partial class CertificatePack : Pulumi.CustomResource
    {
        /// <summary>
        /// Which certificate
        /// authority to issue the certificate pack. Allowed values: `"digicert"`,
        /// `"lets_encrypt"`.
        /// </summary>
        [Output("certificateAuthority")]
        public Output<string> CertificateAuthority { get; private set; } = null!;

        /// <summary>
        /// Whether or not to include
        /// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
        /// if set to `true`.
        /// </summary>
        [Output("cloudflareBranding")]
        public Output<bool?> CloudflareBranding { get; private set; } = null!;

        /// <summary>
        /// List of hostnames to provision the certificate pack for.
        /// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
        /// wildcard for subdomain is available.
        /// </summary>
        [Output("hosts")]
        public Output<ImmutableArray<string>> Hosts { get; private set; } = null!;

        /// <summary>
        /// Certificate pack configuration type.
        /// Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("validationErrors")]
        public Output<ImmutableArray<Outputs.CertificatePackValidationError>> ValidationErrors { get; private set; } = null!;

        /// <summary>
        /// Which validation method to
        /// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        /// </summary>
        [Output("validationMethod")]
        public Output<string?> ValidationMethod { get; private set; } = null!;

        [Output("validationRecords")]
        public Output<ImmutableArray<Outputs.CertificatePackValidationRecord>> ValidationRecords { get; private set; } = null!;

        /// <summary>
        /// How long the certificate is valid
        /// for. Note: If using Let's Encrypt, this value can only be 90 days.
        /// Allowed values: 14, 30, 90, 365.
        /// </summary>
        [Output("validityDays")]
        public Output<int?> ValidityDays { get; private set; } = null!;

        /// <summary>
        /// The DNS zone to which the certificate pack should be added.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a CertificatePack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CertificatePack(string name, CertificatePackArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/certificatePack:CertificatePack", name, args ?? new CertificatePackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CertificatePack(string name, Input<string> id, CertificatePackState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/certificatePack:CertificatePack", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing CertificatePack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CertificatePack Get(string name, Input<string> id, CertificatePackState? state = null, CustomResourceOptions? options = null)
        {
            return new CertificatePack(name, id, state, options);
        }
    }

    public sealed class CertificatePackArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which certificate
        /// authority to issue the certificate pack. Allowed values: `"digicert"`,
        /// `"lets_encrypt"`.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// Whether or not to include
        /// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
        /// if set to `true`.
        /// </summary>
        [Input("cloudflareBranding")]
        public Input<bool>? CloudflareBranding { get; set; }

        [Input("hosts", required: true)]
        private InputList<string>? _hosts;

        /// <summary>
        /// List of hostnames to provision the certificate pack for.
        /// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
        /// wildcard for subdomain is available.
        /// </summary>
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Certificate pack configuration type.
        /// Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("validationErrors")]
        private InputList<Inputs.CertificatePackValidationErrorArgs>? _validationErrors;
        public InputList<Inputs.CertificatePackValidationErrorArgs> ValidationErrors
        {
            get => _validationErrors ?? (_validationErrors = new InputList<Inputs.CertificatePackValidationErrorArgs>());
            set => _validationErrors = value;
        }

        /// <summary>
        /// Which validation method to
        /// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        /// </summary>
        [Input("validationMethod")]
        public Input<string>? ValidationMethod { get; set; }

        [Input("validationRecords")]
        private InputList<Inputs.CertificatePackValidationRecordArgs>? _validationRecords;
        public InputList<Inputs.CertificatePackValidationRecordArgs> ValidationRecords
        {
            get => _validationRecords ?? (_validationRecords = new InputList<Inputs.CertificatePackValidationRecordArgs>());
            set => _validationRecords = value;
        }

        /// <summary>
        /// How long the certificate is valid
        /// for. Note: If using Let's Encrypt, this value can only be 90 days.
        /// Allowed values: 14, 30, 90, 365.
        /// </summary>
        [Input("validityDays")]
        public Input<int>? ValidityDays { get; set; }

        /// <summary>
        /// The DNS zone to which the certificate pack should be added.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public CertificatePackArgs()
        {
        }
    }

    public sealed class CertificatePackState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which certificate
        /// authority to issue the certificate pack. Allowed values: `"digicert"`,
        /// `"lets_encrypt"`.
        /// </summary>
        [Input("certificateAuthority")]
        public Input<string>? CertificateAuthority { get; set; }

        /// <summary>
        /// Whether or not to include
        /// Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name
        /// if set to `true`.
        /// </summary>
        [Input("cloudflareBranding")]
        public Input<bool>? CloudflareBranding { get; set; }

        [Input("hosts")]
        private InputList<string>? _hosts;

        /// <summary>
        /// List of hostnames to provision the certificate pack for.
        /// Note: If using Let's Encrypt, you cannot use individual subdomains and only a
        /// wildcard for subdomain is available.
        /// </summary>
        public InputList<string> Hosts
        {
            get => _hosts ?? (_hosts = new InputList<string>());
            set => _hosts = value;
        }

        /// <summary>
        /// Certificate pack configuration type.
        /// Allowed values: `"custom"`, `"dedicated_custom"`, `"advanced"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("validationErrors")]
        private InputList<Inputs.CertificatePackValidationErrorGetArgs>? _validationErrors;
        public InputList<Inputs.CertificatePackValidationErrorGetArgs> ValidationErrors
        {
            get => _validationErrors ?? (_validationErrors = new InputList<Inputs.CertificatePackValidationErrorGetArgs>());
            set => _validationErrors = value;
        }

        /// <summary>
        /// Which validation method to
        /// use in order to prove domain ownership. Allowed values: `"txt"`, `"http"`, `"email"`.
        /// </summary>
        [Input("validationMethod")]
        public Input<string>? ValidationMethod { get; set; }

        [Input("validationRecords")]
        private InputList<Inputs.CertificatePackValidationRecordGetArgs>? _validationRecords;
        public InputList<Inputs.CertificatePackValidationRecordGetArgs> ValidationRecords
        {
            get => _validationRecords ?? (_validationRecords = new InputList<Inputs.CertificatePackValidationRecordGetArgs>());
            set => _validationRecords = value;
        }

        /// <summary>
        /// How long the certificate is valid
        /// for. Note: If using Let's Encrypt, this value can only be 90 days.
        /// Allowed values: 14, 30, 90, 365.
        /// </summary>
        [Input("validityDays")]
        public Input<int>? ValidityDays { get; set; }

        /// <summary>
        /// The DNS zone to which the certificate pack should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public CertificatePackState()
        {
        }
    }
}
