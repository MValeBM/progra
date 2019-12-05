import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cuantos pasajeros quiere llevar?");
        Scanner entrada = new Scanner(System.in);
        int cant = entrada.nextInt();


        Pasajeros[] ListaPasajeros = new Pasajeros[cant];
        for (int i = 0; i <= ListaPasajeros.length - 1; i++) {

            try {


                System.out.println("Nombre:");
                String nombre = entrada.next();

                System.out.println("DNI:");
                int dni = entrada.nextInt();


                System.out.println("Nombre del Chofer:");
                String nomChof=entrada.next();
                System.out.println("DNI:");
                int doc=entrada.nextInt();

                Choferes chofer= new Choferes(nomChof, doc);

                System.out.println("Matricula del vehiculo:");
                String matri=entrada.next();
                System.out.println("capacidad del vehiculo:");
                int cap=entrada.nextInt();

                Vehiculos colectivito= new Vehiculos(matri,cap);
                colectivito.setChofer(chofer);


                if(cant>colectivito.getCapacidad()){
                    System.out.println("LA LISTA DE PASAJEROS ES SUPERIOR A LA CAPACIDAD DEL VEHÍCULO");
                }else{
                    colectivito.getpasajero();
                }
                System.out.println("Ciudad de Origen:");
                String ciudOrig=entrada.next();
                System.out.println("Domicilio de Origen:");
                String domOri=entrada.next();

                Origen origen=new Origen(ciudOrig,domOri);

                System.out.println("Ciudad de Destino:");
                String ciudDest=entrada.next();

                System.out.println("Domicilio de Destino:");
                String domDest=entrada.next();

                Destino destino=new Destino(ciudDest,domDest);
                colectivito.setOrigen(origen);
                colectivito.setDestino(destino);
                System.out.println("Datos del Chofer: "+ chofer.verDatos()+ "\n Origen: "+ origen.verDatos()+ "\n Destino: "+ destino.verDatos()+
                        "\n Pasajeros: "+ ListaPasajeros +"\n Matricula: "+ matri);



            } catch (Exception e) {
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                break;


            }
        }
    }
}
