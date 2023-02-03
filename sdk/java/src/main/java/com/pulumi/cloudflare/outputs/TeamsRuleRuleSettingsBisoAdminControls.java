// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsRuleRuleSettingsBisoAdminControls {
    private @Nullable Boolean disableCopyPaste;
    private @Nullable Boolean disableDownload;
    private @Nullable Boolean disableKeyboard;
    private @Nullable Boolean disablePrinting;
    private @Nullable Boolean disableUpload;

    private TeamsRuleRuleSettingsBisoAdminControls() {}
    public Optional<Boolean> disableCopyPaste() {
        return Optional.ofNullable(this.disableCopyPaste);
    }
    public Optional<Boolean> disableDownload() {
        return Optional.ofNullable(this.disableDownload);
    }
    public Optional<Boolean> disableKeyboard() {
        return Optional.ofNullable(this.disableKeyboard);
    }
    public Optional<Boolean> disablePrinting() {
        return Optional.ofNullable(this.disablePrinting);
    }
    public Optional<Boolean> disableUpload() {
        return Optional.ofNullable(this.disableUpload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsRuleRuleSettingsBisoAdminControls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disableCopyPaste;
        private @Nullable Boolean disableDownload;
        private @Nullable Boolean disableKeyboard;
        private @Nullable Boolean disablePrinting;
        private @Nullable Boolean disableUpload;
        public Builder() {}
        public Builder(TeamsRuleRuleSettingsBisoAdminControls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableCopyPaste = defaults.disableCopyPaste;
    	      this.disableDownload = defaults.disableDownload;
    	      this.disableKeyboard = defaults.disableKeyboard;
    	      this.disablePrinting = defaults.disablePrinting;
    	      this.disableUpload = defaults.disableUpload;
        }

        @CustomType.Setter
        public Builder disableCopyPaste(@Nullable Boolean disableCopyPaste) {
            this.disableCopyPaste = disableCopyPaste;
            return this;
        }
        @CustomType.Setter
        public Builder disableDownload(@Nullable Boolean disableDownload) {
            this.disableDownload = disableDownload;
            return this;
        }
        @CustomType.Setter
        public Builder disableKeyboard(@Nullable Boolean disableKeyboard) {
            this.disableKeyboard = disableKeyboard;
            return this;
        }
        @CustomType.Setter
        public Builder disablePrinting(@Nullable Boolean disablePrinting) {
            this.disablePrinting = disablePrinting;
            return this;
        }
        @CustomType.Setter
        public Builder disableUpload(@Nullable Boolean disableUpload) {
            this.disableUpload = disableUpload;
            return this;
        }
        public TeamsRuleRuleSettingsBisoAdminControls build() {
            final var o = new TeamsRuleRuleSettingsBisoAdminControls();
            o.disableCopyPaste = disableCopyPaste;
            o.disableDownload = disableDownload;
            o.disableKeyboard = disableKeyboard;
            o.disablePrinting = disablePrinting;
            o.disableUpload = disableUpload;
            return o;
        }
    }
}
