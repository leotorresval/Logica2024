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
public class CuentaBancaria {

    //atributos que complementan la informacion de la cuenta
    private String numeroCuenta;
    private String nombreSocio;
    //atributo para cumplir con los métodos
    private double saldo;

    public CuentaBancaria(String cuenta) {
        numeroCuenta = cuenta;
    }

    public void depositar(double ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Ocurrio un error, intente nuevamente");
        }
    }

    public void retirar(double egreso) {
        if (egreso > saldo) {
            System.out.println("Fondos insuficientes");
        } else {
            saldo -= egreso;
            System.out.println("Retiro realizado");
        }
    }

    public void consultarSaldos() {
        System.out.println("El saldo de la cuenta " + numeroCuenta);
        System.out.println("es " + saldo);
    }

}
