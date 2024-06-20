/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaevaluacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class PracticaHora {

    static ArrayList<String> lista = new ArrayList();
    static String horaCercanaSup = "";
    static String horaCercanaInf = "";

    public static void main(String[] args) {
        cargarDatos();
        //HORA ACTUAL
        String horaActual = "15:30";
        int hora = Integer.parseInt(horaActual.split(":")[0]);
        int minuto = Integer.parseInt(horaActual.split(":")[1]);
        int transformado =hora*60+minuto;
        //HORA A COMPARAR
        int aux = 1439;
        for (String h : lista) {
            int horaC = Integer.parseInt(h.split(":")[0]);
            int minutoC = Integer.parseInt(h.split(":")[1]);
            int transformadoC = horaC*60+minutoC;
            int dif = transformadoC-transformado;
            if(dif>0){
                if(dif<aux){
                    aux=dif;
                    horaCercanaSup=h;
                }
            }
            
            
        }
        System.out.println("\nHora Actual: " + horaActual);
        System.out.println("\nHora Cercana Superior: " + horaCercanaSup);
    }

    public static void cargarDatos() {
        File archivo = new File("F:\\ALP\\HORAS.txt");
        Scanner teclado;
        try {
            teclado = new Scanner(archivo);
            while (teclado.hasNextLine()) {
                String vector[] = teclado.nextLine().split(";");
                String horaIzquierda = vector[0];
                lista.add(horaIzquierda);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaHora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
