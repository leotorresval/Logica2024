package algoritmia;

public class Cafetera {

    private int cantidadActual, capacidadMaxima = 1000;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(int cantidadActual, int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual < 0) {
            cantidadActual = 0;
        }
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("Cantidad actual: "+getCantidadActual());
    }

    public void servirTaza(int capacidad) {
        if (cantidadActual < capacidad) {
            System.out.print("Se sirve " + cantidadActual+ " de cafe    ");
            cantidadActual = 0;
        } else {
            cantidadActual -= capacidad;
            System.out.print("Se sirve " + capacidad+ " de cafe    ");
        }
        System.out.println("Queda " + getCantidadActual() + " de cafe");
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

}
