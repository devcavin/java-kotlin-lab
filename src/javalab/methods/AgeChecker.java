package javalab.methods;

import java.util.Scanner;

public class AgeChecker {
    public static boolean adult(int age){
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        boolean isAdult = adult(age);

        System.out.printf("Your age is %d years old.\nAre you really an adult? %b", age, isAdult);
    }
}
