
import java.util.Comparator;
import java.util.TreeSet;


//TreeSet does not allow duplicate elements
//Implements Red-Black Tree
//Sorts the elements as they are entered
//Time Complexity of Insertion-> O(log n)
//Important Functions
// add()
public class Example {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()) ;
        treeSet.add(10) ;
        treeSet.add(-5) ;
        treeSet.add(12) ;
        treeSet.add(-10) ;
        System.out.println("\n==================\n") ;
        System.out.println("Set-> "+ treeSet) ;
        System.out.println("\n==================\n") ;
        
        treeSet.removeLast();
        System.out.println("Set-> "+ treeSet) ;
        System.out.println("\n==================\n") ;
        
        for(int itr: treeSet){
            System.out.println("TreeSet-> "+ itr);
        }
        treeSet.removeFirst() ;
        System.out.println("\n==================\n") ;
        System.out.println("Set-> "+ treeSet + "\n\n") ;
    }
}
