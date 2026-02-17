package javalab.arrays;

import java.util.Arrays;

public class VarargsMethods {
    public static void main(String[] args) {
        /*
        Varargs allow a method to accept varying amounts of parameters or arguments without the need of overloading
        the method
        this archived by an ellipsis(...)
         */

        System.out.printf("The sum is %s", add(0, 1, 2, 3, 4));
    }

    public static int add(int... numbers) {
        System.out.printf("The array is: %s\n", Arrays.toString(numbers));
        return Arrays.stream(numbers).sum();
    }
}
