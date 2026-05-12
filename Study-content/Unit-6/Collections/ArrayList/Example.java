
import java.util.ArrayList;


//ArrayList allows duplicate elements
//Important Functions to remember-> 
// add()
// get(int index) | list.get(0) ~ ar[0]
// set(int index, <datatype> value) | list.set(0, 10) ~ ar[0] = 10 
// remove(int index)
// size()
public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>() ;
        ar.add(10) ;
        ar.add(20) ;
        ar.add(30) ;
        ar.add(100) ;
        int n = ar.size() ;
        for (int i = 0; i < n; i++) {
            System.out.println("Array's "+ i + " element -> "+ ar.get(i));
        }
        System.out.println("\nArray element printed via foreach loop-> ") ;
        for(int i: ar){
            System.out.println(i) ;
        }
        ar.remove(2);
        System.out.println("\nArray element printed via for each loop ~-> ") ;
        for(int i: ar){
            System.out.println(i) ;
        }
        System.out.println("\nArray element printed via for each loop ~-> ") ;
        ar.set(2, 200) ;
        for(int i: ar){
            System.out.println(i) ;
        }
    }
}
