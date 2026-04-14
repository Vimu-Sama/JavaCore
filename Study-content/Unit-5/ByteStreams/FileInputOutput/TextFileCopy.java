import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextFileCopy {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Dummy.txt");
                FileOutputStream fout = new FileOutputStream("NewFile.txt")) {
            int temp = 0;
            while((temp = fis.read())!=-1){
                fout.write(temp) ;
            }    
        } catch(Exception e){
            System.out.println("Exception-> " + e) ;
        }
    }
}
