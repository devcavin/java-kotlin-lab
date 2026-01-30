package javalab.basics;

public class ForLoop {
    public static void main(String[] args) {
        /*
        For loops execute a given statement a certain specified amounts of times
         */
        for (int i = 1; i <= 25; i++) {
            if (i == 19) {
                continue;
            }

            if (i == 23) {
                break;
            }

            System.out.print(i + " ");

        }
    }
}
