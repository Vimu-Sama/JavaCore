
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader ;
import java.io.FileWriter ;

public class CopyImage {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("Image.jpg") ;
            FileOutputStream ois = new FileOutputStream("OutImage.jpg") ;
            FileReader fir = new FileReader("Image.jpg") ;
            FileWriter fwr = new FileWriter("OutImage2.jpg") ;
            int c ;
            while((c= fis.read())!=-1){
                ois.write(c) ;
            }
            while((c= fir.read())!=-1){
                fwr.write(c);
            }
        } catch(Exception e){
            System.out.println("Exception-> " + e) ;
        }
    }
}
