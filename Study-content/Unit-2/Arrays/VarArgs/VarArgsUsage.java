public class VarArgsUsage {
    public static void main(String args[]){
        int[] arr= {10,20,30,40,50} ;
        VarArgsUsage varObject= new VarArgsUsage() ;    
        //a new object is needed
        //whenever we are trying to call from a static function
        varObject.iterateAndPrint(arr) ;     
        String s= "Array is-> " ;
        varObject.usingVarArgsWithOtherParameter(s, arr);    
    }

    //var arg stands for variable arguments
    //indentation and nomenclature/naming should be consistent
    //talking about varArg behavior during function overloading
    //var arg should be the last parameter
    public void iterateAndPrint(int... ar) {
        System.out.println("Passed string is-> ") ;
        for(int i: ar){
            System.out.print(i + " ") ;
        }
    }

    //IMPORTANT: the var args should be the last argument to be passed, there should be
    // no other argument after var args
    public void usingVarArgsWithOtherParameter(String s, int... arr){
        System.out.println(s) ;
        for(int i: arr){
            System.out.println(i + " ") ;
        }
    }

}
