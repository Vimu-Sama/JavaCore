public class Overloading {

    private String name;
    private int age;

    // ----------------------------
    // Constructor Overloading
    // ----------------------------

    // Default constructor
    public Overloading() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    public Overloading(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with Name Called");
    }

    // Constructor with two parameters
    public Overloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with Name and Age Called");
    }

    // ----------------------------
    // Method (Function) Overloading
    // ----------------------------

    // Method with no parameters
    public void greet() {
        System.out.println("Hello!");
    }

    // Method with one parameter
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with two parameters
    public void greet(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    // Main method to test overloading
    public static void main(String[] args) {

        // Constructor Overloading
        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading("Vimarsh");
        Overloading obj3 = new Overloading("Vimarsh", 25);

        System.out.println();

        // Method Overloading
        obj1.greet();
        obj2.greet("Rahul");
        obj3.greet("Aman", 30);
    }
}