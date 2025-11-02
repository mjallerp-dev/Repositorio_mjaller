package taller_14.ejercicio_4;

public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return this.marca;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("\nLa marca no puede estar vacía, se asignará 'Desconocida' por defecto");
            this.marca = "Desconocida";
        } else {this.marca = marca;}
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima < 0) {
            System.out.println("\nLa velocidad máxima es inválida, se asignará 100 por defecto");
            this.velocidadMaxima = 100;
        } else {this.velocidadMaxima = velocidadMaxima;}
    }

    public void mover() {
        System.out.println("\nEl vehículo se está moviendo");
    }

}
