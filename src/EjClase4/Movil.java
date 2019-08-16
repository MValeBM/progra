package EjClase4;

public class Movil {

    private int tamanioPantalla;
    private int capGb;
    private double precioMovil;
    private int pixels;
    private String tipo;
    private int stockMov;

    public Movil(int tamanioPantalla, int capGb, double precioMovil, int pixels,int stockMov){

        this.tamanioPantalla = tamanioPantalla;
        this.capGb = capGb;
        this.precioMovil=precioMovil;
        this.pixels=pixels;
        this.stockMov=stockMov;

    }

    public String getInfo(){
        return ("El tamano de la pantalla es "+this.tamanioPantalla+" pulgadas, la capacidad del movil es de "+this.capGb+
         " gb, su precio es de $"+this.precioMovil+" la camara es de "+this.pixels+" pixeles, el stcok de este es "+this.stockMov );
    }
}
