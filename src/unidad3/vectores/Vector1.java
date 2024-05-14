package unidad3.vectores;

import java.util.Random;
import java.util.Scanner;
import unidad1.Persona;

public class Vector1 {

    public static void definicionNumerico() {
        int numero[] = new int[5];
        numero[0] = 8;
        numero[1] = -4;
        for (int i = 0; i < 5; i++) {
            numero[i] = 10;
        }
    }

    public static int[] vectorNumerico(int tamaño) {
        int vector[] = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = 10;
        }
        return vector;
    }

    public static int[] vectorNumerico(int tamaño,
            int limite) {
        int vector[] = new int[tamaño];
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(limite);
        }
        return vector;
    }

    public static int[] vectorNumerico(int tamaño,
            int limInferior, int limSuperior) {
        int vector[] = new int[tamaño];
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(limSuperior - limInferior + 1) + limInferior;
        }
        return vector;
    }

    public static int[] vectorNumerico() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = teclado.nextInt();
        System.out.println("Ingrese el limite inferior");
        int limInf = teclado.nextInt();
        System.out.println("Ingrese el limite superior");
        int limSup = teclado.nextInt();
        int vector[] = new int[tamaño];
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(limSup - limInf + 1) + limInf;
        }
        return vector;
    }

    public static void printMultiplos() {

    }

    public static void printVectorNumerico(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println((i + 1) + "[" + v[i] + "]");
        }
        System.out.println("");
    }

    public static void vectorPersonas() {
        Persona lista[] = new Persona[5];
        Persona p1 = new Persona();
        lista[0] = p1;
        lista[1] = new Persona();
        lista[2] = new Persona("1801", "Juan", "Perez");
    }

    public static void main(String[] args) {
        String bandera = "Corre";
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("VECTORES");
            System.out.println("1. Vector con tamaño definido");
            System.out.println("2. Vector con tamaño y limite definido");
            System.out.println("3. Vector con tamaño y rango definido");
            System.out.println("4. Promedio del vector opcion 3");
            System.out.println("5. Imprimir valores superiores al promedio");
            System.out.println("6. Método que solicite internamente"
                    + "los datos de la opcion 3 y devuelva el vector");
            System.out.println("7. Método que acepte un vector e "
                    + "imprima los multiplos de un numero "
                    + "ingresado por tecladol haciendo uso del "
                    + "metodo de la opcion 6");

            System.out.println("Ingrese una opcion");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño del vector");
                    int tamanio = teclado.nextInt();
                    int v[] = vectorNumerico(tamanio);
                    printVectorNumerico(v);
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño del vector");
                    tamanio = teclado.nextInt();
                    System.out.println("Ingrese el limite superior");
                    int limite = teclado.nextInt();
                    printVectorNumerico(vectorNumerico(tamanio, limite));
                    break;
                case 3:
                    System.out.println("Ingrese el tamaño del vector");
                    tamanio = teclado.nextInt();
                    System.out.println("Ingrese el limite inferior");
                    int limInf = teclado.nextInt();
                    System.out.println("Ingrese el limite superior");
                    int limSup = teclado.nextInt();
                    printVectorNumerico(vectorNumerico(tamanio, limInf, limSup));
                    break;
                case 4:
                    System.out.println("Ingrese el tamaño del vector");
                    tamanio = teclado.nextInt();
                    System.out.println("Ingrese el limite inferior");
                    limInf = teclado.nextInt();
                    System.out.println("Ingrese el limite superior");
                    limSup = teclado.nextInt();
                    v = vectorNumerico(tamanio, limInf, limSup);
                    double suma = 0;
                    for (int i = 0; i < v.length; i++) {
                        suma += v[i];
                    }
                    suma = suma / v.length;
                    System.out.println("Promedio:" + suma);
                    break;
                case 5:
                    System.out.println("Ingrese el tamaño del vector");
                    tamanio = teclado.nextInt();
                    System.out.println("Ingrese el limite inferior");
                    limInf = teclado.nextInt();
                    System.out.println("Ingrese el limite superior");
                    limSup = teclado.nextInt();
                    v = vectorNumerico(tamanio, limInf, limSup);
                    printVectorNumerico(v);
                    suma = 0;
                    for (int i = 0; i < v.length; i++) {
                        suma += v[i];
                    }
                    double promedio = suma / v.length;
                    System.out.println("Promedio:" + promedio);
                    System.out.println("Valores superiores al promedio");
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] > promedio) {
                            System.out.println(v[i]);
                        }
                    }
                    break;
                case 6:
                    vectorNumerico();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
                case 7:
                    //FORMA 1
                    //LLAMAR AL METODO QUE GENERA EL VECTOR Y ALMACENARLO
                    //EN UNA VARIABLE
                    //SOLICITAR EL VALOR MULTIPLO PARA EL PROCESO
                    //LLAMAR AL METODO QUE RECIBE EL VECTOR Y EL NUMERO E 
                    //IMPRIMIR LOS MULTIPLOS DEL MULTIPLO CONTENIDO EN EL 
                    //VECTOR
                    //FORMA DOS
                    //LLAMAR AL METODO QUE GENERA EL VECTOR Y ALMACENARLO
                    //EN UNA VARIABLE
                    //LLAMAR AL METODO QUE RECIBE EL VECTOR E INTERNAMENTE
                    //SOLICITAR EL NUMERO E IMPRIMIR LOS MULTIPLOS 
                    //DEL NUMERO CONTENIDO EN EL VECTOR
                    break;
            }
        } while (bandera.equals("Corre"));

    }
}
