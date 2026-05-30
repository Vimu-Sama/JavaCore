import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            Connection con = DriverManager.getConnection(url, user, password) ;  //create a connection
            String readSQL= "SELECT * FROM student" ;
            Statement readStatement = con.createStatement() ; //create statement
            PreparedStatement prepStatement  = con.prepareStatement(readSQL) ;
            ResultSet rst= readStatement.executeQuery(readSQL) ; //execute query 
            ResultSet rst2 = prepStatement.executeQuery() ;
            
            while(rst.next()){
                System.out.println("Index-> " + rst.getInt(1) + " Name-> " + rst.getString(2) + 
              " Student Marks-> " + rst.getInt(3)) ;
            }
            con.close(); //close connection
        } catch(SQLException e){
            System.out.println("Exception caught-> "  + e) ;
        }
    }    
}
