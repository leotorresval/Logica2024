/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.herencia;

/**
 *
 * @author User
 */
public class Persona {

    public String nombre, apellido, tipo, direccion, telefono;
    //Se protege para que no puedan acceder al atributo
    //desde otros paquetes
    protected String documento;

    public void imprimirInformacion() {
        System.out.println("Cedula: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public Persona() {
        System.out.println("Me ejecuto por defecto en la persona");
    }

    public Persona(String nombre, String apellido, String tipo, String direccion, String telefono, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.documento = documento;
    }

    public Persona(String nombre, String apellido, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

}
