import java.util.Scanner;

class YoungerException extends Exception{
    public YoungerException(String message){
        super(message) ;
    }
}

public class YU{
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in) ;
        int i= sc.nextInt() ;
        try{
            Display(i);
        } catch(Exception e){
            System.out.println("Error-> " +e);
        }
        
        System.out.println("Code goes on...") ;
    }

    static void Display(int age) throws YoungerException{
        
    }
}