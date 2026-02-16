package javalab.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<Queues.Person> linkedLists = new LinkedList<>();
        linkedLists.add(new Queues.Person("Dorcas", 22));
        linkedLists.add(new Queues.Person("James", 23));
        linkedLists.add(new Queues.Person("Monica", 24));
        linkedLists.add(new Queues.Person("Mercy", 25));

        ListIterator<Queues.Person> iterator = linkedLists.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(linkedLists.size());
    }
}
