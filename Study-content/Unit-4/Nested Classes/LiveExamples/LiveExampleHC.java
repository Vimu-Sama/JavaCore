class Vehicle{
    int speed ;

    public void accelerates(){
        System.out.println("Vehicle accelerates") ;
    }
    
    static class Engine{
        int torque;

        public void works(){
            System.out.println("Engine runs at" + torque);
        }
    }
}

public class LiveExampleHC {
    public static void main(String[] args) {
        // Vehicle v= new Vehicle() ;
        // Vehicle.Engine e = v.new Engine() ;
                    // new Engine(v reference)
        Vehicle.Engine e = new Vehicle.Engine() ;
    }
}
