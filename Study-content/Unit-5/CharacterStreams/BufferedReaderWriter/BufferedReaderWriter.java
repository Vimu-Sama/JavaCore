
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderWriter {
        public static void main(String[] args){
            
            //Reading file using BufferedReader
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader("Dummy.txt")) ;
                int temp= 0;
                while((temp = bufferedReader.read()) != -1){
                    System.out.print((char)temp) ;
                }
                bufferedReader.close();
                
            } catch(Exception e){
                System.out.println("Exception-> " + e);
            }
            System.out.println("\n============================") ;


            //using Buffered Readline() function
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader("Dummy.txt")) ;
                String s= bufferedReader.readLine() ;
                String s2 = bufferedReader.readLine() ;
                System.out.println(s) ;
                System.out.println(s2) ;
                bufferedReader.close();
                
            } catch(Exception e){
                System.out.println("Exception-> " + e);
            }
        }
}
