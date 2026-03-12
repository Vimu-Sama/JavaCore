abstract class Animal{
    int age ;
    abstract public void Sound() ;
}

class Dog extends Animal{
    String breed ;
    public void Sound(){
        System.out.println("Barks!") ;
    }
    public void Barks(){
        System.out.println("Woof!") ;
    } 
}

public class tempCodeRunnerFile{
    public static void main(String[] args){
        Dog d= new Dog() ;
        d.Sound();
    }
}