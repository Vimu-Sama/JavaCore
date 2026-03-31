import java.util.Scanner ;
public class AOLiveExample{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in) ;
        System.out.println("a-> ");
        int a= sc.nextInt() ;
        System.out.println("b-> ");
        int b= sc.nextInt() ;
        try{
            int c = a/b ;
            System.out.println(c) ;
        } catch(ArithmeticException e){
            System.err.println("Arithmetic Exception occurred-> " + e);
        } finally{
            System.out.println("Code completed execution") ;
        }
        
        
    }
}