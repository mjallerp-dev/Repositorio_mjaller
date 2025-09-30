package repositorio_mjaller.unidad2_poo.taller10;

public class Bicicleta extends Vehiculo {
    String marca;
    String color;

    public Bicicleta(int velocidad, String marca, String color) {
        super(velocidad);
        this.marca = marca;
        this.color = color;
    }
}
