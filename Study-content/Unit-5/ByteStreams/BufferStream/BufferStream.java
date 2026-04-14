
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// always remember by default buffer stream size is 8KB
// you can modify the size by passing one more argument to the class Constructor after 
// FileInputStream
public class BufferStream {
    public static void main(String[] args) {
        try(BufferedInputStream binput = new BufferedInputStream(new FileInputStream("BufferDummy.txt"));
            BufferedOutputStream boutput= new BufferedOutputStream(new FileOutputStream("CreatedNewFile.txt"))){
                boutput.write(binput.readAllBytes()) ;
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }
    }    
}
