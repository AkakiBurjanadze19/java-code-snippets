package DATASTRUCTURES;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Akaki", 19);
        map.put("Luka", 19);
        map.put("Goga", 19);
        map.put("Alex", 20);
        map.put("Gegi", 19);
        map.put("Roma", 19);
        map.put("Demetre", 16);

        System.out.println(map);

        System.out.println("Age of Akaki: " + map.get("Akaki"));
        System.out.println("Age of Luka: " + map.get("Luka"));

        System.out.println("Akaki is in the map? " + map.containsKey("Akaki"));
        System.out.println("James in in the map? " + map.containsKey("James"));

        System.out.println("19 is in the map? " + map.containsValue(19));
        System.out.println("20 is in the map? " + map.containsValue(20));

        map.remove("Akaki");

        System.out.println(map);

        System.out.println("Size of the map: " + map.size());
        System.out.println("The map is empty? " + map.isEmpty());

        System.out.println("keys: " + map.keySet());
        System.out.println("values: " + map.values());

        System.out.println("Printing key:value pairs");
        for (String key : map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }
    }
}
