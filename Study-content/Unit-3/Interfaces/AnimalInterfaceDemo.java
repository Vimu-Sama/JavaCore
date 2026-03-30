/*
INTERFACE RULES IN JAVA

1. An interface is declared using the 'interface' keyword.

   interface Animal { }

2. Interfaces CANNOT be instantiated (no objects can be created).

   Animal a = new Animal();  // compile-time error

3. A class implements an interface using the 'implements' keyword.

   class Dog implements Animal { }

4. All methods in an interface are PUBLIC and ABSTRACT by default
   (unless declared static or default).

   interface Animal {
       void sound();   // automatically public abstract
   }

5. A class implementing an interface MUST implement all its methods
   unless the class itself is abstract.

   interface Animal {
       void sound();
   }

   class Dog implements Animal {
       public void sound() {
           System.out.println("Bark");
       }
   }

6. Interface methods MUST be implemented with 'public' access
   because interface methods are implicitly public.

7. Interfaces CAN contain variables, but they are automatically:
      public static final (constants).

   interface MathConstants {
       int VALUE = 10;   // actually public static final
   }

8. Interface variables MUST be initialized at declaration.

   int VALUE = 10;   // allowed
   
   int VALUE;        // not allowed
   VALUE= 10;

9. Interfaces CAN contain default methods (since Java 8).

   interface Animal {
       default void eat() {
           System.out.println("Animal eating");
       }
   }

10. Interfaces CAN contain static methods (since Java 8).

   interface Utility {
       static void print() {
           System.out.println("Hello");
       }
   }

11. Interfaces CAN contain private methods (since Java 9)
    but they are used only inside default methods.

12. A class can implement MULTIPLE interfaces.

   interface A {}
   interface B {}
    
   class Test implements A, B {}

13. Interfaces CAN extend other interfaces.

   interface A {}
   interface B extends A {}

14. Interfaces CANNOT have constructors.

15. Interfaces CANNOT contain instance variables
    (only public static final constants).

16. Interfaces support MULTIPLE INHERITANCE
    (a class can implement multiple interfaces).

*/

interface Animal {

    // constant (public static final automatically)
    int MAX_AGE = 50;

    // abstract method
    void eat();

    // default method
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    // static method
    static void kingdom() {
        System.out.println("All animals belong to Animalia kingdom");
    }
}

// Interface inheritance
interface Pet extends Animal {
    void play();
}

// Another interface
interface Wild {
    void hunt();
}

// Class implementing multiple interfaces
class Dog implements Pet, Wild {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays with owner");
    }

    public void hunt() {
        System.out.println("Dog hunts small animals");
    }
}

public class AnimalInterfaceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();
        d.hunt();

        // default method
        d.sleep();

        // interface constant
        System.out.println("Max Age: " + Animal.MAX_AGE);

        // static interface method
        Animal.kingdom();
    }
}