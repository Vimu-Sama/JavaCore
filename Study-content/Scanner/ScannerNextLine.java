import java.util.Scanner ;

public class ScannerNextLine{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in) ;
        System.out.println("Input integer-> ") ;
        int i= scanner.nextInt() ;
        String s = scanner.nextLine() ; //show fix
        System.out.println("This is Integer-> " + i) ;
        System.out.println("This is the string-> " + s) ;
        System.out.println("\n\nInput second integer-> ") ;
        int p= scanner.nextInt() ;
        System.out.println("Input string-> ") ;
        String m= scanner.next() ;
        System.out.println("This is Integer-> " + p) ;
        System.out.println("This is String-> "+ m) ;
        scanner.close();
        //explain consumption of delimiters
    }
}