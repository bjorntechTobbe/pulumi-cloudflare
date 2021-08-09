# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AccessIdentityProviderArgs', 'AccessIdentityProvider']

@pulumi.input_type
class AccessIdentityProviderArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessIdentityProvider resource.
        :param pulumi.Input[str] name: Friendly name of the Access Identity Provider configuration.
        :param pulumi.Input[str] type: The provider type to use. Must be one of: `"centrify"`,
               `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
               `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        :param pulumi.Input[str] account_id: The account ID the provider should be associated with. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]] configs: Provider configuration from the [developer documentation][access_identity_provider_guide].
        :param pulumi.Input[str] zone_id: The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Friendly name of the Access Identity Provider configuration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The provider type to use. Must be one of: `"centrify"`,
        `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
        `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account ID the provider should be associated with. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]]:
        """
        Provider configuration from the [developer documentation][access_identity_provider_guide].
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessIdentityProviderState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessIdentityProvider resources.
        :param pulumi.Input[str] account_id: The account ID the provider should be associated with. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]] configs: Provider configuration from the [developer documentation][access_identity_provider_guide].
        :param pulumi.Input[str] name: Friendly name of the Access Identity Provider configuration.
        :param pulumi.Input[str] type: The provider type to use. Must be one of: `"centrify"`,
               `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
               `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        :param pulumi.Input[str] zone_id: The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if configs is not None:
            pulumi.set(__self__, "configs", configs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account ID the provider should be associated with. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]]:
        """
        Provider configuration from the [developer documentation][access_identity_provider_guide].
        """
        return pulumi.get(self, "configs")

    @configs.setter
    def configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessIdentityProviderConfigArgs']]]]):
        pulumi.set(self, "configs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Friendly name of the Access Identity Provider configuration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The provider type to use. Must be one of: `"centrify"`,
        `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
        `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessIdentityProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessIdentityProviderConfigArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Access Identity Provider resource. Identity Providers are
        used as an authentication or authorisation source within Access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # one time pin
        pin_login = cloudflare.AccessIdentityProvider("pinLogin",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="PIN login",
            type="onetimepin")
        # oauth
        github_oauth = cloudflare.AccessIdentityProvider("githubOauth",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                client_id="example",
                client_secret="secret_key",
            )],
            name="GitHub OAuth",
            type="github")
        # saml
        jumpcloud_saml = cloudflare.AccessIdentityProvider("jumpcloudSaml",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                attributes=[
                    "email",
                    "username",
                ],
                idp_public_cert=\"\"\"MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
        uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o
        \"\"\",
                issuer_url="jumpcloud",
                sign_request=False,
                sso_target_url="https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess",
            )],
            name="JumpCloud SAML",
            type="saml")
        # okta
        okta = cloudflare.AccessIdentityProvider("okta",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                api_token="okta_api_token",
                client_id="example",
                client_secret="secret_key",
            )],
            name="Okta",
            type="okta")
        ```

        Please refer to the [developers.cloudflare.com Access documentation][access_identity_provider_guide]
        for full reference on what is available and how to configure your provider.

        ## Import

        Access Identity Providers can be imported using a composite ID formed of account ID and Access Identity Provider ID.

        ```sh
         $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider my_idp cb029e245cfdd66dc8d2e570d5dd3322/e00e1c13-e350-44fe-96c5-fb75c954871c
        ```

         [access_identity_provider_guide]https://developers.cloudflare.com/access/configuring-identity-providers/

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account ID the provider should be associated with. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessIdentityProviderConfigArgs']]]] configs: Provider configuration from the [developer documentation][access_identity_provider_guide].
        :param pulumi.Input[str] name: Friendly name of the Access Identity Provider configuration.
        :param pulumi.Input[str] type: The provider type to use. Must be one of: `"centrify"`,
               `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
               `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        :param pulumi.Input[str] zone_id: The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessIdentityProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Access Identity Provider resource. Identity Providers are
        used as an authentication or authorisation source within Access.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # one time pin
        pin_login = cloudflare.AccessIdentityProvider("pinLogin",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="PIN login",
            type="onetimepin")
        # oauth
        github_oauth = cloudflare.AccessIdentityProvider("githubOauth",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                client_id="example",
                client_secret="secret_key",
            )],
            name="GitHub OAuth",
            type="github")
        # saml
        jumpcloud_saml = cloudflare.AccessIdentityProvider("jumpcloudSaml",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                attributes=[
                    "email",
                    "username",
                ],
                idp_public_cert=\"\"\"MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
        uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o
        \"\"\",
                issuer_url="jumpcloud",
                sign_request=False,
                sso_target_url="https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess",
            )],
            name="JumpCloud SAML",
            type="saml")
        # okta
        okta = cloudflare.AccessIdentityProvider("okta",
            account_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            configs=[cloudflare.AccessIdentityProviderConfigArgs(
                api_token="okta_api_token",
                client_id="example",
                client_secret="secret_key",
            )],
            name="Okta",
            type="okta")
        ```

        Please refer to the [developers.cloudflare.com Access documentation][access_identity_provider_guide]
        for full reference on what is available and how to configure your provider.

        ## Import

        Access Identity Providers can be imported using a composite ID formed of account ID and Access Identity Provider ID.

        ```sh
         $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider my_idp cb029e245cfdd66dc8d2e570d5dd3322/e00e1c13-e350-44fe-96c5-fb75c954871c
        ```

         [access_identity_provider_guide]https://developers.cloudflare.com/access/configuring-identity-providers/

        :param str resource_name: The name of the resource.
        :param AccessIdentityProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessIdentityProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessIdentityProviderConfigArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessIdentityProviderArgs.__new__(AccessIdentityProviderArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["configs"] = configs
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["zone_id"] = zone_id
        super(AccessIdentityProvider, __self__).__init__(
            'cloudflare:index/accessIdentityProvider:AccessIdentityProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessIdentityProviderConfigArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessIdentityProvider':
        """
        Get an existing AccessIdentityProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account ID the provider should be associated with. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessIdentityProviderConfigArgs']]]] configs: Provider configuration from the [developer documentation][access_identity_provider_guide].
        :param pulumi.Input[str] name: Friendly name of the Access Identity Provider configuration.
        :param pulumi.Input[str] type: The provider type to use. Must be one of: `"centrify"`,
               `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
               `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        :param pulumi.Input[str] zone_id: The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessIdentityProviderState.__new__(_AccessIdentityProviderState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["configs"] = configs
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        __props__.__dict__["zone_id"] = zone_id
        return AccessIdentityProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[Optional[str]]:
        """
        The account ID the provider should be associated with. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def configs(self) -> pulumi.Output[Optional[Sequence['outputs.AccessIdentityProviderConfig']]]:
        """
        Provider configuration from the [developer documentation][access_identity_provider_guide].
        """
        return pulumi.get(self, "configs")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Friendly name of the Access Identity Provider configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The provider type to use. Must be one of: `"centrify"`,
        `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
        `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[Optional[str]]:
        """
        The zone ID the provider should be associated with. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

