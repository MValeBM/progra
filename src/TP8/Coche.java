package TP8;

public class Coche implements IVehiculo {
    int velocidad_maxima=120;
    int velocidad_inicial;
    String marca;



    public Coche (int velocidad_inicial,String marca){

        this.velocidad_inicial=velocidad_inicial;
        this.marca=marca;
    }

    public int acelerar(int aumentar){
        velocidad_inicial=velocidad_inicial+aumentar;
        if (velocidad_inicial>velocidad_maxima) System.out.println("La velocidad maxima ha sido superada");
        return velocidad_inicial;
    }


    public int frenar(int disminuir){
        if(disminuir<velocidad_inicial){
        velocidad_inicial=velocidad_inicial+disminuir;}
        else{
            System.out.println("No se puede disminuir tanto, como maximo: "+velocidad_inicial);}

        return velocidad_inicial;
    }

    public void plazas(){
        System.out.println("El auto tiene 5 asientos solamente");
    }




}
