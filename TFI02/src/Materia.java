import java.util.Iterator;
import java.util.TreeSet;

public class Materia implements Informacion{
    String nombre;
    Profesor titular;
    TreeSet<Estudiante> coleccionEstudiante;

    public Materia(String nombre, Profesor titular, TreeSet<Estudiante> coleccionEstudiante) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiante = coleccionEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public TreeSet<Estudiante> getColeccionEstudiante() {
        return coleccionEstudiante;
    }

    public void setColeccionEstudiante(TreeSet<Estudiante> coleccionEstudiante) {
        this.coleccionEstudiante = coleccionEstudiante;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiante=" + coleccionEstudiante +
                '}';
    }
    public void agregarEstudiantes(Estudiante estudiante) {
        coleccionEstudiante.add(estudiante);
        System.out.println(estudiante.toString()+" se cargo");
    }
    public void eliminarEstudiante(Estudiante estudiante) {
        Iterator<Estudiante> iterador = coleccionEstudiante.iterator();

        while (iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if (buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " se elimino");
            }
        }
    }

    @Override
    public void verCantidad(int cantidad) {
        Iterator<Estudiante> iterador = coleccionEstudiante.iterator();
        while(iterador.hasNext()) {
            cantidad++;
        }
        System.out.println("La cantidad de estudiantes para esta materia es: "+cantidad);
    }

    @Override
    public void listarContenidos(String nombre) {
        if (this.nombre == nombre) {
            Iterator<Estudiante> iterador = coleccionEstudiante.iterator();
            while (iterador.hasNext()) {
                System.out.println(coleccionEstudiante.toString());
            }
        }
    }
}
