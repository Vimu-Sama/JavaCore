
import java.util.Scanner;

public class whatever{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in) ;
        boolean electricity ;
        do{
            electricity= sc.nextBoolean() ;
            System.out.println("Fan spinnning!") ;
        }while(electricity) ;
    }
}