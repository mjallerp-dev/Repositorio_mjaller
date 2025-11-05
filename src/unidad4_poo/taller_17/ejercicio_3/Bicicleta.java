package unidad4_poo.taller_17.ejercicio_3;

public class Bicicleta extends Transporte {

    public Bicicleta(double velocidadMaxima, String color, int numeroDeMarchas) {
        super(velocidadMaxima, color);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta de color " + getColor() + " se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h.");
    }

}
