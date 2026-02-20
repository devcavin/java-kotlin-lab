package javalab.threads.synchronization;

public class SynchronizationCaller {
    static class CallMe {
        synchronized void call(String message) {
            System.out.print("[" + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.print("]\n");
        }
    }

    static class Caller implements Runnable {
        private final String message;
        private final CallMe target;
        Thread t;

        public Caller(String message, CallMe target) {
            this.message = message;
            this.target = target;
            this.t = new Thread(this);
        }

        @Override
        public void run() {
            /*synchronized (target) {
                target.call(message);
            }*/ // this is also a way of making it synchronized
            target.call(message);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CallMe callMe = new CallMe();
        Caller obj1 = new Caller("Hello", callMe);
        Caller obj2 = new Caller("Synchronization", callMe);
        Caller obj3 = new Caller("World", callMe);

        // start the threads
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        // waiting for thread to finish
        obj1.t.join();
        obj2.t.join();
        obj3.t.join();
    }
}
