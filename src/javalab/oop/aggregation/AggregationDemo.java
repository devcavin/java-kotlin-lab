package javalab.oop.aggregation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AggregationDemo {
    public static void main(String[] args) {
        Book myBook = new Book(
                "The Two Towers",
                "Somebody",
                3000,
                415
        );

        Book book1 = new Book(
                "The Two Towers",
                "Somebody",
                3000,
                415
        );

        Book book2 = new Book(
                "The Two Towers",
                "Somebody",
                3000,
                415
        );

        Book book3 = new Book(
                "The Two Towers",
                "Somebody",
                3000,
                415
        );

        System.out.println("The title of my book is : " + myBook.getTitle());

        Book[] books = {book1, book2, book3, myBook};

        Library library = new Library(
                "Literature library",
                books
        );


    }
}
