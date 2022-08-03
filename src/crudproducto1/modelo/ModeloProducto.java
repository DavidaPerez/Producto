/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudproducto1.modelo;

/**
 *
 * @author pc
 */
public class ModeloProducto {
    private int codigo;
    private String nombre;
    private int cantidad;
    private String lugar_fabricacion;

    public ModeloProducto() {
    }

    public ModeloProducto(int codigo, String nombre, int cantidad, String lugar_fabricacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.lugar_fabricacion = lugar_fabricacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLugar_fabricacion() {
        return lugar_fabricacion;
    }

    public void setLugar_fabricacion(String lugar_fabricacion) {
        this.lugar_fabricacion = lugar_fabricacion;
    }

    
    public void imprimirConsola(){
        System.out.println(this.codigo+" | " + this.nombre+ " | " + this.cantidad+ " | " + this.lugar_fabricacion);
    };
}

