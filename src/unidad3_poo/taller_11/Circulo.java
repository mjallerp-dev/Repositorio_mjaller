package taller_11;

public class Circulo extends Figura {
    private double radio;
    static double pi = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("El valor del radio es inválido");
        }else{this.radio = radio;}
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es:" + (pi * radio * radio));
    }

}
