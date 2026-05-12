
import java.util.ArrayDeque;

// Operation	      Meaning
// add(x)              add element
// addFirst(x)	    add at front
// addLast(x)	    add at back
// removeFirst()	remove front
// removeLast()	    remove back
// peekFirst()	    see front
// peekLast()	    see back


// to implement in form of queue
// offer()	        add
// peek()	        see front
// poll()	        remove front

// to implement in form of stack
// push()	        push elements
// peek()	        see front
// pop()	           remove top

// example ->
//  front-> [40, 10, 20, 30] <- last
public class Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>() ;
        deque.add(20) ;
        deque.add(10) ;
        deque.add(30) ;
        deque.add(60) ;
        deque.add(50) ;
        // 20, 10, 30, 60, 50
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
        ArrayDeque<Integer> queue = new ArrayDeque<>() ;
        queue.offer(10) ;
        queue.offer(201) ;
        queue.offer(11) ;
        queue.offer(51) ;
        queue.offer(4) ;

        while(!queue.isEmpty()){
         System.out.println("Queue elements-> " + queue.poll()) ;
        }
        
        System.out.println("-------------------") ;
        //push(), pop(), peek()
        ArrayDeque<Integer> stack = new ArrayDeque<>() ;
        stack.push(10);
        stack.push(201);
        stack.push(11);
        stack.push(51) ;
        stack.push(4) ;

        while(!stack.isEmpty()){
         System.out.println("Stack elements-> " + stack.pop()) ;
        }

    }
}
