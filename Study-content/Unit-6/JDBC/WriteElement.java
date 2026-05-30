
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteElement {
    public static void main(String[] args) {
        //Commands to run this code via Terminal->
        //javac -cp ".;postgresql-42.7.10.jar" WriteElement.java
        //java -cp ".;postgresql-42.7.10.jar" WriteElement
        
        String url = "jdbc:postgresql://localhost:5432/postgres" ;
        String user = "postgres" ;
        String password = "postgres" ;
        String createUser = "INSERT INTO student(id, name, marks) VALUES (?, ?, ?)" ;

        try{
            Connection conn = DriverManager.getConnection(url, user, password) ;
            PreparedStatement pstmt = conn.prepareStatement(createUser) ;
            pstmt.setInt(1, 4) ;
            pstmt.setString(2, "Kajal") ;
            pstmt.setInt(3, 30) ;
            int rowInserted = pstmt.executeUpdate() ;
            System.out.println("Row Inserted-> " + rowInserted) ;
            conn.close() ;
        } catch(Exception e){
            System.out.println("Exception caught-> "  + e) ;
        }
    }
}
