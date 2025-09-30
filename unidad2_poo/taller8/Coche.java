package repositorio_mjaller.unidad2_poo.taller8;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }
}
