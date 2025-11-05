package unidad4_poo.taller_17.ejercicio_1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            System.out.println("El radio no puede ser negativo, se asignará '1' por defecto.");
        } else {
            this.radio = radio;}
        }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

}
