package javalab.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Enter your favourite programming language: ");
        String programmingLanguage = scannerInput.nextLine(); // next only doesn't read spaces
        System.out.println("Your favourite programming language is " + programmingLanguage);

        // reading integers
        // int age = scannerInput.nextInt(); // same to byte, float, double etc
        scannerInput.close();
    }
}
