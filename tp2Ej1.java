package TP2;
import java.util.Scanner;

public class tp2Ej1 {
    public static void main(String[] args){
        int pos=0;
        int neg=0;
        int cero=0;


        Scanner entrada = new Scanner(System.in);
        int arreglo[]= new int[10];
        for(int i=0; i<10; i++) {
            System.out.println("Ingrese un número para la posición:"+i);
            arreglo[i]=entrada.nextInt();
        }
        for(int valor:arreglo) {
            if(valor>0) {
                pos++;
            }else {
                if(valor<0) {
                    neg++;
                }else {
                    cero++;
                }
            }
        }
        System.out.print("hay "+cero+ "ceros, "+ pos+" números positivos y "+neg+" números negativos");

    }
}
