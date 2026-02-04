package javalab.oop.abstraction;

public class Rectangle extends Shape {
    double length;
    double width;
    double height;

    Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return length * width;
    }

    double volume() {
        return area() * height;
    }
}
