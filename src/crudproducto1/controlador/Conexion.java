/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudproducto1.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Conexion {
     Connection con = null;
     PreparedStatement ps = null;
     ResultSet rs = null;
     
    String url ="jdbc:mysql://localhost:3306/baseproducto";
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);
            System.out.println("Se Logro la coneccion");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
   public void cerrar(){
         try {
             /*
             this.rs.close();
             this.ps.close();*/
             this.con.close();
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
    
}
