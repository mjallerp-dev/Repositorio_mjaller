package taller_11.ejercicio_1;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El area de la figura es: " + calcularArea());
    }
}
