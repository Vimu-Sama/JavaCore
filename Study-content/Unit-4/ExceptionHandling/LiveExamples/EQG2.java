import java.sql.SQLException;
import java.util.Scanner;

class ValueException extends Exception{
    public ValueException(String message){
        super(message) ;
    }
}

class Animal{
    String name ;

    public Animal(String name){
        this.name= name;
    }
}

class Dog extends Animal{
    int age ;
    public Dog(String s, int age){
        super(s) ;
        this.age = age ;
    }
}


public class EQG2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a= sc.nextInt() ;
        int b= sc.nextInt() ;
        try{
            if(b==0){
                throw new ValueException("The error was encountered on line-> 17") ;
            }
            int quotient = a/b ;
            System.out.println("Quotient-> " + quotient) ;
            throw new SQLException();
        } catch(SQLException | ArithmeticException | RuntimeException e){
            System.out.println("Exception-> " + e) ;
        }

        System.out.println("Code worked! And process goes on...") ;
    }
}
