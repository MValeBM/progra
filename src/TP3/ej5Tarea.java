package TP3;

import java.util.Scanner;

public class ej5Tarea {
    public  static  void  main ( String [] args ) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número para la posición:"+(i+1)+" "+(j+1));
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\n"+"Matriz cargada por usuario" + "\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        if(matriz[i][j]>matriz[x][y]){
                            int temp=matriz[i][j];
                            matriz[i][j]=matriz[x][y];
                            matriz[x][y]=temp;
                        }
                    }
                }
            }
        }
        System.out.println("\n"+"Ordenada" + "\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
