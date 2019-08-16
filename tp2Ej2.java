package TP2;
import java.util.Scanner;

public class tp2Ej2 {
    public static void main(String[] args){
        int pares=0;
        int media=0;
        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        for(int i=0; i<10; i++) {
            System.out.println("Ingrese un número para la posición:"+i);
            arreglo[i]=entrada.nextInt();
        }
        for(int i=0; i<arreglo.length; i++) {
            if(i%2==0 && i!=0) {
                pares++;
                media=media+arreglo[i];
            }

        }
        System.out.print("El promedio de las posiciones pares introducido es: "+media/pares);
    }
}
