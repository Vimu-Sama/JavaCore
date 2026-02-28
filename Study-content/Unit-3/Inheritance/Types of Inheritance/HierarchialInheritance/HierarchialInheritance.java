// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class HierarchialInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        // Dog object
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method

        System.out.println();

        // Cat object
        c.eat();   // inherited from Animal
        c.meow();  // Cat's own method
    }
}