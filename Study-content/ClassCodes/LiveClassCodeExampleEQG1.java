


abstract class Vehicle{
    int speed ;
    abstract void engineStarts() ;
}

class Car extends Vehicle{
    public void engineStarts(){
        System.out.println("Ignition key rotated!");
    }
}

class Bike extends Vehicle{
    public void engineStarts(){
        System.out.println("Power switch or kick used!");
    }
}

public class LiveClassCodeExampleEQG1 {
    public static void main(String[] args) {
        Vehicle v1= new Car() ;
        Vehicle v2= new Bike() ;
        v1.engineStarts();
        v2.engineStarts();
    }
}
