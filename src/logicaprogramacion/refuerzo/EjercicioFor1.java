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
public class EjercicioFor1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int inicio,fin;
        System.out.println("Ingrese el inicio");
        inicio=teclado.nextInt();
        System.out.println("Ingrese el fin");
        fin=teclado.nextInt();
        for (int i = inicio; i <= fin; i=i+3) {
            System.out.println(i);
        }
    }
}
