/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

/**
 *
 * @author User
 */
public class ContadorCiclico {
    private int valorActual, valorMaximo,valorMinimo;

    public ContadorCiclico() {
        valorActual=valorMinimo=0;
        valorMaximo=30;
    }
    
    public void incremento(){
        valorActual++;
        if(valorActual>valorMaximo)
            valorActual=valorMinimo;
    }
    public void decremento(){
        valorActual--;
        if(valorActual<valorMinimo)
            valorActual=valorMaximo;
    }
    
    public void mostrarValor(){
        System.out.println("Valor actual: "+valorActual);
    }
}
