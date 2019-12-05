public class Pasajeros extends Personas implements IParaMostrar {
    private String nombre;
    private int dni;

    public Pasajeros(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String verDatos() {
        return "Nombre: "+nombre
                + "\nDNI: "+dni;
    }

    @Override
    public String getNombreClase() {
        return "Soy un pasajero";
    }
}
