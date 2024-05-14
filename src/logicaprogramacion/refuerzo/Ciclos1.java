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
public class Ciclos1 {
    //Escribe un programa que calcule la suma de todos 
    //los números pares desde 1 hasta un número dado por el usuario.
    
    public static void main(String [] args){        
        int sumatoria=0, rango;
        Scanner teclado= new Scanner(System.in);
        //ENTRADA
        System.out.println("Ingresa el rango");
        rango=teclado.nextInt();
        //PROCESOS
        for(int i=1;i<=rango;i++){
            if(i%2==0){
                sumatoria=sumatoria+i;
            }
        }
        //SALIDAS
        System.out.println("La sumatoria es "+sumatoria);
    }
}
