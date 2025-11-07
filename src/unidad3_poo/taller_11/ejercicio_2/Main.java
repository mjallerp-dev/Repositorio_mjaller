package taller_11.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Gomez", "Administración", 80000, 30, 2000000);
        Vendedor vendedor = new Vendedor("Juan Perez", "Ventas", 60000, 10, 30, 50000);
        
        System.out.println("\nDetalles del Gerente: \n");
        gerente.mostrarDetalles();
        System.out.println("\nDetalles del Vendedor: \n");
        vendedor.mostrarDetalles();
        vendedor.setSalarioDiario(20000);
        System.out.println("\nDetalles del Vendedor: \n");
        vendedor.mostrarDetalles();
        gerente.setDepartamento("");
        System.out.println("\nDetalles del Gerente: \n");
        gerente.mostrarDetalles();        

    }

}
