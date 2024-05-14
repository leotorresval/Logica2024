/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.herencia;

import java.security.SecureRandom;
import java.util.Random;
import javax.swing.JOptionPane;

public class Cliente extends Persona {

    public String categoria, codigo;

    //predeterminado
    public Cliente() {
        System.out.println("Me ejecuto por defecto en el cliente");
    }

    public Cliente(String categoria, String codigo) {
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public Cliente(String categoria, String codigo, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public Cliente(String categoria, String codigo, String nombre, String apellido, String tipo, String direccion, String telefono, String documento) {
        super(nombre, apellido, tipo, direccion, telefono, documento);
        this.categoria = categoria;
        this.codigo = codigo;
    }
    
    
    
    

    
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Categoria: " + categoria);
    }

}
