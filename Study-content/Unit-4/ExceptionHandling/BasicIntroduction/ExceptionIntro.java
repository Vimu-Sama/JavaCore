// In this file, the primary focus is on working with
// try, catch and finally keywords to handle the exceptions
import java.util.Scanner ;

public class ExceptionIntro {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in) ;
        System.out.print("a-> ") ;
        int a= sc.nextInt() ;
        System.out.print("b-> ") ;
        int b= sc.nextInt() ;
        try{
            int c = a/b ;
            System.out.println(c) ;
            return ;
        }
        catch(Exception e){
            System.out.println("Exception caught-> " + e);
            int d= a/b ;
        } 
        finally{
            System.out.println("Code execution ended") ;
        }
    }

}
