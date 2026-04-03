
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchException {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in) ;
        int a= sc.nextInt() ;
        int b= sc.nextInt() ;
        try{
            int quotient = a/b ;
            System.out.println("Quotient-> " + quotient) ;
            throw new SQLException("Error!!");
        }
        catch(ArithmeticException | SQLException | InputMismatchException e){
            System.out.println("Exception encountered-> "+ e) ;
        }
        finally{
            System.out.println("Error code executed and compiled") ;
        }
        System.out.println("Code goes on...") ;
    }
}
