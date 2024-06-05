/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author User
 */
public class Producto {
    private int id, cantidad;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int id, int cantidad, String nombre, double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarProducto(){
        System.out.println("Id: "+id
                +" Nombre: "+nombre 
                +" Precio: "+precio
                +" Cantidad: "+cantidad);
    }
    
    
}
