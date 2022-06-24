package bank;

import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    private Connection connect;
    
    
    public Connection open(){
        
        try{
           Class.forName("org.sqlite.JDBC");
           connect = DriverManager.getConnection("jdbc:sqlite:bank.db");
           
           return connect;
           
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public void close(){
        try{
            connect.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    /*public void closeConnection(){
        try{
            connect.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }*/
}
