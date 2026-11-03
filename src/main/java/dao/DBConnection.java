/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author log
 */
public class DBConnection {
    private static final String HOST="locahost";
       

    private static final int PORT =5432;
    private static final String DB_NAME="Northwind";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD=System.getenv().getOrDefault("DB_PASSWORD", "12345");
    
    private static Connection connection ;
    
   public static Connection getConnection(){
        
        
        try {
            connection = (Connection) DriverManager.getConnection(String.format("jdbc:sqlserver://%s:%d;databaseName=%s", HOST, PORT, DB_NAME)
,USERNAME,PASSWORD);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
                       

            
            
        }
        return connection ;
   }
   
        
    
    
    
    
    
     
}
