
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example{
    public static void main(String[] args) {
        try{
            //replace FileReader with FileInputStream
            //replace FileWriter with FileOutputStream
            //replace BufferedReader with BufferedInputStream
            //replace BufferedWriter with BufferedOutputStream
            FileInputStream fis= new FileInputStream("newFile.txt") ;
            BufferedInputStream bufReader = new BufferedInputStream(fis) ;


            FileOutputStream fos= new FileOutputStream("newFile2.txt") ;
            
            BufferedOutputStream bufferedWriter = new BufferedOutputStream(fos, 1024) ;


            int i= 0 ;
            while( (i= bufReader.read()) != -1){
                bufferedWriter.write(i);
            }
            bufferedWriter.flush();


            BufferedInputStream bufReader2 = new BufferedInputStream(new FileInputStream("anotherFile.txt")) ;
            
            byte[] b= bufReader2.readAllBytes() ;
            bufferedWriter.write(b) ;
            bufferedWriter.close();

        } catch(Exception e){
            System.out.println("Exception caught->" + e) ;
        }
        
    }
}