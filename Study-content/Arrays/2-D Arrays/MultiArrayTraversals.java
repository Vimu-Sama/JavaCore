public class MultiArrayTraversals{
    public static void main(String[] args){
        int ar[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        } ;
        System.out.println("Row first traversal-> ") ;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j] + " ") ;
            }
            System.out.println() ;
        }
        System.out.println("Column first traversal-> ") ;
        for(int j=0;j<ar[0].length; j++){
            for(int i=0;i<ar.length; i++){
                System.out.print(ar[i][j] + " ") ;
            }
            System.out.println() ;
        }
    }
}