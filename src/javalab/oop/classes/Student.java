package javalab.oop.classes;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // constructor a special method that runs when the object is created
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
}
