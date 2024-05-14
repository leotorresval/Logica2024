
package logicaprogramacion.refuerzo;

import java.util.Scanner;

public class Ciclos2 {
    /*
    Conteo de números pares e impares: 
    Escribe un programa que lea una lista de N números 
    (puedes asumir que la lista es proporcionada por el usuario 
    de alguna manera, como a través de la entrada del teclado) 
    y cuente cuántos números pares e impares hay en la lista.
     */
    public static void main(String[] args) {
        //ENTRADA
        Scanner teclado = new Scanner(System.in);
        int cantidad=0,numeros=0;
        int contador=1, cPares=0,cImpares=0;
        System.out.println("Dime cuantos datos voy a clasificar");
        cantidad = teclado.nextInt();
        //PROCESO
        while(contador<=cantidad){
            System.out.println("["+contador+"] Ingresa el valor:");
            numeros = teclado.nextInt();
            if(numeros%2==0){
                cPares++;
            }else{
                cImpares++;
            }
            contador++;
        }
        //SALIDA
        System.out.println("Cantidad pares: "+cPares);
        System.out.println("Cantidad impares: "+cImpares);
    }
    
}
