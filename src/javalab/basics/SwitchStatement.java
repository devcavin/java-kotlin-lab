package javalab.basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("When is today? ");
        final String today = scanner.nextLine();

       switch(today) {
           case "Monday", "Tuesday", "Wednesday", "Thursday",  "Friday", "Saturday", "Sunday" -> {
               System.out.printf("Today is %s\n", today);
               switch (today) {
                   case "Monday", "Tuesday", "Wednesday", "Thursday",  "Friday" -> System.out.println("It's weekday");
                   case "Saturday", "Sunday"  -> System.out.println("It's weekend");
                   // default -> System.out.println("Invalid day");
               }
           }
           default -> System.out.println("Invalid day");
       }
       scanner.close();
    }
}
