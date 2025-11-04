package unidad4_poo.taller_16;

public abstract class Descuento {
    private double precio;

    public Descuento(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("El precio no puede ser negativo, transacción cancelada.");
        } else {
            this.precio = precio;
        }
    }
 
    public abstract void aplicarDescuento();
    
}
