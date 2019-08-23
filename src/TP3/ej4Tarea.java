package TP3;

public class ej4Tarea {
    public  static  void  main ( String [] args ) {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int x = 0; x < 3; x++){
                    for(int y = 0; y < 3; y++){
                        if(matriz[i][j]<matriz[x][y]){
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
