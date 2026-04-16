
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteOnFile {
    public static void main(String[] args) {
        try {
            String s1 = "Hello World!";
            String s2 = "This is a file done!";
            String[] s = { s1, s2 };
            Files.write(
                    Paths.get("NEwFile.txt"),
                    java.util.Arrays.asList(s),
                    StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println("Input Output Exception-> " + e);
        }
    }
}
