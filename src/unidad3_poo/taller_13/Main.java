package taller_13;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        circulo.setRadio(-3);
        rectangulo.setBase(0);
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
    }

}
