public class Acomodadores extends Empleados implements IParaAcomodadores{

    private Sala sala;

    public Acomodadores(double sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
    }


    @Override
    public String getTipo() {
        return "Acomodador";
    }


    @Override
    public void setSala() {

    }

    @Override
    public void getSala(Sala salas) {
        this.sala = sala;
    }
}
