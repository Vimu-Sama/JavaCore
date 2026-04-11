import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AO {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("Image.jpg");
            FileOutputStream fout= new FileOutputStream("Image2.jpg") ;
            int i= 0;
            while((i=fin.read())!=-1){
                fout.write(i) ;
            }
            fin.close();
            fout.close();

        } catch(Exception e){
            System.out.println("Exception occurred-> " + e) ;
        }
        
    }
}
