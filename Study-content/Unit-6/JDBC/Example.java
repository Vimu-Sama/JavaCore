
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres" ;
        String user = "postgres" ;
        String password = "postgres" ;
        String readQuery = " FROM student WHERE name= ?" ;
        try{
            Connection conn = DriverManager.getConnection(url, user, password) ;
            conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement(readQuery) ;

            pstmt.setString(1, "Varshith Reddy");
            
            int i= pstmt.executeUpdate() ;
            System.out.println("Changed row(s)-> " + i) ;
            conn.commit();
            conn.close() ;
        } catch(SQLException e){
            e.printStackTrace(); 
        }
    }
}
