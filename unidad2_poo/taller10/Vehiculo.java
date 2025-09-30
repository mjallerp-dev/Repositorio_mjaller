package repositorio_mjaller.unidad2_poo.taller10;

public class Vehiculo {
    protected int velocidad;;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void moverse() {
        System.out.println("\nEl vehículo se mueve a una velocidad de " + getVelocidad() + " km/h.");
    }
}