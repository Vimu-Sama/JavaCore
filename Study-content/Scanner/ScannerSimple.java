import java.util.Scanner ;
public class ScannerSimple{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in) ;
        System.out.println("Enter string-> ") ;
        String s = scanner.nextLine() ;     // try deleting this!!
        System.out.println("String is->" + s) ;
        scanner.close();
    }
}


//other elements
//nextInt, hasNextInt(), 
//nextFloat, nextDouble