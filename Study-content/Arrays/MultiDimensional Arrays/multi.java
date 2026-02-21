public class multi {
    public static void main(String[] args){
        int[][][] ar = {{{ 1,2,3 }, {4,5,6}},
                        {{ 7,8,9 }, {10,11,12}},
                        {{10,11,12}, {13,14,15}}} ;

        // Range of i-> [0, 3) -- from 0 inclusive to 3 exclusive i.e. i will stop at value 3
        // Range of j-> 0 to 2  -- from 0 inclusive to 2 exclusive i.e. j will stop at value 2
        // Range of k-> [0, 3) -- from 0 inclusive to 3 exclusive i.e. k will stop at value 3

        //outer array size= 3
        for(int i=0;i<3;i++){
            //middle array size= 2
            for(int j=0; j<2; j++){
                //inner array size= 3
                for(int k=0; k<3; k++){
                    System.out.print(ar[i][j][k] + " ") ;
                }
                System.out.println() ;
            }
            //line below printed for better visuals
            System.out.println("-------------") ;
        }
    }
    //IMPORTANT NOTE: NOTICE HOW THE NUMBER OF LOOPS INCREASED AS
    // THE DIMENSION OF OUR ARRAY INCREASED, SAME IS POSSIBLE IN CASE OF FURTHER INCREAMENT
    // IN DIMENSIONS OF ARRAY
}
