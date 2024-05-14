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
public class Prueba {

    public static void main(String[] args) {
        Cafetera c = new Cafetera();
        Cafetera c1 = new Cafetera(2000);
        Cafetera c2 = new Cafetera(2000, 3000);
        c.llenarCafetera();
        c.servirTaza(8050);
        c.servirTaza(100);
    }

}
