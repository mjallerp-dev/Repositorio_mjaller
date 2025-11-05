package unidad4_poo.taller_17.ejercicio_1;

public class Main {

    public static void main(String[] args) {

        Figura rectangulo = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Figura circulo = new Circulo(7);
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }

}
