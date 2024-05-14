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
public class Rectangulo extends Figura {

    public double base, altura;

    public void calcularArea() {
        super.area = base*altura;
    }
    
    public void calcularPerimetro(){
        perimetro = base*2+altura*2;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
}
