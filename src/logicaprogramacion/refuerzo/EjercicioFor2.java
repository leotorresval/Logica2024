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
public class EjercicioFor2 {
    /*Suma de números naturales hasta N: 
    Escribe un programa que sume todos los 
    números naturales hasta un número N 
    proporcionado por el usuario. 
    Por ejemplo, si el usuario introduce 10, 
    el programa debe calcular la suma de los números del 1 al 10.*/
    public static void main(String[] args) {
        int valor=0,sumatoria=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        valor=teclado.nextInt();
        for (int i = 0; i <= valor; i++) {
            sumatoria+=i;
        }
        System.out.println("Sumatoria: "+sumatoria);
    }
}
