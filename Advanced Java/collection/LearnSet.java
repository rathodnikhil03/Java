//The Set interface in Java is part of the Java Collections Framework and represents a collection that does not allow duplicate elements. 
//It models the mathematical set abstraction.

package collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be added as it is a duplicate

        // Displaying the set
        System.out.println("Set: " + set);

        // Checking for an element
        if (set.contains("Banana")) {
            System.out.println("Set contains Banana");
        }

        // Removing an element
        set.remove("Banana");

        // Displaying the set after removal
        System.out.println("Set after removal: " + set);
    }
}


