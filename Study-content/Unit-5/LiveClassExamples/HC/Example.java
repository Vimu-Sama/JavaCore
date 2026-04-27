
import java.util.* ;

public class Example{

    public static void PrintList(List<?> list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)) ;
        }
    }
    public static void main(String[] args){
        List<String> name = new ArrayList<>();
        name.add("Saleel") ;
        name.add("badal") ;
        name.add("aditya") ;
        name.add("hamad") ;
        PrintList(name);
        List<Integer> age = new ArrayList<>() ;
        age.add(20) ;
        age.add(20) ;
        age.add(21) ;
        age.add(20) ;
        PrintList(age);
    }
}