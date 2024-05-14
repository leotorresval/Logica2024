package unidad1;

public class PruebasRestaurante {
    public static void main(String[] args) {
        Restaurante doniaPati = new Restaurante();
        doniaPati.nombre = "Doña Pati";
        doniaPati.tipoCocina = "Rapida";
        doniaPati.calificacionPromedio = 4.7;
        doniaPati.direccion= "UTA";
        doniaPati.presentacion();
        
    }
}
