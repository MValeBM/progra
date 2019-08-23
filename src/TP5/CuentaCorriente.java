package TP5;

public class CuentaCorriente {
    private String nombreTitular;
    private double saldo;
    private int numeroCta;


    public CuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
        this.numeroCta=(int)(Math.random() * 10);
    }
    public void credit(double monto){

            this.saldo +=monto;
    }
    public void debito(double monto){
        if(monto<this.saldo)
            this.saldo -=monto;
    }
    public void getInfo(){
        System.out.println();
    }





}
