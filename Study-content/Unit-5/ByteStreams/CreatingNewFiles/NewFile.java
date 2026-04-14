import java.io.FileOutputStream;

public class NewFile {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("NewFile.txt")) {
            String s = "Hello World!";
            int i=0 ;
            fout.write(s.getBytes()) ;
        } catch(Exception e){
            System.out.println("E-> " + e) ;
        }
    }
}
