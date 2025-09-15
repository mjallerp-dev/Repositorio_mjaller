package repositorio_mjaller.poo_taller2_protocoloindividual;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("""

        Detalles del producto:
        
        Nombre: %s
        Precio: %s

        """.formatted(nombre, precio));
    }

}
