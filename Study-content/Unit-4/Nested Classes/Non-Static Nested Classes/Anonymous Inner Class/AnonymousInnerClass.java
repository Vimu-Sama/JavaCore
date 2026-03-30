//Anonymous inner class is used when we only want to reduce code size and
//the new class created temporarily doesn't matter much and is of single time
//use case

interface A{
    void walks() ;
    void swims() ;
}

abstract class B{
    public abstract void works() ;
    public void sleeps(){
        System.out.println("Sleep!");
    }
}

abstract class C{
    public void runs(){
        System.out.println("Object runs") ;
    }
    public void swims(){
        System.out.println("Doesn't swim");
    }
}


public class AnonymousInnerClass {
    public static void main(String[] args) {
        //with interface
        A a= new A() {
            public void walks(){
                System.out.println("Object walks!") ;
            }
            public void swims(){
                System.out.println("Object swims!") ;
            }

            public void display(){
                System.out.println("Concrete function");
            }
        } ;
        a.walks();
        a.swims();

        //with abstract classes
        B b = new B(){
            public void works() {
                System.out.println("It works!") ;
            }
        };
        b.works();
        b.sleeps();

        //with normal classes
        C c = new C() {
            public void swims(){
                System.err.println("Swims!");
            }
        } ;
        c.swims();
    }
}
