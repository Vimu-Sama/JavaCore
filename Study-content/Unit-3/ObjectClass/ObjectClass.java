//below is class with no overridden toString method
class A{
    public A(){
        System.out.println("Empty class Constructor of A") ;
    }
    public String info(){
        return "This is an empty class" ;
    }
}

class B{
    public B(){
        System.out.println("Empty class Constructor of B") ;
    }
    public String info(){
        return "This is an empty class" ;
    }

    @Override
    public String toString(){
        return "This class is -> " + this.getClass() ;
    }
}





public class ObjectClass {
    public static void main(String[] args){

        A a = new A() ;

        //toString() method
        System.out.println(a) ;
        System.out.println(a.toString()) ;
        //to print out a class, we use toString


        B b = new B() ;
        //toString() method
        System.out.println(b) ;
        
    }
}
