//NOTE:
//two types of member functions- methods(manipulate data- only serves the purpose of modifying member variables) and 
// behaviours(how it interacts with data) 

public class CarAdvanced{
    private String carCompany ;
    private String carModel ;
    private String carColor ;
    public int carSpeed = 10;
    
    
    //constructor
    public CarAdvanced(String carCompany, String carModel, String carColor){
        this.carCompany= carCompany ;
        this.carModel = carModel ;
        this.carColor = carColor ;
    }

    public String carStart(){       //behavior
        return "Car starts running with a speed of " + carSpeed ;
    }
    //getters
    public String getCarCompany(){
        return carCompany ;
    }

    public String getCarModel(){
        return carModel ;
    }

    public String getCarColor(){
        return carColor ;
    }

    public void setCarColor(String carColor){
        this.carColor = carColor ;
    }

    public static void main(String args[]){
        CarAdvanced car= new CarAdvanced("Tata", "Sierra", "Black") ;
        System.out.println("Car company is-> " + car.getCarCompany()) ;
        System.out.println("Car model is-> " + car.getCarColor()) ;
        System.out.println("Car color is-> " + car.getCarModel()) ;
        System.out.println(car.carStart()) ;
    }
}