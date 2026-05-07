
import java.util.TreeSet;

public class EQG1live {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>() ;
        treeSet.add(-10) ;
        treeSet.add(20) ;
        treeSet.add(90) ;
        treeSet.add(1) ;
        treeSet.add(56) ;

        System.out.println("Tree set is-> " + treeSet) ;

        for(var itr: treeSet){
            System.out.println("Element-> " + itr) ;
        }
        treeSet.remove(56);
        
        System.out.println("Tree set is-> " + treeSet) ;

        treeSet.remove(0) ;

        System.out.println("Tree set is-> " + treeSet) ;

    }    
}
