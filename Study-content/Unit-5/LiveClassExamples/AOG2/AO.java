
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AO{
    public static void main(String[] args) {
        try{

            //REPLACE FileWriter WITH FileOutputStream
            //REPLACE FileReader WITH FileInputStream
            //REPLACE BufferedWriter WITH BufferedOutputStream
            //REPLACE BufferedReader WITH BufferedInputStream
            //import java.io.* ;
            FileInputStream fis= new FileInputStream("Dummy.txt") ;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis) ;
            
            FileOutputStream fos= new FileOutputStream("newFile.txt") ;
            BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fos) ;
            int i= 0 ;
            while( (i = bufferedInputStream.read()) != -1  ){
                bufferedOutputStream.write((char)i);
            }
            String s= "\nThis is the added String!" ;
            bufferedOutputStream.write(s.getBytes()) ;
            bufferedOutputStream.flush() ;
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }
    }
}