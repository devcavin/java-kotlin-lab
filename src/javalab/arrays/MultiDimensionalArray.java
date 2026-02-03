package javalab.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] fruits = {"mango", "apple", "banana"};
        String[] colors = {"red", "green", "blue"};
        String[] meat = {"pork", "beef"};
        String[] vegetables = {"onions", "garlic"};

        String[][]groceries = {fruits, meat, vegetables}; // 2D Array

        System.out.println(Arrays.deepToString(groceries));

        // 3D array
        String[][][] threeD = {
                {fruits, meat, vegetables},
                {fruits, meat, vegetables},
                {fruits, meat, vegetables, colors}
        };

        System.out.println(Arrays.deepToString(threeD));
    }
}
