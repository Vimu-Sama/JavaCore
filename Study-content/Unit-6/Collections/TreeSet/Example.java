
import java.util.TreeSet;


//TreeSet does not allow duplicate elements
//Implements Red-Black Tree
//Sorts the elements as they are entered
//Time Complexity of Insertion-> O(log n)

//Important Functions-> 
// add(Object o)
// size()
// remove(Object o) ;
// removeFirst()
// removeLast()
// addFirst()
// addLast()

public class Example {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>() ;
        treeSet.add(10) ;     //10
        treeSet.add(-5) ;       // -5 10
        treeSet.add(12) ;    // -5 10 12
        treeSet.add(-10) ;     // -10 -5 10 12
        treeSet.add(-5) ;       // -10 -5 10 12
        System.out.println("\n==================\n") ;
        System.out.println("Set-> "+ treeSet) ;
        System.out.println("==================\n") ;
        treeSet.removeLast();
        System.out.println("Set-> "+ treeSet) ;
        System.out.println("==================\n") ;
        treeSet.remove(-5) ;
        for(int itr: treeSet){
            System.out.println("TreeSet-> "+ itr);
        }
        treeSet.removeFirst() ;
        System.out.println("==================\n") ;
        System.out.println("Set-> "+ treeSet + "\n\n") ;

        
    }
}
