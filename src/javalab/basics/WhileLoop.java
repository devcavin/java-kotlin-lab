package javalab.basics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        A while loop help execute some code forever once a given condition is met or remains true
         */

        Scanner input = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name =  input.nextLine();
        }

        System.out.printf("Hi, %s!\nHow are you catching up lately?", name);

        input.close();
    }
}
