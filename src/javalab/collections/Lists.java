package javalab.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> colors =new ArrayList<>();

        // add
        colors.add("red");

        // size
        System.out.println("The size of my list is "+colors.size());

        // check if the list contains a given element
        System.out.println(colors.contains("yellow")); // returns boolean

        // adding a collection
        String[] otherColors = { "indigo", "green", "blue" };
        colors.addAll(List.of(otherColors));
        System.out.println(colors);
        colors.addLast("yellow"); // add at the end of the list
        colors.addFirst("green"); // add at the beginning

        // remove
        colors.remove("yellow");
        colors.removeFirst(); // removes the first element
        colors.removeLast(); // removes the last element

        // remove a collection or many elements
        colors.removeAll(List.of("red", "green", "blue"));

        // reversing
        colors.reversed();
        colors.removeIf(color -> color.equals("yellow"));
        System.out.println(colors);

        // sorting
        Collections.sort(colors);

        // looping through a list
        for(String color:colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);
    }
}
