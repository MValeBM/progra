package TP7;
import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un Numero: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0)
            {
                System.out.println("ES PAR");
            } else
            {
                System.out.println("ES IMPAR");
            }

        } catch (Exception InputMismatchException) {
            System.out.println("El valor introducido no es numérico. El programa se cerrará");
        }
    }
}
