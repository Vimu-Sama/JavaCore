import java.util.Scanner;
public class MultiDimensionalArray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in) ;
        int[][] ar = new int[3][3]; //{ { 1,2,3,}, {4,5,6}, {7,8,9}} ;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter element-> ") ;
                ar[i][j]= sc.nextInt() ;
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(ar[i][j]+ " ") ;
            }
            System.out.println("") ;
        }
        sc.close() ;
    }
}