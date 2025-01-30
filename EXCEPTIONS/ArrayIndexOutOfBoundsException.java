package EXCEPTIONS;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            int index = 6;
            System.out.println("letter at index 6: " + letters[index]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
            e.printStackTrace();
        }
    }
}
