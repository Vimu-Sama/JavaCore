
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteElement {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres" ;
        String user = "postgres" ;
        String password = "postgres" ;
        String createUser = "INSERT INTO customer(id, name) VALUES (?, ?)" ;

        try{
            Connection conn = DriverManager.getConnection(url, user, password) ;
            PreparedStatement pstmt = conn.prepareStatement(createUser) ;
            pstmt.setInt(1, 3) ;
            pstmt.setString(2, "Mukesh") ;
            int rowInserted = pstmt.executeUpdate() ;
            System.out.println("Row Inserted-> " + rowInserted) ;
            conn.close() ;
        } catch(Exception e){
            System.out.println("Exception caught-> "  + e) ;
        }
    }
}
