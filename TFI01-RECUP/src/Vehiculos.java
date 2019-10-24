import java.util.Arrays;

public class Vehiculos extends Automovil implements IParaMostrar{
    private String matricula;
    private int capacidad;
    private Choferes chofer;
    private Destino destino;
    private Pasajeros[] pasajeros;
    private Origen origen;

    public Vehiculos(String matricula, int capacidad) {
        this.matricula = matricula;
        this.capacidad = capacidad;
    }
    public Choferes getChofer() {
        return this.chofer;
    }

    public void setChofer(Choferes chofer) {
        this.chofer = chofer;
    }
    public Pasajeros[] getpasajero() {
        return this.pasajeros;
    }

    public void setPasajeros(Pasajeros []pasajeros) {
        this.pasajeros=pasajeros;
    }
    public void setOrigen(Origen origen) {
        this.origen = origen;
    }
    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    public Origen getOrigen() {
        return this.origen;
    }
    public Destino getDestino() {
        return this.destino;
    }


    public String getMatricula() {
        return matricula;
    }

    @Override
    public String setMatricula() {
        this.matricula = matricula;
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public int setCapacidad() {
        return 0;
    }

    @Override
    public int setCapacidad(int capacidad) {
        return 0;
    }


    @Override
    public String verDatos() {
        return "Vehiculos" +
                "matricula='" + matricula + '\'' +
                ", capacidad=" + capacidad +
                ", chofer=" + chofer +
                ", destino=" + destino +
                ", pasajeros=" + Arrays.toString(pasajeros);
    }

    @Override
    public String getNombreClase() {
        return "Soy un Vehiculo";
    }

}
