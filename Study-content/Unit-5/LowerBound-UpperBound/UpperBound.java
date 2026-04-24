import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        List<? extends Integer> list = List.of(1,2,3) ;
        Number  i = list.get(0) ;
        Integer p = list.get(1) ;
        Object  d = list.get(2) ;
        System.out.println("Number-> " + i) ;
        System.out.println("Integer-> " + p) ;
        System.out.println("Object-> " + d) ;
    }   
}
