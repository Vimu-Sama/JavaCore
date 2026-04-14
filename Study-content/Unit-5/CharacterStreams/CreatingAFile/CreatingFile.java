import java.io.FileWriter;

public class CreatingFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("NewFile.txt") ;
            
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }
        
    }    
}
