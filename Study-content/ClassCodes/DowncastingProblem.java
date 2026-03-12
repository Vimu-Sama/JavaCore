class Animal{
    int  age ;
    public void Sound(){
        System.out.println("Sound") ;
    }
}

class Dog extends Animal{
    String breed ;
    public void Sound(){
        System.out.println("Barks!") ;
    }
}

public class DowncastingProblem{
    public static void main(String[] args){
        final Animal a= new Animal() ;
        a.age= 10 ;
    }
}