class MyThread implements Runnable{
    public MyThread(){
        System.out.println("only Object of the Mythread class has been created...");
    }

    @Override
    public void run(){
        System.out.println("Thread running..." + Thread.currentThread().getName());
    }
}
public class Example{
    public static void main(String[] args){
        Thread myThread = new Thread(new MyThread()) ;
        Thread myThreadTwo = new Thread(()->{
            System.out.println("This expression is inside Lambda Expression Runnable Interface") ;
        }) ;
        myThread.start();
        myThreadTwo.start();
    }
}