//TreeSet->
// 1)- no duplicates (bcz its parent class Set, doesnt allow duplicates)
// 2)- the elements are sorted on their own (bcz of Red-Black Tree)
// 3)- it implements Red-Black Tree

import java.util.TreeSet;

public class aoLiveExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>() ;
        treeSet.add(100) ;
        treeSet.add(20) ;
        treeSet.add(-50) ;
        treeSet.add(80) ;
        treeSet.add(10) ;
        treeSet.add(100) ;
        // -50 10 20 80 100
        for(Integer i: treeSet){
            System.out.println("Element val-> " + i) ;
        }

        treeSet.remove(20) ;
        // -50 10 80 100
        System.out.println("Elements-> " + treeSet) ;
    }
}
