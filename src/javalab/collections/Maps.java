package javalab.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    record Person (String name, int age) { }
    public static void main(String[] args) {
        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("John", 25));
        people.put(2, new Person("Jane", 35));
        people.put(3, new Person("Jack", 25));
        people.put(4, new Person("Tony", 35));

        System.out.println("Size of people: " + people.size());
        System.out.println(people);

        System.out.println(people.get(0));
        people.remove(0);

        // clear
        // people.clear();

        people.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
