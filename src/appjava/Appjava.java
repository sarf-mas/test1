/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava;
import java.sql.*;
/**
 *
 * @author SMaster
 */
public class Appjava {

   
    
    public static final String USERNAME = "root";
    public static final String PASSWORD = "mdfgdg";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/youtube";
    public static void main(String[] args) {
        
        
      
        
        
        
        try {
           Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("connected");
          
            System.out.println(PASSWORD);



          
      }catch (SQLException e){
          System.err.println(); 
      }
      
        // TODO code application logic here
    }
    
}
