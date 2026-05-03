//Overloading Rules->

//1)- Can be done based on number of parameters
//2)- Can be done based on type of parameters
//3)- Can be done based on order of parameters

//IRON RULE: CANNOT BE DONE BASED ON RETURN TYPE


class Animal {
    private int age;

    public Animal(){
        age= 0;
    }
    public Animal(int age) {
        this.age = age;
    }

    public void animalSleeps() {
        System.out.println("Animal starts sleeping...");
    }
}

class Dog extends Animal {
    String name;

    public Dog(int age, String name){
        //always define super() first
        super(age) ;
        this.name = name ;
    }

    public void animalSleeps(){
        System.out.println("Dog sleeps...") ;
    }

    public void eats(){
        System.out.println("Dog eats...");
    }

}

public class Example2 {
    public static void main(String[] args) {
        Animal a = new Animal(10);
        Animal b= new Dog(2,"Sheru") ;
        a.animalSleeps();
        b.animalSleeps();
        
        Dog d= (Dog) b ;
        d.animalSleeps();
        d.eats();

        Dog e = (Dog) new Animal(20) ; 

    }
}