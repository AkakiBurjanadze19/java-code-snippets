package GENERICS;

public class GenericFunctionExample {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f"};
        Integer[] numbers = {10, 20, 30, 40, 50, 60};
        Boolean[] values = {true, true, false, false, true, true};
        Double[] decimalValues = {3.5, 10.2, 12.5, 0.3, 1.5, 2.5};

        printArray(letters);
        printArray(numbers);
        printArray(values);
        printArray(decimalValues);
    }

    public static <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
