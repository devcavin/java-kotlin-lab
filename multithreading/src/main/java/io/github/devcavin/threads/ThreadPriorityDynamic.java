package io.github.devcavin.threads;

public class ThreadPriorityDynamic {
    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("Custom thread executed"));

        t.start();

        // Thread.yield();

        System.out.println("Main thread executed");
    }
}
