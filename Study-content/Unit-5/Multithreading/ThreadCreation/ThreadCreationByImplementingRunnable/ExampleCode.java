// Runnable is a functional interface with run() abstract function,
// it is useful when working with threads, and eases the process of
// enabling the functionality of splitting main thread into multiple threads.
// It helps resolve the problem of inability to extend any other class

class MyThread implements Runnable{
    public void run(){
        System.out.println("Running thread by Runnable") ;
    }
}


public class ExampleCode {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread()) ;
        //Run on the thread-> will run on the same thread
        t1.run() ;

        //Start the thread-> will run on different new thread
        t1.start() ;


        //Lambda Expression for Runnable Thread
        Thread t2= new Thread(() -> {
            System.out.println("Lambda expression Running");
        }) ;

        //Run-> will run on same thread
        t2.run() ;

        //Start-> will run on different new thread
        t2.start();
    }
}
