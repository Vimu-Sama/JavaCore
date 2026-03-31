public class Example {
    public static void main(String[] aStrings){
        try{
            divide(65,0) ;
        } catch(Exception e){
            System.err.println("Caught exception-> "+ e);
        }
        
    }   
    //throws forces us to handle the error at caller end
    static int divide(int a, int b) throws Exception{
        return a/b ;
    }
}
