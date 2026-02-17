package javalab.threading;

// controlling the main thread
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread(); // getting the current thread
        System.out.println("Current thread: " + currentThread); // main

        // changing the name
        currentThread.setName("My Thread");
        System.out.println("Current thread name after modification: " + currentThread.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted.\n", currentThread.getName());
        }
    }
}
