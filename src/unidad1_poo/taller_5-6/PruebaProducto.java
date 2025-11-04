package repositorio_mjaller.poo_actividad_unidad1;

public class PruebaProducto {
    public static void main(String[] args) {

        Producto p = new Producto("Laptop", 2500.0, 10);
        p.mostrarInfo();
        p.stock = 20;
        p.nombre = "Movil";
        p.precio = 3000;
        p.mostrarInfo();

        System.out.println("Acceso directo al stock: " + p.stock);
        System.out.println("Acceso directo al precio: " + p.precio);
        System.out.println("Acceso directo al nombre: " + p.nombre);
    }
}
