package unidad4.archivos;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import unidad1.Persona;

public class CreacionDataSet {

    public static void main(String[] args) {
        try {
            File nombres = new File("F:\\ALP\\Datasets\\Datasets\\Nombres\\nombres-sexo-origen-significado.csv");
            File apellidos = new File("F:\\ALP\\Datasets\\Datasets\\Apellidos\\Apellidos(2).csv");
            File ciudades = new File("F:\\ALP\\Datasets\\Datasets\\Ciudades\\ciudadeseo.csv");
            File personas = new File("F:\\ALP\\Datasets\\Datasets\\personas.csv");
            PrintWriter escribir= new PrintWriter(personas);

            Scanner leerNom = new Scanner(nombres);//9817
            Scanner leerApe = new Scanner(apellidos);//40463
            Scanner leerCiudad = new Scanner(ciudades);//40463
            int cedula = 1800000000;
            ArrayList<Persona> lista = new ArrayList();
            leerNom.nextLine();
            leerApe.nextLine();
            leerCiudad.nextLine();
            while (leerNom.hasNextLine()) {
                //LEER LA LINEA, OBTIENEN, SALTAN A LA SIGUIENTE LINEA DEL 
                //ARCHIVO
                String lineaNombre = leerNom.nextLine();
                String lineaApellido = leerApe.nextLine();
                String lineaCiudad = leerCiudad.nextLine();
                //System.out.println(lineaNombre+"---"+lineaApellido);
                //TRANSFORMA LA LINEA EN VECTOR
                String[] linea1 = lineaNombre.split(";");
                String[] linea3 = lineaCiudad.split(",");
                String nombre = linea1[0];
                Random rd = new Random();
                char genero = linea1[1].charAt(0);
                String[] linea2 = lineaApellido.split(";");
                String apellido = linea2[0];
                int edad = rd.nextInt(56) + 5;//5-60
                cedula += 1;
                String ced = cedula + "";
                String ciudad = linea3[0];
                Persona p = new Persona(ced, nombre, apellido, genero, edad, ciudad);
                //ALMACENARLOS EN UNA LISTA
                lista.add(p);if ('M'!=genero   && genero != 'F') {
                escribir.println(ced +"<>"+nombre+"<>"+apellido+"<>"+genero+"<>"+ edad+"<>"+ciudad);
                }
            }
            System.out.println("Tamaño de la lista: " + lista.size());
            int contador = 0;
            for (Persona persona : lista) {
                if ('M'!=persona.genero   && persona.genero != 'F') {
                    contador++;
                }
            }
            System.out.println("El numero de personas con "
                    + "genero distinto a M o F:" + contador);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }
    }
}
