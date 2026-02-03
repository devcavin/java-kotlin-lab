package javalab.oop.classes;

public class CarObject {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.color = "red";
        myCar.speed = 100;

        System.out.println(myCar.color);

        myCar.accelerate();
        System.out.println(myCar.speed); // 110

        myCar.stop();
        System.out.println(myCar.speed); // 0
    }
}
