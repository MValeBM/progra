package TP7.Ej2;

import java.util.Scanner;

public class Exception {
    public static void pedirDatos() throws numeroFueraRango {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un Numero del 1 al 100: ");
        int numero = entrada.nextInt();

        if(numero<1 || numero>100)
        {
            throw new numeroFueraRango("El numero esta fuera de rango!");
        }
        else
        {
            System.out.println("Numero Correcto!");
        }
    }
}
