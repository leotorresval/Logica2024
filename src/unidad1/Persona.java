package unidad1;

public class Persona {

    private String cedula;
    public String nombre, apellido;
    private int edad;
    public char genero;
    public double estatura;
    public String telefono, direccionDomiciliaria;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String cedula, String nombre,
            String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String cedula, String nombre, String apellido, int edad, char genero, double estatura, String telefono, String direccionDomiciliaria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.telefono = telefono;
        this.direccionDomiciliaria = direccionDomiciliaria;
    }

    //mA tipoRetorno nombre(Parametros){
    //}
    public void presentacionPersona() {
        System.out.print("Cedula: " + cedula + " ");
        System.out.print("Nombre: " + nombre + " ");
        System.out.print("Apellido: " + apellido + " ");
        System.out.println("Edad: " + edad + " ");
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        } else {
            this.edad = 18;
        }
    }

    public static void genCedulaAmbato(int semilla, int rango) {
        for (int i = 0; i < rango; i++) {
            System.out.println(1804000000L + semilla + i);
        }
    }

    public static void genCedulaPorCiudad(int semilla, int rango,String provincia) {
        for (int i = 0; i < rango; i++) {
            System.out.println(provincia+(000000L + semilla + i));
        }
    }

}
