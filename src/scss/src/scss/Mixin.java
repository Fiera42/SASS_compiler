package scss.src.scss;

import scss.src.scss.lib.ScssParser;

import java.util.*;

public record Mixin(String name, List<Argument> args, ScssParser.BlockContext content) {
    public Mixin {
        Objects.requireNonNull(name);
        Objects.requireNonNull(args);

        args = List.copyOf(args);
    }

    public int argCount() {
        return args.size();
    }

    public int mandatoryArgCount() {
        return (int) args.stream()
                .filter(arg -> arg.defaultValue().isEmpty())
                .count();
    }

    public boolean isMoreSpecificThan(Mixin mixin) {
        if (mandatoryArgCount() > mixin.mandatoryArgCount()) return true;
        return argCount() < mixin.argCount();
    }

    public Optional<Mixin> fitArgs(List<Argument> list) {
        Set<Argument> newArgs = new LinkedHashSet<>();
        List<String> finalArgList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Argument arg = list.get(i);

            if (arg.name().isEmpty()) {
                if (args.size() - 1 > i) {
                    newArgs.add(new Argument(args.get(i).name(), Optional.of(arg.defaultValue().orElseThrow()), false));
                } else {
                    finalArgList.add(arg.defaultValue().orElseThrow());
                }
            } else {
                newArgs.add(new Argument(arg.name(), Optional.of(arg.defaultValue().orElseThrow()), false));
            }
        }

        if (!finalArgList.isEmpty()) {
            if (args.getLast().isDotDotDot()) {
                newArgs.add(new Argument(args.getLast().name(), Optional.of(String.join(", ", finalArgList)), true));
            } else {
                newArgs.add(new Argument(args.getLast().name(), Optional.of(finalArgList.getFirst()), true));
            }
        }

        for (Argument arg : args) {
            arg.defaultValue().ifPresent(_ -> newArgs.add(arg));
        }

        if (!newArgs.containsAll(args)) return Optional.empty();
        newArgs.removeIf(arg -> !args.contains(arg));

        return Optional.of(new Mixin(name, newArgs.stream().toList(), content));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (other instanceof Mixin otherMixin) {
            if (!name.equals(otherMixin.name())) return false;
            return args.equals(otherMixin.args());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, args);
    }
}
