package taller_14.ejercicio_4;

public class Coche extends Vehiculo {
    private String modelo;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("El modelo no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.modelo = "Desconocido";
        } else {this.modelo = modelo;}
    }

    @Override
    public void mover() {
        System.out.println("El coche de marca " + getMarca() + ", modelo " + getModelo() + ", se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h");
    }

}
