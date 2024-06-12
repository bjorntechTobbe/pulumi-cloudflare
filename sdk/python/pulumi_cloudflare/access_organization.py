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

__all__ = ['AccessOrganizationArgs', 'AccessOrganization']

@pulumi.input_type
class AccessOrganizationArgs:
    def __init__(__self__, *,
                 auth_domain: pulumi.Input[str],
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 allow_authenticate_via_warp: Optional[pulumi.Input[bool]] = None,
                 auto_redirect_to_identity: Optional[pulumi.Input[bool]] = None,
                 custom_pages: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]] = None,
                 session_duration: Optional[pulumi.Input[str]] = None,
                 ui_read_only_toggle_reason: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 warp_auth_session_duration: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessOrganization resource.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[bool] allow_authenticate_via_warp: When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        :param pulumi.Input[bool] auto_redirect_to_identity: When set to true, users skip the identity provider selection step during login.
        :param pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]] custom_pages: Custom pages for your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] session_duration: How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        :param pulumi.Input[str] ui_read_only_toggle_reason: A description of the reason why the UI read only field is being toggled.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] warp_auth_session_duration: The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "auth_domain", auth_domain)
        pulumi.set(__self__, "name", name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if allow_authenticate_via_warp is not None:
            pulumi.set(__self__, "allow_authenticate_via_warp", allow_authenticate_via_warp)
        if auto_redirect_to_identity is not None:
            pulumi.set(__self__, "auto_redirect_to_identity", auto_redirect_to_identity)
        if custom_pages is not None:
            pulumi.set(__self__, "custom_pages", custom_pages)
        if is_ui_read_only is not None:
            pulumi.set(__self__, "is_ui_read_only", is_ui_read_only)
        if login_designs is not None:
            pulumi.set(__self__, "login_designs", login_designs)
        if session_duration is not None:
            pulumi.set(__self__, "session_duration", session_duration)
        if ui_read_only_toggle_reason is not None:
            pulumi.set(__self__, "ui_read_only_toggle_reason", ui_read_only_toggle_reason)
        if user_seat_expiration_inactive_time is not None:
            pulumi.set(__self__, "user_seat_expiration_inactive_time", user_seat_expiration_inactive_time)
        if warp_auth_session_duration is not None:
            pulumi.set(__self__, "warp_auth_session_duration", warp_auth_session_duration)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> pulumi.Input[str]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @auth_domain.setter
    def auth_domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_domain", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="allowAuthenticateViaWarp")
    def allow_authenticate_via_warp(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        """
        return pulumi.get(self, "allow_authenticate_via_warp")

    @allow_authenticate_via_warp.setter
    def allow_authenticate_via_warp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_authenticate_via_warp", value)

    @property
    @pulumi.getter(name="autoRedirectToIdentity")
    def auto_redirect_to_identity(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, users skip the identity provider selection step during login.
        """
        return pulumi.get(self, "auto_redirect_to_identity")

    @auto_redirect_to_identity.setter
    def auto_redirect_to_identity(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_redirect_to_identity", value)

    @property
    @pulumi.getter(name="customPages")
    def custom_pages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]]:
        """
        Custom pages for your Zero Trust organization.
        """
        return pulumi.get(self, "custom_pages")

    @custom_pages.setter
    def custom_pages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]]):
        pulumi.set(self, "custom_pages", value)

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @is_ui_read_only.setter
    def is_ui_read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_ui_read_only", value)

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]:
        return pulumi.get(self, "login_designs")

    @login_designs.setter
    def login_designs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]):
        pulumi.set(self, "login_designs", value)

    @property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> Optional[pulumi.Input[str]]:
        """
        How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        """
        return pulumi.get(self, "session_duration")

    @session_duration.setter
    def session_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "session_duration", value)

    @property
    @pulumi.getter(name="uiReadOnlyToggleReason")
    def ui_read_only_toggle_reason(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the reason why the UI read only field is being toggled.
        """
        return pulumi.get(self, "ui_read_only_toggle_reason")

    @ui_read_only_toggle_reason.setter
    def ui_read_only_toggle_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ui_read_only_toggle_reason", value)

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @user_seat_expiration_inactive_time.setter
    def user_seat_expiration_inactive_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_seat_expiration_inactive_time", value)

    @property
    @pulumi.getter(name="warpAuthSessionDuration")
    def warp_auth_session_duration(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        """
        return pulumi.get(self, "warp_auth_session_duration")

    @warp_auth_session_duration.setter
    def warp_auth_session_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warp_auth_session_duration", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AccessOrganizationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allow_authenticate_via_warp: Optional[pulumi.Input[bool]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 auto_redirect_to_identity: Optional[pulumi.Input[bool]] = None,
                 custom_pages: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_duration: Optional[pulumi.Input[str]] = None,
                 ui_read_only_toggle_reason: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 warp_auth_session_duration: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessOrganization resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[bool] allow_authenticate_via_warp: When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] auto_redirect_to_identity: When set to true, users skip the identity provider selection step during login.
        :param pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]] custom_pages: Custom pages for your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] session_duration: How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        :param pulumi.Input[str] ui_read_only_toggle_reason: A description of the reason why the UI read only field is being toggled.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] warp_auth_session_duration: The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if allow_authenticate_via_warp is not None:
            pulumi.set(__self__, "allow_authenticate_via_warp", allow_authenticate_via_warp)
        if auth_domain is not None:
            pulumi.set(__self__, "auth_domain", auth_domain)
        if auto_redirect_to_identity is not None:
            pulumi.set(__self__, "auto_redirect_to_identity", auto_redirect_to_identity)
        if custom_pages is not None:
            pulumi.set(__self__, "custom_pages", custom_pages)
        if is_ui_read_only is not None:
            pulumi.set(__self__, "is_ui_read_only", is_ui_read_only)
        if login_designs is not None:
            pulumi.set(__self__, "login_designs", login_designs)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if session_duration is not None:
            pulumi.set(__self__, "session_duration", session_duration)
        if ui_read_only_toggle_reason is not None:
            pulumi.set(__self__, "ui_read_only_toggle_reason", ui_read_only_toggle_reason)
        if user_seat_expiration_inactive_time is not None:
            pulumi.set(__self__, "user_seat_expiration_inactive_time", user_seat_expiration_inactive_time)
        if warp_auth_session_duration is not None:
            pulumi.set(__self__, "warp_auth_session_duration", warp_auth_session_duration)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="allowAuthenticateViaWarp")
    def allow_authenticate_via_warp(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        """
        return pulumi.get(self, "allow_authenticate_via_warp")

    @allow_authenticate_via_warp.setter
    def allow_authenticate_via_warp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_authenticate_via_warp", value)

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> Optional[pulumi.Input[str]]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @auth_domain.setter
    def auth_domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_domain", value)

    @property
    @pulumi.getter(name="autoRedirectToIdentity")
    def auto_redirect_to_identity(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, users skip the identity provider selection step during login.
        """
        return pulumi.get(self, "auto_redirect_to_identity")

    @auto_redirect_to_identity.setter
    def auto_redirect_to_identity(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_redirect_to_identity", value)

    @property
    @pulumi.getter(name="customPages")
    def custom_pages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]]:
        """
        Custom pages for your Zero Trust organization.
        """
        return pulumi.get(self, "custom_pages")

    @custom_pages.setter
    def custom_pages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationCustomPageArgs']]]]):
        pulumi.set(self, "custom_pages", value)

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @is_ui_read_only.setter
    def is_ui_read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_ui_read_only", value)

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]:
        return pulumi.get(self, "login_designs")

    @login_designs.setter
    def login_designs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccessOrganizationLoginDesignArgs']]]]):
        pulumi.set(self, "login_designs", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> Optional[pulumi.Input[str]]:
        """
        How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        """
        return pulumi.get(self, "session_duration")

    @session_duration.setter
    def session_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "session_duration", value)

    @property
    @pulumi.getter(name="uiReadOnlyToggleReason")
    def ui_read_only_toggle_reason(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the reason why the UI read only field is being toggled.
        """
        return pulumi.get(self, "ui_read_only_toggle_reason")

    @ui_read_only_toggle_reason.setter
    def ui_read_only_toggle_reason(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ui_read_only_toggle_reason", value)

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @user_seat_expiration_inactive_time.setter
    def user_seat_expiration_inactive_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_seat_expiration_inactive_time", value)

    @property
    @pulumi.getter(name="warpAuthSessionDuration")
    def warp_auth_session_duration(self) -> Optional[pulumi.Input[str]]:
        """
        The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        """
        return pulumi.get(self, "warp_auth_session_duration")

    @warp_auth_session_duration.setter
    def warp_auth_session_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warp_auth_session_duration", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessOrganization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allow_authenticate_via_warp: Optional[pulumi.Input[bool]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 auto_redirect_to_identity: Optional[pulumi.Input[bool]] = None,
                 custom_pages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationCustomPageArgs']]]]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_duration: Optional[pulumi.Input[str]] = None,
                 ui_read_only_toggle_reason: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 warp_auth_session_duration: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        A Zero Trust organization defines the user login experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AccessOrganization("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example.cloudflareaccess.com",
            auth_domain="example.cloudflareaccess.com",
            is_ui_read_only=False,
            user_seat_expiration_inactive_time="720h",
            auto_redirect_to_identity=False,
            login_designs=[cloudflare.AccessOrganizationLoginDesignArgs(
                background_color="#ffffff",
                text_color="#000000",
                logo_path="https://example.com/logo.png",
                header_text="My header text",
                footer_text="My footer text",
            )])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[bool] allow_authenticate_via_warp: When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] auto_redirect_to_identity: When set to true, users skip the identity provider selection step during login.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationCustomPageArgs']]]] custom_pages: Custom pages for your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] session_duration: How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        :param pulumi.Input[str] ui_read_only_toggle_reason: A description of the reason why the UI read only field is being toggled.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] warp_auth_session_duration: The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessOrganizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A Zero Trust organization defines the user login experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.AccessOrganization("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="example.cloudflareaccess.com",
            auth_domain="example.cloudflareaccess.com",
            is_ui_read_only=False,
            user_seat_expiration_inactive_time="720h",
            auto_redirect_to_identity=False,
            login_designs=[cloudflare.AccessOrganizationLoginDesignArgs(
                background_color="#ffffff",
                text_color="#000000",
                logo_path="https://example.com/logo.png",
                header_text="My header text",
                footer_text="My footer text",
            )])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example <account_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessOrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessOrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allow_authenticate_via_warp: Optional[pulumi.Input[bool]] = None,
                 auth_domain: Optional[pulumi.Input[str]] = None,
                 auto_redirect_to_identity: Optional[pulumi.Input[bool]] = None,
                 custom_pages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationCustomPageArgs']]]]] = None,
                 is_ui_read_only: Optional[pulumi.Input[bool]] = None,
                 login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_duration: Optional[pulumi.Input[str]] = None,
                 ui_read_only_toggle_reason: Optional[pulumi.Input[str]] = None,
                 user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
                 warp_auth_session_duration: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessOrganizationArgs.__new__(AccessOrganizationArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["allow_authenticate_via_warp"] = allow_authenticate_via_warp
            if auth_domain is None and not opts.urn:
                raise TypeError("Missing required property 'auth_domain'")
            __props__.__dict__["auth_domain"] = auth_domain
            __props__.__dict__["auto_redirect_to_identity"] = auto_redirect_to_identity
            __props__.__dict__["custom_pages"] = custom_pages
            __props__.__dict__["is_ui_read_only"] = is_ui_read_only
            __props__.__dict__["login_designs"] = login_designs
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["session_duration"] = session_duration
            __props__.__dict__["ui_read_only_toggle_reason"] = ui_read_only_toggle_reason
            __props__.__dict__["user_seat_expiration_inactive_time"] = user_seat_expiration_inactive_time
            __props__.__dict__["warp_auth_session_duration"] = warp_auth_session_duration
            __props__.__dict__["zone_id"] = zone_id
        super(AccessOrganization, __self__).__init__(
            'cloudflare:index/accessOrganization:AccessOrganization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            allow_authenticate_via_warp: Optional[pulumi.Input[bool]] = None,
            auth_domain: Optional[pulumi.Input[str]] = None,
            auto_redirect_to_identity: Optional[pulumi.Input[bool]] = None,
            custom_pages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationCustomPageArgs']]]]] = None,
            is_ui_read_only: Optional[pulumi.Input[bool]] = None,
            login_designs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationLoginDesignArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            session_duration: Optional[pulumi.Input[str]] = None,
            ui_read_only_toggle_reason: Optional[pulumi.Input[str]] = None,
            user_seat_expiration_inactive_time: Optional[pulumi.Input[str]] = None,
            warp_auth_session_duration: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessOrganization':
        """
        Get an existing AccessOrganization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. Conflicts with `zone_id`.
        :param pulumi.Input[bool] allow_authenticate_via_warp: When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        :param pulumi.Input[str] auth_domain: The unique subdomain assigned to your Zero Trust organization.
        :param pulumi.Input[bool] auto_redirect_to_identity: When set to true, users skip the identity provider selection step during login.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AccessOrganizationCustomPageArgs']]]] custom_pages: Custom pages for your Zero Trust organization.
        :param pulumi.Input[bool] is_ui_read_only: When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        :param pulumi.Input[str] name: The name of your Zero Trust organization.
        :param pulumi.Input[str] session_duration: How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        :param pulumi.Input[str] ui_read_only_toggle_reason: A description of the reason why the UI read only field is being toggled.
        :param pulumi.Input[str] user_seat_expiration_inactive_time: The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        :param pulumi.Input[str] warp_auth_session_duration: The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessOrganizationState.__new__(_AccessOrganizationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["allow_authenticate_via_warp"] = allow_authenticate_via_warp
        __props__.__dict__["auth_domain"] = auth_domain
        __props__.__dict__["auto_redirect_to_identity"] = auto_redirect_to_identity
        __props__.__dict__["custom_pages"] = custom_pages
        __props__.__dict__["is_ui_read_only"] = is_ui_read_only
        __props__.__dict__["login_designs"] = login_designs
        __props__.__dict__["name"] = name
        __props__.__dict__["session_duration"] = session_duration
        __props__.__dict__["ui_read_only_toggle_reason"] = ui_read_only_toggle_reason
        __props__.__dict__["user_seat_expiration_inactive_time"] = user_seat_expiration_inactive_time
        __props__.__dict__["warp_auth_session_duration"] = warp_auth_session_duration
        __props__.__dict__["zone_id"] = zone_id
        return AccessOrganization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="allowAuthenticateViaWarp")
    def allow_authenticate_via_warp(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
        """
        return pulumi.get(self, "allow_authenticate_via_warp")

    @property
    @pulumi.getter(name="authDomain")
    def auth_domain(self) -> pulumi.Output[str]:
        """
        The unique subdomain assigned to your Zero Trust organization.
        """
        return pulumi.get(self, "auth_domain")

    @property
    @pulumi.getter(name="autoRedirectToIdentity")
    def auto_redirect_to_identity(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to true, users skip the identity provider selection step during login.
        """
        return pulumi.get(self, "auto_redirect_to_identity")

    @property
    @pulumi.getter(name="customPages")
    def custom_pages(self) -> pulumi.Output[Optional[Sequence['outputs.AccessOrganizationCustomPage']]]:
        """
        Custom pages for your Zero Trust organization.
        """
        return pulumi.get(self, "custom_pages")

    @property
    @pulumi.getter(name="isUiReadOnly")
    def is_ui_read_only(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        """
        return pulumi.get(self, "is_ui_read_only")

    @property
    @pulumi.getter(name="loginDesigns")
    def login_designs(self) -> pulumi.Output[Optional[Sequence['outputs.AccessOrganizationLoginDesign']]]:
        return pulumi.get(self, "login_designs")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of your Zero Trust organization.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sessionDuration")
    def session_duration(self) -> pulumi.Output[Optional[str]]:
        """
        How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        """
        return pulumi.get(self, "session_duration")

    @property
    @pulumi.getter(name="uiReadOnlyToggleReason")
    def ui_read_only_toggle_reason(self) -> pulumi.Output[Optional[str]]:
        """
        A description of the reason why the UI read only field is being toggled.
        """
        return pulumi.get(self, "ui_read_only_toggle_reason")

    @property
    @pulumi.getter(name="userSeatExpirationInactiveTime")
    def user_seat_expiration_inactive_time(self) -> pulumi.Output[Optional[str]]:
        """
        The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        """
        return pulumi.get(self, "user_seat_expiration_inactive_time")

    @property
    @pulumi.getter(name="warpAuthSessionDuration")
    def warp_auth_session_duration(self) -> pulumi.Output[Optional[str]]:
        """
        The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
        """
        return pulumi.get(self, "warp_auth_session_duration")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

