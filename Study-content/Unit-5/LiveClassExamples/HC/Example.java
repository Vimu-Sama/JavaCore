
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Dummy.txt") ;
            FileOutputStream fos = new FileOutputStream("newFile.txt") ;
            int i= 0;
            while(  (i = fis.read()) != -1 ){
                fos.write(i) ;
            }
        } catch(Exception e){
            System.out.println("Exception encountered-> " + e) ;
        }
    }
}