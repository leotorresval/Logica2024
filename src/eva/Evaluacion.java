package eva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Evaluacion {

    public static void main(String[] args) {
        
        literal6(cargarPeliculas());
    }

    public static Pelicula [] cargarPeliculas() {
        Pelicula lista[] = new Pelicula[250];
        File archivo = new File("F:\\ALP\\dataset_pelicula.csv");
        try {
            Scanner teclado = new Scanner(archivo);
            int contado = 0;
            teclado.nextLine();
            while (teclado.hasNextLine()) {
                String li[] = teclado.nextLine().split(";");
                Pelicula p = new Pelicula(li[0], 
                        li[1],
                        Integer.parseInt(li[2]), 
                        Double.parseDouble(li[3]),
                        li[4].charAt(0), 
                        li[5],
                        li[6], 
                        Double.parseDouble(li[7]),
                        Double.parseDouble(li[8]));
                lista[contado]=p;
                contado++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static void imprimir (Pelicula [] lista){
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula.toString());
        }
    }
    
    /*
    Genere un método que reciba el vector y añada en una lista 
    aquellas películas que su título, tenga una longitud mayor a 8, 
    el nombre de su director comience con vocales abiertas 
    y su país de origen sea Francia
    */
    public static void literal6(Pelicula [] lista){
        ArrayList<Pelicula> nuevaLista = new ArrayList();
        for (Pelicula pelicula : lista) {
            if(pelicula.getTitulo().length()>8){
                String d = pelicula.getDirector();
                char c =d.charAt(0);
                if(c=='A' ||c=='E' || c=='O'){
                    if(pelicula.getPaisOrigen().equals("France"))
                        nuevaLista.add(pelicula);
                }
            }
        }
        for (Pelicula pelicula : nuevaLista) {
            System.out.println(pelicula.toString());
        }
    }
}
