
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example{
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("newFile.txt") ; 
            FileOutputStream fos= new FileOutputStream("newFile2.txt") ;   
            int i= 0 ;
            while( (i= (byte)fis.read()) != -1){
                fos.write(i);
            }
        } catch(Exception e){
            System.out.println("Exception caught->" + e) ;
        }
        
    }
}