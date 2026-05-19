package io.github.devcavin.threads;

public class DaemonUserThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonThread());
        Thread t2 = new Thread(new UserThread());

        t1.setDaemon(true);

        t1.start();
        t2.start();
    }
}

class DaemonThread implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count < 500) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon thread is running...");
        }
    }
}

class UserThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User is done executing...");
    }
}
