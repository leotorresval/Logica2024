/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaprogramacion.refuerzo;

import java.util.Scanner;

public class Ciclos3 {

    /*
    Contar las ocurrencias de un número específico: 
    Desarrolla un programa que solicite un número específico
    y luego pida al usuario una lista de números enteros. 
    El programa debe contar y mostrar cuántas veces aparece el número 
    específico dentro de la lista proporcionada.
     */

 /*
    Buscar el máximo y mínimo en una lista: 
    Escribe un programa que solicite N números enteros y, 
    mediante el uso de un ciclo, encuentre el valor máximo y mínimo 
    de los números proporcionados. 
    Este ejercicio te ayudará a entender cómo comparar valores 
    y actualizar variables basadas en condiciones dentro de un bucle.
     */
    public static void main(String[] args) {
        //ENTRADA
        int cantidad = 0, numero = 0, min = 0, max = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad de datos a leer: ");
        cantidad = teclado.nextInt();
        System.out.print("Numero: ");
        numero = teclado.nextInt();
        min=max=numero;
        //PROCESO
        for (int i = 1; i < cantidad; i++) {
            System.out.print("Numero: ");
            numero = teclado.nextInt();
            //Minimo
            if (numero < min) {
                min = numero;
            }
            //Maximo
            if (numero > max) {
                max = numero;
            }
        }
        //SALIDA
        System.out.println("Minimo: " + min);
        System.out.println("Max: " + max);
    }
}
