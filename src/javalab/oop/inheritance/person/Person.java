package javalab.oop.inheritance.person;

public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showNames() {
        System.out.printf("%s %s\n", firstName, lastName);
    }
}
