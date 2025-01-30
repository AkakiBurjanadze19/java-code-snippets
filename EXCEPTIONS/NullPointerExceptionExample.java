package EXCEPTIONS;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String name = null;
        try {
            int length = name.length();
            System.out.println("length of name: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException encountered!");
            e.printStackTrace();
        }
    }
}
