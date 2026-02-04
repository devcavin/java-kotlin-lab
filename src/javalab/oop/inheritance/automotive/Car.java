package javalab.oop.inheritance.automotive;

public class Car extends Vehicle {
    String color;
    String model;
    String make;
    int year;

    Car(String color, String model, String make, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // overriding the .toString() method
    @Override
    public String toString() {
        return "%s %s %s %d".formatted(color, model, make, year);
    }
}
