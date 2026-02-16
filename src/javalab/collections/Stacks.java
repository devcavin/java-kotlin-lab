package javalab.collections;

import java.util.List;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>  myStack = new Stack<>();

        // add element
        myStack.push(0);
        myStack.push(1);
        myStack.add(2);
        myStack.addAll(List.of(3, 4, 5));
        myStack.addAll(5, List.of(6, 7, 8, 9, 10));

        // peek- fetching the top element
        System.out.println(myStack.peek());

        // removing
        myStack.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // myStack.removeFirst(); // removing the first element
        // myStack.removeLast(); // removing last element
        myStack.removeElement(10); // removes an element of value 10
        System.out.println(myStack);
    }
}
