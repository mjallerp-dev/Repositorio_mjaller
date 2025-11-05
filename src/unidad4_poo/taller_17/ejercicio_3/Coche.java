package unidad4_poo.taller_17.ejercicio_3;

public class Coche extends Transporte {

    public Coche(double velocidadMaxima, String color, int numeroDePuertas) {
        super(velocidadMaxima, color);
    }

    @Override
    public void mover() {
        System.out.println("El coche de color " + getColor() + " se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h.");
    }

}
