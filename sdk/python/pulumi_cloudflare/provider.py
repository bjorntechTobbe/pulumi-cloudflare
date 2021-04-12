# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Provider resource.
        :param pulumi.Input[str] account_id: Configure API client to always use that account
        :param pulumi.Input[bool] api_client_logging: Whether to print logs from the API client (using the default log library logger)
        :param pulumi.Input[str] api_key: The API key for operations.
        :param pulumi.Input[str] api_token: The API Token for operations.
        :param pulumi.Input[str] api_user_service_key: A special Cloudflare API key good for a restricted set of endpoints
        :param pulumi.Input[str] email: A registered Cloudflare email address
        :param pulumi.Input[int] max_backoff: Maximum backoff period in seconds after failed API calls
        :param pulumi.Input[int] min_backoff: Minimum backoff period in seconds after failed API calls
        :param pulumi.Input[int] retries: Maximum number of retries to perform when an API request fails
        :param pulumi.Input[int] rps: RPS limit to apply when making calls to the API
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if api_client_logging is None:
            api_client_logging = (_utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
        if api_client_logging is not None:
            pulumi.set(__self__, "api_client_logging", api_client_logging)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if api_user_service_key is not None:
            pulumi.set(__self__, "api_user_service_key", api_user_service_key)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if max_backoff is None:
            max_backoff = (_utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
        if max_backoff is not None:
            pulumi.set(__self__, "max_backoff", max_backoff)
        if min_backoff is None:
            min_backoff = (_utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
        if min_backoff is not None:
            pulumi.set(__self__, "min_backoff", min_backoff)
        if retries is None:
            retries = (_utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)
        if rps is None:
            rps = (_utilities.get_env_int('CLOUDFLARE_RPS') or 4)
        if rps is not None:
            pulumi.set(__self__, "rps", rps)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        Configure API client to always use that account
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="apiClientLogging")
    def api_client_logging(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to print logs from the API client (using the default log library logger)
        """
        return pulumi.get(self, "api_client_logging")

    @api_client_logging.setter
    def api_client_logging(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "api_client_logging", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API key for operations.
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        """
        The API Token for operations.
        """
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter(name="apiUserServiceKey")
    def api_user_service_key(self) -> Optional[pulumi.Input[str]]:
        """
        A special Cloudflare API key good for a restricted set of endpoints
        """
        return pulumi.get(self, "api_user_service_key")

    @api_user_service_key.setter
    def api_user_service_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_user_service_key", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        A registered Cloudflare email address
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="maxBackoff")
    def max_backoff(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum backoff period in seconds after failed API calls
        """
        return pulumi.get(self, "max_backoff")

    @max_backoff.setter
    def max_backoff(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_backoff", value)

    @property
    @pulumi.getter(name="minBackoff")
    def min_backoff(self) -> Optional[pulumi.Input[int]]:
        """
        Minimum backoff period in seconds after failed API calls
        """
        return pulumi.get(self, "min_backoff")

    @min_backoff.setter
    def min_backoff(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_backoff", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of retries to perform when an API request fails
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter
    def rps(self) -> Optional[pulumi.Input[int]]:
        """
        RPS limit to apply when making calls to the API
        """
        return pulumi.get(self, "rps")

    @rps.setter
    def rps(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rps", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        The provider type for the cloudflare package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: Configure API client to always use that account
        :param pulumi.Input[bool] api_client_logging: Whether to print logs from the API client (using the default log library logger)
        :param pulumi.Input[str] api_key: The API key for operations.
        :param pulumi.Input[str] api_token: The API Token for operations.
        :param pulumi.Input[str] api_user_service_key: A special Cloudflare API key good for a restricted set of endpoints
        :param pulumi.Input[str] email: A registered Cloudflare email address
        :param pulumi.Input[int] max_backoff: Maximum backoff period in seconds after failed API calls
        :param pulumi.Input[int] min_backoff: Minimum backoff period in seconds after failed API calls
        :param pulumi.Input[int] retries: Maximum number of retries to perform when an API request fails
        :param pulumi.Input[int] rps: RPS limit to apply when making calls to the API
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the cloudflare package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 api_client_logging: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 api_user_service_key: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 max_backoff: Optional[pulumi.Input[int]] = None,
                 min_backoff: Optional[pulumi.Input[int]] = None,
                 retries: Optional[pulumi.Input[int]] = None,
                 rps: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['account_id'] = account_id
            if api_client_logging is None:
                api_client_logging = (_utilities.get_env_bool('CLOUDFLARE_API_CLIENT_LOGGING') or False)
            __props__['api_client_logging'] = pulumi.Output.from_input(api_client_logging).apply(pulumi.runtime.to_json) if api_client_logging is not None else None
            __props__['api_key'] = api_key
            __props__['api_token'] = api_token
            __props__['api_user_service_key'] = api_user_service_key
            __props__['email'] = email
            if max_backoff is None:
                max_backoff = (_utilities.get_env_int('CLOUDFLARE_MAX_BACKOFF') or 30)
            __props__['max_backoff'] = pulumi.Output.from_input(max_backoff).apply(pulumi.runtime.to_json) if max_backoff is not None else None
            if min_backoff is None:
                min_backoff = (_utilities.get_env_int('CLOUDFLARE_MIN_BACKOFF') or 1)
            __props__['min_backoff'] = pulumi.Output.from_input(min_backoff).apply(pulumi.runtime.to_json) if min_backoff is not None else None
            if retries is None:
                retries = (_utilities.get_env_int('CLOUDFLARE_RETRIES') or 3)
            __props__['retries'] = pulumi.Output.from_input(retries).apply(pulumi.runtime.to_json) if retries is not None else None
            if rps is None:
                rps = (_utilities.get_env_int('CLOUDFLARE_RPS') or 4)
            __props__['rps'] = pulumi.Output.from_input(rps).apply(pulumi.runtime.to_json) if rps is not None else None
        super(Provider, __self__).__init__(
            'cloudflare',
            resource_name,
            __props__,
            opts)

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

