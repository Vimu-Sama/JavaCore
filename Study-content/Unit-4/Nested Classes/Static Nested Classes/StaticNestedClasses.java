class Parent{
    static int a = 100;
    static int b = 200;
    static class Child{
        int p ;
        public void addNums(){
            System.out.println(a+b) ;
        }
        public void Display(){
            System.out.println("P is-> " + p) ;
        }
    }
}


public class StaticNestedClasses {
    public static void main(String[] args){
        Parent.Child child1= new Parent.Child() ;
        child1.p = 500 ;
        child1.addNums() ;
        child1.Display() ;
        Parent.a = 2000 ;
        child1.addNums() ;
    }
}
