package javalab.basics;

public class Variables {
    public static void main(String[] args) {
        /*
         * Variables are containers,they hold values
         * Types of variables:
         *  Primitive variables: these are simple values stored directly into the memory often the stack
         *  Reference variables: memory address (stack) that points to a heap
         */

        // how to create a variable
        // declaring and assigning

        // long: 64 bits whole numbers
        long currentAmount = 895;

        // integers: whole numbers, 32 bits in size
        int myVariable = 21;
        int age;
        age = 21;
        System.out.println("My Variable is: " + myVariable);
        System.out.println("Age is: " + age);

        // double: are numbers with a decimal portion, are 64 bits
        double price = 102.68;
        double totalPrice = price * 0.9;
        System.out.println("Total price is: " + totalPrice);

        // float: 32 bit decimal values
        float gpa = 2.5f;
        float milliSeconds = 4F;
        System.out.println("My GPA was: " + gpa);
        System.out.println("The program took " + milliSeconds + " milliseconds to run");

        // short: are 16 bits
        short someShort = 6;

        // byte: 8 bits
        byte someByte = 7;

        // char: single character words, digits or symbols
        char letter = 'a';
        char symbol = '@';
        char currency = '$';
        System.out.println("Letter is: " + letter);
        System.out.println("Symbol is: " + symbol);

        // boolean: logical values that are either true or false
        boolean isTrue = true;
        boolean isFalse = false;
        boolean itsRaining = true;
        boolean isRaining = false;
        boolean isAdmin = false;

        // String: series of characters, symbols or digits
        // String is a reference type
        String programmingLanguage = "Java";
        String color = "Brown wood";
        System.out.println("Programming language is: " + programmingLanguage);
    }
}
