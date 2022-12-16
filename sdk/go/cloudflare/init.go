// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "cloudflare:index/accessApplication:AccessApplication":
		r = &AccessApplication{}
	case "cloudflare:index/accessBookmark:AccessBookmark":
		r = &AccessBookmark{}
	case "cloudflare:index/accessCaCertificate:AccessCaCertificate":
		r = &AccessCaCertificate{}
	case "cloudflare:index/accessGroup:AccessGroup":
		r = &AccessGroup{}
	case "cloudflare:index/accessIdentityProvider:AccessIdentityProvider":
		r = &AccessIdentityProvider{}
	case "cloudflare:index/accessKeysConfiguration:AccessKeysConfiguration":
		r = &AccessKeysConfiguration{}
	case "cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate":
		r = &AccessMutualTlsCertificate{}
	case "cloudflare:index/accessOrganization:AccessOrganization":
		r = &AccessOrganization{}
	case "cloudflare:index/accessPolicy:AccessPolicy":
		r = &AccessPolicy{}
	case "cloudflare:index/accessRule:AccessRule":
		r = &AccessRule{}
	case "cloudflare:index/accessServiceToken:AccessServiceToken":
		r = &AccessServiceToken{}
	case "cloudflare:index/account:Account":
		r = &Account{}
	case "cloudflare:index/accountMember:AccountMember":
		r = &AccountMember{}
	case "cloudflare:index/apiShield:ApiShield":
		r = &ApiShield{}
	case "cloudflare:index/apiToken:ApiToken":
		r = &ApiToken{}
	case "cloudflare:index/argo:Argo":
		r = &Argo{}
	case "cloudflare:index/argoTunnel:ArgoTunnel":
		r = &ArgoTunnel{}
	case "cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls":
		r = &AuthenticatedOriginPulls{}
	case "cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate":
		r = &AuthenticatedOriginPullsCertificate{}
	case "cloudflare:index/byoIpPrefix:ByoIpPrefix":
		r = &ByoIpPrefix{}
	case "cloudflare:index/certificatePack:CertificatePack":
		r = &CertificatePack{}
	case "cloudflare:index/customHostname:CustomHostname":
		r = &CustomHostname{}
	case "cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin":
		r = &CustomHostnameFallbackOrigin{}
	case "cloudflare:index/customPages:CustomPages":
		r = &CustomPages{}
	case "cloudflare:index/customSsl:CustomSsl":
		r = &CustomSsl{}
	case "cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates":
		r = &DevicePolicyCertificates{}
	case "cloudflare:index/devicePostureIntegration:DevicePostureIntegration":
		r = &DevicePostureIntegration{}
	case "cloudflare:index/devicePostureRule:DevicePostureRule":
		r = &DevicePostureRule{}
	case "cloudflare:index/deviceSettingsPolicy:DeviceSettingsPolicy":
		r = &DeviceSettingsPolicy{}
	case "cloudflare:index/dlpProfile:DlpProfile":
		r = &DlpProfile{}
	case "cloudflare:index/emailRoutingAddress:EmailRoutingAddress":
		r = &EmailRoutingAddress{}
	case "cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll":
		r = &EmailRoutingCatchAll{}
	case "cloudflare:index/emailRoutingRule:EmailRoutingRule":
		r = &EmailRoutingRule{}
	case "cloudflare:index/emailRoutingSettings:EmailRoutingSettings":
		r = &EmailRoutingSettings{}
	case "cloudflare:index/fallbackDomain:FallbackDomain":
		r = &FallbackDomain{}
	case "cloudflare:index/filter:Filter":
		r = &Filter{}
	case "cloudflare:index/firewallRule:FirewallRule":
		r = &FirewallRule{}
	case "cloudflare:index/greTunnel:GreTunnel":
		r = &GreTunnel{}
	case "cloudflare:index/healthcheck:Healthcheck":
		r = &Healthcheck{}
	case "cloudflare:index/ipList:IpList":
		r = &IpList{}
	case "cloudflare:index/ipsecTunnel:IpsecTunnel":
		r = &IpsecTunnel{}
	case "cloudflare:index/list:List":
		r = &List{}
	case "cloudflare:index/loadBalancer:LoadBalancer":
		r = &LoadBalancer{}
	case "cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor":
		r = &LoadBalancerMonitor{}
	case "cloudflare:index/loadBalancerPool:LoadBalancerPool":
		r = &LoadBalancerPool{}
	case "cloudflare:index/logpullRetention:LogpullRetention":
		r = &LogpullRetention{}
	case "cloudflare:index/logpushJob:LogpushJob":
		r = &LogpushJob{}
	case "cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge":
		r = &LogpushOwnershipChallenge{}
	case "cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset":
		r = &MagicFirewallRuleset{}
	case "cloudflare:index/managedHeaders:ManagedHeaders":
		r = &ManagedHeaders{}
	case "cloudflare:index/notificationPolicy:NotificationPolicy":
		r = &NotificationPolicy{}
	case "cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks":
		r = &NotificationPolicyWebhooks{}
	case "cloudflare:index/originCaCertificate:OriginCaCertificate":
		r = &OriginCaCertificate{}
	case "cloudflare:index/pageRule:PageRule":
		r = &PageRule{}
	case "cloudflare:index/pagesDomain:PagesDomain":
		r = &PagesDomain{}
	case "cloudflare:index/pagesProject:PagesProject":
		r = &PagesProject{}
	case "cloudflare:index/rateLimit:RateLimit":
		r = &RateLimit{}
	case "cloudflare:index/record:Record":
		r = &Record{}
	case "cloudflare:index/ruleset:Ruleset":
		r = &Ruleset{}
	case "cloudflare:index/spectrumApplication:SpectrumApplication":
		r = &SpectrumApplication{}
	case "cloudflare:index/splitTunnel:SplitTunnel":
		r = &SplitTunnel{}
	case "cloudflare:index/staticRoute:StaticRoute":
		r = &StaticRoute{}
	case "cloudflare:index/teamsAccount:TeamsAccount":
		r = &TeamsAccount{}
	case "cloudflare:index/teamsList:TeamsList":
		r = &TeamsList{}
	case "cloudflare:index/teamsLocation:TeamsLocation":
		r = &TeamsLocation{}
	case "cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint":
		r = &TeamsProxyEndpoint{}
	case "cloudflare:index/teamsRule:TeamsRule":
		r = &TeamsRule{}
	case "cloudflare:index/totalTls:TotalTls":
		r = &TotalTls{}
	case "cloudflare:index/tunnelConfig:TunnelConfig":
		r = &TunnelConfig{}
	case "cloudflare:index/tunnelRoute:TunnelRoute":
		r = &TunnelRoute{}
	case "cloudflare:index/tunnelVirtualNetwork:TunnelVirtualNetwork":
		r = &TunnelVirtualNetwork{}
	case "cloudflare:index/urlNormalizationSettings:UrlNormalizationSettings":
		r = &UrlNormalizationSettings{}
	case "cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule":
		r = &UserAgentBlockingRule{}
	case "cloudflare:index/wafGroup:WafGroup":
		r = &WafGroup{}
	case "cloudflare:index/wafOverride:WafOverride":
		r = &WafOverride{}
	case "cloudflare:index/wafPackage:WafPackage":
		r = &WafPackage{}
	case "cloudflare:index/wafRule:WafRule":
		r = &WafRule{}
	case "cloudflare:index/waitingRoom:WaitingRoom":
		r = &WaitingRoom{}
	case "cloudflare:index/waitingRoomEvent:WaitingRoomEvent":
		r = &WaitingRoomEvent{}
	case "cloudflare:index/waitingRoomRules:WaitingRoomRules":
		r = &WaitingRoomRules{}
	case "cloudflare:index/web3Hostname:Web3Hostname":
		r = &Web3Hostname{}
	case "cloudflare:index/workerCronTrigger:WorkerCronTrigger":
		r = &WorkerCronTrigger{}
	case "cloudflare:index/workerRoute:WorkerRoute":
		r = &WorkerRoute{}
	case "cloudflare:index/workerScript:WorkerScript":
		r = &WorkerScript{}
	case "cloudflare:index/workersKv:WorkersKv":
		r = &WorkersKv{}
	case "cloudflare:index/workersKvNamespace:WorkersKvNamespace":
		r = &WorkersKvNamespace{}
	case "cloudflare:index/zone:Zone":
		r = &Zone{}
	case "cloudflare:index/zoneCacheVariants:ZoneCacheVariants":
		r = &ZoneCacheVariants{}
	case "cloudflare:index/zoneDnssec:ZoneDnssec":
		r = &ZoneDnssec{}
	case "cloudflare:index/zoneLockdown:ZoneLockdown":
		r = &ZoneLockdown{}
	case "cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride":
		r = &ZoneSettingsOverride{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:cloudflare" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessBookmark",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessIdentityProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessKeysConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessMutualTlsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessOrganization",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accessServiceToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/accountMember",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiShield",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/apiToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/argo",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/argoTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPulls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/authenticatedOriginPullsCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/byoIpPrefix",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/certificatePack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customHostnameFallbackOrigin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customPages",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/customSsl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePolicyCertificates",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePostureIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/devicePostureRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/deviceSettingsPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/dlpProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingAddress",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingCatchAll",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/emailRoutingSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/fallbackDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/filter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/firewallRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/greTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/healthcheck",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ipList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ipsecTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/list",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancer",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/loadBalancerPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpullRetention",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpushJob",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/logpushOwnershipChallenge",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/magicFirewallRuleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/managedHeaders",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/notificationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/notificationPolicyWebhooks",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/originCaCertificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pageRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pagesDomain",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/pagesProject",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/rateLimit",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/record",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/ruleset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/spectrumApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/splitTunnel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/staticRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsList",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsLocation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsProxyEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/teamsRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/totalTls",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/tunnelVirtualNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/urlNormalizationSettings",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/userAgentBlockingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafOverride",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafPackage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/wafRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoom",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoomEvent",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/waitingRoomRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/web3Hostname",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerCronTrigger",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerRoute",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workerScript",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKv",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/workersKvNamespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zone",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneCacheVariants",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneDnssec",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneLockdown",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"cloudflare",
		"index/zoneSettingsOverride",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"cloudflare",
		&pkg{version},
	)
}
