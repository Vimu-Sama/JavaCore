abstract class Vehicle{
    int speed ;
    int fuelCapacity ;

    abstract void EngineStarts() ;  //abstract method

    public void EngineStops(){
        System.out.println("Engine has stopped") ;
    }
}

abstract class VehicleColor extends Vehicle{
    
}

class Car extends VehicleColor{
    public void EngineStarts(){
        System.out.println("Turn on ignition key") ;
    }
}

class Bike extends Vehicle{
    public void EngineStarts(){
        System.out.println("Used power switch or kick") ;
    }
}

public class liveclassExample {
    public static void main(String[] args) {
        Vehicle v= new Car() ;
        v.EngineStarts();
        Vehicle v2= new Bike() ;
        v2.EngineStarts();
    }
}
