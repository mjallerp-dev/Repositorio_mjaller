package unidad4_poo.taller_17.ejercicio_1;

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
        if (base < 0) {
            System.out.println("La base no puede ser negativa, se asignará '1' por defecto.");
        } else {
            this.base = base;}
    }
    public void setAltura(double altura) {
        if (altura < 0) {
            System.out.println("La altura no puede ser negativa, se asignará '1' por defecto.");
        } else {
        this.altura = altura;}
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

}
