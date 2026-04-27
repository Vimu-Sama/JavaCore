import java.util.ArrayList;
import java.util.List;

public class WildCard {

    // Wildcard allows for more localised approach.
    // You can use it in functions, you can use it in
    // Lists
    public static void PrintDetails(List<?> currentList){
        for(int i=0;i<currentList.size();i++){
            System.out.println(i +" element-> " + currentList.get(i)) ;
        }
    }
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Manashwi") ;
        name.add("Bryn") ;
        name.add("Astuti") ;
        PrintDetails(name);

        List<Integer> age= new ArrayList<>() ;
        age.add(10) ;
        age.add(20) ;
        age.add(30) ;
        PrintDetails(age);
    }
}
