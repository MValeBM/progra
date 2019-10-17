public class Espectadores extends Persona{
    private String fila;
    private int silla;

    public Espectadores(String nombre, int edad, String fila, int silla) {
        this.fila = fila;
        this.silla = silla;
        nombre= super.getNombre();
        edad=super.getEdad();
    }

    public String getFila() {
        return fila;
    }

    public int getSilla() {
        return silla;
    }

    @Override
    public String getTipo() {
        return "Espectador";
    }

    @Override
    public String toString() {
        return  getTipo() +
                "\n nombre= " + super.getNombre() + '\'' +
                "\n edad= " + super.getEdad()+
                "\n fila= "+ getFila() +
                "\n Silla= "+ getSilla();
    }
}
