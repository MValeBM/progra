import java.util.Iterator;
import java.util.TreeSet;

public class Facultad implements Informacion {
    String nombre;
    TreeSet<Carrera> carreras;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(TreeSet<Carrera> carreras) {
        this.carreras = carreras;
    }

    public void cargarCarreras(Carrera carrera) {
        carreras.add(carrera);
        System.out.println(carreras.toString() + " se cargo");
    }

    public void eliminarCarrera(String nombre) {
        Iterator<Carrera> iterador = carreras.iterator();

        while (iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if (buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + " se elimino");
            }
        }
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", carreras=" + carreras +
                '}';
    }

    @Override
    public void verCantidad(int cantidad) {
        Iterator<Carrera> iterador = carreras.iterator();
        while (iterador.hasNext()) {
            cantidad++;
        }
        System.out.println("La cantidad de carreras para esta facultad es: "+cantidad);

    }

    @Override
    public void listarContenidos(String nombre) {
        if (this.nombre == nombre) {
            Iterator<Carrera> iterador = carreras.iterator();
            while (iterador.hasNext()) {
                System.out.println(carreras.toString());
            }
        }
    }


}