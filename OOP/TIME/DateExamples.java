package OOP.TIME;

import java.time.LocalDate;

public class DateExamples {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate min = LocalDate.MIN;
        LocalDate max = LocalDate.MAX;

        System.out.println("current date: " + now);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
