
package eva;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Evaluacion {
    public static void main(String[] args) {
        cargarAutos();
    }
    
    public static void cargarAutos(){
        File archivo = new File("F:\\ALP\\dataset_pelicula.csv");
        try {
            Scanner teclado = new Scanner(archivo);
            int contado = 0;
            while (teclado.hasNextLine()) {                
                contado++;
                System.out.println(teclado.nextLine().split(";").length);
            }
            System.out.println(contado);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Evaluacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
