//The Set interface in Java is part of the Java Collections Framework and represents a collection that does not allow duplicate elements. 
//It models the mathematical set abstraction.

package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class HashSets {

    public void hashset() {

        // No Duplicates: Ensures that no two elements in the set are equal.
        // Unordered: Does not guarantee any specific order of the elements.
        // Allows Null: Can contain a single null element.

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

class LinkedHashSets {

    public void linkedhashset() {

        // No Duplicates: Like a HashSet, it doesn't allow duplicate elements.
        // Insertion Order: Maintains a doubly-linked list internally, which keeps track
        // of the insertion order.
        // Performance: Generally offers constant time performance for basic operations
        // like add, remove, and contains, similar to a HashSet.

        // Creating a TreeSet
        Set<Integer> set = new LinkedHashSet<>();

        // Adding elements to the set
        set.add(12);
        set.add(45);
        set.add(37);
        set.add(65); // This will not be added as it is a duplicate

        // Displaying the set
        System.out.println("Set: " + set);

        // Checking for an element
        if (set.contains(45)) {
            System.out.println("Set contains 45");
        }

        // Removing an element
        set.remove(57);

        // Displaying the set after removal
        System.out.println("Set after removal: " + set);
    }

}

class TreeSets {

    public void treeset() {

        // Sorted Order: Maintains the elements in ascending order.
        // No Duplicates: Does not allow duplicate elements.
        // NavigableSet: Implements the NavigableSet interface, providing navigation
        // methods like lower, floor, ceiling, and higher.

        // Creating a LinkedHashSet
        Set<Integer> set = new TreeSet<>();

        // Adding elements to the set
        set.add(12);
        set.add(45);
        set.add(37);
        set.add(65); // This will not be added as it is a duplicate

        // Displaying the set
        System.out.println("Set: " + set);

        // Checking for an element
        if (set.contains(45)) {
            System.out.println("Set contains 45");
        }

        // Removing an element
        set.remove(57);

        // Displaying the set after removal
        System.out.println("Set after removal: " + set);
    }

}

public class LearnSet {
    public static void main(String[] args) {

        HashSets sh = new HashSets();
        sh.hashset();

        LinkedHashSets lhs = new LinkedHashSets();
        lhs.linkedhashset();

        TreeSets ts = new TreeSets();
        ts.treeset();
    }
}
