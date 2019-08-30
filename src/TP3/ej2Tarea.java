package TP3;
import  java.util.Scanner;

public class ej2Tarea {

    //Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.
    //Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.
    public  static  void  main ( String [] args ) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
     }
     //
}
