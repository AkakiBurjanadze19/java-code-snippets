package INTERFACES.EXAMPLES.CUSTOM;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MultipleFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.startsWith("A");
        Function<String, Integer> lengthMapper = s -> s.length();

        List<String> names = new ArrayList<>(List.of("Akaki", "Luka", "Alex"));
        names.stream().filter(startsWithA).map(lengthMapper).forEach(System.out::println);
    }
}
