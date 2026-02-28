//please note that name of class and the name of file should be similar
public class Car{
    //attributes
    public String carCompany ;
    public String carModel ;
    public String carColor ;

    public static void main(String args[]){
        Car car= new Car() ;
        car.carCompany= "Tata" ;
        car.carModel= "Sierra" ;
        car.carColor= "Red" ;
        System.out.println("Car company is-> " + car.carCompany) ;
        System.out.println("Car model is-> " + car.carModel) ;
        System.out.println("Car color is-> " + car.carColor) ;
    }
}