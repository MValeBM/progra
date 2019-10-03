package TP8;

public interface IVehiculo {
    int velocidad_maxima=120;
    int acelerar(int aumentar);
    int frenar(int disminuir);
    void plazas();
}
