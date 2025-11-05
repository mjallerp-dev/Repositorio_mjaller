package unidad4_poo.taller_17.ejercicio_3;

public class Transporte {
    private double velocidadMaxima;
    private String color;

    public Transporte(double velocidadMaxima, String color) {
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public String getColor() {
        return this.color;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima < 0) {
            System.out.println("La velocidad máxima no puede ser negativa, se asignará 1 Km/h por defecto.");
            this.velocidadMaxima = 1;
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }
    public void setColor(String color) {
        if (color==null || color.trim().isEmpty()) {
            System.out.println("El color no puede estar vacío, se asignará 'Desconocido' por defecto.");
            this.color = "Desconocido";
        } else{
        this.color = color;}
    }

    public void moviendo() {
        System.out.println("El transporte de color " + getColor() + "se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h.");
    }

}
