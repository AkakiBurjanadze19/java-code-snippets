package INTERFACES;

@FunctionalInterface
public interface Baz {
    String method(String string);
    default String defaultBaz() {
        return "default Baz";
    }
    default String defaultCommon() {
        return "default Common";
    }
}
