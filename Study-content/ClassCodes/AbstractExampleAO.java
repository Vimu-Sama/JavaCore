interface VehicleBehavior{
    void start() ;
    void accelerates() ;
    void brakes() ;
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

class Car extends Vehicle implements VehicleBehavior{
    public void start(){
        System.out.println("Turns on ignition key!") ;
    }
    
    public void accelerates(){
        System.out.println("Accelerator pedal pressed!") ;
    }
    public void brakes(){
        System.out.println("Brake pedal pressed") ;
    }
}

class Bike extends  Vehicle{
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

public class AbstractExampleAO {
    
}
