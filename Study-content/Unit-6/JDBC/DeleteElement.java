
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteElement {
    public static void main(String[] args) {
        //Commands to run this code via Terminal->
        //javac -cp ".;postgresql-42.7.10.jar" DeleteElement.java
        //java -cp ".;postgresql-42.7.10.jar" DeleteElement
        
        String url= "jdbc:postgresql://localhost:5432/postgres" ;
        String user= "postgres" ;
        String password = "postgres" ;
        String delSql = "DELETE FROM student WHERE id= ?" ;
        try{
            Connection conn = DriverManager.getConnection(url, user, password) ;
            PreparedStatement pstmt = conn.prepareStatement(delSql) ;
            pstmt.setInt(1, 1);
            int i= pstmt.executeUpdate() ;
            System.out.println("Records modified-> " + i) ;
        } catch(Exception e){
            System.out.println("Exception-> "+ e) ;
        }
    }
}
