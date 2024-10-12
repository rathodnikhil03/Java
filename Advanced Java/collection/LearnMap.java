package collection;
import java.util.HashMap;
import java.util.Map;


class HashMaps{
    
    public void hashmap(){
    // Creating a HashMap
    Map<String, Integer> map = new HashMap<>();

    // Adding key-value pairs to the HashMap
    map.put("Apple", 10);
    map.put("Banana", 20);
    map.put("Cherry", 30);

    // if(!map.containsKey("Banana")){
    //     map.put("Banana", 25);
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
public class LearnMap {
    public static void main(String[] args) {
        
    HashMaps hm = new HashMaps();
    hm.hashmap();
 

}
}


