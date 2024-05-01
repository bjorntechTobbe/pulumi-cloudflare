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
    /// Provides a Cloudflare Teams Account resource. The Teams Account
    /// resource defines configuration for secure web gateway.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.TeamsAccount("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         TlsDecryptEnabled = true,
    ///         ProtocolDetectionEnabled = true,
    ///         BlockPage = new Cloudflare.Inputs.TeamsAccountBlockPageArgs
    ///         {
    ///             FooterText = "hello",
    ///             HeaderText = "hello",
    ///             LogoPath = "https://example.com/logo.jpg",
    ///             BackgroundColor = "#000000",
    ///         },
    ///         BodyScanning = new Cloudflare.Inputs.TeamsAccountBodyScanningArgs
    ///         {
    ///             InspectionMode = "deep",
    ///         },
    ///         Antivirus = new Cloudflare.Inputs.TeamsAccountAntivirusArgs
    ///         {
    ///             EnabledDownloadPhase = true,
    ///             EnabledUploadPhase = false,
    ///             FailClosed = true,
    ///             NotificationSettings = new Cloudflare.Inputs.TeamsAccountAntivirusNotificationSettingsArgs
    ///             {
    ///                 Enabled = true,
    ///                 Message = "you are blocked",
    ///                 SupportUrl = "https://example.com/blocked",
    ///             },
    ///         },
    ///         Fips = new Cloudflare.Inputs.TeamsAccountFipsArgs
    ///         {
    ///             Tls = true,
    ///         },
    ///         Proxy = new Cloudflare.Inputs.TeamsAccountProxyArgs
    ///         {
    ///             Tcp = true,
    ///             Udp = true,
    ///             RootCa = true,
    ///         },
    ///         UrlBrowserIsolationEnabled = true,
    ///         Logging = new Cloudflare.Inputs.TeamsAccountLoggingArgs
    ///         {
    ///             RedactPii = true,
    ///             SettingsByRuleType = new Cloudflare.Inputs.TeamsAccountLoggingSettingsByRuleTypeArgs
    ///             {
    ///                 Dns = new Cloudflare.Inputs.TeamsAccountLoggingSettingsByRuleTypeDnsArgs
    ///                 {
    ///                     LogAll = false,
    ///                     LogBlocks = true,
    ///                 },
    ///                 Http = new Cloudflare.Inputs.TeamsAccountLoggingSettingsByRuleTypeHttpArgs
    ///                 {
    ///                     LogAll = true,
    ///                     LogBlocks = true,
    ///                 },
    ///                 L4 = new Cloudflare.Inputs.TeamsAccountLoggingSettingsByRuleTypeL4Args
    ///                 {
    ///                     LogAll = false,
    ///                     LogBlocks = true,
    ///                 },
    ///             },
    ///         },
    ///         ExtendedEmailMatching = new Cloudflare.Inputs.TeamsAccountExtendedEmailMatchingArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/teamsAccount:TeamsAccount example &lt;account_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/teamsAccount:TeamsAccount")]
    public partial class TeamsAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether to enable the activity log.
        /// </summary>
        [Output("activityLogEnabled")]
        public Output<bool?> ActivityLogEnabled { get; private set; } = null!;

        /// <summary>
        /// Configuration block for antivirus traffic scanning.
        /// </summary>
        [Output("antivirus")]
        public Output<Outputs.TeamsAccountAntivirus?> Antivirus { get; private set; } = null!;

        /// <summary>
        /// Configuration for a custom block page.
        /// </summary>
        [Output("blockPage")]
        public Output<Outputs.TeamsAccountBlockPage?> BlockPage { get; private set; } = null!;

        /// <summary>
        /// Configuration for body scanning.
        /// </summary>
        [Output("bodyScanning")]
        public Output<Outputs.TeamsAccountBodyScanning?> BodyScanning { get; private set; } = null!;

        /// <summary>
        /// Configuration for custom certificates / BYO-PKI.
        /// </summary>
        [Output("customCertificate")]
        public Output<Outputs.TeamsAccountCustomCertificate?> CustomCertificate { get; private set; } = null!;

        /// <summary>
        /// Configuration for extended e-mail matching.
        /// </summary>
        [Output("extendedEmailMatching")]
        public Output<Outputs.TeamsAccountExtendedEmailMatching> ExtendedEmailMatching { get; private set; } = null!;

        /// <summary>
        /// Configure compliance with Federal Information Processing Standards.
        /// </summary>
        [Output("fips")]
        public Output<Outputs.TeamsAccountFips?> Fips { get; private set; } = null!;

        [Output("logging")]
        public Output<Outputs.TeamsAccountLogging?> Logging { get; private set; } = null!;

        /// <summary>
        /// Enable non-identity onramp for Browser Isolation. Defaults to `false`.
        /// </summary>
        [Output("nonIdentityBrowserIsolationEnabled")]
        public Output<bool?> NonIdentityBrowserIsolationEnabled { get; private set; } = null!;

        /// <summary>
        /// Configuration for DLP Payload Logging.
        /// </summary>
        [Output("payloadLog")]
        public Output<Outputs.TeamsAccountPayloadLog?> PayloadLog { get; private set; } = null!;

        /// <summary>
        /// Indicator that protocol detection is enabled.
        /// </summary>
        [Output("protocolDetectionEnabled")]
        public Output<bool?> ProtocolDetectionEnabled { get; private set; } = null!;

        /// <summary>
        /// Configuration block for specifying which protocols are proxied.
        /// </summary>
        [Output("proxy")]
        public Output<Outputs.TeamsAccountProxy?> Proxy { get; private set; } = null!;

        /// <summary>
        /// Configuration for SSH Session Logging.
        /// </summary>
        [Output("sshSessionLog")]
        public Output<Outputs.TeamsAccountSshSessionLog?> SshSessionLog { get; private set; } = null!;

        /// <summary>
        /// Indicator that decryption of TLS traffic is enabled.
        /// </summary>
        [Output("tlsDecryptEnabled")]
        public Output<bool?> TlsDecryptEnabled { get; private set; } = null!;

        /// <summary>
        /// Safely browse websites in Browser Isolation through a URL. Defaults to `false`.
        /// </summary>
        [Output("urlBrowserIsolationEnabled")]
        public Output<bool?> UrlBrowserIsolationEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a TeamsAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamsAccount(string name, TeamsAccountArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsAccount:TeamsAccount", name, args ?? new TeamsAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamsAccount(string name, Input<string> id, TeamsAccountState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsAccount:TeamsAccount", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TeamsAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamsAccount Get(string name, Input<string> id, TeamsAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamsAccount(name, id, state, options);
        }
    }

    public sealed class TeamsAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether to enable the activity log.
        /// </summary>
        [Input("activityLogEnabled")]
        public Input<bool>? ActivityLogEnabled { get; set; }

        /// <summary>
        /// Configuration block for antivirus traffic scanning.
        /// </summary>
        [Input("antivirus")]
        public Input<Inputs.TeamsAccountAntivirusArgs>? Antivirus { get; set; }

        /// <summary>
        /// Configuration for a custom block page.
        /// </summary>
        [Input("blockPage")]
        public Input<Inputs.TeamsAccountBlockPageArgs>? BlockPage { get; set; }

        /// <summary>
        /// Configuration for body scanning.
        /// </summary>
        [Input("bodyScanning")]
        public Input<Inputs.TeamsAccountBodyScanningArgs>? BodyScanning { get; set; }

        /// <summary>
        /// Configuration for custom certificates / BYO-PKI.
        /// </summary>
        [Input("customCertificate")]
        public Input<Inputs.TeamsAccountCustomCertificateArgs>? CustomCertificate { get; set; }

        /// <summary>
        /// Configuration for extended e-mail matching.
        /// </summary>
        [Input("extendedEmailMatching")]
        public Input<Inputs.TeamsAccountExtendedEmailMatchingArgs>? ExtendedEmailMatching { get; set; }

        /// <summary>
        /// Configure compliance with Federal Information Processing Standards.
        /// </summary>
        [Input("fips")]
        public Input<Inputs.TeamsAccountFipsArgs>? Fips { get; set; }

        [Input("logging")]
        public Input<Inputs.TeamsAccountLoggingArgs>? Logging { get; set; }

        /// <summary>
        /// Enable non-identity onramp for Browser Isolation. Defaults to `false`.
        /// </summary>
        [Input("nonIdentityBrowserIsolationEnabled")]
        public Input<bool>? NonIdentityBrowserIsolationEnabled { get; set; }

        /// <summary>
        /// Configuration for DLP Payload Logging.
        /// </summary>
        [Input("payloadLog")]
        public Input<Inputs.TeamsAccountPayloadLogArgs>? PayloadLog { get; set; }

        /// <summary>
        /// Indicator that protocol detection is enabled.
        /// </summary>
        [Input("protocolDetectionEnabled")]
        public Input<bool>? ProtocolDetectionEnabled { get; set; }

        /// <summary>
        /// Configuration block for specifying which protocols are proxied.
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.TeamsAccountProxyArgs>? Proxy { get; set; }

        /// <summary>
        /// Configuration for SSH Session Logging.
        /// </summary>
        [Input("sshSessionLog")]
        public Input<Inputs.TeamsAccountSshSessionLogArgs>? SshSessionLog { get; set; }

        /// <summary>
        /// Indicator that decryption of TLS traffic is enabled.
        /// </summary>
        [Input("tlsDecryptEnabled")]
        public Input<bool>? TlsDecryptEnabled { get; set; }

        /// <summary>
        /// Safely browse websites in Browser Isolation through a URL. Defaults to `false`.
        /// </summary>
        [Input("urlBrowserIsolationEnabled")]
        public Input<bool>? UrlBrowserIsolationEnabled { get; set; }

        public TeamsAccountArgs()
        {
        }
        public static new TeamsAccountArgs Empty => new TeamsAccountArgs();
    }

    public sealed class TeamsAccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether to enable the activity log.
        /// </summary>
        [Input("activityLogEnabled")]
        public Input<bool>? ActivityLogEnabled { get; set; }

        /// <summary>
        /// Configuration block for antivirus traffic scanning.
        /// </summary>
        [Input("antivirus")]
        public Input<Inputs.TeamsAccountAntivirusGetArgs>? Antivirus { get; set; }

        /// <summary>
        /// Configuration for a custom block page.
        /// </summary>
        [Input("blockPage")]
        public Input<Inputs.TeamsAccountBlockPageGetArgs>? BlockPage { get; set; }

        /// <summary>
        /// Configuration for body scanning.
        /// </summary>
        [Input("bodyScanning")]
        public Input<Inputs.TeamsAccountBodyScanningGetArgs>? BodyScanning { get; set; }

        /// <summary>
        /// Configuration for custom certificates / BYO-PKI.
        /// </summary>
        [Input("customCertificate")]
        public Input<Inputs.TeamsAccountCustomCertificateGetArgs>? CustomCertificate { get; set; }

        /// <summary>
        /// Configuration for extended e-mail matching.
        /// </summary>
        [Input("extendedEmailMatching")]
        public Input<Inputs.TeamsAccountExtendedEmailMatchingGetArgs>? ExtendedEmailMatching { get; set; }

        /// <summary>
        /// Configure compliance with Federal Information Processing Standards.
        /// </summary>
        [Input("fips")]
        public Input<Inputs.TeamsAccountFipsGetArgs>? Fips { get; set; }

        [Input("logging")]
        public Input<Inputs.TeamsAccountLoggingGetArgs>? Logging { get; set; }

        /// <summary>
        /// Enable non-identity onramp for Browser Isolation. Defaults to `false`.
        /// </summary>
        [Input("nonIdentityBrowserIsolationEnabled")]
        public Input<bool>? NonIdentityBrowserIsolationEnabled { get; set; }

        /// <summary>
        /// Configuration for DLP Payload Logging.
        /// </summary>
        [Input("payloadLog")]
        public Input<Inputs.TeamsAccountPayloadLogGetArgs>? PayloadLog { get; set; }

        /// <summary>
        /// Indicator that protocol detection is enabled.
        /// </summary>
        [Input("protocolDetectionEnabled")]
        public Input<bool>? ProtocolDetectionEnabled { get; set; }

        /// <summary>
        /// Configuration block for specifying which protocols are proxied.
        /// </summary>
        [Input("proxy")]
        public Input<Inputs.TeamsAccountProxyGetArgs>? Proxy { get; set; }

        /// <summary>
        /// Configuration for SSH Session Logging.
        /// </summary>
        [Input("sshSessionLog")]
        public Input<Inputs.TeamsAccountSshSessionLogGetArgs>? SshSessionLog { get; set; }

        /// <summary>
        /// Indicator that decryption of TLS traffic is enabled.
        /// </summary>
        [Input("tlsDecryptEnabled")]
        public Input<bool>? TlsDecryptEnabled { get; set; }

        /// <summary>
        /// Safely browse websites in Browser Isolation through a URL. Defaults to `false`.
        /// </summary>
        [Input("urlBrowserIsolationEnabled")]
        public Input<bool>? UrlBrowserIsolationEnabled { get; set; }

        public TeamsAccountState()
        {
        }
        public static new TeamsAccountState Empty => new TeamsAccountState();
    }
}
