/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.matrices;

import java.util.Random;

/**
 *
 * @author User
 */
public class EjerciciosDeber {
    public static void main(String[] args) {
        ejercicio6();
        
    }
    public static void ejercicio6(){
        Random rd = new Random();
        int matriz[][] = new int[rd.nextInt(7)+3][rd.nextInt(7)+3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = rd.nextInt(9)+1;
                if(aleatorio%2==0){
                    j--;
                }else{
                    matriz[i][j]=aleatorio;
                }
            }
        }
        int fila =rd.nextInt();
        int columna =rd.nextInt();
        
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.print(rd.nextInt(2)+" ");
            }
            System.out.println("");
        }
    }
}
