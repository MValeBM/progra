package TP8;


import javax.swing.JOptionPane;

public class Main {
    public  static  void  main ( String [] args ) {

        IVehiculo [] arr = new IVehiculo[2];
        arr[0]= new Moto(40);
        arr[1]= new Coche(60,"ford");

        System.out.println(arr[0].acelerar(200));
        System.out.println(arr[0].frenar(50));
        System.out.println(arr[1].acelerar(60));
        System.out.println(arr[1].frenar(200));
        arr[0].plazas();
        arr[1].plazas();
        int dato;
        dato= Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si quiere crear una moto,\n" +
                " o 2 para crear un auto \n" +
                "o cualquier otra tecla para salir del menu"));

        switch(dato) {
            case 0: Moto a = new Moto(0);
            break;
            case 1: Coche c = new Coche(0, "ford");
            break;
            default: break;

        }



    }
}
