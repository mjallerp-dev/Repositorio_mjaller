package repositorio_mjaller.unidad2_poo.taller8;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles del Vehiculo: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
    }
}
