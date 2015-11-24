/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static Dao.ObjetoConexion.conectarSQL;
import java.sql.*;

/**
 *
 * @author davidxona
 */
public class Consultas extends Conexionnn{
    
    public boolean autenticacion(String usr, String pass){
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        
        try {
            String sql="SELECT     * FROM         Usuario \n" +
"inner join personal on personal.dni=Usuario.dni \n" +
"where usuario.usuario=? and personal.DNI=?";
//            ps=getConexion().prepareStatement(sql);
               ps=conectarSQL().prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            
//            if(rs.absolute(1)){
            if(rs.next()){
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(getConexion()!=null) getConexion().close();
                    rs.close();
            ps.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
    
    public boolean registrar(String dni, String apaterno, String amaterno,String nombre){
        
        PreparedStatement ps=null;
        
        try {
            
            String consulta="insert into personal(DNI,ap_paterno,ap_materno,nombres) values(?,?,?,?)";
            
            ps=getConexion().prepareStatement(consulta);
            ps.setString(1, dni);
            ps.setString(2, apaterno);
            ps.setString(3, amaterno);
            ps.setString(4, nombre);
            
            
            
            if(ps.executeUpdate()==1){
                return true;
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            
            try {
                if(getConexion()!=null) getConexion().close();
            } catch (Exception e) {
            }
        }
        
        
        
        
        
        return false;
        
        
    }
    
    
//    public static void main(String[] args) {
//        Consultas c=new Consultas();
//        c.registrar("44682413","AGUIRRE","RAMIREZ","VANESA");
//    }
        
        
        
//        Consultas c=new Consultas();
//        System.out.println(c.autenticacion("DAGUIRRE","43537493"));
//    }
    }
    
    
    
    

