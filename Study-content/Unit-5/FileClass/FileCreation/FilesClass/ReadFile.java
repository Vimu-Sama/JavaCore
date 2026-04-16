import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try {
            List<String> stringList = Files.readAllLines(Paths.get("./Dummy.txt"));
            for(String curr: stringList){
                System.out.println("~~" + curr);
            }
        } catch (IOException e) {
            System.out.println("Caught Exception-> " + e);
        }
    }
}
