



class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("My thread has started running!");
    }
}

public class Example {
        public static void main(String[] args) {
            Thread thread= new Thread(()->{
                System.out.println("System started running...") ;
            });
            thread.start() ;

            Thread thread2= new Thread(new MyThread()) ;
        }
}
