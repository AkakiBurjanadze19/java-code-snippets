package INTERFACES.EXAMPLES;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /* Accepts an input and performs an action */
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("how are you!");

        /* Usage with forEach */
        List<String> names = List.of("Akaki", "Luka", "Goga");
        names.forEach(printUpperCase);
    }
}
