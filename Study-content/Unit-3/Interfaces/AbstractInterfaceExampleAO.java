

interface VehicleBehavior{
    // int i= 0;
    void start() ;
    void accelerates() ;
    void brakes() ;
}

interface Trial{
    void checkOil() ;
}

abstract class Vehicle{
    int speed= 100 ;

    public void Horn(){
        System.out.println("Blows Horn") ;
    }
    public void stop(){
        System.out.println("Turns off ignition key!") ;
    }
}

class Car extends Vehicle implements VehicleBehavior, Trial {
    public void start(){
        System.out.println("Turns on ignition key!") ;
    }
    
    public void checkOil(){
        System.err.println("");
    }

    public void accelerates(){
        System.out.println("Accelerator pedal pressed!") ;
    }
    public void brakes(){
        System.out.println("Brake pedal pressed") ;
    }
}

class Bike extends  Vehicle implements Ve{
    public void start(){
        System.out.println("Uses kick or power switch!") ;
    }
    public void accelerates(){
        System.out.println("Accelerator rotated!") ;
    }
    public void brakes(){
        System.out.println("Brake pedal pressed or power brake used") ;
    }
}

public class AbstractInterfaceExampleAO {
    public static void main(String[] args) {
        Vehicle c= new Car() ;
        Bike b= new Bike() ;
        c.stop();
        c.Horn();
        b.start();
        b.stop();
        b.brakes();
    }
}
