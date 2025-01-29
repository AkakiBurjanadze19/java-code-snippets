package INTERFACES.EXAMPLES;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        /* Tests a condition and returns true/false */
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(22));

        List<Integer> numbers = new ArrayList<>(List.of(5, 10, 4, 20, 21, 24));
        numbers.stream().filter(isEven).forEach(System.out::println);
    }
}
