package javalab.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraySearch {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomScores = new int[10];
        // int[] randomScores = random.ints(10, 0, 10).toArray();

        // add random numbers to the array
        for (int i = 0; i < randomScores.length; i++) {
            randomScores[i] = random.nextInt(0, 10);
        }

        System.out.println(Arrays.toString(randomScores));
    }
}
