package repositorio_mjaller.poo_taller2_protocoloindividual;

public class Main {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Miguel Jaller",26);
        Estudiante estudiante2 = new Estudiante();
        Producto producto1 = new Producto("Lavaloza",28);
        System.out.println("\nUsando método estatico sin this: ");
        Estudiante.metodoEstatico(estudiante1);
        System.out.println("\nUsando método NO estático con this: ");
        estudiante2.metodoNoEstatico();
        System.out.println("\nEjercicio 1: Clase Producto");
        producto1.mostrarProducto();
    }
    
}
