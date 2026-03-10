public class Car extends Vehicle {
    private String gearType ;

    public void setGearType(String gearType){
        this.gearType = gearType ;
    }

    public String getGearType(){
        return this.gearType ;
    }

    public static void main(String[] args){
        System.out.println("hello world") ;
        Car c= new Car() ;
        c.Display();
    }
}
