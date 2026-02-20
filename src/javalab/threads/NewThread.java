package javalab.threads;

public class NewThread extends Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Child thread exited");
    }

    public static void main(String[] args) {
        NewThread thread = new NewThread();
        thread.start();
       try {
           for (int i = 5; i >= 1; i--) {
               System.out.println("Main Thread " + i);
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           System.out.println("Main Thread Interrupted");
       }
       System.out.println("Main thread exited");
    }
}
