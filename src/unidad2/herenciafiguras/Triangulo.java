package unidad2.herenciafiguras;

public abstract  class Triangulo extends Figura{
    public double base, altura;

    @Override
    public void calcularArea() {
        area = (base*altura)/2;
    }
    
    
}
