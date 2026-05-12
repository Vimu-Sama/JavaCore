
import java.util.HashMap;

//Important Functions-> 
    //put() --> used for insertion of elements
    //clear() --> clears the HashMap data
    //getValue(int key) --> used to get value of given key
    //isEmpty() --> checks if the HashMap is empty or not
    //size() --> gives size of HashMap

//Traversal->
    //values() --> gives set of all values in HashMap
    //keySet() --> gives set of all keys in HashMap
    //entrySet() --> gives set of all elements in HashMap

public class Example {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>() ;
        hashMap.put(null, "Arnav") ;
        hashMap.put(1, "Harsh") ;
        hashMap.put(2, "Krishna") ;
        hashMap.put(null, "Jivraj") ;
        hashMap.put(1, "Nikhil") ;

        // values() traversal
        for(var val: hashMap.values()){
            System.out.println("HashMap values-> "+ val) ;
        }

        System.out.println("-----------") ;

        // keySet() traversal
        for(var key: hashMap.keySet()){
            System.out.println("HashMap keys-> " + key);
        }

        System.out.println("Is the hashMap empty?-> "+ hashMap.isEmpty()) ;
        hashMap.clear();
        System.out.println("-----------") ;
        
        System.out.println("Is the hashMap empty-> " + hashMap.isEmpty());
        // entrySet() traversal
        for(HashMap.Entry<Integer, String> map: hashMap.entrySet()){
            System.out.println("HashMap sets-> " + map);
        }

    }    
}
