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
    /// Provides a Cloudflare Tunnel configuration resource.
    /// 
    /// !&gt; When you delete a tunnel configuration, the tunnel will be deleted. You need to make sure that the tunnel is not in use before deleting the configuration.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleTunnel = new Cloudflare.ArgoTunnel("exampleTunnel", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "example_tunnel",
    ///         Secret = "&lt;32 character secret&gt;",
    ///     });
    /// 
    ///     var exampleConfig = new Cloudflare.TunnelConfig("exampleConfig", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         TunnelId = exampleTunnel.Id,
    ///         Config = new Cloudflare.Inputs.TunnelConfigConfigArgs
    ///         {
    ///             WarpRouting = new Cloudflare.Inputs.TunnelConfigConfigWarpRoutingArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///             OriginRequest = new Cloudflare.Inputs.TunnelConfigConfigOriginRequestArgs
    ///             {
    ///                 ConnectTimeout = "1m0s",
    ///                 TlsTimeout = "1m0s",
    ///                 TcpKeepAlive = "1m0s",
    ///                 NoHappyEyeballs = false,
    ///                 KeepAliveConnections = 1024,
    ///                 KeepAliveTimeout = "1m0s",
    ///                 HttpHostHeader = "baz",
    ///                 OriginServerName = "foobar",
    ///                 CaPool = "/path/to/unsigned/ca/pool",
    ///                 NoTlsVerify = false,
    ///                 DisableChunkedEncoding = false,
    ///                 BastionMode = false,
    ///                 ProxyAddress = "10.0.0.1",
    ///                 ProxyPort = 8123,
    ///                 ProxyType = "socks",
    ///                 IpRules = new[]
    ///                 {
    ///                     new Cloudflare.Inputs.TunnelConfigConfigOriginRequestIpRuleArgs
    ///                     {
    ///                         Prefix = "/web",
    ///                         Ports = new[]
    ///                         {
    ///                             80,
    ///                             443,
    ///                         },
    ///                         Allow = false,
    ///                     },
    ///                 },
    ///             },
    ///             IngressRules = new[]
    ///             {
    ///                 new Cloudflare.Inputs.TunnelConfigConfigIngressRuleArgs
    ///                 {
    ///                     Hostname = "foo",
    ///                     Path = "/bar",
    ///                     Service = "http://10.0.0.2:8080",
    ///                 },
    ///                 new Cloudflare.Inputs.TunnelConfigConfigIngressRuleArgs
    ///                 {
    ///                     Service = "https://10.0.0.3:8081",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/tunnelConfig:TunnelConfig")]
    public partial class TunnelConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Configuration block for Tunnel Configuration.
        /// </summary>
        [Output("config")]
        public Output<Outputs.TunnelConfigConfig> Config { get; private set; } = null!;

        /// <summary>
        /// Identifier of the Tunnel to target for this configuration.
        /// </summary>
        [Output("tunnelId")]
        public Output<string> TunnelId { get; private set; } = null!;


        /// <summary>
        /// Create a TunnelConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TunnelConfig(string name, TunnelConfigArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnelConfig:TunnelConfig", name, args ?? new TunnelConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TunnelConfig(string name, Input<string> id, TunnelConfigState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnelConfig:TunnelConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TunnelConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TunnelConfig Get(string name, Input<string> id, TunnelConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new TunnelConfig(name, id, state, options);
        }
    }

    public sealed class TunnelConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Configuration block for Tunnel Configuration.
        /// </summary>
        [Input("config", required: true)]
        public Input<Inputs.TunnelConfigConfigArgs> Config { get; set; } = null!;

        /// <summary>
        /// Identifier of the Tunnel to target for this configuration.
        /// </summary>
        [Input("tunnelId", required: true)]
        public Input<string> TunnelId { get; set; } = null!;

        public TunnelConfigArgs()
        {
        }
        public static new TunnelConfigArgs Empty => new TunnelConfigArgs();
    }

    public sealed class TunnelConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Configuration block for Tunnel Configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.TunnelConfigConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// Identifier of the Tunnel to target for this configuration.
        /// </summary>
        [Input("tunnelId")]
        public Input<string>? TunnelId { get; set; }

        public TunnelConfigState()
        {
        }
        public static new TunnelConfigState Empty => new TunnelConfigState();
    }
}
