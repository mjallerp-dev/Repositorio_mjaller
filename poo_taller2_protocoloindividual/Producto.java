package repositorio_mjaller.poo_taller2_protocoloindividual;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre no especificado, se asignará 'Nombre Desconocido'\n");
            this.nombre = "Nombre Desconocido";
        } else {
            this.nombre = nombre;
        }
    }
    public void setEdad(double precio) {
        if (precio <= 1.0 ) {
            System.out.println("Precio no válido, se asignará '1.0' por defecto\n");
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }

    public void mostrarProducto() {
        System.out.println("""
            

        Detalles del producto:
        
        Nombre: %s
        Precio: %f

        """.formatted(getNombre(), getPrecio()));
    }

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Lavaloza",28000);
        producto1.mostrarProducto();

    }
}
