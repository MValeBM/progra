public class Estudiante extends Persona {


    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public String getApellido() {
        return null;
    }

    @Override
    public void setApellido(String apellido) {

    }

    @Override
    public int getLegajo() {
        return 0;
    }

    @Override
    public void setLegajo(int legajo) {

    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }

}
