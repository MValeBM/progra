package TP4;

public class UsoCuenta {
    public static void main (String[] args){

        CuentaCorriente cta1 = new CuentaCorriente("Valeria", 2000);
        CuentaCorriente cta2 = new CuentaCorriente("Alejandro", 2000);

        cta1.getInfo();
        cta2.getInfo();

        CuentaCorriente.Transferencia(cta1,cta2,500);

        cta1.getInfo();
        cta2.getInfo();

    }
}
