class Animal{
    public Animal(){
        System.out.println("Animal Constructor called") ;
    }

    public void Sound(){
        System.out.println("Animal sound") ;
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog Constructor called") ;
    }

    public void Sound(){
        System.out.println("Dog sound") ;
    }

    public void Barks(){
        System.out.println("Dog barks") ;
    }
}

public class UpcastingAndDownCasting {
    public static void main(String[] args){
        Animal a = new Dog() ;  //upcasting
        a.Sound();
        Dog d = (Dog)a ;        //downcasting
        d.Barks() ;

        //without checking downcasting is highly unsafe
        //thus we use InstanceOf operator

        Animal p = new Animal() ;
        Dog t= (Dog) p ;

        //instanceof

        System.out.println("Is p a type of animal? " + (p instanceof Animal)) ;
        System.out.println("Is p a type of dog? " + (p instanceof Dog)) ;
        Dog q ;
        if(p instanceof Dog){
            q = (Dog) p ;
            q.Barks();
        }
    }
}
