package INTERFACES.EXAMPLES;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /* Supplies a value of type T */
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
    }
}
