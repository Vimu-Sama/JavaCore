
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializing {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Car car = (Car) ois.readObject();
            System.out.println("Car object--> " + car);
            Car car2 = (Car) ois.readObject();
            System.out.println("Car object2--> " + car2);
            System.out.println("Current Class UID: " + Car.serialVersionUID);
            // or you can use while loop, with EOF exception as the way out
        } catch (Exception e) {
            System.out.println("Exception caught-> " + e);
        }
    }
}
