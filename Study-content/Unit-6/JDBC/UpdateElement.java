
import java.sql.Connection;
import java.sql.DriverManager ;
import java.sql.PreparedStatement;

public class UpdateElement {
    public static void main(String[] args){
        //Commands to run this code via Terminal->
        //javac -cp ".;postgresql-42.7.10.jar" UpdateElement.java
        //java -cp ".;postgresql-42.7.10.jar" UpdateElement
        String url = "jdbc:postgresql://localhost:5432/postgres" ;
        String name= "postgres" ;
        String password = "postgres" ;
        String updateSQL = "UPDATE student SET id = ? WHERE name= ?" ;
        try{
            Connection conn= DriverManager.getConnection(url, name, password) ;
            PreparedStatement preparedStatement = conn.prepareStatement(updateSQL) ;
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Satvik") ;
            int i = preparedStatement.executeUpdate() ;
            System.out.println("Rows modified-> "+ i) ;
        } catch(Exception e){
            System.out.println("Exception-> "+ e) ;
        }
    }
}
