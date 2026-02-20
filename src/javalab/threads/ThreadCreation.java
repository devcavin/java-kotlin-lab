package javalab.threads;

public class ThreadCreation implements Runnable {
    Thread t;

    ThreadCreation() {
        t = new Thread(this, "Demo Thread");
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Exiting the child thread");
    }


    public static void main(String[] args) {
        ThreadCreation newThread = new ThreadCreation(); // new thread
        newThread.t.start(); // start the thread

        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting the main thread");
    }
}
