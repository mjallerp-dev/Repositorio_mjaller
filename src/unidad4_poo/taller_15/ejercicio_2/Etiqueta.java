package unidad4_poo.taller_15.ejercicio_2;

public class Etiqueta {

    public void generarEtiqueta(Producto p) {
        System.out.println("""

            Nombre del producto: %s
            Precio: %.2f
            """.formatted(p.getNombre(), p.getPrecioBase() * (1 + Producto.impuesto)));
    }

}
