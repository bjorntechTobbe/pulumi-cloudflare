// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.DlpProfileEntryPattern;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DlpProfileEntry {
    /**
     * @return Whether the entry is active. Defaults to `false`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Unique entry identifier.
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the entry to deploy.
     * 
     */
    private String name;
    private @Nullable DlpProfileEntryPattern pattern;

    private DlpProfileEntry() {}
    /**
     * @return Whether the entry is active. Defaults to `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Unique entry identifier.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the entry to deploy.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<DlpProfileEntryPattern> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DlpProfileEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private String name;
        private @Nullable DlpProfileEntryPattern pattern;
        public Builder() {}
        public Builder(DlpProfileEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("DlpProfileEntry", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pattern(@Nullable DlpProfileEntryPattern pattern) {

            this.pattern = pattern;
            return this;
        }
        public DlpProfileEntry build() {
            final var _resultValue = new DlpProfileEntry();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.pattern = pattern;
            return _resultValue;
        }
    }
}
