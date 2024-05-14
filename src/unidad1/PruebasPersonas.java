package unidad1;

import java.util.Scanner;

public class PruebasPersonas {

    public static void main(String[] args) {
        //NombreClase nombreObjeto = new NombreClase();
        Persona leo = new Persona("1804", "Leo", "Torres");
        leo.setEdad(31);
        leo.genero = 'M';
        leo.setEdad(-100);
        System.out.println("Objeto1");
        leo.presentacionPersona();
        System.out.println();
        System.out.println(leo.getCedula());
        Persona juan = new Persona("1805", "Juan", "Perez");
        juan.setEdad(40);
        System.out.println("Objeto2");
        juan.presentacionPersona();

        Persona david = new Persona("1806", "David", "Valverde");
        david.presentacionPersona();

        Persona diego = new Persona("1809", "Diego",
                "Perez", 13);
        diego.presentacionPersona();
        //GENERADOR DE 10000 CEDULAS DE AMBATO
        Persona.genCedulaAmbato(100, 5000000);
        //GENERADOR DE CEDULAS POR PROVINCIA

    }

}
