package repositorio_mjaller.poo_taller3_protocolocolaborativo;

public class Prueba {
    public static void main(String[] args) {
        int resultado1 = Matemáticas.sumar(1,2);
        int resultado2 = Matemáticas.restar(3,4);
        int resultado3 = Matemáticas.multiplicar(5,6);
        double resultado4 = Matemáticas.dividir(7,8);
        System.out.println("\nEl resultado de la suma es: " + resultado1);
        System.out.println("\nEl resultado de la resta es: " + resultado2);
        System.out.println("\nEl resultado de la multiplicación es: " + resultado3);
        System.out.println("\nEl resultado de la división es: " + resultado4);
    }

}
