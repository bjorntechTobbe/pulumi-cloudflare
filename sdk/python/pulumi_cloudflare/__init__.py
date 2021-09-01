# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .access_application import *
from .access_ca_certificate import *
from .access_group import *
from .access_identity_provider import *
from .access_mutual_tls_certificate import *
from .access_policy import *
from .access_rule import *
from .access_service_token import *
from .account_member import *
from .api_token import *
from .argo import *
from .argo_tunnel import *
from .authenticated_origin_pulls import *
from .authenticated_origin_pulls_certificate import *
from .byo_ip_prefix import *
from .certificate_pack import *
from .custom_hostname import *
from .custom_hostname_fallback_origin import *
from .custom_pages import *
from .custom_ssl import *
from .device_posture_rule import *
from .filter import *
from .firewall_rule import *
from .get_api_token_permission_groups import *
from .get_ip_ranges import *
from .get_origin_ca_root_certificate import *
from .get_waf_groups import *
from .get_waf_packages import *
from .get_waf_rules import *
from .get_zone_dnssec import *
from .get_zones import *
from .healthcheck import *
from .ip_list import *
from .load_balancer import *
from .load_balancer_monitor import *
from .load_balancer_pool import *
from .log_push_ownership_challenge import *
from .logpull_retention import *
from .logpush_job import *
from .magic_firewall_ruleset import *
from .notification_policy import *
from .notification_policy_webhooks import *
from .origin_ca_certificate import *
from .page_rule import *
from .provider import *
from .rate_limit import *
from .record import *
from .ruleset import *
from .spectrum_application import *
from .static_route import *
from .teams_list import *
from .teams_location import *
from .waf_group import *
from .waf_override import *
from .waf_package import *
from .waf_rule import *
from .waiting_room import *
from .worker_cron_trigger import *
from .worker_route import *
from .worker_script import *
from .workers_kv import *
from .workers_kv_namespace import *
from .zone import *
from .zone_dnssec import *
from .zone_lockdown import *
from .zone_settings_override import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_cloudflare.config as config
else:
    config = _utilities.lazy_import('pulumi_cloudflare.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "cloudflare",
  "mod": "index/accessApplication",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessApplication:AccessApplication": "AccessApplication"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessCaCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessCaCertificate:AccessCaCertificate": "AccessCaCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessGroup",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessGroup:AccessGroup": "AccessGroup"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessIdentityProvider",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessIdentityProvider:AccessIdentityProvider": "AccessIdentityProvider"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessMutualTlsCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate": "AccessMutualTlsCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessPolicy",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessPolicy:AccessPolicy": "AccessPolicy"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessRule:AccessRule": "AccessRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accessServiceToken",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accessServiceToken:AccessServiceToken": "AccessServiceToken"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/accountMember",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/accountMember:AccountMember": "AccountMember"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/apiToken",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/apiToken:ApiToken": "ApiToken"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/argo",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/argo:Argo": "Argo"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/argoTunnel",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/argoTunnel:ArgoTunnel": "ArgoTunnel"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/authenticatedOriginPulls",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls": "AuthenticatedOriginPulls"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/authenticatedOriginPullsCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate": "AuthenticatedOriginPullsCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/byoIpPrefix",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/byoIpPrefix:ByoIpPrefix": "ByoIpPrefix"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/certificatePack",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/certificatePack:CertificatePack": "CertificatePack"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customHostname",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customHostname:CustomHostname": "CustomHostname"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customHostnameFallbackOrigin",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customHostnameFallbackOrigin:CustomHostnameFallbackOrigin": "CustomHostnameFallbackOrigin"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customPages",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customPages:CustomPages": "CustomPages"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/customSsl",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/customSsl:CustomSsl": "CustomSsl"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/devicePostureRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/devicePostureRule:DevicePostureRule": "DevicePostureRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/filter",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/filter:Filter": "Filter"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/firewallRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/firewallRule:FirewallRule": "FirewallRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/healthcheck",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/healthcheck:Healthcheck": "Healthcheck"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/ipList",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/ipList:IpList": "IpList"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancer",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancer:LoadBalancer": "LoadBalancer"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancerMonitor",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor": "LoadBalancerMonitor"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/loadBalancerPool",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/loadBalancerPool:LoadBalancerPool": "LoadBalancerPool"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logPushOwnershipChallenge",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logPushOwnershipChallenge:LogPushOwnershipChallenge": "LogPushOwnershipChallenge"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logpullRetention",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logpullRetention:LogpullRetention": "LogpullRetention"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/logpushJob",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/logpushJob:LogpushJob": "LogpushJob"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/magicFirewallRuleset",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/magicFirewallRuleset:MagicFirewallRuleset": "MagicFirewallRuleset"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/notificationPolicy",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/notificationPolicy:NotificationPolicy": "NotificationPolicy"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/notificationPolicyWebhooks",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks": "NotificationPolicyWebhooks"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/originCaCertificate",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/originCaCertificate:OriginCaCertificate": "OriginCaCertificate"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/pageRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/pageRule:PageRule": "PageRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/rateLimit",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/rateLimit:RateLimit": "RateLimit"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/record",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/record:Record": "Record"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/ruleset",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/ruleset:Ruleset": "Ruleset"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/spectrumApplication",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/spectrumApplication:SpectrumApplication": "SpectrumApplication"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/staticRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/staticRoute:StaticRoute": "StaticRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsList",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsList:TeamsList": "TeamsList"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/teamsLocation",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/teamsLocation:TeamsLocation": "TeamsLocation"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/wafGroup",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/wafGroup:WafGroup": "WafGroup"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/wafOverride",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/wafOverride:WafOverride": "WafOverride"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/wafPackage",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/wafPackage:WafPackage": "WafPackage"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/wafRule",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/wafRule:WafRule": "WafRule"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/waitingRoom",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/waitingRoom:WaitingRoom": "WaitingRoom"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerCronTrigger",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerCronTrigger:WorkerCronTrigger": "WorkerCronTrigger"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerRoute",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerRoute:WorkerRoute": "WorkerRoute"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workerScript",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workerScript:WorkerScript": "WorkerScript"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersKv",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersKv:WorkersKv": "WorkersKv"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/workersKvNamespace",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/workersKvNamespace:WorkersKvNamespace": "WorkersKvNamespace"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zone",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zone:Zone": "Zone"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneDnssec",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneDnssec:ZoneDnssec": "ZoneDnssec"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneLockdown",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneLockdown:ZoneLockdown": "ZoneLockdown"
  }
 },
 {
  "pkg": "cloudflare",
  "mod": "index/zoneSettingsOverride",
  "fqn": "pulumi_cloudflare",
  "classes": {
   "cloudflare:index/zoneSettingsOverride:ZoneSettingsOverride": "ZoneSettingsOverride"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "cloudflare",
  "token": "pulumi:providers:cloudflare",
  "fqn": "pulumi_cloudflare",
  "class": "Provider"
 }
]
"""
)
