package javalab.oop.gettersetter;

public class GetterSetter {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "White", 10000, 2002);

        car.setColor("Blue");
        car.setPrice(30000);

        System.out.printf("%s %s %.0f %d", car.getModel(), car.getColor(), car.getPrice(), car.getYear());
    }
}
