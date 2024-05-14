package unidad2.herencia;

public class Pruebas {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre="Juan";
        p.apellido = "Perez";
        p.imprimirInformacion();
        Empleado e = new Empleado();
        e.nombre = "Diego";
        e.apellido = "Freire";
        e.sueldo = 1000;
        e.imprimirInformacion();
        Cliente c= new Cliente();
        c.nombre = "Alex";
        c.apellido = "Quinteros";
        c.categoria = "Mayorista";
        c.imprimirInformacion();
        c.documento = "1801";
        
        Persona persona =new Persona("Bernardo","Lopez","180500");
        Cliente c1 = new Cliente();
    }
}












