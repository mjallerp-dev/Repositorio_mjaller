package taller_14.ejercicio_1;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("El valor del radio es inválido, se asignará 1 por defecto");
            this.radio = 1;
        }
        else{this.radio = radio;}
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es: " + Math.PI * Math.pow(getRadio(), 2));
    }

}
