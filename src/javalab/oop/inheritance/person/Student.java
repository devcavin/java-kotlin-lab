package javalab.oop.inheritance.person;

public class Student extends Person {
    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    double getGpa() {
        return gpa;
    }
}
