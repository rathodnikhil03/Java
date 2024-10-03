package collection;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListInList {
    public static void main(String[] args) {
        // Creating a LinkedList
        List<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("");
        list.add("Two");
        list.add("Three");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Adding an element at a specific position
        list.add(1, "Four");
        System.out.println("After adding at index 1: " + list);

        // Removing an element
        list.remove("Two");
        System.out.println("After removing 'Two': " + list);

        // Getting an element
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Setting an element
        list.set(2, "Five");
        System.out.println("After setting at index 2: " + list);
    }
}
