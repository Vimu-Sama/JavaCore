import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadElement {
    public static void main(String[] args) {
        String url= "jdbc:postgresql://localhost:5432/postgres" ;
        String user= "postgres" ;
        String password= "postgres" ;
        String readSQL= "SELECT * FROM customer" ;
        try{
            Connection con = DriverManager.getConnection(url, user, password) ;
            Statement readStatement = con.createStatement() ;
            ResultSet rst= readStatement.executeQuery(readSQL) ;
            while(rst.next()){
                System.out.println("Index-> " + rst.getInt(1) + " Name-> " + rst.getString(2)) ;
            }
            con.close();
        } catch(SQLException e){
            System.out.println("Exception caught-> "  + e) ;
        }
    }    
}
