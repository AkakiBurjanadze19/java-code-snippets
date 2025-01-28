package GENERICS.WRAPPER;

import java.util.ArrayList;
import java.util.List;

public class UnboxingExample {
    public static void main(String[] args) {
        Character ch = 'a';
        char a = ch;
        System.out.println(a);

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        int numFirst = nums.get(0);
        int numSecond = nums.get(1);

        System.out.println("first element: " + numFirst);
        System.out.println("second element: " + numSecond);
    }
}
