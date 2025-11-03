package unidad4_poo.taller_15.ejercicio_2;

public class Precio {

    public void calcularPrecio(Producto p) {
        System.out.println("Precio de " + p.getNombre() + ":" + p.getPrecioBase() * (1 + Producto.impuesto));
    }
}
