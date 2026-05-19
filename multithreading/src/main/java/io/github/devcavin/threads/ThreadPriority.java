package io.github.devcavin.threads;

public class ThreadPriority {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        int threadPriority = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(7);

        System.out.println("Current thread name: " + threadName); // main
        System.out.println("Current thread priority: " + threadPriority); // 5
        System.out.println("Current thread priority after modification: " + Thread.currentThread().getPriority()); // 7
    }
}
