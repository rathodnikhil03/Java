//An ArrayList in Java is a resizable-array implementation of the List interface. 
//It is a part of the Java Collections Framework and is used to store a collection of elements. 
//ArrayList is a dynamic array that can grow or shrink in size as elements are added or removed.

package collection;
import java.util.ArrayList; 

public class LearnArrayList {
    
    public static void main(String[] args) {
 

 
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the ArrayList
        System.out.println("ArrayList: " + colors);

        // Access an element at a specific index
        String secondColor = colors.get(1);
        System.out.println("Second color: " + secondColor);

        // Remove an element from the ArrayList
        colors.remove("Green");
        System.out.println("ArrayList after removal: " + colors);

        // Check if an element is present in the ArrayList
        boolean isYellowPresent = colors.contains("Yellow");
        System.out.println("Is Yellow present? " + isYellowPresent);
    }
}
    

