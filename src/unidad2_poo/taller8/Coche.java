package repositorio_mjaller.unidad2_poo.taller8;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de Puertas: " + this.numeroPuertas);
    }

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", 180);
        vehiculo1.mostrarDetalles();
        Vehiculo vehiculo2 = new Vehiculo("Ford", 220);
        vehiculo2.mostrarDetalles();
        Coche coche1 = new Coche("Ferrari", 300, 2);
        coche1.mostrarDetalles();
        Coche coche2 = new Coche("Honda", 200, 4);
        coche2.mostrarDetalles();
    }
}
