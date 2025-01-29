package INTERFACES;

import java.util.function.Function;

public class useFooUsage {
    public static void main(String[] args) {
//        Foo foo = parameter -> parameter + " from lambda";
//        String result = useFoo.add("Message", foo);

        Function<String, String> fn = parameter -> parameter + " from lambda";
        String result = useFoo.add("Message", fn);
        System.out.println(result);
    }
}
