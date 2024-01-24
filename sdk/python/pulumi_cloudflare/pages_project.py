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

__all__ = ['PagesProjectArgs', 'PagesProject']

@pulumi.input_type
class PagesProjectArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 name: pulumi.Input[str],
                 production_branch: pulumi.Input[str],
                 build_config: Optional[pulumi.Input['PagesProjectBuildConfigArgs']] = None,
                 deployment_configs: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']] = None,
                 source: Optional[pulumi.Input['PagesProjectSourceArgs']] = None):
        """
        The set of arguments for constructing a PagesProject resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        :param pulumi.Input[str] production_branch: Project production branch name.
        :param pulumi.Input['PagesProjectBuildConfigArgs'] build_config: Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        :param pulumi.Input['PagesProjectDeploymentConfigsArgs'] deployment_configs: Configuration for deployments in a project.
        :param pulumi.Input['PagesProjectSourceArgs'] source: Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "production_branch", production_branch)
        if build_config is not None:
            pulumi.set(__self__, "build_config", build_config)
        if deployment_configs is not None:
            pulumi.set(__self__, "deployment_configs", deployment_configs)
        if source is not None:
            pulumi.set(__self__, "source", source)

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
    def name(self) -> pulumi.Input[str]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> pulumi.Input[str]:
        """
        Project production branch name.
        """
        return pulumi.get(self, "production_branch")

    @production_branch.setter
    def production_branch(self, value: pulumi.Input[str]):
        pulumi.set(self, "production_branch", value)

    @property
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> Optional[pulumi.Input['PagesProjectBuildConfigArgs']]:
        """
        Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        """
        return pulumi.get(self, "build_config")

    @build_config.setter
    def build_config(self, value: Optional[pulumi.Input['PagesProjectBuildConfigArgs']]):
        pulumi.set(self, "build_config", value)

    @property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]:
        """
        Configuration for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @deployment_configs.setter
    def deployment_configs(self, value: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]):
        pulumi.set(self, "deployment_configs", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['PagesProjectSourceArgs']]:
        """
        Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['PagesProjectSourceArgs']]):
        pulumi.set(self, "source", value)


@pulumi.input_type
class _PagesProjectState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 build_config: Optional[pulumi.Input['PagesProjectBuildConfigArgs']] = None,
                 created_on: Optional[pulumi.Input[str]] = None,
                 deployment_configs: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']] = None,
                 domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 production_branch: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input['PagesProjectSourceArgs']] = None,
                 subdomain: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PagesProject resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input['PagesProjectBuildConfigArgs'] build_config: Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        :param pulumi.Input[str] created_on: When the project was created.
        :param pulumi.Input['PagesProjectDeploymentConfigsArgs'] deployment_configs: Configuration for deployments in a project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: A list of associated custom domains for the project.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        :param pulumi.Input[str] production_branch: Project production branch name.
        :param pulumi.Input['PagesProjectSourceArgs'] source: Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        :param pulumi.Input[str] subdomain: The Cloudflare subdomain associated with the project.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if build_config is not None:
            pulumi.set(__self__, "build_config", build_config)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if deployment_configs is not None:
            pulumi.set(__self__, "deployment_configs", deployment_configs)
        if domains is not None:
            pulumi.set(__self__, "domains", domains)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if production_branch is not None:
            pulumi.set(__self__, "production_branch", production_branch)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)

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
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> Optional[pulumi.Input['PagesProjectBuildConfigArgs']]:
        """
        Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        """
        return pulumi.get(self, "build_config")

    @build_config.setter
    def build_config(self, value: Optional[pulumi.Input['PagesProjectBuildConfigArgs']]):
        pulumi.set(self, "build_config", value)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[str]]:
        """
        When the project was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_on", value)

    @property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]:
        """
        Configuration for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @deployment_configs.setter
    def deployment_configs(self, value: Optional[pulumi.Input['PagesProjectDeploymentConfigsArgs']]):
        pulumi.set(self, "deployment_configs", value)

    @property
    @pulumi.getter
    def domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of associated custom domains for the project.
        """
        return pulumi.get(self, "domains")

    @domains.setter
    def domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "domains", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> Optional[pulumi.Input[str]]:
        """
        Project production branch name.
        """
        return pulumi.get(self, "production_branch")

    @production_branch.setter
    def production_branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "production_branch", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['PagesProjectSourceArgs']]:
        """
        Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['PagesProjectSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        The Cloudflare subdomain associated with the project.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdomain", value)


class PagesProject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 build_config: Optional[pulumi.Input[pulumi.InputType['PagesProjectBuildConfigArgs']]] = None,
                 deployment_configs: Optional[pulumi.Input[pulumi.InputType['PagesProjectDeploymentConfigsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 production_branch: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['PagesProjectSourceArgs']]] = None,
                 __props__=None):
        """
        Provides a resource which manages Cloudflare Pages projects.

        > If you are using a `source` block configuration, you must first have a
           connected GitHub or GitLab account connected to Cloudflare. See the
           [Getting Started with Pages] documentation on how to link your accounts.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Direct upload Pages project
        basic_project = cloudflare.PagesProject("basicProject",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="this-is-my-project-01",
            production_branch="main")
        # Pages project with managing build config
        build_config = cloudflare.PagesProject("buildConfig",
            account_id="f037e56e89293a057740de681ac9abbe",
            build_config=cloudflare.PagesProjectBuildConfigArgs(
                build_command="npm run build",
                destination_dir="build",
                root_dir="",
                web_analytics_tag="cee1c73f6e4743d0b5e6bb1a0bcaabcc",
                web_analytics_token="021e1057c18547eca7b79f2516f06o7x",
            ),
            name="this-is-my-project-01",
            production_branch="main")
        # Pages project managing project source
        source_config = cloudflare.PagesProject("sourceConfig",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="this-is-my-project-01",
            production_branch="main",
            source=cloudflare.PagesProjectSourceArgs(
                config=cloudflare.PagesProjectSourceConfigArgs(
                    deployments_enabled=True,
                    owner="cloudflare",
                    pr_comments_enabled=True,
                    preview_branch_excludes=[
                        "main",
                        "prod",
                    ],
                    preview_branch_includes=[
                        "dev",
                        "preview",
                    ],
                    preview_deployment_setting="custom",
                    production_branch="main",
                    production_deployment_enabled=True,
                    repo_name="ninjakittens",
                ),
                type="github",
            ))
        # Pages project managing all configs
        deployment_configs = cloudflare.PagesProject("deploymentConfigs",
            account_id="f037e56e89293a057740de681ac9abbe",
            build_config=cloudflare.PagesProjectBuildConfigArgs(
                build_command="npm run build",
                destination_dir="build",
                root_dir="",
                web_analytics_tag="cee1c73f6e4743d0b5e6bb1a0bcaabcc",
                web_analytics_token="021e1057c18547eca7b79f2516f06o7x",
            ),
            deployment_configs=cloudflare.PagesProjectDeploymentConfigsArgs(
                preview=cloudflare.PagesProjectDeploymentConfigsPreviewArgs(
                    compatibility_date="2022-08-15",
                    compatibility_flags=["nodejs_compat"],
                    d1_databases={
                        "D1BINDING": "445e2955-951a-4358-a35b-a4d0c813f63",
                    },
                    durable_object_namespaces={
                        "DOBINDING": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                    },
                    environment_variables={
                        "ENVIRONMENT": "preview",
                    },
                    kv_namespaces={
                        "KVBINDING": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                    },
                    r2_buckets={
                        "R2BINDING": "some-bucket",
                    },
                    secrets={
                        "TURNSTILESECRET": "1x0000000000000000000000000000000AA",
                    },
                ),
                production=cloudflare.PagesProjectDeploymentConfigsProductionArgs(
                    compatibility_date="2022-08-16",
                    compatibility_flags=[
                        "nodejs_compat",
                        "streams_enable_constructors",
                    ],
                    d1_databases={
                        "D1BINDING1": "445e2955-951a-4358-a35b-a4d0c813f63",
                        "D1BINDING2": "a399414b-c697-409a-a688-377db6433cd9",
                    },
                    durable_object_namespaces={
                        "DOBINDING1": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                        "DOBINDING2": "3cdca5f8bb22bc390deee10ebbb36be5",
                    },
                    environment_variables={
                        "ENVIRONMENT": "production",
                        "OTHERVALUE": "other value",
                    },
                    kv_namespaces={
                        "KVBINDING1": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                        "KVBINDING2": "3cdca5f8bb22bc390deee10ebbb36be5",
                    },
                    r2_buckets={
                        "R2BINDING1": "some-bucket",
                        "R2BINDING2": "other-bucket",
                    },
                    secrets={
                        "TURNSTILEINVISSECRET": "2x0000000000000000000000000000000AA",
                        "TURNSTILESECRET": "1x0000000000000000000000000000000AA",
                    },
                ),
            ),
            name="this-is-my-project-01",
            production_branch="main",
            source=cloudflare.PagesProjectSourceArgs(
                config=cloudflare.PagesProjectSourceConfigArgs(
                    deployments_enabled=True,
                    owner="cloudflare",
                    pr_comments_enabled=True,
                    preview_branch_excludes=[
                        "main",
                        "prod",
                    ],
                    preview_branch_includes=[
                        "dev",
                        "preview",
                    ],
                    preview_deployment_setting="custom",
                    production_branch="main",
                    production_deployment_enabled=True,
                    repo_name="ninjakittens",
                ),
                type="github",
            ))
        ```

        ## Import

        !> It is not possible to import a pages project with secret environment variables. If you have a secret environment variable, you must remove it from your project before importing it.

        ```sh
         $ pulumi import cloudflare:index/pagesProject:PagesProject example <account_id>/<project_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[pulumi.InputType['PagesProjectBuildConfigArgs']] build_config: Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        :param pulumi.Input[pulumi.InputType['PagesProjectDeploymentConfigsArgs']] deployment_configs: Configuration for deployments in a project.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        :param pulumi.Input[str] production_branch: Project production branch name.
        :param pulumi.Input[pulumi.InputType['PagesProjectSourceArgs']] source: Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PagesProjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource which manages Cloudflare Pages projects.

        > If you are using a `source` block configuration, you must first have a
           connected GitHub or GitLab account connected to Cloudflare. See the
           [Getting Started with Pages] documentation on how to link your accounts.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Direct upload Pages project
        basic_project = cloudflare.PagesProject("basicProject",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="this-is-my-project-01",
            production_branch="main")
        # Pages project with managing build config
        build_config = cloudflare.PagesProject("buildConfig",
            account_id="f037e56e89293a057740de681ac9abbe",
            build_config=cloudflare.PagesProjectBuildConfigArgs(
                build_command="npm run build",
                destination_dir="build",
                root_dir="",
                web_analytics_tag="cee1c73f6e4743d0b5e6bb1a0bcaabcc",
                web_analytics_token="021e1057c18547eca7b79f2516f06o7x",
            ),
            name="this-is-my-project-01",
            production_branch="main")
        # Pages project managing project source
        source_config = cloudflare.PagesProject("sourceConfig",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="this-is-my-project-01",
            production_branch="main",
            source=cloudflare.PagesProjectSourceArgs(
                config=cloudflare.PagesProjectSourceConfigArgs(
                    deployments_enabled=True,
                    owner="cloudflare",
                    pr_comments_enabled=True,
                    preview_branch_excludes=[
                        "main",
                        "prod",
                    ],
                    preview_branch_includes=[
                        "dev",
                        "preview",
                    ],
                    preview_deployment_setting="custom",
                    production_branch="main",
                    production_deployment_enabled=True,
                    repo_name="ninjakittens",
                ),
                type="github",
            ))
        # Pages project managing all configs
        deployment_configs = cloudflare.PagesProject("deploymentConfigs",
            account_id="f037e56e89293a057740de681ac9abbe",
            build_config=cloudflare.PagesProjectBuildConfigArgs(
                build_command="npm run build",
                destination_dir="build",
                root_dir="",
                web_analytics_tag="cee1c73f6e4743d0b5e6bb1a0bcaabcc",
                web_analytics_token="021e1057c18547eca7b79f2516f06o7x",
            ),
            deployment_configs=cloudflare.PagesProjectDeploymentConfigsArgs(
                preview=cloudflare.PagesProjectDeploymentConfigsPreviewArgs(
                    compatibility_date="2022-08-15",
                    compatibility_flags=["nodejs_compat"],
                    d1_databases={
                        "D1BINDING": "445e2955-951a-4358-a35b-a4d0c813f63",
                    },
                    durable_object_namespaces={
                        "DOBINDING": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                    },
                    environment_variables={
                        "ENVIRONMENT": "preview",
                    },
                    kv_namespaces={
                        "KVBINDING": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                    },
                    r2_buckets={
                        "R2BINDING": "some-bucket",
                    },
                    secrets={
                        "TURNSTILESECRET": "1x0000000000000000000000000000000AA",
                    },
                ),
                production=cloudflare.PagesProjectDeploymentConfigsProductionArgs(
                    compatibility_date="2022-08-16",
                    compatibility_flags=[
                        "nodejs_compat",
                        "streams_enable_constructors",
                    ],
                    d1_databases={
                        "D1BINDING1": "445e2955-951a-4358-a35b-a4d0c813f63",
                        "D1BINDING2": "a399414b-c697-409a-a688-377db6433cd9",
                    },
                    durable_object_namespaces={
                        "DOBINDING1": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                        "DOBINDING2": "3cdca5f8bb22bc390deee10ebbb36be5",
                    },
                    environment_variables={
                        "ENVIRONMENT": "production",
                        "OTHERVALUE": "other value",
                    },
                    kv_namespaces={
                        "KVBINDING1": "5eb63bbbe01eeed093cb22bb8f5acdc3",
                        "KVBINDING2": "3cdca5f8bb22bc390deee10ebbb36be5",
                    },
                    r2_buckets={
                        "R2BINDING1": "some-bucket",
                        "R2BINDING2": "other-bucket",
                    },
                    secrets={
                        "TURNSTILEINVISSECRET": "2x0000000000000000000000000000000AA",
                        "TURNSTILESECRET": "1x0000000000000000000000000000000AA",
                    },
                ),
            ),
            name="this-is-my-project-01",
            production_branch="main",
            source=cloudflare.PagesProjectSourceArgs(
                config=cloudflare.PagesProjectSourceConfigArgs(
                    deployments_enabled=True,
                    owner="cloudflare",
                    pr_comments_enabled=True,
                    preview_branch_excludes=[
                        "main",
                        "prod",
                    ],
                    preview_branch_includes=[
                        "dev",
                        "preview",
                    ],
                    preview_deployment_setting="custom",
                    production_branch="main",
                    production_deployment_enabled=True,
                    repo_name="ninjakittens",
                ),
                type="github",
            ))
        ```

        ## Import

        !> It is not possible to import a pages project with secret environment variables. If you have a secret environment variable, you must remove it from your project before importing it.

        ```sh
         $ pulumi import cloudflare:index/pagesProject:PagesProject example <account_id>/<project_name>
        ```

        :param str resource_name: The name of the resource.
        :param PagesProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PagesProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 build_config: Optional[pulumi.Input[pulumi.InputType['PagesProjectBuildConfigArgs']]] = None,
                 deployment_configs: Optional[pulumi.Input[pulumi.InputType['PagesProjectDeploymentConfigsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 production_branch: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['PagesProjectSourceArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PagesProjectArgs.__new__(PagesProjectArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["build_config"] = build_config
            __props__.__dict__["deployment_configs"] = deployment_configs
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            if production_branch is None and not opts.urn:
                raise TypeError("Missing required property 'production_branch'")
            __props__.__dict__["production_branch"] = production_branch
            __props__.__dict__["source"] = source
            __props__.__dict__["created_on"] = None
            __props__.__dict__["domains"] = None
            __props__.__dict__["subdomain"] = None
        super(PagesProject, __self__).__init__(
            'cloudflare:index/pagesProject:PagesProject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            build_config: Optional[pulumi.Input[pulumi.InputType['PagesProjectBuildConfigArgs']]] = None,
            created_on: Optional[pulumi.Input[str]] = None,
            deployment_configs: Optional[pulumi.Input[pulumi.InputType['PagesProjectDeploymentConfigsArgs']]] = None,
            domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            production_branch: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[pulumi.InputType['PagesProjectSourceArgs']]] = None,
            subdomain: Optional[pulumi.Input[str]] = None) -> 'PagesProject':
        """
        Get an existing PagesProject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[pulumi.InputType['PagesProjectBuildConfigArgs']] build_config: Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        :param pulumi.Input[str] created_on: When the project was created.
        :param pulumi.Input[pulumi.InputType['PagesProjectDeploymentConfigsArgs']] deployment_configs: Configuration for deployments in a project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] domains: A list of associated custom domains for the project.
        :param pulumi.Input[str] name: The global variable for the binding in your Worker code.
        :param pulumi.Input[str] production_branch: Project production branch name.
        :param pulumi.Input[pulumi.InputType['PagesProjectSourceArgs']] source: Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        :param pulumi.Input[str] subdomain: The Cloudflare subdomain associated with the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PagesProjectState.__new__(_PagesProjectState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["build_config"] = build_config
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["deployment_configs"] = deployment_configs
        __props__.__dict__["domains"] = domains
        __props__.__dict__["name"] = name
        __props__.__dict__["production_branch"] = production_branch
        __props__.__dict__["source"] = source
        __props__.__dict__["subdomain"] = subdomain
        return PagesProject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="buildConfig")
    def build_config(self) -> pulumi.Output[Optional['outputs.PagesProjectBuildConfig']]:
        """
        Configuration for the project build process. Read more about the build configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/build-configuration).
        """
        return pulumi.get(self, "build_config")

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[str]:
        """
        When the project was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter(name="deploymentConfigs")
    def deployment_configs(self) -> pulumi.Output['outputs.PagesProjectDeploymentConfigs']:
        """
        Configuration for deployments in a project.
        """
        return pulumi.get(self, "deployment_configs")

    @property
    @pulumi.getter
    def domains(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of associated custom domains for the project.
        """
        return pulumi.get(self, "domains")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The global variable for the binding in your Worker code.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="productionBranch")
    def production_branch(self) -> pulumi.Output[str]:
        """
        Project production branch name.
        """
        return pulumi.get(self, "production_branch")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional['outputs.PagesProjectSource']]:
        """
        Configuration for the project source. Read more about the source configuration in the [developer documentation](https://developers.cloudflare.com/pages/platform/branch-build-controls/).
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Output[str]:
        """
        The Cloudflare subdomain associated with the project.
        """
        return pulumi.get(self, "subdomain")

