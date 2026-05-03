
class Sweets{
    int counter;

    public Sweets(int counter){
        this.counter = counter ;
    }

}
class PersonEating implements Runnable{

    Sweets sweets ;
    String name;

    public PersonEating(Sweets sweets, String name){
        this.sweets = sweets ;
        this.name = name ;
    }

    public synchronized void eatSweet(){
        sweets.counter--;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName() + " " + "started executing!");
        Thread example= new Thread(()-> {
            System.out.println("This is new thread created! Name->  " + Thread.currentThread().getName() ) ;
        }) ;
        example.start();
    }
}

public class Example {
        public static void main(String[] args) {
            Sweets diwaliSweets= new Sweets(5) ;
            Thread manashwi = new Thread(new PersonEating(diwaliSweets, "manashwi")) ;
            Thread dhruv = new Thread(new PersonEating(diwaliSweets, "dhruv")) ;
            Thread bryn = new Thread(new PersonEating(diwaliSweets, "bryn")) ;
            manashwi.start();
            dhruv.start();
            bryn.start();
        }
}
