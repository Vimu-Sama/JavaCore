class Parent{
    int a ;
    int b ;
    class Child{
        int c ;
        public void AddTotalSum(){
            System.out.println("Add-> " + a + b) ;
        }
        public void Display(){
            System.out.println("c-> " + c) ;
        }
    }
}

public class InnerClass {
    public static void main(String[] args){
        Parent p = new Parent() ;
        Parent.Child c= p.new Child() ;
        c.AddTotalSum() ;
        c.Display() ;
    }
}

// This is the deep one. The inner class 
// holds an invisible reference to the outer 
// instance (Parent.this). This is the source 
// of both its power (access to private state) 
// and its danger (memory leaks — the inner object 
// keeps the outer alive even if no one else references it).