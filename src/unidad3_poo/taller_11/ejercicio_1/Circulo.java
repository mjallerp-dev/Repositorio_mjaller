package taller_11.ejercicio_1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("El valor del radio es inválido");
        }else{this.radio = radio;}
    }

    @Override
    public double calcularArea() {
        double pi = 3.1416;
        return (pi * this.radio * this.radio);
    }
}
