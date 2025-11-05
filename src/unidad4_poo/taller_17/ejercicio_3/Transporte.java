package unidad4_poo.taller_17.ejercicio_3;

public class Transporte {
    private double velocidadMaxima;
    private String color;

    public Transporte(double velocidadMaxima, String color) {
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public void moviendo() {
        System.out.println("El transporte de color " + this.color + "se está moviendo a una velocidad máxima de " + this.velocidadMaxima + " km/h.");
    }

}
