package INTERFACES;

@FunctionalInterface
public interface Bar {
    String method(String string);
    default String defaultBar() {
        return "default Bar";
    }
    default String defaultCommon() {
        return "default Common";
    }
}
