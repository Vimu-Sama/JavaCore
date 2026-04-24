
import java.util.List;

class Saver<T extends  Integer, U extends Number> {
    T data1 ;
    U data2 ;

    public Saver(T a, U b){
        this.data1 = a ;
        this.data2 = b ;
    }

    public T getData1(){
        return data1 ;
    }

    public U getData2(){
        return data2 ;
    }
}

public class Example1{

    List<?> list ;

    public void StoreAnyList(List<?> list){
        this.list= list ;
    }

    public static void PrintList(List<? extends Number> list){
        for(Number n : list){
            System.out.println("n.doubleValue()->  " +  n.doubleValue());
        }
    }

    public static void main(String[] args) {
        Saver<Integer, Double> saver= new Saver<>(1, 3.2) ;
        Saver<Integer, Double> saver2 = new Saver<>(3, 2.0) ;
        PrintList(List.of(1.0,2.0, 3.0));
    }
}