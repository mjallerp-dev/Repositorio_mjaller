package unidad4_poo.taller_15.ejercicio_2;

public class Producto {
    private String nombre;
    private double precioBase;
    static double impuesto = 0.19; //iva 19%

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return this.nombre;
    }
    public double getPrecioBase() {
        return this.precioBase;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío, se asignará 'Desconocido' por defecto.");
            this.nombre = "Desconocido";
        } else{this.nombre = nombre;}
    }
    public void setPrecioBase(double precioBase) {
        if (precioBase < 0) {
            System.out.println("El precio no puede ser negativo, se asignará 0 por defecto.");
            this.precioBase = 0;
        } else{this.precioBase = precioBase;}
    }

    public double calcularPrecio() {
        System.out.println("El precioBase total del producto " + getNombre() + " es:");
        return getPrecioBase() + (getPrecioBase() * impuesto);
    }

    public void mostrarEtiqueta() {
        System.out.println("""

        Nombre del producto: %s
        Precio: %.2f
        """.formatted(getNombre(), getPrecioBase() + (getPrecioBase() * impuesto)));
    }

}
