package javalab.collections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter the number of food items you'd like to order: ");
        size = input.nextInt();
        input.nextLine();

        foods = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter food item number %d: ", i + 1);
            foods[i] = input.nextLine();
        }

        System.out.printf("You ordered %s ",  Arrays.toString(foods));
    }
}
