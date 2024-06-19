package integrador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import unidad3.listas.Listas;

public class MenuAdministrador {

    public static ArrayList<Empresa> empresas = new ArrayList<>();

    public static ArrayList<Empresa> cargarEmpresas() {
        try {
            File file = new File("F:\\ALP\\empresas.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner leer = new Scanner(file);
            while (leer.hasNextLine()) {
                String line = leer.nextLine();
                String[] datos = line.split(";");
                Empresa empresa = new Empresa(
                        datos[0], // RUC
                        datos[1], // Nombre Empresa
                        datos[2], // Nombre Encargado
                        datos[3], // Apellido Encargado
                        datos[4], // Dirección
                        datos[5], // Teléfono
                        datos[6], // Hora Apertura
                        datos[7], // Hora Cierre
                        datos[8] // Tipo Empresa
                );
                empresas.add(empresa);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(MenuAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresas;
    }

    public static void guardarEmpresas() {
        try {
            PrintWriter escribir = new PrintWriter(new File("F:\\ALP\\empresas.txt"));
            for (Empresa empresa : empresas) {
                String line = String.join(";",
                        empresa.getRuc(),
                        empresa.getNombreEmpresa(),
                        empresa.getNombreEncargado(),
                        empresa.getApellidoEncargado(),
                        empresa.getDireccion(),
                        empresa.getTelefono(),
                        empresa.getHoraApertura(),
                        empresa.getHoraCierre(),
                        empresa.getTipoEmpresa()
                );
                escribir.println(line);
            }
            escribir.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void añadirEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el RUC: ");
        String ruc = scanner.next();
        System.out.print("Ingrese el nombre de la empresa (dejar en blanco si es una persona): ");
        String nombreEmpresa = scanner.next();
        System.out.print("Ingrese el nombre del encargado: ");
        String nombreEncargado = scanner.next();
        System.out.print("Ingrese el apellido del encargado: ");
        String apellidoEncargado = scanner.next();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.next();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.next();
        System.out.print("Ingrese la hora de apertura (HH:MM): ");
        String horaApertura = scanner.next();
        System.out.print("Ingrese la hora de cierre (HH:MM): ");
        String horaCierre = scanner.next();
        System.out.print("Ingrese el tipo de empresa: ");
        String tipoEmpresa = scanner.next();
        Empresa empresa;
        empresa = new Empresa(ruc, nombreEmpresa, nombreEncargado, apellidoEncargado, direccion, telefono, horaApertura, horaCierre, tipoEmpresa);
        empresas.add(empresa);
        System.out.println("Empresa añadida con éxito.");
    }

    public static void añadirEmpresa(String ruc1, int i) {
        Scanner scanner = new Scanner(System.in);
        String ruc = ruc1;
        System.out.print("Ingrese el nombre de la empresa (dejar en blanco si es una persona): ");
        String nombreEmpresa = scanner.next();
        System.out.print("Ingrese el nombre del encargado: ");
        String nombreEncargado = scanner.next();
        System.out.print("Ingrese el apellido del encargado: ");
        String apellidoEncargado = scanner.next();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.next();
        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.next();
        System.out.print("Ingrese la hora de apertura (HH:MM): ");
        String horaApertura = scanner.next();
        System.out.print("Ingrese la hora de cierre (HH:MM): ");
        String horaCierre = scanner.next();
        System.out.print("Ingrese el tipo de empresa: ");
        String tipoEmpresa = scanner.next();
        Empresa empresa;
        empresa = new Empresa(ruc, nombreEmpresa, nombreEncargado, apellidoEncargado, direccion, telefono, horaApertura, horaCierre, tipoEmpresa);
        empresas.set(i, empresa);
        System.out.println("Empresa modificada con éxito.");
    }

    public static void imprimirEmpresa() {
        for (Empresa empresa : empresas) {
            System.out.println(empresa);
        }
    }

    public static void modificarEmpresa() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el ruc de la empresa");
        String ruc = teclado.nextLine();
        boolean bandera = true;
        for (int i = 0; i < empresas.size(); i++) {
            if (ruc.equals(empresas.get(i).getRuc())) {
                bandera = false;
                añadirEmpresa(ruc, i);
                break;
            }
        }
        if(bandera==true)
            System.out.println("No existen coincidencias");

    }

    public static void main(String[] args) {
        cargarEmpresas();
        añadirEmpresa();
        guardarEmpresas();
        imprimirEmpresa();
    }
}
