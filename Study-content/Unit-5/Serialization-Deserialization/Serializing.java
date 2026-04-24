
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable{
    public static final long serialVersionUID = 4L ;
    int speed= 10 ;
    int mileage = 30 ;
    String carName ;
    String carColor ;

    public Car(int speed, int mileage){
        this.speed = speed ;
        this.mileage = mileage ;
    }

    public void RunCar(){
        System.out.println("Car runs with speed of-> " + this.speed);
    }

    public String toString(){
        return "\nCar speed-> " + speed + "\nCar mileage-> " + mileage ;
    }
}


public class Serializing{
    public static void main(String[] args) {
        try{
            FileOutputStream fos= new FileOutputStream("car.dat") ;
            ObjectOutputStream outputStream = new ObjectOutputStream(fos) ;
            Car car= new Car(10,30) ;
            Car car1= new Car(20,60) ;
            outputStream.writeObject(car) ;
            outputStream.writeObject(car1) ;
        } catch(Exception e){
            System.out.println("Exception caught-> " + e) ;
        }
    }    
}