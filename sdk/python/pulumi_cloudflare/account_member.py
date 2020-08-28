# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['AccountMember']


class AccountMember(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_address: Optional[pulumi.Input[str]] = None,
                 role_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a resource which manages Cloudflare account members.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example_user = cloudflare.AccountMember("exampleUser",
            email_address="user@example.com",
            role_ids=[
                "68b329da9893e34099c7d8ad5cb9c940",
                "d784fa8b6d98d27699781bd9a7cf19f0",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[List[pulumi.Input[str]]] role_ids: Array of account role IDs that you want to assign to a member.
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

            if email_address is None:
                raise TypeError("Missing required property 'email_address'")
            __props__['email_address'] = email_address
            if role_ids is None:
                raise TypeError("Missing required property 'role_ids'")
            __props__['role_ids'] = role_ids
        super(AccountMember, __self__).__init__(
            'cloudflare:index/accountMember:AccountMember',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email_address: Optional[pulumi.Input[str]] = None,
            role_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'AccountMember':
        """
        Get an existing AccountMember resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email_address: The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
        :param pulumi.Input[List[pulumi.Input[str]]] role_ids: Array of account role IDs that you want to assign to a member.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["email_address"] = email_address
        __props__["role_ids"] = role_ids
        return AccountMember(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="emailAddress")
    def email_address(self) -> pulumi.Output[str]:
        """
        The email address of the user who you wish to manage. Note: Following creation, this field becomes read only via the API and cannot be updated.
        """
        return pulumi.get(self, "email_address")

    @property
    @pulumi.getter(name="roleIds")
    def role_ids(self) -> pulumi.Output[List[str]]:
        """
        Array of account role IDs that you want to assign to a member.
        """
        return pulumi.get(self, "role_ids")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

