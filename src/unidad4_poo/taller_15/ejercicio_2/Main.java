package unidad4_poo.taller_15.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Software", 1000000);
        Producto producto2 = new Producto("Página Web", 2000000);

        Etiqueta etiqueta = new Etiqueta();
        Precio precio = new Precio();

        etiqueta.generarEtiqueta(producto1);
        precio.calcularPrecio(producto2);

    }

}
