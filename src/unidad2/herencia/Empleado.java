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
public class Empleado extends Persona{
    public String tipoContrato;
    public double sueldo;

    public Empleado() {
    }

    public Empleado(String tipoContrato, double sueldo) {
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }
    
    
}
