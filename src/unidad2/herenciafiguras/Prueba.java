package unidad2.herenciafiguras;

public class Prueba {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.radio =5;
        Rectangulo r = new Rectangulo();
        r.base =5;//asignacion
        r.altura=8;//asignacion
        
        //tipo nombre corchetes = new tipo corchetes(cantidad);
        Figura lista [] = new Figura[2];
        //nombreVector[posicion] = objeto
        lista[0] = c;//asignacion
        lista[1]= r;
        for (int i = 0; i < lista.length ; i++) {//i < 2
            //lista[i].calcularArea();
            Figura f = lista[i];
            f.calcularArea();
            f.calcularPerimetro();
            System.out.print("El area del " +f.getClass().getSimpleName() );
            System.out.println(" es "+lista[i].area);
        }
        //llamada o invocacion del metodo
        aplicacionPolimorfismo();
    }
    
    public static void aplicacionPolimorfismo(){
        Figura lista [] = new Figura[100];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Figura.obtenerFiguraAleatoria();
            lista[i].calcularArea();
            lista[i].calcularPerimetro();
            String nombre = lista[i].getClass().getSimpleName();
            System.out.print("El area del "+nombre);
            System.out.println(" es "+lista[i].area);
        }
    }
    
}
