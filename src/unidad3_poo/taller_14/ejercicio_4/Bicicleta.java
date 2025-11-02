package taller_14.ejercicio_4;

public class Bicicleta extends Vehiculo {
    private String tipo; // Montaña, carretera, deporte, etc.

    public Bicicleta(String marca, String tipo, int velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            System.out.println("El tipo no puede estar vacío, se asignará 'Desconocida' por defecto");
            this.tipo = "Desconocida";
        } else {this.tipo = tipo;}
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta de marca " + getMarca() + ", de tipo " + getTipo() + ", se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h");
    }

}