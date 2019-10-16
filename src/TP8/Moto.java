package TP8;

public class Moto implements IVehiculo{
    int velocidad_maxima=120;
    int velocidad_inicial;
    int frena_delan;
    int frena_atras;




    public Moto (int velocidad_inicial){
        this.velocidad_inicial=velocidad_inicial;
    }

    public int acelerar(int aumentar){
        velocidad_inicial=velocidad_inicial+aumentar;
        if (velocidad_inicial>velocidad_maxima) System.out.println("La velocidad maxima ha sido superada");
        return velocidad_inicial;
    }


    public int frenar(int disminuir){
        if(disminuir<velocidad_inicial){
            velocidad_inicial=velocidad_inicial-disminuir;}
        else{
            System.out.println("No se puede disminuir tanto, como maximo: "+velocidad_inicial);}

        return velocidad_inicial;
    }
    public int frenos_delant(int frena_delan){
        velocidad_inicial=velocidad_inicial-frena_delan;
        return velocidad_inicial;
    }
    public String frenos_atras(int frena_atras){
        velocidad_inicial=velocidad_inicial-frena_atras;
        return "Velocidad actual: " + velocidad_inicial+" Si aceleras y soltas el freno de golpe, podes hacer Willy";
    }
    public void plazas(){
        System.out.println("La moto tiene 2 asientos solamente");
    }
}
