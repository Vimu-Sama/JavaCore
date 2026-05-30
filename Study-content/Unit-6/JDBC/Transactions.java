
import java.sql.Connection;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {
    public static void main(String[] args){
        //Commands to run this code via Terminal-> 
        //javac -cp ".;postgresql-42.7.10.jar" Transactions.java
        //java -cp ".;postgresql-42.7.10.jar" Transactions
        
        String url= "jdbc:postgresql://localhost:5432/postgres" ;
        String user = "postgres" ;
        String password= "postgres" ;
        try{
            Connection conn = DriverManager.getConnection(url, user, password) ;
            conn.setAutoCommit(false) ;
            String sql1 = "INSERT INTO customer(id, name) VALUES (?, ?)" ;
            PreparedStatement pstmt1 =  conn.prepareStatement(sql1);
            pstmt1.setInt(1, 1);
            pstmt1.setString(2, "AnyName") ;

            String sql2 = "UPDATE customer SET name= ? WHERE name= ?" ;
            PreparedStatement pstmt2 = conn.prepareStatement(sql2) ;
            pstmt2.setString(1, "Mukul") ;
            pstmt2.setString(2, "Muuku") ;

            pstmt1.executeUpdate();
            pstmt2.executeUpdate() ;
            conn.commit();
            conn.close() ;
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
