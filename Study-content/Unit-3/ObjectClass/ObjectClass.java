//below is class with no overridden toString method
class A{
    int id;
    public A(){
        System.out.println("Empty class Constructor of A") ;
    }
    public String info(){
        return "This is an empty class" ;
    }
}

class B{
    int id ;
    public B(){
        id= 0;
        System.out.println("Empty class Constructor of B") ;
    }

    public B(int id){
        this.id = id ;
        System.out.println("Constructor of B called with given id") ;
    }

    public String info(){
        return "This is an empty class" ;
    }

    @Override
    public String toString(){
        return "This class is -> " + this.getClass() ;
    }

    @Override
    public int hashCode(){
        return id ;
    }

    @Override
    public boolean equals(Object o){
        // 1. Check for reference equality (performance optimization)
        if (this == o) return true;
        // 2. Check for null and type equality (using getClass() for strict type checking)
        if (o == null || getClass() != o.getClass()) return false;
        // 3. Cast the object to the correct type
        B b = (B) o;
        // 4. Compare significant fields using appropriate methods (== for primitives, Objects.equals() for objects)
        return id == b.id ;
    }
}





public class ObjectClass {
    public static void main(String[] args){

        A a = new A() ;
        B b = new B() ;

        //toString() -- to print out a class, we use toString()

        //toString() method
        System.out.println(a) ;
        System.out.println(a.toString()) ;

        //toString() method
        System.out.println(b) ;

        //equals() - checks for equality, without overriding it compares the memory reference
        
        //hashCode()- its part of the object class, so that in case we are working with collections like HashSet, HashMap, it can work easily
        //hash Code is generated only when hashCode() is called
        System.out.println("HashCode for A-> " + a.hashCode()) ;
        System.out.println("HashCode for B-> " + b.hashCode()) ;
        
        
        //using normal equalsTo
        A anotherObjectA = new A() ;
        System.out.println("Is new object equal to old object of A class-> " + a.equals(anotherObjectA) );

        //using overridden B
        B clonedB = new B() ;
        System.out.println("are these clonedB and b equal? " + b.equals(clonedB)) ;
    }
}
