class MyThread implements Runnable{
    public void run(){
        System.out.println("Running thread via aplpication");
    }
}

public class Example2{
    public static void main(String[] args) {
        Thread thread= new Thread(new MyThread()) ;
        thread.start();
        
        Thread thread2 = new Thread(()-> {
            System.out.println("This is Running thread via Lambda Expression");
        }) ;
        thread2.start();
    }
}