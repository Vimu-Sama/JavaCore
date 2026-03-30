





abstract class Vehicle{
    public abstract void engineStarts() ;
    public void Print(){
        System.out.println("Hello!") ;
    }
}

abstract class VehicleSupport extends Vehicle{
    abstract void engineStops() ;
}

class Bike extends Vehicle{
    public void engineStarts(){
        System.out.println("Used Power Switch or kick") ;
    }
}

class Car extends VehicleSupport{
    public void engineStarts(){
        System.out.println("Used ignition key") ;
    }
    public void engineStops(){
        System.out.println("Used ignition key to turn off vehicle") ;
    }
}





public class AbstractLiveClassExampleHC {
    public static void main(String[] args) {
        Vehicle v= new Car() ;
        v.engineStarts();
        v.Print();
    }
}
