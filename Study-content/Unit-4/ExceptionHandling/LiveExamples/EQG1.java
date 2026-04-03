class Animal{
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

public class EQG1 {
    public static void main(String[] args){
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
