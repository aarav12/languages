package syntax;

import java.util.HashMap;

public class MapOps {

    public static void hashMapOps() {

        System.out.println("------------------------------------------");
        System.out.println("HASHMAP OPERATIONS");
        System.out.println("---------------------");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        map.putIfAbsent("E", 5);
        map.putIfAbsent("E", 6);

        map.get("E");
        map.getOrDefault("F", 0);
        map.remove("E");

        map.size();

        map.containsKey("E");
        map.containsValue(2);

        //HashMap and ConcurrentHashMap are both implementations of the Map interface in Java,
        //but they serve different purposes and have different characteristics, especially in the context of concurrency

    }

    public static void treeMapOps() {

        System.out.println("------------------------------------------");
        System.out.println("TREEMAP OPERATIONS");
        System.out.println("---------------------");

    }

}
