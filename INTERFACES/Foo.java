package INTERFACES;

@FunctionalInterface
public interface Foo {
    String method(String string);
    default String defaultFoo() {
        return "default Foo";
    }
    default String defaultCommon() {
        return "default Common";
    }
}
