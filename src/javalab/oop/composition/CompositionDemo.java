package javalab.oop.composition;

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car(
                "Toyota",
                "Black",
                2015,
                "V6"
        );

        System.out.printf("The car engine is %s ", car.getEngine());
    }
}
