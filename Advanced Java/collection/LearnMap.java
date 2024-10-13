package collection;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

class HashMaps {

    // Key-Value Pairs: Stores data as key-value pairs.
    // No Duplicate Keys: Each key must be unique; duplicate keys are not allowed.
    // Null Keys and Values: Allows one null key and multiple null values.
    // Unordered: Does not maintain any order of the keys.
    public void hashmap() {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // if(!map.containsKey("Banana")){
        // map.put("Banana", 25);
        // }

        map.putIfAbsent("Banana", 25);

        // Accessing a value using its key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Iterating over the key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("Cherry");

        // Displaying the HashMap after removal
        System.out.println("HashMap: " + map);
    }

}

class TreeMaps {

    // Sorted Order: Maintains the keys in ascending order by default.
    // Custom Ordering: Allows custom sorting by providing a comparator at map
    // creation time.
    // No Duplicates: Does not allow duplicate keys; each key can map to exactly one
    // value.
    // Navigable: Provides methods to navigate the map like lowerKey, floorKey,
    // ceilingKey, and higherKey.
    public void treemap() {
        // Creating a HashMap
        Map<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // if(!map.containsKey("Banana")){
        // map.put("Banana", 25);
        // }

        map.putIfAbsent("Banana", 25);

        // Accessing a value using its key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Iterating over the key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        map.remove("Cherry");

        // Displaying the HashMap after removal
        System.out.println("TreeMap: " + map);
    }
}

public class LearnMap {
    public static void main(String[] args) {

        HashMaps hm = new HashMaps();
        hm.hashmap();

        TreeMaps tm = new TreeMaps();
        tm.treemap();
    }
}
