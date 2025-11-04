package unidad4_poo.taller_16;

public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double precio, double porcentaje) {
        super(precio);
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return this.porcentaje;
    }
    public void setPorcentaje(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("El porcentaje debe estar entre 0 y 100, se asignará 0 por defecto.");
            this.porcentaje = 0;
        } else {
            this.porcentaje = porcentaje;
        }
    }

    @Override
    public void aplicarDescuento() {
        double precioFinal = getPrecio() - (getPrecio() * getPorcentaje() / 100);
        System.out.println("Precio con descuento del " + getPorcentaje() + "%: $" + precioFinal);
    }
}
