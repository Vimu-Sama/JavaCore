enum Color{
    WHITE,
    BLACK,
    RED    
}


public class Vehicle{
    private int speed ;
    private String companyName ;
    private String modelName ;
    private Color vehicleColor ;


    //setters
    public void setSpeed(int speed){
        this.speed = speed ;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName ;
    }

    public void setModelName(String modelName){
        this.modelName = modelName ;
    }

    public void Color(Color vehicleColor){
         this.vehicleColor = vehicleColor ;
    }

    //getters
    public int getSpeed(){
        return speed ;
    }

    public String getCompanyName(){
        return companyName ;
    }

    public String getModelName(){
        return modelName ;
    }

    public Color getColor(){
        return vehicleColor ;
    }
    
    //default constructor
    public Vehicle(){
        this.speed= 0;
        this.companyName = "TATA" ;
        this.modelName = "Scorpio" ;
        this.vehicleColor= Color.RED ;
    }

    //custom constructor
    public Vehicle(int speed, String companyName, String modelName, Color vehicleColor){
        this.speed= speed ;
        this.companyName = companyName ;
        this.modelName = modelName ;
        this.vehicleColor = vehicleColor ;
    }
}