class SharedCounter {
    int counter = 0;

    public synchronized void increament() {
        for(int i=0;i<5;i++){
            counter++ ;
        }
    }
}

class MyThread implements Runnable {
    SharedCounter sharedCounter;

    public MyThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public void run() {
        sharedCounter.increament();
    }

}

public class Example {
    public static void main(String[] args) {

        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread(new MyThread(sharedCounter));
        Thread thread2 = new Thread(new MyThread(sharedCounter));
        Thread thread3 = new Thread(new MyThread(sharedCounter));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Counter before thread starting-> " + sharedCounter.counter);

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (Exception e) {
            System.out.println("Exception e-> "+ e) ;
        }

        System.out.println("Counter after thread waiting-> " + sharedCounter.counter) ;

    }
}
