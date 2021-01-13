# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['LoadBalancer']


class LoadBalancer(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 default_pool_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 fallback_pool_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 pop_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerPopPoolArgs']]]]] = None,
                 proxied: Optional[pulumi.Input[bool]] = None,
                 region_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerRegionPoolArgs']]]]] = None,
                 session_affinity: Optional[pulumi.Input[str]] = None,
                 session_affinity_attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 session_affinity_ttl: Optional[pulumi.Input[int]] = None,
                 steering_policy: Optional[pulumi.Input[str]] = None,
                 ttl: Optional[pulumi.Input[int]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        foo = cloudflare.LoadBalancerPool("foo",
            name="example-lb-pool",
            origins=[cloudflare.LoadBalancerPoolOriginArgs(
                name="example-1",
                address="192.0.2.1",
                enabled=False,
            )])
        # Define a load balancer which always points to a pool we define below
        # In normal usage, would have different pools set for different pops (cloudflare points-of-presence) and/or for different regions
        # Within each pop or region we can define multiple pools in failover order
        bar = cloudflare.LoadBalancer("bar",
            zone_id="d41d8cd98f00b204e9800998ecf8427e",
            name="example-load-balancer.example.com",
            fallback_pool_id=foo.id,
            default_pool_ids=[foo.id],
            description="example load balancer using geo-balancing",
            proxied=True,
            steering_policy="geo",
            pop_pools=[cloudflare.LoadBalancerPopPoolArgs(
                pop="LAX",
                pool_ids=[foo.id],
            )],
            region_pools=[cloudflare.LoadBalancerRegionPoolArgs(
                region="WNAM",
                pool_ids=[foo.id],
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] default_pool_ids: A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Enable or disable the load balancer. Defaults to `true` (enabled).
        :param pulumi.Input[str] fallback_pool_id: The pool ID to use when all other pools are detected as unhealthy.
        :param pulumi.Input[str] name: The DNS name (FQDN, including the zone) to associate with the load balancer.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerPopPoolArgs']]]] pop_pools: A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        :param pulumi.Input[bool] proxied: Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerRegionPoolArgs']]]] region_pools: A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        :param pulumi.Input[str] session_affinity: Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ip_cookie"`.  Default is `""`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] session_affinity_attributes: Configure cookie attributes for session affinity cookie. See the field documentation below.
        :param pulumi.Input[int] session_affinity_ttl: Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
        :param pulumi.Input[str] steering_policy: Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        :param pulumi.Input[int] ttl: Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        :param pulumi.Input[str] zone_id: The zone ID to add the load balancer to.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if default_pool_ids is None and not opts.urn:
                raise TypeError("Missing required property 'default_pool_ids'")
            __props__['default_pool_ids'] = default_pool_ids
            __props__['description'] = description
            __props__['enabled'] = enabled
            if fallback_pool_id is None and not opts.urn:
                raise TypeError("Missing required property 'fallback_pool_id'")
            __props__['fallback_pool_id'] = fallback_pool_id
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['pop_pools'] = pop_pools
            __props__['proxied'] = proxied
            __props__['region_pools'] = region_pools
            __props__['session_affinity'] = session_affinity
            __props__['session_affinity_attributes'] = session_affinity_attributes
            __props__['session_affinity_ttl'] = session_affinity_ttl
            __props__['steering_policy'] = steering_policy
            __props__['ttl'] = ttl
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['created_on'] = None
            __props__['modified_on'] = None
        super(LoadBalancer, __self__).__init__(
            'cloudflare:index/loadBalancer:LoadBalancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_on: Optional[pulumi.Input[str]] = None,
            default_pool_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            fallback_pool_id: Optional[pulumi.Input[str]] = None,
            modified_on: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            pop_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerPopPoolArgs']]]]] = None,
            proxied: Optional[pulumi.Input[bool]] = None,
            region_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerRegionPoolArgs']]]]] = None,
            session_affinity: Optional[pulumi.Input[str]] = None,
            session_affinity_attributes: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            session_affinity_ttl: Optional[pulumi.Input[int]] = None,
            steering_policy: Optional[pulumi.Input[str]] = None,
            ttl: Optional[pulumi.Input[int]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'LoadBalancer':
        """
        Get an existing LoadBalancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_on: The RFC3339 timestamp of when the load balancer was created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] default_pool_ids: A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        :param pulumi.Input[str] description: Free text description.
        :param pulumi.Input[bool] enabled: Enable or disable the load balancer. Defaults to `true` (enabled).
        :param pulumi.Input[str] fallback_pool_id: The pool ID to use when all other pools are detected as unhealthy.
        :param pulumi.Input[str] modified_on: The RFC3339 timestamp of when the load balancer was last modified.
        :param pulumi.Input[str] name: The DNS name (FQDN, including the zone) to associate with the load balancer.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerPopPoolArgs']]]] pop_pools: A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        :param pulumi.Input[bool] proxied: Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['LoadBalancerRegionPoolArgs']]]] region_pools: A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        :param pulumi.Input[str] session_affinity: Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ip_cookie"`.  Default is `""`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] session_affinity_attributes: Configure cookie attributes for session affinity cookie. See the field documentation below.
        :param pulumi.Input[int] session_affinity_ttl: Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
        :param pulumi.Input[str] steering_policy: Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        :param pulumi.Input[int] ttl: Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        :param pulumi.Input[str] zone_id: The zone ID to add the load balancer to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["created_on"] = created_on
        __props__["default_pool_ids"] = default_pool_ids
        __props__["description"] = description
        __props__["enabled"] = enabled
        __props__["fallback_pool_id"] = fallback_pool_id
        __props__["modified_on"] = modified_on
        __props__["name"] = name
        __props__["pop_pools"] = pop_pools
        __props__["proxied"] = proxied
        __props__["region_pools"] = region_pools
        __props__["session_affinity"] = session_affinity
        __props__["session_affinity_attributes"] = session_affinity_attributes
        __props__["session_affinity_ttl"] = session_affinity_ttl
        __props__["steering_policy"] = steering_policy
        __props__["ttl"] = ttl
        __props__["zone_id"] = zone_id
        return LoadBalancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[str]:
        """
        The RFC3339 timestamp of when the load balancer was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter(name="defaultPoolIds")
    def default_pool_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
        """
        return pulumi.get(self, "default_pool_ids")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Free text description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable or disable the load balancer. Defaults to `true` (enabled).
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="fallbackPoolId")
    def fallback_pool_id(self) -> pulumi.Output[str]:
        """
        The pool ID to use when all other pools are detected as unhealthy.
        """
        return pulumi.get(self, "fallback_pool_id")

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[str]:
        """
        The RFC3339 timestamp of when the load balancer was last modified.
        """
        return pulumi.get(self, "modified_on")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The DNS name (FQDN, including the zone) to associate with the load balancer.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="popPools")
    def pop_pools(self) -> pulumi.Output[Sequence['outputs.LoadBalancerPopPool']]:
        """
        A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
        """
        return pulumi.get(self, "pop_pools")

    @property
    @pulumi.getter
    def proxied(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
        """
        return pulumi.get(self, "proxied")

    @property
    @pulumi.getter(name="regionPools")
    def region_pools(self) -> pulumi.Output[Sequence['outputs.LoadBalancerRegionPool']]:
        """
        A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
        """
        return pulumi.get(self, "region_pools")

    @property
    @pulumi.getter(name="sessionAffinity")
    def session_affinity(self) -> pulumi.Output[Optional[str]]:
        """
        Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.  Valid values are: `""`, `"none"`, `"cookie"`, and `"ip_cookie"`.  Default is `""`.
        """
        return pulumi.get(self, "session_affinity")

    @property
    @pulumi.getter(name="sessionAffinityAttributes")
    def session_affinity_attributes(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Configure cookie attributes for session affinity cookie. See the field documentation below.
        """
        return pulumi.get(self, "session_affinity_attributes")

    @property
    @pulumi.getter(name="sessionAffinityTtl")
    def session_affinity_ttl(self) -> pulumi.Output[Optional[int]]:
        """
        Time, in seconds, until this load balancers session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of 23 hours will be used unless `session_affinity_ttl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between 1800 and 604800.
        """
        return pulumi.get(self, "session_affinity_ttl")

    @property
    @pulumi.getter(name="steeringPolicy")
    def steering_policy(self) -> pulumi.Output[str]:
        """
        Determine which method the load balancer uses to determine the fastest route to your origin. Valid values are: `"off"`, `"geo"`, `"dynamic_latency"`, `"random"` or `""`. Default is `""`.
        """
        return pulumi.get(self, "steering_policy")

    @property
    @pulumi.getter
    def ttl(self) -> pulumi.Output[int]:
        """
        Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone ID to add the load balancer to.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

