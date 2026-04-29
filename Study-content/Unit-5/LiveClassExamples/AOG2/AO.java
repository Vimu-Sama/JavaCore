import java.util.List ;

public class AO{
    public static void main(String[] args) {
        List<? super Number> list = List.of(20, 10.0f, 7.0) ;
        Object f= list.get(1) ;
        Float f2= (Float) f ;
        list.add(20) ;
    }
}