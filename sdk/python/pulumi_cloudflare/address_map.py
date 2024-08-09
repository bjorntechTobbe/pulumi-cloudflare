# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AddressMapArgs', 'AddressMap']

@pulumi.input_type
class AddressMapArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 enabled: pulumi.Input[bool],
                 default_sni: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ips: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]] = None,
                 memberships: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]] = None):
        """
        The set of arguments for constructing a AddressMap resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] enabled: Whether the Address Map is enabled or not.
        :param pulumi.Input[str] default_sni: If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        :param pulumi.Input[str] description: Description of the address map.
        :param pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]] ips: The set of IPs on the Address Map.
        :param pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]] memberships: Zones and Accounts which will be assigned IPs on this Address Map.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "enabled", enabled)
        if default_sni is not None:
            pulumi.set(__self__, "default_sni", default_sni)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ips is not None:
            pulumi.set(__self__, "ips", ips)
        if memberships is not None:
            pulumi.set(__self__, "memberships", memberships)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the Address Map is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="defaultSni")
    def default_sni(self) -> Optional[pulumi.Input[str]]:
        """
        If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        """
        return pulumi.get(self, "default_sni")

    @default_sni.setter
    def default_sni(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sni", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the address map.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]]:
        """
        The set of IPs on the Address Map.
        """
        return pulumi.get(self, "ips")

    @ips.setter
    def ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]]):
        pulumi.set(self, "ips", value)

    @property
    @pulumi.getter
    def memberships(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]]:
        """
        Zones and Accounts which will be assigned IPs on this Address Map.
        """
        return pulumi.get(self, "memberships")

    @memberships.setter
    def memberships(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]]):
        pulumi.set(self, "memberships", value)


@pulumi.input_type
class _AddressMapState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 can_delete: Optional[pulumi.Input[bool]] = None,
                 can_modify_ips: Optional[pulumi.Input[bool]] = None,
                 default_sni: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ips: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]] = None,
                 memberships: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]] = None):
        """
        Input properties used for looking up and filtering AddressMap resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] can_delete: If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
        :param pulumi.Input[bool] can_modify_ips: If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        :param pulumi.Input[str] default_sni: If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        :param pulumi.Input[str] description: Description of the address map.
        :param pulumi.Input[bool] enabled: Whether the Address Map is enabled or not.
        :param pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]] ips: The set of IPs on the Address Map.
        :param pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]] memberships: Zones and Accounts which will be assigned IPs on this Address Map.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if can_delete is not None:
            pulumi.set(__self__, "can_delete", can_delete)
        if can_modify_ips is not None:
            pulumi.set(__self__, "can_modify_ips", can_modify_ips)
        if default_sni is not None:
            pulumi.set(__self__, "default_sni", default_sni)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if ips is not None:
            pulumi.set(__self__, "ips", ips)
        if memberships is not None:
            pulumi.set(__self__, "memberships", memberships)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="canDelete")
    def can_delete(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
        """
        return pulumi.get(self, "can_delete")

    @can_delete.setter
    def can_delete(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "can_delete", value)

    @property
    @pulumi.getter(name="canModifyIps")
    def can_modify_ips(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        """
        return pulumi.get(self, "can_modify_ips")

    @can_modify_ips.setter
    def can_modify_ips(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "can_modify_ips", value)

    @property
    @pulumi.getter(name="defaultSni")
    def default_sni(self) -> Optional[pulumi.Input[str]]:
        """
        If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        """
        return pulumi.get(self, "default_sni")

    @default_sni.setter
    def default_sni(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_sni", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the address map.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the Address Map is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]]:
        """
        The set of IPs on the Address Map.
        """
        return pulumi.get(self, "ips")

    @ips.setter
    def ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapIpArgs']]]]):
        pulumi.set(self, "ips", value)

    @property
    @pulumi.getter
    def memberships(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]]:
        """
        Zones and Accounts which will be assigned IPs on this Address Map.
        """
        return pulumi.get(self, "memberships")

    @memberships.setter
    def memberships(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AddressMapMembershipArgs']]]]):
        pulumi.set(self, "memberships", value)


class AddressMap(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 default_sni: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapIpArgs', 'AddressMapIpArgsDict']]]]] = None,
                 memberships: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapMembershipArgs', 'AddressMapMembershipArgsDict']]]]] = None,
                 __props__=None):
        """
        Provides the ability to manage IP addresses that can be used by DNS records when
        they are proxied through Cloudflare.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AddressMap("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            description="My address map",
            default_sni="*.example.com",
            enabled=True,
            ips=[
                {
                    "ip": "192.0.2.1",
                },
                {
                    "ip": "203.0.113.1",
                },
            ],
            memberships=[
                {
                    "identifier": "92f17202ed8bd63d69a66b86a49a8f6b",
                    "kind": "account",
                },
                {
                    "identifier": "023e105f4ecef8ad9ca31a8372d0c353",
                    "kind": "zone",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/addressMap:AddressMap example <account_id>/<address_map_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] default_sni: If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        :param pulumi.Input[str] description: Description of the address map.
        :param pulumi.Input[bool] enabled: Whether the Address Map is enabled or not.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AddressMapIpArgs', 'AddressMapIpArgsDict']]]] ips: The set of IPs on the Address Map.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AddressMapMembershipArgs', 'AddressMapMembershipArgsDict']]]] memberships: Zones and Accounts which will be assigned IPs on this Address Map.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AddressMapArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides the ability to manage IP addresses that can be used by DNS records when
        they are proxied through Cloudflare.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AddressMap("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            description="My address map",
            default_sni="*.example.com",
            enabled=True,
            ips=[
                {
                    "ip": "192.0.2.1",
                },
                {
                    "ip": "203.0.113.1",
                },
            ],
            memberships=[
                {
                    "identifier": "92f17202ed8bd63d69a66b86a49a8f6b",
                    "kind": "account",
                },
                {
                    "identifier": "023e105f4ecef8ad9ca31a8372d0c353",
                    "kind": "zone",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/addressMap:AddressMap example <account_id>/<address_map_id>
        ```

        :param str resource_name: The name of the resource.
        :param AddressMapArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AddressMapArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 default_sni: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapIpArgs', 'AddressMapIpArgsDict']]]]] = None,
                 memberships: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapMembershipArgs', 'AddressMapMembershipArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AddressMapArgs.__new__(AddressMapArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["default_sni"] = default_sni
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["ips"] = ips
            __props__.__dict__["memberships"] = memberships
            __props__.__dict__["can_delete"] = None
            __props__.__dict__["can_modify_ips"] = None
        super(AddressMap, __self__).__init__(
            'cloudflare:index/addressMap:AddressMap',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            can_delete: Optional[pulumi.Input[bool]] = None,
            can_modify_ips: Optional[pulumi.Input[bool]] = None,
            default_sni: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            ips: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapIpArgs', 'AddressMapIpArgsDict']]]]] = None,
            memberships: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AddressMapMembershipArgs', 'AddressMapMembershipArgsDict']]]]] = None) -> 'AddressMap':
        """
        Get an existing AddressMap resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[bool] can_delete: If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
        :param pulumi.Input[bool] can_modify_ips: If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        :param pulumi.Input[str] default_sni: If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        :param pulumi.Input[str] description: Description of the address map.
        :param pulumi.Input[bool] enabled: Whether the Address Map is enabled or not.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AddressMapIpArgs', 'AddressMapIpArgsDict']]]] ips: The set of IPs on the Address Map.
        :param pulumi.Input[Sequence[pulumi.Input[Union['AddressMapMembershipArgs', 'AddressMapMembershipArgsDict']]]] memberships: Zones and Accounts which will be assigned IPs on this Address Map.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AddressMapState.__new__(_AddressMapState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["can_delete"] = can_delete
        __props__.__dict__["can_modify_ips"] = can_modify_ips
        __props__.__dict__["default_sni"] = default_sni
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["ips"] = ips
        __props__.__dict__["memberships"] = memberships
        return AddressMap(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="canDelete")
    def can_delete(self) -> pulumi.Output[bool]:
        """
        If set to false, then the Address Map cannot be deleted via API. This is true for Cloudflare-managed maps.
        """
        return pulumi.get(self, "can_delete")

    @property
    @pulumi.getter(name="canModifyIps")
    def can_modify_ips(self) -> pulumi.Output[bool]:
        """
        If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        """
        return pulumi.get(self, "can_modify_ips")

    @property
    @pulumi.getter(name="defaultSni")
    def default_sni(self) -> pulumi.Output[Optional[str]]:
        """
        If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        """
        return pulumi.get(self, "default_sni")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the address map.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the Address Map is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def ips(self) -> pulumi.Output[Optional[Sequence['outputs.AddressMapIp']]]:
        """
        The set of IPs on the Address Map.
        """
        return pulumi.get(self, "ips")

    @property
    @pulumi.getter
    def memberships(self) -> pulumi.Output[Optional[Sequence['outputs.AddressMapMembership']]]:
        """
        Zones and Accounts which will be assigned IPs on this Address Map.
        """
        return pulumi.get(self, "memberships")

