package javalab.oop.composition;

public class Car {
    private final String model;
    private final String color;
    private final int year;
    private Engine engine;


    public Car(String model, String color, int year, String engineType) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    public String getEngine() {
        return engine.type;
    }
}
