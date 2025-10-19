package taller_11.ejercicio_1;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Rectangulo rectangulo = new Rectangulo(4, 5);

        System.out.println("\nÁrea del circulo: ");
        circulo.mostrarArea();
        System.out.println("\nÁrea del circulo: ");
        rectangulo.mostrarArea();
        System.out.println("\n_________________________________");
        circulo.setRadio(-2);
        rectangulo.setBase(0);
        rectangulo.setAltura(7);
        System.out.println("\nÁrea del circulo: ");
        circulo.mostrarArea();
        System.out.println("\nÁrea del rectángulo: ");
        rectangulo.mostrarArea();

    }

}
