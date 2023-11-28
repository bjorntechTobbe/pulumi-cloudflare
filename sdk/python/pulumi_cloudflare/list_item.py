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

__all__ = ['ListItemInitArgs', 'ListItem']

@pulumi.input_type
class ListItemInitArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 list_id: pulumi.Input[str],
                 asn: Optional[pulumi.Input[int]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input['ListItemHostnameArgs']] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 redirect: Optional[pulumi.Input['ListItemRedirectArgs']] = None):
        """
        The set of arguments for constructing a ListItem resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] list_id: The list identifier to target for the resource.
        :param pulumi.Input[int] asn: Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] comment: An optional comment for the item.
        :param pulumi.Input['ListItemHostnameArgs'] hostname: Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ip: IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input['ListItemRedirectArgs'] redirect: Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "list_id", list_id)
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if redirect is not None:
            pulumi.set(__self__, "redirect", redirect)

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
    @pulumi.getter(name="listId")
    def list_id(self) -> pulumi.Input[str]:
        """
        The list identifier to target for the resource.
        """
        return pulumi.get(self, "list_id")

    @list_id.setter
    def list_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "list_id", value)

    @property
    @pulumi.getter
    def asn(self) -> Optional[pulumi.Input[int]]:
        """
        Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment for the item.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input['ListItemHostnameArgs']]:
        """
        Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input['ListItemHostnameArgs']]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter
    def redirect(self) -> Optional[pulumi.Input['ListItemRedirectArgs']]:
        """
        Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "redirect")

    @redirect.setter
    def redirect(self, value: Optional[pulumi.Input['ListItemRedirectArgs']]):
        pulumi.set(self, "redirect", value)


