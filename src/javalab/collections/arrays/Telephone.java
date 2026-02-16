package javalab.collections.arrays;

public class Telephone {
    public static void main(String[] args) {
        char[][] keys = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] key : keys) {
            for (char digit : key) {
                System.out.printf("%c ", digit);
            }
            System.out.println();
        }
    }
}
