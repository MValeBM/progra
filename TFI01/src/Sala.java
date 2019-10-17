public class Sala {
    private int capacidad;
    private String pelicula;
    private String nombre;
    Espectadores p1;


    public Sala(int capacidad, String nombre, String pelicula) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.pelicula = pelicula;

    }

    public Espectadores getP1(Espectadores e1, Espectadores e2, Espectadores p2) {
        return p1;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Sala" +
                "\n nombre='" + nombre +
                "\n capacidad= " + capacidad +
                "\n pelicula= " + pelicula;
    }
}

