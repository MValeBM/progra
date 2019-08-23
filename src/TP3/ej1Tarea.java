package TP3;

public class ej1Tarea {
    //Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
    //El programa debe imprimir en consola todos los valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados.
    //(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
    //BONUS: Verificar que el número no se repita.
    public  static  void  main ( String [] args ) {
        int cadena[]= new int[100];
        int i=0;
        cadena [i] = ( int ) ( Math . random () * 100 );

        for ( i = 1 ; i < 100 ; i++ ) {
            cadena [i] = ( int ) ( Math . random () * 100 );
            for(int j=0; j<i;j++){
                if(cadena[i]==cadena[j]){
                    i--;
                }
            }
        }
       for  ( int elemento : cadena) {
            System.out.print(elemento + "  " );
        }
        for(int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                if (cadena[x] < cadena[y]) {
                    int temp = cadena[x];
                    cadena[x] = cadena[y];
                    cadena[y] = temp;
                }
            }
        }
        /*int[] numeros= new int[100];
        Random randomizer = new Random(System.nanoTime());
        for (int i=0; i<numeros.length; i++){
        numeros[i]=randomizer.nextInt(numeros.length);
        }
         */
        System.out.print( "\n " );
        for  ( int array : cadena) {
            System.out.print(array + "  " );
        }
    }
}
