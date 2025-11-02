package taller_14.ejercicio_4;

public class Coche extends Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mover() {
        System.out.println("El coche " + marca + " " + modelo + " se está moviendo a una velocidad máxima de " + velocidadMaxima + " km/h");
    }

}
