package DATASTRUCTURES;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First number: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);
        System.out.println("Last number: " + numbers[numbers.length - 1]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        numbers[1] = 25;
        System.out.println("Updated number at index 1: " + numbers[1]);

        System.out.println("Printing all numbers...");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
