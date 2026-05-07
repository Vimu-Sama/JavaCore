
import java.util.ArrayDeque;

// Operation	      Meaning
// addFirst(x)	    add at front
// addLast(x)	    add at back
// removeFirst()	remove front
// removeLast()	    remove back
// peekFirst()	    see front
// peekLast()	    see back
// add              add
// offer()	        add
// peek()	        see front
// poll()	        remove front

public class Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>() ;
        deque.add(10) ;
        deque.add(20) ;
        deque.add(30) ;
        deque.add(40) ;
        deque.add(50) ;
        
        System.out.println("-------------------") ;
        for(var i : deque){
           System.out.println("Element-> " + i) ; 
        }
        deque.remove() ;
        
        System.out.println("-------------------") ;
        for(var i : deque){
           System.out.println("Element-> " + i) ; 
        }
        System.out.println("-------------------") ;
        deque.removeLast() ;
        for(var i : deque){
           System.out.println("Element-> " + i) ; 
        }
        System.out.println("-------------------") ;
        deque.removeFirst() ;
        for(var i : deque){
           System.out.println("Element-> " + i) ; 
        }
        System.out.println("-------------------") ;
        
        //offer(), peek(), poll()
        
    }
}
