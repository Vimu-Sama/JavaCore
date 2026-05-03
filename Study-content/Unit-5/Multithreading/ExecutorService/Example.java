import java.util.concurrent.*;

class MyThread implements Runnable{
    int a;
    int b ;
    public void run(){
        System.out.println(Thread.currentThread().getName() + " : thread started running") ; 
    }
}

public class Example {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        ExecutorService cachedExecutor= Executors.newCachedThreadPool() ;

        ExecutorService singlExecutorService= Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            System.out.println("Task 1");
        });

        executor.submit(() -> {
            System.out.println("Task 2");
        });

        executor.submit(new MyThread()) ;

        //For the case you want to return something, the thread
        //will wait for the return
        Future<String> result = executor.submit(()->{
            //you call backend api here to get data
            String uid= "abc12-sdas-sdas-asda" ;
            return uid ;
        }) ;
        try{
            String a = result.get() ;
            System.out.println("Boolean -> " + a) ;
        } catch(Exception e ){
            e.getStackTrace() ;
        }
        
        executor.shutdownNow();
        executor.shutdown();
    }
}