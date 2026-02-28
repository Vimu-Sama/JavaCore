public class Pet {
    private String species;
    private String petName; 

    public Pet(){
        species= "dog" ;
        petName= "Bruno" ;
    }

    public Pet(String species, String petName){
        this.species = species ;
        this.petName = petName ;
    }

    public String petVoice(){
        return "This animal Barks" ;
    }

    //overloaded method/behavior with different list of parameters
    public String petVoice(String voice){
        return "This animal " + voice ;
    }

    //overloaded method/behavior with different list of parameters
    public void petVoice(String voice, int num){
        System.out.println("This animal " + voice + ". I have seen" + num + " of these pets") ;
    }

    //overloaded method/behavior with different order of parameters
    public void petVoice(int num, String voice){
        System.out.println("This animal " + voice + ". I have seen" + num + " of these pets. They are super nice!") ;
    }

    //NOTE: A function cannot be overloaded based on Return Type

    public static void main(String[] args){
        
    }
}
