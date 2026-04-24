
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Example2 {
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("rear.dat") ;
            ObjectInputStream ois = new ObjectInputStream(fis) ;
            Employee emp ;
            while(true){
                emp= (Employee)ois.readObject() ;
                System.out.println("~~Employee~~ "+ emp) ;
            }
        } catch(Exception e){
            System.err.println("Error occured-> " + e);
        }
    }
}
