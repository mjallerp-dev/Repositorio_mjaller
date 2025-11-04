package unidad4_poo.taller_16;

public class DescuentoFijo extends Descuento {
    private double monto;

    public DescuentoFijo(double precio, double monto) {
        super(precio);
        this.monto = monto;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        if (monto < 0) {
            System.out.println("El monto a descontar no puede ser negativo, se asignará 0 por defecto.");
            this.monto = 0;
        } else {
            this.monto = monto;
        }
    }

    @Override
    public void aplicarDescuento() {
        double precioFinal = getPrecio() - getMonto();
        if (precioFinal < 0) {
            System.out.println("El descuento excede el precio, el precio final se ajustará a 0.");
            precioFinal = 0;
        }
        System.out.println("Precio con descuento fijo de $" + getMonto() + ": $" + precioFinal);
    }
}
