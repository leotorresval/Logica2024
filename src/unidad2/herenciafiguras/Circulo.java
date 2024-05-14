/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.herenciafiguras;

/**
 *
 * @author User
 */
public class Circulo extends Figura {

    public double radio;

    public void calcularArea() {
        super.area = Math.PI * Math.pow(radio, 2);
    }

    public void calcularPerimetro() {
        perimetro = 2*Math.PI*radio;
    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
}
