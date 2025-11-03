package unidad4_poo.taller_15.ejercicio_2;

public class Producto {
    private String nombre;
    private double precioBase;
    static double impuesto = 0.19; //iva 19%

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double calcularPrecio() {
        System.out.println("El precioBase total del producto " + this.nombre + " es:");
        return this.precioBase + (this.precioBase * impuesto);
    }

    public void mostrarEtiqueta() {
        System.out.println("""

        Nombre del producto: %s
        Precio: %.2f
        """.formatted(this.nombre, this.precioBase + (this.precioBase * impuesto)));
    }

}
