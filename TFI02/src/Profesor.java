public class Profesor extends Persona {
    double basico;
    int antiguedad;

    public Profesor(double basico, int antiguedad) {
        this.basico = basico;
        this.antiguedad = antiguedad;

    }

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

    public double calcularSueldo(double sueldo){
        double porcentaje=10*antiguedad;
        sueldo=((porcentaje*basico)/100)+basico;
        return sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "basico=" + basico +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
