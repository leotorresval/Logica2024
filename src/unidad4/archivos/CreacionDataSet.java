package unidad4.archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import unidad1.Persona;

public class CreacionDataSet {

    public static void main(String[] args) {
        try {
            File nombres = new File("F:\\ALP\\Datasets\\Datasets\\Nombres\\nombres-sexo-origen-significado.csv");
            File apellidos = new File("F:\\ALP\\Datasets\\Datasets\\Apellidos\\Apellidos(2).csv");
            Scanner leerNom = new Scanner(nombres);//9817
            Scanner leerApe = new Scanner(apellidos);//40463
            long cedula = 1800000000;
            ArrayList<Persona> lista = new ArrayList();
            leerNom.nextLine();
            leerApe.nextLine();
            while (leerNom.hasNextLine()) {
                //LEER LA LINEA, OBTIENEN, SALTAN A LA SIGUIENTE LINEA DEL 
                //ARCHIVO
                String lineaNombre = leerNom.nextLine();
                String lineaApellido = leerApe.nextLine();
                //System.out.println(lineaNombre+"---"+lineaApellido);
                //TRANSFORMA LA LINEA EN VECTOR
                String[] linea1 = lineaNombre.split(";");
                String nombre = linea1[0];
                char genero = linea1[1].charAt(0);
                String[] linea2 = lineaApellido.split(";");
                String apellido = linea2[0];
                Random rd = new Random();
                int edad = rd.nextInt(56) + 5;//5-60
                cedula += 1;
                String ced = cedula + "";
                Persona p = new Persona(ced, nombre, apellido, genero, edad);
                //ALMACENARLOS EN UNA LISTA
                lista.add(p);
            }
            System.out.println("Tamaño de la lista: " + lista.size());
            for (Persona persona : lista) {
                persona.presentacionPersona();

            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }
    }
}
