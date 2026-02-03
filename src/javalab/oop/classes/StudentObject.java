package javalab.oop.classes;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 28, 3.2);
        Student student2 = new Student("Bob", 23, 4.4);

        System.out.printf("Student 1 attributes: name %s, age %d, gpa %f\n", student1.name, student1.age, student1.gpa);
        System.out.printf("Student 2 attributes: name %s, age %d, gpa %f\n", student2.name, student2.age, student2.gpa);
    }
}
