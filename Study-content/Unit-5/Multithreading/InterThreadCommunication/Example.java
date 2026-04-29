class ThreadWorkings implements Runnable{
    synchronized void FirstFunction(){
        try{
            wait() ;
        } catch(Exception e){
            System.out.println("Exception-> "  + e);
        }
        System.out.println("Thread woke up!") ;
    }

    synchronized void WakeAnyThread(){
        notify();
        System.out.println("Thread notified to wake up!") ;
    }

    synchronized void WakeAllThreads(){
        notifyAll();
    }

    public void run(){
       System.out.println("Thread Workings started running"); 
       FirstFunction();
    }
}


public class Example {
    public static void main(String[] args) {
        System.out.println("Thread execution started") ;
        Thread thread= new Thread(new ThreadWorkings()) ;
        try{
            thread.start();
        } catch(Exception e){
            System.out.println("Exception caught-> " + e) ;
        }
        System.out.println("Thread execution completed") ;
    }    
}
