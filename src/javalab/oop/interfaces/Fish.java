package javalab.oop.interfaces;

public class Fish implements Prey, Predator {
    @Override
    public String flee() {
        return "Fish is swimming away";
    }

    @Override
    public String hunt() {
        return "Fish is hunting";
    }
}
