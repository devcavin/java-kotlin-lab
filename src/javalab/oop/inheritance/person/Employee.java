package javalab.oop.inheritance.person;

public class Employee extends Person {
    double salary;

    Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void showEmployeeInfo() {
        System.out.printf("The employee names are %s %s and they receive a basic salary of %.0f\n", firstName,
                lastName, salary);
    }

    String showInfo() {
        return "Employee names are %s %s and they receive a basic salary of %.0f".formatted(firstName, lastName,  salary);
    } // simple string return with
}
