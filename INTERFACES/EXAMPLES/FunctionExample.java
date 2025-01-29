package INTERFACES.EXAMPLES;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /* Transforms an input of type T to an output of type R */
        Function<String, Integer> stringLength = s -> s.length();

        Function<List<Integer>, Integer> sum = (nums) -> {
          int total = 0;

          for (int num : nums) {
              total += num;
          }

          return total;
        };

        System.out.println(stringLength.apply("hello"));
        System.out.println(stringLength.apply("how are you?"));

        List<Integer> nums1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> nums2 = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        System.out.println(sum.apply(nums1));
        System.out.println(sum.apply(nums2));
    }
}
