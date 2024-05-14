/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3.vectores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class VectoresCadenas {

    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = teclado.nextInt();
        String vector[] = new String[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese la palabra");
            vector[i] = teclado.next();
        }
        System.out.println("Ingrese la longitud de palabras a buscar");
        int longitud = teclado.nextInt();
        System.out.println("Palabras con tamaño "
                + "superior a " + longitud);
        for (int i = 0; i < vector.length; i++) {
            String palabra = vector[i];
            if (palabra.length() > longitud) {
                System.out.println(vector[i]);
            }
        }
        System.out.println("Palabras con mas de 3 vocales");
        for (String palabra : vector) {
        int contador=0;
            for (int i = 0; i < palabra.length(); i++) {
                char c = palabra.toLowerCase().charAt(i);
                if(c=='a' || c=='e' || c=='i' || 
                        c=='o' || c=='u'  ){
                    contador++;
                }
            }
            if (contador>3) {
                System.out.println(palabra);
            }
        }
    }

    public static void main(String[] args) {
        ejercicio8();
    }
}
