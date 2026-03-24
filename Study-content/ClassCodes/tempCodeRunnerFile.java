abstract class A{
    public void Sound(){
        System.out.println("Sound");
    }
    abstract public void Sleep() ;
}

abstract class B extends A{
    abstract public void Eat() ;
    public void Function2(){
        System.out.println("Function 2");
    }
}

class C extends B{
    public void Eat(){
        System.out.println("C eats food") ;
    }
    public void Sleep(){
        System.out.println("Hello world!") ;
    }
}

public class tempCodeRunnerFile{
    public static void main(String[] args){
        C c= new C() ;
        c.Sound();
    }
}