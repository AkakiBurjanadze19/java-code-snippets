package INTERFACES.EXAMPLES.CUSTOM;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // static method reference
        Function<String, Integer> parseInt = Integer::parseInt;
        System.out.println(parseInt.apply("123"));
        System.out.println(parseInt.apply("450"));

        // instance method reference
        Consumer<String> printer = System.out::println;
        printer.accept("hello");
        printer.accept("how are you?");

        // constructor reference
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();

        list.add("hello");
        list.add("how");
        list.add("are");
        list.add("you");

        list.forEach(printer);
    }
}
