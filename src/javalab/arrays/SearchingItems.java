package javalab.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchingItems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = random.ints(10, 0, 100).toArray();
        int target;
        boolean found = false;

        System.out.print("Enter the number to search for: ");
        target = input.nextInt();
        input.nextLine();

        System.out.printf("The array is: %s", Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.printf("\nTarget %d found number at index %d of the array", target, i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nTarget %d NOT found");
        }

        input.close();
    }
}
