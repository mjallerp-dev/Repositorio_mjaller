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

    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("La marca no puede estar vacía, se asignará 'Desconocida' por defecto");
            this.marca = "Desconocida";
        } else {this.marca = marca;}
    }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("El modelo no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.modelo = "Desconocido";
        } else {this.modelo = modelo;}
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima < 0) {
            System.out.println("La velocidad máxima es inválida, se asignará 100 por defecto");
            this.velocidadMaxima = 160;
        } else {this.velocidadMaxima = velocidadMaxima;}
    }

    @Override
    public void mover() {
        System.out.println("El coche " + getMarca() + " " + getModelo() + " se está moviendo a una velocidad máxima de " + getVelocidadMaxima() + " km/h");
    }

}
