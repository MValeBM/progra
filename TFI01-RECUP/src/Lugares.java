public class Lugares implements IParaMostrar {

    private String nombre;
    private String direccion;

    public Lugares(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String verDatos() {
        return "Nombre: "+nombre
                + "\nDireccion: "+direccion;
    }

    @Override
    public String getNombreClase() {
        return "Soy un Lugar";
    }
}
