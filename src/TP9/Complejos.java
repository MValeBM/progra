package TP9;

public class Complejos extends Numeros implements ParaNumeros{

    private double a;
    private double b;

    @Override
    public void sumar(Numeros nro) { }

    @Override
    public void restar(Numeros nro) { }

    @Override
    public String getValor() {
        return "valor: ("+this.a+","+this.b+")";
    }

}