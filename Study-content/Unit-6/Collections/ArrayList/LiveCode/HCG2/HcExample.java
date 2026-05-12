import java.util.ArrayList ;
import java.util.List ;

public class HcExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10) ;
        list1.add(20) ;
        list1.add(30) ;
        list1.add(40) ;
        list1.add(50) ;
        // [10, 20, 30, 40, 50]
        int n= list1.size() ;
        //5
        System.out.println("-------------------") ;
        for(int i=0;i<n;i++){
            System.out.println("Element-> " + list1.get(i)) ;
        }
        
        list1.remove(2) ;
        // [10, 20, 40, 50]
        n = list1.size() ;
        System.out.println("-------------------") ;
        for(int i=0;i<n;i++){
            System.out.println("Element-> " + list1.get(i)) ;
        }
        // ar[0] = 100 ; -> assignment in array
        // list1.set(0, 100) ; -> assignment in list
        //first parameter is index
        //second parameter is element value
        list1.set(0, 50) ;
        // [50, 20, 40, 50]
        System.out.println("-------------------") ;
        for(int i=0;i<n;i++){
            System.out.println("Element-> " + list1.get(i)) ;
        }

    }    
}
