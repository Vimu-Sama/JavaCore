enum CollegePeople{
    Dean,
    Professor,
    Trainer,
    Student ;

    CollegePeople(){
        System.out.println("Constructor called for-> " + this);
    }

    public void CheckForDayToDayActivity(){
        switch(this){
            case CollegePeople.Dean: 
                System.out.println(this + " governs the college!");
                break ;
            case CollegePeople.Professor: 
                System.out.println(this + " teaches student and also publishes research") ;
                break ;
            case CollegePeople.Trainer:
                System.out.println(this + "teaches students and assists professors") ;
                break ;
            case CollegePeople.Student:
                System.out.println(this + " studies and chills with momentary periods of confusion and stress") ;
                break ;
            default:
                System.out.println("Error with type of individual") ;
        }
    }
}

public class EnumConstructorAndMethods {
    public static void main(String[] args){
        CollegePeople people = CollegePeople.Dean ;
        System.out.println("---Main Function Starts---") ;
        people.CheckForDayToDayActivity();
    }
}

//The enum keyword instructs the Java compiler to automatically generate 
// a class using a predefined template, where each enum constant becomes 
// a static final object, and built-in methods like values() and valueOf()
// are added automatically.