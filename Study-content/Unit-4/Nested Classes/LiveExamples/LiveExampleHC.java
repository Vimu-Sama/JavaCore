
class Parent {
    void Display() {
        System.out.println("This is a Parent Class");
    }
}

class Child extends Parent {
    void Display() {
        System.out.println("This is a Child Class");
    }
}

public class LiveExampleHC {
    public static void main(String[] args){
        Parent p = new Child() ;
        Parent p2 = new Parent() {
            void Display(){
                System.out.println("This is an Anonymous Class");
            }
        };
        p.Display();
        p2.Display();
    }
}