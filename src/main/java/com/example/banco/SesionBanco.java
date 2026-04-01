package com.example.banco;
public class SesionBanco {

    private static double saldo = 5000;

    public static double getSaldo() {
        return saldo;
    }
    //metodo para mostrar saldo
    public static void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }
    //metodo para retirar
    public static void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo =saldo - cantidad;
        }
    }
    //metodo para depositar
    public static void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }
}