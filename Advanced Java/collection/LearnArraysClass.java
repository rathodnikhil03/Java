package collection;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LearnArraysClass {

    public static void main(String[] args) {

        // Sorting an Array:
        // This method sorts the specified array of objects into ascending order,
        // according to the natural ordering of its elements. It uses the dual-pivot
        // quicksort algorithm, which is a variation of the quicksort algorithm that is
        // faster and more efficient.
        int[] num1 = { 3, 5, 1, 4, 2 };
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

        // Binary Search:
        // This method searches the specified array for the specified key using the
        // binary search algorithm. The array must be sorted before calling this method.
        // If the array contains multiple elements with the specified value, there is no
        // guarantee which one will be found.
        // the binarySearch works when the array is sorted.
        int[] num2 = { 1, 2, 3, 4, 5 };
        int index = Arrays.binarySearch(num2, 3);
        System.out.println("Index of 3 is: " + index);

        // Comparing Arrays:
        // This method returns true if the two specified arrays are equal to one
        // another. Two arrays are considered equal if both arrays contain the same
        // number of elements, and all corresponding pairs of elements in the two arrays
        // are equal.
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + isEqual);

        // Filling an Array:
        // This method assigns the specified value to each element of the specified
        // array. This is useful for initializing an array with a default value.
        int[] num3 = new int[5];
        Arrays.fill(num3, 9);
        System.out.println(Arrays.toString(num3));

        // Copying an Array:
        // This method copies the specified array, truncating or padding with zeros
        //  so the copy has the specified length. It is used when you need a
        // new array with a different size but want to retain the existing elements.
        int[] num4 = { 1, 2, 3 };
        int[] newNumbers = Arrays.copyOf(num4, 5);
        System.out.println(Arrays.toString(newNumbers));

        // Converting an Array to a String:
        // This method returns a string representation of the contents of the specified
        // array. The string representation consists of a list of the array's elements,
        // enclosed in square brackets ([]).
        int[] num5 = { 1, 2, 3 };
        String arrayString = Arrays.toString(num5);
        System.out.println("Array as string: " + arrayString);

        // Creating a Stream from an Array:
        // This method returns a sequential IntStream with the specified array as its
        // source. This is useful for performing bulk operations on array elements, like
        // filtering, mapping, or reducing.
        int[] num6 = { 1, 2, 3, 4, 5 };
        IntStream stream = Arrays.stream(num6);
        stream.forEach(System.out::println);

    }
}
