class Counter{
    private int counter ;
    public Counter(int counter){
        this.counter = counter ;
    }
    public int getCounter(){
        return counter ;
    }

    public void setCounter(int counter){
        this.counter = counter ;
    }
}

class MyThread implements Runnable{
    Counter counter ;

    public MyThread(Counter counter){
        this.counter = counter ;
    }

    public void increament(){
        counter.setCounter(counter.getCounter()+1);
    }

    @Override
    public void run(){
        increament() ;
    }
}

class MyThreadAlt implements Runnable{
    Counter counter ;

    public MyThreadAlt(Counter counter){
        this.counter = counter ;
    }
    
    public void multiplyByTwo(){
        this.counter.setCounter(counter.getCounter()*2);
    }

    @Override
    public void run(){
        multiplyByTwo();
    }
}

public class Example{
    public static void main(String[] args) {
        Counter counter= new Counter(2) ;
        Thread thread1 = new Thread(new MyThread(counter)) ;
        Thread thread2 = new Thread(new MyThreadAlt(counter)) ;
        thread1.start();
        thread2.start();
        try{
            thread1.join() ;
            thread2.join() ;
        } catch(Exception e){
            System.out.println("Exception-> " + e);
        }
        System.out.println("Final value-> " + counter.getCounter());
    }
}