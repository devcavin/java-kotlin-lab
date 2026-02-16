package javalab.collections.arrays;

import java.util.Arrays;

public class ArraysIntro {
    /*
    A collection of values of the same data type
     */

    public static void main(String[] args) {
        // creating an array
        String[] fruits = {"orange", "banana", "apple", "kiwi"};

        // printing arrays
        System.out.println(Arrays.toString(fruits)); // Arrays.deepToString(fruits)

        // getting elements of an array
        String firstElement = fruits[0];
        String secondElement = fruits[1];
        String thirdElement = fruits[2];

        // modifying an array
        fruits[0] = "mango";

        Arrays.sort(fruits, 0, 2); // sort only a given portion
        System.out.println(Arrays.toString(fruits));

        Arrays.sort(fruits); // sorting an array
        System.out.println(Arrays.toString(fruits));

        // empty array
        int[] numbers = new int[10];
        Arrays.fill(numbers, 1); // fill the entire array with the specified value
        System.out.println(Arrays.toString(numbers));
    }
}
