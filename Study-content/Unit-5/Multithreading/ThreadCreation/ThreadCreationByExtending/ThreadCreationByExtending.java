class MyThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("Thread is running") ;
    }
}


public class ThreadCreationByExtending {
    public static void main(String[] args) {
        MyThread myThread= new MyThread() ;
        //this runs the run() function is same thread
        myThread.run();

        //to create new thread, use start() function,
        //start() function internally calls the run() function
        //after creating new thread
        myThread.start() ;
    }
}
