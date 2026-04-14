
import java.io.FileReader;
import java.io.FileWriter;

public class CopyAFile{
    public static void main(String[] args) {
        try{
            FileReader fis= new FileReader("Dummy.txt") ;
            FileWriter fos= new FileWriter("newFile.txt") ;
            int i= 0 ;
            while( (i = fis.read()) != -1  ){
                fos.write((char)i);
            }
            fos.flush() ;   //flushes bytes
            fos.close() ;   //closes FileReader
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }
    }
}