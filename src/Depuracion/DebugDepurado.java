package Depuracion;

import java.util.Scanner;

public class DebugDepurado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos numeros a dividir: ");
        float a = input.nextInt();
        float b = input.nextInt();

        if(b==0){
            System.out.println("No se puede dividir por 0");
        }else{
            System.out.println("El resultado de " +a+ "/" +b+ " es: " +(a/b));
        }

    }

}
