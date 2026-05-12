
import java.sql.Connection;
import java.sql.DriverManager;

public class OnlyConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";

        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established-> ");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}