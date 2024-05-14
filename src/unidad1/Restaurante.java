package unidad1;

public class Restaurante {
    //: nombre, dirección, tipo de cocina, 
    //calificación promedio de los clientes, 
    //capacidad de asientos, horario de apertura, 
    //chef principal.
    public String nombre, direccion,tipoCocina;
    public double calificacionPromedio;
    public int capacidadAsientos;
    public String horarioApertura;
    public String chefPrincipal;
    
    public void presentacion(){
        System.out.print("Nombre: "+nombre);
        System.out.print("Direccion: "+direccion);
        System.out.println("TipoCocina: "+tipoCocina);
    }
}
