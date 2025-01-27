package DATASTRUCTURES;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> countries = new Stack<>();

        countries.push("Georgia");
        countries.push("Germany");
        countries.push("United States");

        System.out.println("Top element: " + countries.peek());

        System.out.println("Popped element: " + countries.pop());

        System.out.println("Stack is empty? " + countries.isEmpty());

        System.out.println("Size of a stack: " + countries.size());

        System.out.println("Printing countries...");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
