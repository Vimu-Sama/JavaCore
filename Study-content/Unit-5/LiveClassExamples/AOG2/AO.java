class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread running via Ruunable Implementation...") ;
    }
}

public class AO{
    public static void main(String[] args) {
        Thread myThread = new Thread(()->{
            System.out.println("Thread running via Runnable Lambda Expression...") ;
        }) ;
        Thread myThread1 = new Thread(new MyThread()) ;
        myThread.start();   //creates a new thread
        myThread1.start();
        //start function internally calls the run function
    }
}