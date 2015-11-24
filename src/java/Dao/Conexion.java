/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author davidxona
 */
public class Conexion {
    
    private String Username="sa";
    private String Pass="Srp007";
    private String Host="localhost";
    private String Port="1433";
    private String DB="pegasus";
    
    private String Classname="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String Url="jdbc:sqlserver://"+Host+":"+Port+";"+"DatabaseName="+DB;
    private Connection con;
    
    
    public Conexion(){
        
        
        
        try {
            Class.forName(Classname);
            con=DriverManager.getConnection(Url, Username, Pass);
           
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR"+e);
            
        }catch(SQLException e){
            System.err.println("Error"+e);
        }
    }
    
    
    
    public Connection getConexion(){
        return con;
    }
    
    
//    public static void main(String[] args) {
//        Conexion con=new Conexion();
//    }
    
}
