package INTERFACES.EXAMPLES;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /* Accepts two inputs (T and U) and returns a result R */
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 10));
        System.out.println(add.apply(10, 5));
        System.out.println(add.apply(2, 3));
        System.out.println(add.apply(15, 10));
    }
}
