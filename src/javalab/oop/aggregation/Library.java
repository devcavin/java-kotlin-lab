package javalab.oop.aggregation;

public class Library {
    private final String name;
    private final Book[] books;


    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }
}
