/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.vectores;

/**
 *
 * @author User
 */
public class matrices {
    public static int [][] definicionMatriz(){
        //DEFINICION DE LA MATRIZ
        int matriz [][] = new int[3][4];
        //OBTENER UN VALOR
        int valor = matriz[1][1];
        //OBTENER UN VALOR E IMPRIMIRLO
        System.out.println(matriz[1][1]);
        //ASIGNAR VALORES
        matriz[1][1]=1;
        return matriz;
    }
    
    public static String[][] definicionMatrizCadenas(){
        String [][] matriz = new String[3][3];
        String variable = matriz[0][0];
        System.out.println(variable);
        matriz[1][1]=2+"";
        int valor2 = Integer.parseInt(matriz[1][1]);
        int valor = 9+Integer.parseInt(matriz[1][1]);
        return matriz;
    }
    
    public static void imprimirMatriz(int [][] matriz){
        System.out.println("Impresion de matriz");
        int fila =matriz.length;
        int columna=matriz[0].length;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        imprimirMatriz(definicionMatriz());
    }
}
