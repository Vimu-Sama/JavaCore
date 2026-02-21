import java.util.Scanner ;
public class Arrays{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in) ;
        int n=  scan.nextInt() ;
        int[] ar= new int[n] ;      //{1,2,3,4,5}
        for(int i=0;i<n; i++){
            ar[i] = scan.nextInt() ;
        }
        System.out.println("This is the array u entered-> ") ;
        for(int i=0;i<n; i++){
            System.out.print(ar[i] + " ")  ;
        }
        scan.close() ;
    }
}