package scss.src.scss;

import java.util.Objects;
import java.util.Optional;

public record Argument(String name, Optional<String> defaultValue, boolean isDotDotDot) {
    public Argument {
        Objects.requireNonNull(name);
        Objects.requireNonNull(defaultValue);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (other instanceof Argument otherArgument) {
            return name.equals(otherArgument.name());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
