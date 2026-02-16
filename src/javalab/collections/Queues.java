package javalab.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        Queue<Person> myQueue = new LinkedList<>();
        myQueue.add(new Person("John", 18));
        myQueue.poll();
        myQueue.offer(new Person("James", 48));
        myQueue.offer(new Person("Mercy", 22));
        myQueue.remove();
        myQueue.removeIf(person -> !myQueue.isEmpty());
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
    }
}
