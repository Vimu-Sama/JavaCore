import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        
        Object a = new Object() ;
        Object b= new Object() ;
        List<? extends Object> list = List.of(2.0,1) ;
        Object  i = list.get(0) ;
        Object p = list.get(1) ;
        //no addition will be allowed here
        //send data in one go, not in middle of the code
        System.out.println("Number-> " + i) ;
        System.out.println("Integer-> " + p) ;
    }   
}
