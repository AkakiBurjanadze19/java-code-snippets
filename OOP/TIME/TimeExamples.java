package OOP.TIME;

import java.time.LocalTime;

public class TimeExamples {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime min = LocalTime.MIN;
        LocalTime max = LocalTime.MAX;

        System.out.println("current time: " + currentTime);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
