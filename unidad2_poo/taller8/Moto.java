package repositorio_mjaller.unidad2_poo.taller8;

public class Moto {
    private String marca;
    private int velocidadMaxima;

    public Moto(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return this.marca;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles de la Moto: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
    }
}