@pulumi.input_type
class _ListItemState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[int]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input['ListItemHostnameArgs']] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 list_id: Optional[pulumi.Input[str]] = None,
                 redirect: Optional[pulumi.Input['ListItemRedirectArgs']] = None):
        """
        Input properties used for looking up and filtering ListItem resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] asn: Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] comment: An optional comment for the item.
        :param pulumi.Input['ListItemHostnameArgs'] hostname: Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ip: IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] list_id: The list identifier to target for the resource.
        :param pulumi.Input['ListItemRedirectArgs'] redirect: Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if asn is not None:
            pulumi.set(__self__, "asn", asn)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ip is not None:
            pulumi.set(__self__, "ip", ip)
        if list_id is not None:
            pulumi.set(__self__, "list_id", list_id)
        if redirect is not None:
            pulumi.set(__self__, "redirect", redirect)

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
    @pulumi.getter
    def asn(self) -> Optional[pulumi.Input[int]]:
        """
        Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "asn")

    @asn.setter
    def asn(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "asn", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment for the item.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input['ListItemHostnameArgs']]:
        """
        Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input['ListItemHostnameArgs']]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter
    def ip(self) -> Optional[pulumi.Input[str]]:
        """
        IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ip")

    @ip.setter
    def ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip", value)

    @property
    @pulumi.getter(name="listId")
    def list_id(self) -> Optional[pulumi.Input[str]]:
        """
        The list identifier to target for the resource.
        """
        return pulumi.get(self, "list_id")

    @list_id.setter
    def list_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "list_id", value)

    @property
    @pulumi.getter
    def redirect(self) -> Optional[pulumi.Input['ListItemRedirectArgs']]:
        """
        Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "redirect")

    @redirect.setter
    def redirect(self, value: Optional[pulumi.Input['ListItemRedirectArgs']]):
        pulumi.set(self, "redirect", value)


class ListItem(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[int]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[pulumi.InputType['ListItemHostnameArgs']]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 list_id: Optional[pulumi.Input[str]] = None,
                 redirect: Optional[pulumi.Input[pulumi.InputType['ListItemRedirectArgs']]] = None,
                 __props__=None):
        """
        Provides individual list items (IPs, Redirects) to be used in Edge Rules Engine
        across all zones within the same account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # IP List
        example_ip_list = cloudflare.List("exampleIpList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_list",
            description="example IPs for a list",
            kind="ip")
        # IP List Item
        example_ip_item = cloudflare.ListItem("exampleIpItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_ip_list.id,
            comment="List Item Comment",
            ip="192.0.2.0")
        # Redirect List
        example_redirect_list = cloudflare.List("exampleRedirectList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_list",
            description="example Redirects for a list",
            kind="redirect")
        # Redirect List Item
        example_redirect_item = cloudflare.ListItem("exampleRedirectItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_ip_list.id,
            redirect=cloudflare.ListItemRedirectArgs(
                source_url="https://source.tld",
                target_url="https://target.tld",
                status_code=302,
                subpath_matching="enabled",
            ))
        # ASN List
        example_asn_list = cloudflare.List("exampleAsnList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_asn_list",
            description="example ASNs for a list",
            kind="asn")
        # ASN List Item
        example_asn_item = cloudflare.ListItem("exampleAsnItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_asn_list.id,
            comment="List Item Comment",
            asn=6789)
        # Hostname List
        example_hostname_list = cloudflare.List("exampleHostnameList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_hostname_list",
            description="example Hostnames for a list",
            kind="hostname")
        # Hostname List Item
        example_hostname_item = cloudflare.ListItem("exampleHostnameItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_hostname_list.id,
            comment="List Item Comment",
            hostname=cloudflare.ListItemHostnameArgs(
                url_hostname="example.com",
            ))
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/listItem:ListItem example <account_id>/<list_id>/<item_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] asn: Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] comment: An optional comment for the item.
        :param pulumi.Input[pulumi.InputType['ListItemHostnameArgs']] hostname: Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ip: IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] list_id: The list identifier to target for the resource.
        :param pulumi.Input[pulumi.InputType['ListItemRedirectArgs']] redirect: Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ListItemInitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides individual list items (IPs, Redirects) to be used in Edge Rules Engine
        across all zones within the same account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # IP List
        example_ip_list = cloudflare.List("exampleIpList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_list",
            description="example IPs for a list",
            kind="ip")
        # IP List Item
        example_ip_item = cloudflare.ListItem("exampleIpItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_ip_list.id,
            comment="List Item Comment",
            ip="192.0.2.0")
        # Redirect List
        example_redirect_list = cloudflare.List("exampleRedirectList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_list",
            description="example Redirects for a list",
            kind="redirect")
        # Redirect List Item
        example_redirect_item = cloudflare.ListItem("exampleRedirectItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_ip_list.id,
            redirect=cloudflare.ListItemRedirectArgs(
                source_url="https://source.tld",
                target_url="https://target.tld",
                status_code=302,
                subpath_matching="enabled",
            ))
        # ASN List
        example_asn_list = cloudflare.List("exampleAsnList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_asn_list",
            description="example ASNs for a list",
            kind="asn")
        # ASN List Item
        example_asn_item = cloudflare.ListItem("exampleAsnItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_asn_list.id,
            comment="List Item Comment",
            asn=6789)
        # Hostname List
        example_hostname_list = cloudflare.List("exampleHostnameList",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example_hostname_list",
            description="example Hostnames for a list",
            kind="hostname")
        # Hostname List Item
        example_hostname_item = cloudflare.ListItem("exampleHostnameItem",
            account_id="f037e56e89293a057740de681ac9abbe",
            list_id=example_hostname_list.id,
            comment="List Item Comment",
            hostname=cloudflare.ListItemHostnameArgs(
                url_hostname="example.com",
            ))
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/listItem:ListItem example <account_id>/<list_id>/<item_id>
        ```

        :param str resource_name: The name of the resource.
        :param ListItemInitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ListItemInitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 asn: Optional[pulumi.Input[int]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[pulumi.InputType['ListItemHostnameArgs']]] = None,
                 ip: Optional[pulumi.Input[str]] = None,
                 list_id: Optional[pulumi.Input[str]] = None,
                 redirect: Optional[pulumi.Input[pulumi.InputType['ListItemRedirectArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ListItemInitArgs.__new__(ListItemInitArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["asn"] = asn
            __props__.__dict__["comment"] = comment
            __props__.__dict__["hostname"] = hostname
            __props__.__dict__["ip"] = ip
            if list_id is None and not opts.urn:
                raise TypeError("Missing required property 'list_id'")
            __props__.__dict__["list_id"] = list_id
            __props__.__dict__["redirect"] = redirect
        super(ListItem, __self__).__init__(
            'cloudflare:index/listItem:ListItem',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            asn: Optional[pulumi.Input[int]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[pulumi.InputType['ListItemHostnameArgs']]] = None,
            ip: Optional[pulumi.Input[str]] = None,
            list_id: Optional[pulumi.Input[str]] = None,
            redirect: Optional[pulumi.Input[pulumi.InputType['ListItemRedirectArgs']]] = None) -> 'ListItem':
        """
        Get an existing ListItem resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] asn: Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] comment: An optional comment for the item.
        :param pulumi.Input[pulumi.InputType['ListItemHostnameArgs']] hostname: Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] ip: IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] list_id: The list identifier to target for the resource.
        :param pulumi.Input[pulumi.InputType['ListItemRedirectArgs']] redirect: Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ListItemState.__new__(_ListItemState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["asn"] = asn
        __props__.__dict__["comment"] = comment
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["ip"] = ip
        __props__.__dict__["list_id"] = list_id
        __props__.__dict__["redirect"] = redirect
        return ListItem(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def asn(self) -> pulumi.Output[Optional[int]]:
        """
        Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "asn")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        An optional comment for the item.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[Optional['outputs.ListItemHostname']]:
        """
        Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter
    def ip(self) -> pulumi.Output[Optional[str]]:
        """
        IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter(name="listId")
    def list_id(self) -> pulumi.Output[str]:
        """
        The list identifier to target for the resource.
        """
        return pulumi.get(self, "list_id")

    @property
    @pulumi.getter
    def redirect(self) -> pulumi.Output[Optional['outputs.ListItemRedirect']]:
        """
        Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "redirect")

