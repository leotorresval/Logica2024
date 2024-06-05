package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiTienda {

    private static ArrayList<Producto> lista = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1. Mostrar Productos");
        System.out.println("2. Buscar por Id");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Actualizar cantidad");
        System.out.println("5. Actualizar precio");
        System.out.println("6. Añadir Producto");
        System.out.println("7. Producto mas caro");
        System.out.println("8. Producto mas barato");
        System.out.println("9. Producto con stock menor a 50");
        System.out.println("10. Calcular total inventario");
        System.out.println("11. Crear una lista que contenga"
                + "productos con id multiplo de 8"
                + "cantidad multiplo de 7"
                + "precio mayor a 50"
                + "y nombre con longitud entre 5 y 8"
                + "incluidos los rangos");
        cargarProductos();
        mostrarProductos();
        
        buscarPorId(199);
    }

    public static void cargarProductos() {
        File archivo = new File("F:\\ALP\\productos_real.csv");
        try {
            Scanner leer = new Scanner(archivo);
            leer.nextLine();
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                String[] v = linea.split(",");
                if (v.length == 4) {
                    int id = Integer.parseInt(v[0]);
                    int cantidad = Integer.parseInt(v[3]);
                    double precio = Double.parseDouble(v[2]);
                    String nombre = v[1];
                    Producto p = new Producto(id, cantidad, nombre, precio);
                    lista.add(p);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void mostrarProductos() {
        for (Producto p : lista) {
            p.mostrarProducto();
        }
    }

    public static void buscarPorId(int id) {
        System.out.println("Buscando producto por id: " + id);
        boolean bandera=true;
        for (Producto p : lista) {
            if (id == p.getId()) {
                p.mostrarProducto();
                bandera=false;
                break;
            }
        }
        if(bandera)
            System.out.println("No existe el id:" +id);
    }

    public static void buscarPorNombre(String nombre) {
        System.out.println("Buscando producto por nombre: " + nombre);
        for (Producto p : lista) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.mostrarProducto();
                break;
            }
        }
    }

    public static void actualizarCantidad(int id, int cantidad) {
        System.out.println("Actualizar producto: " + id);
        System.out.println("Con cantidad: " + cantidad);
        for (Producto producto : lista) {
            if (id == producto.getId()) {
                producto.setCantidad(cantidad);
            }
        }
    }
}
