package GENERICS.WRAPPER;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        char ch = 'a';
        Character charBox = ch;
        System.out.println(charBox);

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        System.out.println("size: " + nums.size());
        System.out.println("first element: " + nums.get(0));
        System.out.println("second element: " + nums.get(1));
    }
}
