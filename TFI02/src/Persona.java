public abstract class Persona {
    public String nombre;
    public String apellido;
    public int legajo;

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract String getApellido();

    public abstract void setApellido(String apellido);

    public abstract int getLegajo();

    public abstract void setLegajo(int legajo);

    public abstract void modificarDatos();
}
