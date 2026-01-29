package javalab.basics;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age <= 0) throw new IllegalArgumentException("Age must be greater than zero");

        if  (age > 100) throw new IllegalArgumentException("Age must be less than 100");

        /*if (age < 18) {
            System.out.printf("You're %d years old, please get back home and play with some toys baby.\n", age);
        } else {
            System.out.printf("You're %d years old, please join the club for a party.\n", age);
        }*/
        String adult = (age < 18) ? "NO" : "YES";
        System.out.printf("I am an adult: %s", adult);
        scanner.close();
    }
}
