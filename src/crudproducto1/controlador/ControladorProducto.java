/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudproducto1.controlador;

import com.mysql.cj.xdevapi.PreparableStatement;
import crudproducto1.modelo.ModeloProducto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class ControladorProducto extends Conexion {
    public List<ModeloProducto> ListProductos(){
        List<ModeloProducto> productos = new ArrayList<>();
        try {
            Connection c = this.Conectar();
            this.ps = c.prepareStatement("SELECT * FROM producto");
            this.rs = ps.executeQuery();
            while(rs.next()){
            productos.add(new ModeloProducto(rs.getInt("codigo"), rs.getString("nombre"), rs.getInt("cantidad"), rs.getString("lugar_fabricacion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        this.cerrar();
        }
        return productos;
    }
    public String insertar(ModeloProducto p){
        try {
            Connection c=this.Conectar();
            this.ps=c.prepareStatement(    "insert into producto(codigo,nombre,cantidad,lugar_fabricacion)values("+p.getCodigo()+",'"+p.getNombre()+"',"+p.getCantidad()+",'"+p.getLugar_fabricacion()+"')");
            ps.executeUpdate();
            return "Se ha creado un nuevo producto";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        return "No se ha podido crear un nuevo producto";
        } finally{this.cerrar();}
        
    }
    
    public String modificar(ModeloProducto p){
        try {
            Connection c = this.Conectar();
            this.ps=c.prepareStatement("UPDATE producto SET codigo="+p.getCodigo()+", nombre='"+p.getNombre()+"', cantidad = "+p.getCantidad()+", lugar_fabricacion='"+p.getLugar_fabricacion()+"' WHERE codigo=1");
        ps.executeUpdate();
        return "Se ha actualizado con exito";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally{ this.cerrar();
        }
        return "No se ha podido actualizar";
    }
    
    public String eliminar(ModeloProducto p){
        try {
            Connection c = this.Conectar();
            this.ps = c.prepareStatement("delete from producto WHERE codigo ="+p.getCodigo());
            this.ps.executeUpdate();
           return "Se ha eliminado producto";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally { this.cerrar(); }
        return "No se pudo eliminar productro";
    }
    
   
}
