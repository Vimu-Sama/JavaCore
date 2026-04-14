import java.io.FileReader;

public class ReadingFromFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader= new FileReader("Dummy.txt") ;
            int temp= 0;
            while((temp= fileReader.read()) != -1){
                System.out.print((char)temp) ;
            }
        } catch(Exception e){
            System.out.println("Exception caught-> " + e);
        }
    }
}
