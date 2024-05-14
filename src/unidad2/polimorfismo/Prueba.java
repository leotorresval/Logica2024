/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.polimorfismo;

import unidad2.herencia.Cliente;
import unidad2.herencia.Persona;

/**
 *
 * @author User
 */
public class Prueba {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        /*Aparece un erro puesto que el atributo es protected
        y solo puede ser accedido por las hijas que se encuentren
        en el mismo paquete
         */
        //cliente.documento ="1801";
        /*Al ser protected, se establece como privado y no permite el
        acceso desde fuera
         */
        Persona persona = new Persona();
        //persona.documento = "1801";
    }
}
