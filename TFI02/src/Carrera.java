import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Carrera implements Informacion {
    String nombre;
    TreeSet<Materia> coleccMaterias;

    public Carrera(String nombre, TreeSet<Materia> coleccMaterias) {
        this.nombre = nombre;
        this.coleccMaterias = coleccMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Materia> getColeccMaterias() {
        return coleccMaterias;
    }

    public void setColeccMaterias(TreeSet<Materia> coleccMaterias) {
        this.coleccMaterias = coleccMaterias;
    }

    public void agregarMaterias(Materia materias) {
        coleccMaterias.add(materias);
        System.out.println(materias.toString() + " se cargo");
    }

    public void eliminarMateria(Materia materia) {
        Iterator<Materia> iterador = coleccMaterias.iterator();

        while (iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if (buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " se elimino");
            }
        }
    }

    public void encontrarMateria(String nombre) {

        for (Materia materias : coleccMaterias) {
            if (materias.getNombre().equals(nombre)) {
                System.out.println(materias.toString() + " se encontro");

            }
            int a = 0;
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Desea eliminar esta materia?");
                System.out.println("Presione 1 si quiere realizarlo");
                a = teclado.nextInt();
                if (a == 1) {
                    eliminarMateria(materias);
                }
            } catch (Exception e) {
                System.out.println("error en el ingreso de datos, intente nuevamente. ");
            }

        }
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccMaterias=" + coleccMaterias +
                '}';
    }

    @Override
    public void verCantidad(int cantidad) {
        Iterator<Materia> iterador = coleccMaterias.iterator();
        while (iterador.hasNext()) {
            cantidad++;
        }
        System.out.println("La cantidad de materia para esta carrera es: " + cantidad);
    }

    @Override
    public void listarContenidos(String nombre) {

        if (this.nombre == nombre) {
            Iterator<Materia> iterador = coleccMaterias.iterator();
            while (iterador.hasNext()) {
                System.out.println(coleccMaterias.toString());
            }
        }
    }
}


