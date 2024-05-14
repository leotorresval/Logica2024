/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PruebaCuenta {

    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("220001");
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nBanco Santander");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. ConsultarSaldos");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Monto a depositar");
                    double deposito = teclado.nextDouble();
                    cb.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Monto a retirar");
                    double retiro = teclado.nextDouble();
                    cb.retirar(retiro);
                    break;
                case 3:
                    cb.consultarSaldos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta");

                    System.out.println("");
            }
        } while (true);
    }
}
