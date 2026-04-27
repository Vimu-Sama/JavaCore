class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("My thread has started running!");
    }
}

public class Example {
        public static void main(String[] args) {
            MyThread thread= new MyThread() ;
            thread.run() ;
            // thread.start() ;
        }
}
