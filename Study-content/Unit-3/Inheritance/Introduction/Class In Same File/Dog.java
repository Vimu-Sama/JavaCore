class Animal{
    private String sound ;
    private int age;

    //setters
    public void setSound(String sound){
        this.sound = sound ;
    }

    public void setAge(int age){
        this.age = age ;
    }

    //getters
    public String getSound(){
        return sound ;
    }

    public int getAge(){
        return age ;
    }

    //constructor
    public Animal(){
        this.sound = "" ;
        this.age= 0 ;
    }
    public Animal(String sound, int age){
        this.sound = sound ;
        this.age= age ;
    }
}

public class Dog extends Animal{
    private String name ;
    private String breed ;

    //getters
    public String getName(){
        return name ;
    }

    public String getBreed(){
        return breed ; 
    }


    //setters
    public void setName(String name){
        this.name = name ;
    }

    public void setBreed(String breed){
        this.breed = breed ;
    }

    //constructors
    public Dog(){
        super() ; //calls parent class constructor
        this.name= "" ;
        this.breed= "" ;
    }

    public Dog(int age, String name, String breed){
        super("Barks", age) ;
        this.name= name ;
        this.breed = breed ;
    }

    public void Barks(){
        System.out.println("Woof") ;
    }

    public String Details(){
        return "This is a Dog, whose name is " + name + " its breed is " + breed + " and it is " + 
        super.getAge() + " years old" ;
    }

    public static void main(String[] args){
        Dog tom= new Dog(8, "Tom", "Great Dan") ;
        tom.Barks();
        System.out.println(tom.Details()) ;
    }

}

