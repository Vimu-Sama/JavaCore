

class Parent{
    void Display(){
        class Child{
            void Display(){
                System.out.println("Inner method class") ;
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
