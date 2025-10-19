package taller_11.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Gomez", "Administración", 80000, 30);
        Vendedor vendedor = new Vendedor("Juan Perez", "Ventas", 60000, 10, 28);
        

        System.out.println("\nDetalles del Vendedor:");
        vendedor.mostrarDetalles();
        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }

}
