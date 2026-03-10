/*
ABSTRACT CLASS RULES IN JAVA

1. An abstract class is declared using the 'abstract' keyword.
   abstract class Animal { }

2. Abstract classes CANNOT be instantiated (no objects can be created).
   Animal a = new Animal();  --> will throw compile-time error

3. Abstract classes CAN contain abstract methods (methods without body).
   abstract void sound();

4. If a class contains at least one abstract method,
   the class MUST be declared abstract.

5. A subclass extending an abstract class MUST implement
   all abstract methods unless the subclass is also abstract.
   
   Small quick example-> 
   abstract class Shape {
       abstract void draw();
   }

   class Circle extends Shape {
       void draw() {
           System.out.println("Drawing circle");
       }
   }

6. Abstract classes CAN contain concrete (normal) methods.

   abstract class Animal {
       void eat() {
           System.out.println("Eating");
       }
   }

7. Abstract classes CAN have constructors.
   These constructors are called when a subclass object is created.

8. Abstract classes CAN contain instance variables (fields).

   abstract class Animal {
       int age;
   }

9. Abstract classes CAN contain static methods.

10. Abstract classes CAN contain final methods
    (final methods cannot be overridden by subclasses).

11. Abstract classes CAN extend another abstract class.

12. Abstract methods CANNOT be:        // we are talking about abstract methods here
    - private
    - static
    - final
    because they must be overridden by subclasses.

13. Abstract classes may contain NO abstract methods.
    They can still be abstract just to prevent object creation.

14. Abstract classes can have access modifiers:
    public, protected, default.

15. A class can extend ONLY ONE abstract class
    (Java does not support multiple inheritance with classes).

*/

abstract class Animal{
    int age ;
    public Animal(){
        System.out.println("This is an Abstract class Constructor!") ;
    }
    public void Sound(){
        System.out.println("This is the sound function from animal abstract class") ;
    }
    public abstract void Walks() ;// abstract functions cannot have body
}

abstract class AnimalTraits extends Animal{
    String color ;
    public AnimalTraits(){
        System.out.println("This is an Animal Trait class constructor") ;
    }
    public abstract void AssignColor(String s) ;
}

class Cat extends AnimalTraits{
    public Cat(){
        System.out.println("This is Cat normal class constructor!") ;
    }
    public void Walks(){
        System.out.println("Cat walks!") ;
    }
    public void AssignColor(String color){
        super.color = color;
        System.out.println("Assign color got called") ;
    }
}

public class AbstractClass {
    public static void main(String[] args){
        Cat cat= new Cat() ;
        cat.Sound();    //function overriding
        cat.Walks();    //abstract method implementation
        cat.AssignColor("red");
        System.out.println("Color-> " + cat.color) ;
    }    
}
