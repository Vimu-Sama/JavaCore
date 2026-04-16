import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterCode {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("output.txt"));
            bufferWriter.write("This is a normal line");
            bufferWriter.flush();
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println("Exception caught-> " + e);
        }
    }
}
