package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class LecturaDatos {

    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese su nombre");
                String nombre = teclado.next();
                int edad = lecturaEnteros("Ingrese su edad");
                double estatura = lecturaDecimales("Ingrese su estatura en metros");
                char [] v ={'M','F'};
                char genero = lecturaCaracteres("Ingrese su genero [M/F]",v );
                System.out.println("Ingrese si esta soltero [true/false]");
                boolean soltero = teclado.nextBoolean();
                bandera = false;
                System.out.println("Informacion almacenada correctamente");
            } catch (Exception e) {
                System.out.println("Error, ingrese los datos correctos");
            }
        }

    }

    public static int lecturaEnteros(String mensaje) {
        boolean bandera = true;
        int numero = 0;
        while (bandera == true) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                numero = teclado.nextInt();
                bandera = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo enteros");
            }
        }
        return numero;
    }

    public static double lecturaDecimales(String mensaje) {
        boolean bandera = true;
        double decimal = 0;
        while (bandera == true) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                decimal = teclado.nextDouble();
                bandera = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo decimales");
            }
        }
        return decimal;
    }

    public static char lecturaCaracteres(String mensaje) {
        boolean bandera = true;
        char caracter = 0;
        while (bandera == true) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                caracter = teclado.next().charAt(0);
                bandera = false;
            } catch (Exception e) {
                System.out.println("Ingrese solo caracteres");
            }
        }
        return caracter;
    }

    public static char lecturaCaracteres(String mensaje, char letras[]) {
        boolean bandera = true;
        char caracter = 0;
        String letrasPermitidas = Arrays.toString(letras);
        while (bandera == true) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println(mensaje);
                caracter = teclado.next().charAt(0);
                boolean contiene = letrasPermitidas.contains(caracter+"");
                if(contiene){
                    bandera=false;
                }else{
                    caracter ="".charAt(0);
                }
            } catch (Exception e) {
                System.out.println("Ingrese solo caracteres " + letrasPermitidas);
            }
        }
        return caracter;
    }
}
