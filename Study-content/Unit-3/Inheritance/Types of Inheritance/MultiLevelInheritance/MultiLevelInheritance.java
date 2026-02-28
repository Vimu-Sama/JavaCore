// Grandfather class
class Grandfather {
    String familyName = "Sharma";

    void showGrandfather() {
        System.out.println("I am the Grandfather. Surname was inherited from me");
    }
}

// Father class inherits Grandfather
class Father extends Grandfather {
    String house = "Delhi House";

    void showFather() {
        System.out.println("I am the Father. House was inherited from me");
    }
}

// Son class inherits Father (and indirectly Grandfather)
class Son extends Father {
    String name = "Rahul";

    void showSon() {
        System.out.println("I am the Son. I am chilling");
    }
}

// Main class
public class MultiLevelInheritance {
    public static void main(String[] args) {

        Son s = new Son();

        // Accessing all properties
        System.out.println("Name: " + s.name);
        System.out.println("Family Name: " + s.familyName);
        System.out.println("House: " + s.house);

        // Calling all methods
        s.showSon();
        s.showFather();
        s.showGrandfather();
    }
}