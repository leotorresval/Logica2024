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
public class Ciclos5 {

    /*
    Generador de números Fibonacci hasta N: Escribe un programa 
    que genere y muestre los números de la secuencia Fibonacci 
    hasta un número N proporcionado por el usuario. 
    La secuencia Fibonacci comienza con los números 0 y 1, 
    y cada número siguiente es la suma de los dos números anteriores. 
    Por ejemplo, los primeros números de Fibonacci son 0, 1, 1, 2, 3, 5, 8, 13, ...
     */

    public static void main(String[] args) {
        int valor;
        int val1 = 0, val2 = 1;
        int val3 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el rango");
        valor = teclado.nextInt();
        System.out.println(val1);
        System.out.println(val2);
        for (int i = 0; i < valor; i++) {
            val3 = val1 + val2;
            val1=val2;
            val2=val3;
            System.out.println(val3);

        }
    }
}
