public class Empleados extends Persona {
    private double sueldo;



    public Empleados(double sueldo, String nombre, int edad) {
        this.sueldo = sueldo;
        nombre = super.getNombre();
        edad= super.getEdad();


    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "Persona " +
                "nombre= " + super.getNombre() + '\'' +
                ", edad= " + super.getEdad()+
                "tipo= "+ getTipo();
    }

}
