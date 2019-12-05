package TP9;

public class Naturales extends Numeros implements ParaNumeros{

    private double a;

    @Override
    public void sumar(Numeros nro) { }

    @Override
    public void restar(Numeros nro) { }

    public String getValor() {
        return "valor: "+this.a;
    }


}
