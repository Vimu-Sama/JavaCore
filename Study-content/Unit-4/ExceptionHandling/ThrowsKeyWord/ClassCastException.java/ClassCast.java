class AnimalException extends Exception{
    public AnimalException(String message){
        super(message) ;
    }
}


class Animal{
    int ageAnimal;

    void Eats(){
        System.out.println("Animal Eats") ;
    }
}

class Dog extends Animal{
    void Eats(){
        System.out.println("Dog Eats") ;
    }
    void Walks(){
        System.out.println("Dog walks") ;
    }
}

public class ClassCast {
    public static void main(String[] args){


        Animal a= new Animal() ;
        a.ageAnimal = 19 ;

        try{
            if(a.ageAnimal>18){
                throw new AnimalException("rare animal found!!") ;
            }
        } catch(Exception e){
            System.out.println("Exception-> " + e);
        }
        

        try{
            DisplayDogHabit();
        } catch(Exception e){
            System.out.println("Exception->" + e);
        }
        System.out.println("Code ended");
    }

    static void DisplayDogHabit() throws ClassCastException{
        Dog d= (Dog)new Animal() ;
    }
}
