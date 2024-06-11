package unidad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LecturaDatos {

    public static void main(String[] args) {
        boolean bandera = true;
        while (bandera) {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese su nombre");
                String nombre = teclado.next();
                System.out.println("Ingrese su edad");
                int edad = teclado.nextInt();
                System.out.println("Ingrese su estatura en metros");
                double estatura = teclado.nextDouble();
                System.out.println("Ingrese su genero [M/F]");
                char genero = teclado.next().charAt(0);
                System.out.println("Ingrese si esta soltero [true/false]");
                boolean soltero = teclado.nextBoolean();
                bandera = false;
                System.out.println("Informacion almacenada correctamente");
            } catch (Exception e) {
                System.out.println("Error, ingrese los datos correctos");
            }
        }

    }
}
