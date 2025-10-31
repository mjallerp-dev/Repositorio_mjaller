package taller_13;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("El valor de la base es inválido, se asignará 1 por defecto");
            this.base = 1;
        }else{this.base = base;}
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("El valor de la altura es inválido, se asignará 1 por defecto");
            this.altura = 1;
        }else{this.altura = altura;}
    }

    @Override
    public double calcularArea() {
        return (getBase()* getAltura());
    }

}
