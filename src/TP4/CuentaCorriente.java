package TP4;

import java.util.Random;
import java.util.Scanner;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldo;
    private int numeroCta;


    public CuentaCorriente(String nombreTitular, double saldo) {
        Random randomizer = new Random(System.nanoTime());
        numeroCta= randomizer.nextInt(100);
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCta = numeroCta;
    }

    public void credit(double monto) {

        this.saldo += monto;
    }
    public void reintegro(double monto) {

        this.saldo += monto;
    }

    public void debito(double monto) {
        if (monto < this.saldo)
            this.saldo -= monto;
    }

    public void getInfo() {
        System.out.println( "\n-----------------\n"
                + " Nombre: " + this.nombreTitular
                + "\n Saldo: " + this.saldo
                + "\n Nro de Cuenta: " + this.numeroCta
                + "\n-----------------\n");

    }

    public static void Transferencia(CuentaCorriente destino, CuentaCorriente origen, double monto) {
        origen.debito(monto);
        destino.credit(monto);
        System.out.println("\n Transferencia realizada por el importe de $ "+monto);
    }

    public static void CargarCuentas(CuentaCorriente[] cuentas) {
        Scanner teclado = new Scanner(System.in);
        for (CuentaCorriente cuenta : cuentas) {
            System.out.print("Nombre: ");

        }
    }
}