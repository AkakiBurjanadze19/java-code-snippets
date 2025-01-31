package OOP.INPUT;

import java.util.Scanner;

public class InputExamples {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = reader.nextLine();

        System.out.print("Last name: ");
        String lastName = reader.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.print("GPA: ");
        double gpa = Double.parseDouble(reader.nextLine());

        System.out.println();

        System.out.println("Personal information: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
