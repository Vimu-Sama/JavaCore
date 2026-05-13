import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadElement {
    public static void main(String[] args) {
        //Commands to run this code via Terminal->
        //javac -cp ".;postgresql-42.7.10.jar" ReadElement.java
        //java -cp ".;postgresql-42.7.10.jar" ReadElement
        String url= "jdbc:postgresql://localhost:5432/postgres" ;
        String user= "postgres" ;
        String password= "postgres" ;
        try{
            Connection con = DriverManager.getConnection(url, user, password) ;
            Statement readStatement = con.createStatement() ;
            String readSQL= "SELECT * FROM student" ;
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
