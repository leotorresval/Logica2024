package unidad3.listas;

import java.util.LinkedList;
import java.util.Random;

public class ListasEnlazadas {
    
    public static void definicionLista(){
        LinkedList<String> lista = new LinkedList();
        lista.add("Hola mundo");
        lista.add("Evaluacion");
        lista.add("Palabra");
        System.out.println("Tamanio" +lista.size());
        lista.remove(0);
        lista.removeLast();
        System.out.println("Tamanio" +lista.size());
        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
        boolean respuesta =lista.get(0).contains("i");
        System.out.println(respuesta);
    }
    
    public static LinkedList<Integer> definicioListaEnteros(){
        LinkedList<Integer> lista = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            lista.add(rd.nextInt(100));
        }
        return lista;
    }
    public static void imprimirLista(LinkedList<Integer>lis){
        //ITERA POR ELEMENTO
        for (Integer li : lis) {
            System.out.println(li);
        }
    }
    
    public static void main(String[] args) {
        definicionLista();
        
    }
}
