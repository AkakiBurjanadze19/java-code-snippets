package DATASTRUCTURES;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("James", 15);
        treeMap.put("Thomas", 12);
        treeMap.put("Nick", 18);
        treeMap.put("Ann", 13);
        treeMap.put("Gordon", 8);
        treeMap.put("Lucy", 3);
        treeMap.put("Ben", 10);
        treeMap.put("Carl", 38);

        System.out.println("TreeMap: " + treeMap);

        System.out.println("Size of TreeMap: " + treeMap.size());

        System.out.println("Age of James: " + treeMap.get("James"));
        System.out.println("Age of Lucy: " + treeMap.get("Lucy"));
        System.out.println("Age of Nick: " + treeMap.get("Nick"));

        System.out.println("TreeMap contains Carl: " + treeMap.containsKey("Carl"));
        System.out.println("TreeMap contains William: " + treeMap.containsKey("William"));

        treeMap.remove("Lucy");
        System.out.println("Updated TreeMap: " + treeMap);

        System.out.println("keys: " + treeMap.keySet());
        System.out.println("values: " + treeMap.values());

        System.out.println("Printing key:value pairs...");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ", " + treeMap.get(key));
        }

        System.out.println(treeMap.entrySet());
    }
}
