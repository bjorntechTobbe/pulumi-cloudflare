// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationLandingPageDesignArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationLandingPageDesignArgs Empty = new AccessApplicationLandingPageDesignArgs();

    /**
     * The button color of the landing page.
     * 
     */
    @Import(name="buttonColor")
    private @Nullable Output<String> buttonColor;

    /**
     * @return The button color of the landing page.
     * 
     */
    public Optional<Output<String>> buttonColor() {
        return Optional.ofNullable(this.buttonColor);
    }

    /**
     * The button text color of the landing page.
     * 
     */
    @Import(name="buttonTextColor")
    private @Nullable Output<String> buttonTextColor;

    /**
     * @return The button text color of the landing page.
     * 
     */
    public Optional<Output<String>> buttonTextColor() {
        return Optional.ofNullable(this.buttonTextColor);
    }

    /**
     * The URL of the image to be displayed in the landing page.
     * 
     */
    @Import(name="imageUrl")
    private @Nullable Output<String> imageUrl;

    /**
     * @return The URL of the image to be displayed in the landing page.
     * 
     */
    public Optional<Output<String>> imageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }

    /**
     * The message of the landing page.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return The message of the landing page.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The title of the landing page.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title of the landing page.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private AccessApplicationLandingPageDesignArgs() {}

    private AccessApplicationLandingPageDesignArgs(AccessApplicationLandingPageDesignArgs $) {
        this.buttonColor = $.buttonColor;
        this.buttonTextColor = $.buttonTextColor;
        this.imageUrl = $.imageUrl;
        this.message = $.message;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationLandingPageDesignArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationLandingPageDesignArgs $;

        public Builder() {
            $ = new AccessApplicationLandingPageDesignArgs();
        }

        public Builder(AccessApplicationLandingPageDesignArgs defaults) {
            $ = new AccessApplicationLandingPageDesignArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buttonColor The button color of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder buttonColor(@Nullable Output<String> buttonColor) {
            $.buttonColor = buttonColor;
            return this;
        }

        /**
         * @param buttonColor The button color of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder buttonColor(String buttonColor) {
            return buttonColor(Output.of(buttonColor));
        }

        /**
         * @param buttonTextColor The button text color of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder buttonTextColor(@Nullable Output<String> buttonTextColor) {
            $.buttonTextColor = buttonTextColor;
            return this;
        }

        /**
         * @param buttonTextColor The button text color of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder buttonTextColor(String buttonTextColor) {
            return buttonTextColor(Output.of(buttonTextColor));
        }

        /**
         * @param imageUrl The URL of the image to be displayed in the landing page.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(@Nullable Output<String> imageUrl) {
            $.imageUrl = imageUrl;
            return this;
        }

        /**
         * @param imageUrl The URL of the image to be displayed in the landing page.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(String imageUrl) {
            return imageUrl(Output.of(imageUrl));
        }

        /**
         * @param message The message of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message The message of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param title The title of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title of the landing page.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public AccessApplicationLandingPageDesignArgs build() {
            return $;
        }
    }

}
