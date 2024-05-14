/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2.herenciafiguras;

import java.util.Random;

/**
 *
 * @author User
 */
public abstract class Figura {

    public double area, perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public static Figura obtenerFiguraAleatoria() {
        Random r = new Random();
        int valor = r.nextInt(2);
        if (valor == 0) {
            return new Circulo(r.nextInt(10)+1);
        }
        if (valor == 1) {
            return new Rectangulo(r.nextInt(10)+1, r.nextInt(10)+1);
        }
        return null; 
    }
}
