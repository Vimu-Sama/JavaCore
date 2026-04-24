import java.util.ArrayList;
import java.util.List ;

public class LowerBound {
    
    public static void main(String[] args) {
        List<? super Integer> ls= new ArrayList<Number>() ;
        ls.add(1) ;
        ls.add(2) ;
        //Number n = ls.get(0) ;// wrong- get doesnt work with any other but object
        Object o = ls.get(1) ;
    }    
}
