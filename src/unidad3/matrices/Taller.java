
package unidad3.matrices;

import unidad3.vectores.Matrices;


public class Taller {
    public static void main(String[] args) {
        ejercicioTraspuesta(Matrices.definicionMatriz());
    }
    
    public static void ejercicioTraspuesta(int [][] matriz){
        System.out.println("");
        int [][]traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i]=matriz[i][j];
            }
        }
        Matrices.imprimirMatriz(traspuesta);
        
    }
    
    public void ejercicioMatrizVector(int [][] matriz){
        int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                    cont++;
                }
            }
        }
        int vector []=new int[cont];
        cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                    vector[cont]=matriz[i][j];
                    cont++;
                }
            }
        }
    }
}
