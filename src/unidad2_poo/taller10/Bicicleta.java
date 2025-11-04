package repositorio_mjaller.unidad2_poo.taller10;

public class Bicicleta extends Vehiculo {
    String marca;
    String color;

    public Bicicleta(int velocidad, String marca, String color) {
        super(velocidad);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }
    public String getColor() {
        return this.color;
    }

    @Override
    public void moverse() {
        System.out.println("\nLa bicicleta de marca " + getMarca() + " y color " + getColor() + " se mueve a una velocidad de " + getVelocidad() + " km/h.");
    }
}
