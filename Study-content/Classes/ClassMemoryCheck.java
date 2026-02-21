// remember the memory layout in jvm
public class ClassMemoryCheck{

    static
    {
        System.out.println("This is Static and already loaded") ;
    }

    {
        System.out.println("First Instance Intializer Block") ;
    }

    public ClassMemoryCheck(){
        System.out.println("Constructor loaded") ;
    }

    

    public static void main(String args[]){         //why we write this at the very start? the public static void main(String args[])
        ClassMemoryCheck check= new ClassMemoryCheck() ;
    }

    {
        System.out.println("Second Instance Intializer Block") ;
    }

    static
    {
        System.out.println("This is also Static and already loaded before the instance intialization") ;
    }
}