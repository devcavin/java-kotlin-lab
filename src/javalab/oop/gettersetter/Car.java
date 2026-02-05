package javalab.oop.gettersetter;

public class Car {
    private final String model;
    private String color;
    private double price;
    private final int year;


    public Car(String model, String color, double price, int year) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    String getModel() {
        return model;
    }
    String getColor() {
        return color;
    }
    double getPrice() {
        return price;
    }
    int getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
