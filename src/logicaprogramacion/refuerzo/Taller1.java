/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacion.refuerzo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Taller1 {

    public static void main(String[] args) {
        double promedio, nota, min, max;
        promedio = nota = max = 0;
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nota " + (1) + ":");
        nota = teclado.nextDouble();
        max=min=nota;
            promedio += nota;
        for (int i = 0; i < 6; i++) {
            System.out.println("Nota " + (i + 1) + ":");
            nota = teclado.nextDouble();
            promedio += nota;
            if (nota < min) {
                min = nota;
            }
            if (nota > max) {
                max = nota;
            }
        }
        promedio = promedio / 7;
        System.out.println("Promedio: " + promedio);
        System.out.println("Minimo: " + min);
        System.out.println("Maximo: " + max);
    }
}
