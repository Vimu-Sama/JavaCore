class Parent{
    void Display(){
        String p= "hello";  //parent variable referenced by local class should be final or effectively final

        class Child{
            void Display(){
                System.out.println("Inner method class" + p) ;
            }
        }
        Child c= new Child() ;
        c.Display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args){
        Parent p = new Parent();
        p.Display();
    }
}
