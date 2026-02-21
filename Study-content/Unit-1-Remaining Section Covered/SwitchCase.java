import java.util.Scanner ;
public class SwitchCase{
    public static void main(String[] args){
        System.out.println("Input your favourite pet-> ") ;
        Scanner scan= new Scanner(System.in) ;
        String pet= scan.next() ;
        //dog, cat, bird, cow
        if(pet.equals("dogs")){      //"dog" == pet
            System.out.println("Bark!") ;
        } else {
            if(pet.equals("cat")){
                System.out.println("Meow!") ;
            } else {
                if(pet.equals("bird")){
                    System.out.println("Chirp!") ;
                } else {
                    if(pet.equals("cow")){
                        System.out.println("Moos") ;
                    } else {
                        System.out.println("Enter valid input!") ;
                    }
                }
            }
        }
        scan.close() ;
    }
}