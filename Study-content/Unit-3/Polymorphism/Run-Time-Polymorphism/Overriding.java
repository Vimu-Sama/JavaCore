// Parent Class
class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}


public class Overriding {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.sound();   // Dog's version
        a2.sound();   // Cat's version
        a3.sound();   // Parent version
    }
}