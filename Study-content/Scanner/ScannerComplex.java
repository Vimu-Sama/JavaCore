import java.util.Scanner ;

public class ScannerComplex {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the variable-> ") ;
        scanner.useDelimiter(",");
        // ",|\\s+" --this right here is regex
        //a little brief about regex
        while(scanner.hasNextInt()){
            System.out.println("next scan-> " + scanner.nextInt()) ;
        }
        scanner.close() ;
    }
}
