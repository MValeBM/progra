package TP8;


public class Main {
    public  static  void  main ( String [] args ) {

        IVehiculo [] arr = new IVehiculo[2];
        arr[0]= new Moto(40);
        arr[1]= new Coche(60);

        System.out.println(arr[0].acelerar(200));
        System.out.println(arr[0].frenar(50));
        System.out.println(arr[1].acelerar(60));
        System.out.println(arr[1].frenar(200));
        arr[0].plazas();
        arr[1].plazas();



    }
}
