package EXCEPTIONS;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "hello";
        try {
            int parsedNumber = Integer.parseInt(str);
            System.out.println("parsedNumber: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse String to an integer!");
            e.printStackTrace();
        }
    }
}
