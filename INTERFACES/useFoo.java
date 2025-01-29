package INTERFACES;

import java.util.function.Function;

public class useFoo {
    public static String add(String string, Foo foo) {
        return foo.method(string);
    }

    public static String add(String string, Function<String, String> fn) {
        return fn.apply(string);
    }
}
