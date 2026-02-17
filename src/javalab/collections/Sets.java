package javalab.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    record Ball(String color) {}

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("red"));
        balls.add(new Ball("green"));
        balls.addAll(Set.of(new Ball("black"), new Ball("blue"), new Ball("white"),  new Ball("brown"),
                new Ball("orange")));

        balls.removeAll(Set.of(new Ball("red"), new Ball("green"), new Ball("blue")));
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println);
    }
}
