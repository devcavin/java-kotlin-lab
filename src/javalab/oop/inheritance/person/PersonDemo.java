package javalab.oop.inheritance.person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        person.showNames();

        Student student = new Student("Alice", "Alice", 3.2);
        double studentGpa = student.getGpa();
        System.out.println("The student's GPA is: " + studentGpa);

        Employee employee = new Employee("Tom", "Riddle", 32000);
        employee.showEmployeeInfo();

        String showInfo = employee.showInfo();
        System.out.println(showInfo);
    }
}
