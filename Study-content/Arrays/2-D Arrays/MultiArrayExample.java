import java.util.Scanner ;
public class MultiArrayExample{
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in) ;
       int numRow= scan.nextInt() ;
       int numCol= scan.nextInt() ;
       int[][] ar= new int[numRow][numCol] ;
       for(int i=0;i<numRow;i++){
        for(int j=0;j<numCol;j++){
            ar[i][j]= scan.nextInt() ;
        }
       }
       for(int i=0;i<numRow;i++){
        for(int j=0;j<numCol;j++){
            System.out.print(ar[i][j] + " ") ;
        }
        System.out.println() ;
       }
       scan.close() ; 
    }
}