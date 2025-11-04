package unidad4_poo.taller_16;

public class DescuentoPorcentaje extends Descuento {
    private final double porcentaje;

    public DescuentoPorcentaje(double precio, double porcentaje) {
        super(precio);
        this.porcentaje = porcentaje;
    }

    @Override
    public void aplicarDescuento() {
        double precioFinal = getPrecio() - (getPrecio() * this.porcentaje / 100);
        System.out.println("Precio con descuento del " + this.porcentaje + "%: " + precioFinal);
    }
}
