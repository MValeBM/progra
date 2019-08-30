package TP3;

import java.util.Scanner;

public class ej3Tarea {
    public  static  void  main ( String [] args ) {
        Scanner entrada = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el nombre");
                matriz[i][j] = entrada.next();
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el DNI de "+matriz[0][j]);
                matriz[i][j] = entrada.next();
            }
        }
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la edad de "+matriz[0][j]);
                matriz[i][j] = entrada.next();
            }
        }
        System.out.println("\n"+"Matriz cargada por usuario" + "\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
        for(int i=0; i<3;i++){
            if (matriz[i][0].charAt(0) > matriz[i+1][0].charAt(0)){
                String temporal=matriz[i][0];
                matriz[i][0] = matriz[i+1][0];
                matriz[i+1][0] = temporal;
                for(int j=1; j<3;j++){
                    String temp=matriz[i][j];
                    matriz[i][j] = matriz[i+1][j+1];
                    matriz[i+1][j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
/*// Se ordena la matriz usando el ordenamiento burbuja.
        for (x = 0 ; x < n - 1 ; x ++ ) {
            for (y = x + 1 ; y < n; y ++ ) {
                if ( Matriz [ 0 ] [x] . compareTo ( Matriz [ 0 ] [y]) > 0 ) {
                // Se comparan los Strings de la primera fila unicamente (Nombres). Si el resultado es positivo, eso quiere decir que la posición actual debe intercambiarse con la siguiente.

                    // Se guardan los valores de la columna actual en un arreglo temporal, y se prosigue a intercambiar todos los valores de las columnas entre si.
                    for ( int k = 0 ; k < 3 ; k ++ ) {
                        temp [k]       =  Matriz [k] [x];
                        Matriz [k] [x] =  Matriz [k] [y];
                        Matriz [k] [y] = temp [k];
                    }
                }
            }
        }
      */