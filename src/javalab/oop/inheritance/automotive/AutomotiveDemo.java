package javalab.oop.inheritance.automotive;

public class AutomotiveDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.move());

        Aeroplane aeroplane = new Aeroplane();
        System.out.println(aeroplane.move());
    }
}
