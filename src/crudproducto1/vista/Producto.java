/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudproducto1.vista;

import crudproducto1.controlador.ControladorProducto;
import java.util.Scanner;
import crudproducto1.modelo.ModeloProducto;
import java.util.List;
/**
 *
 * @author pc
 */
public class Producto {
    public void vistaPrincipal(){
        ModeloProducto a;
        ControladorProducto cProducto = new ControladorProducto();
    Scanner sc = new Scanner(System.in);
        String variableMenu = "";
        System.out.println("Ingrese 1 Para Insertar");
        System.out.println("Ingrese 2 Para Modificar");
        System.out.println("Ingrese 3 Para Eliminar");
        System.out.println("Ingrese 4 Para Consultar");
        variableMenu = sc.nextLine();
        switch (variableMenu) {
            case "1":
                crear();
                a = new ModeloProducto(pedirCodigo(), pedirNombre(), pedirCantidad(), pedirLugar());
                System.out.println(cProducto.insertar(a));
                
                break;
            case "2":
                modificar();
                a = new ModeloProducto(pedirCodigo(), pedirNombre(), pedirCantidad(), pedirLugar());
                System.out.println(cProducto.modificar(a));
                break;
            case "3":
                borrar();
                a = new ModeloProducto();
               a.setCodigo(pedirCodigo());
                System.out.println(cProducto.eliminar(a));
                break;
            case "4":
                consulta(cProducto.ListProductos());
                break;
        }
    }
    
    public void crear(){
        System.out.println("Crear Producto");
    }
    public String pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        return sc.nextLine();
    }
    public int pedirCodigo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Codigo");
        return sc.nextInt();
    }
    public int pedirCantidad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Cantidad");
        return sc.nextInt();
    }
    public String pedirLugar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Lugar");
        return sc.nextLine();
    }
    public void borrar(){
    
    }
    public void modificar(){
        System.out.println("Modificar Producto");
        
    }
    public void consulta(List<ModeloProducto> producto){
        System.out.println("Productos");
        for(ModeloProducto m : producto){
        m.imprimirConsola();
        }
    }
  

}
