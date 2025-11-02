package taller_14.ejercicio_1;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
        public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("El valor de la base es inválido, se asignará 1 por defecto");
            this.base = 1;
        }
        else{this.base = base;}
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("El valor de la altura es inválido, se asignará 1 por defecto");
            this.altura = 1;
        }
        else{this.altura = altura;}
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: " + (getBase() * getAltura()));
    }

}
