import java.util.TreeSet;

public class LiveExamplehc {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>() ;
        treeSet.add(100) ;  //100
        treeSet.add(-20);      // -20, 100
        treeSet.add(50) ;   // -20, 50, 100
        treeSet.add(-80) ;    //-80, -20, 50, 100

        System.out.println("Tree set elements are-> " + treeSet) ;
        treeSet.remove(-20) ;
        treeSet.remove(500);
        System.out.println("Tree set elements are-> " + treeSet) ;

        for(var element: treeSet){
            System.out.println("Elements are-> " + element) ;
        }
    }    
}
