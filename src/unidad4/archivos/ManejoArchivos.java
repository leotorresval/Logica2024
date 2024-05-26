package unidad4.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    public static void main(String[] args) {
        File archivo = new File("F:/ALV/car_db_metric.csv");
        try {
            Scanner lectura = new Scanner(archivo);
            while (lectura.hasNextLine()) {
                System.out.println(lectura.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
