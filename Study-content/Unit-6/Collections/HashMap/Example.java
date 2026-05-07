
import java.util.HashMap;

//Important Functions-> 
    //put()
    //clear()
    //getValue()
    //isEmpty()
    //size()

//Traversal->
    //values()
    //keySet()
    //entrySet()

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>() ;
        hashMap.put(null, "Arnav") ;
        hashMap.put(1, "Harsh") ;
        hashMap.put(2, "Krishna") ;

        // values() traversal
        for(var val: hashMap.values()){
            System.out.println("HashMap values-> "+ val) ;
        }

        // keySet() traversal
        for(var key: hashMap.keySet()){
            System.out.println("HashMap keys-> " + key);
        }

        // entrySet() traversal
        for(var map: hashMap.entrySet()){
            System.out.println("HashMap sets-> " + map);
        }

    }    
}
