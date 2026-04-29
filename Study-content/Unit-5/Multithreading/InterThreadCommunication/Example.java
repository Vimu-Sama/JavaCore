class Shared {
    private boolean ready = false;

    public synchronized void waitForSignal() {
        while (!ready) {
            try {
                System.out.println("Thread 1: Waiting...");
                wait(); // releases lock and waits
            } catch (InterruptedException e) {
                System.out.println("Exception-> "+ e);
            }
        }
        System.out.println("Thread 1: Got signal, continuing...");
    }

    public synchronized void sendSignal() {
        System.out.println("Thread 2: Doing some work...");
        ready = true;
        notify(); // wakes one waiting thread
        System.out.println("Thread 2: Sent signal");
    }
}

public class Example {
    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // simulate delay
            } catch (InterruptedException e) {}

            obj.sendSignal();
        });

        t1.start();
        t2.start();
    }
}