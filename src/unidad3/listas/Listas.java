package unidad3.listas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import unidad1.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Listas {

    public static void definicionArrayList() {
        ArrayList lista = new ArrayList();
        System.out.println(lista.size());
        lista.add("Hola mundo");
        lista.add(3);
        lista.add(false);
        lista.add('@');
        lista.get(1);
        lista.add(new Scanner(System.in));
    }

    public static void definicionArrayList2() {
        ArrayList<Integer> lista = new ArrayList();
        System.out.println("Tamaño lista: " + lista.size());
        lista.add(3);
        lista.add(12);
        lista.add(0);
        System.out.println("Tamaño lista: " + lista.size());
        imprimirLista(lista);
        lista.remove(0);
        imprimirLista(lista);
        //System.out.println("Tamaño lista: "+lista.size());

    }

    public static void definicionArrayList3() {
        ArrayList<Persona> lista = new ArrayList();
        System.out.println("Tamaño lista: " + lista.size());
        Persona p = new Persona("1801", "Juan", "Perez");
        lista.add(p);
        lista.add(new Persona("1802", "Edison", "Manjarres"));
        lista.add(new Persona("1803", "Jaime", "Hurtado"));
        lista.add(new Persona("1804", "Jose", "Delgado"));
        p.nombre = "Juanito";
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).presentacionPersona();
        }
        lista.remove(p);
        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).presentacionPersona();
        }

    }

    public static void imprimirLista(ArrayList<Integer> lista) {
        System.out.println("Impresion de la lista");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

    public static void definicionArrayList4() {
        ArrayList<Persona> lista = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            Persona p = new Persona();
            int edad = rd.nextInt(25) + 1;
            System.out.println("Edad aleatoria " + edad);
            p.setEdad(edad);
            lista.add(p);
        }
        int contadorEdades = 0;
        for (Persona p : lista) {
            Persona otraP = p;
            contadorEdades += p.getEdad();

        }
        System.out.println("Total: " + contadorEdades);
    }

    public static void main(String[] args) {
        definicionArrayList4();
    }
}
