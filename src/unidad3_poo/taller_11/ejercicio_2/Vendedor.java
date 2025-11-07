package taller_11.ejercicio_2;

public class Vendedor extends Empleado {
    private int numeroVentas;
    private double comisionPorVenta;

    public Vendedor(String nombre, String departamento, double salarioDiario, int numeroVentas, int diasTrabajados, double comisionPorVenta) {
        super(nombre,departamento, salarioDiario, diasTrabajados);
        this.numeroVentas= numeroVentas;
        this.comisionPorVenta = comisionPorVenta;
    }
    
    public int getNumeroVentas() {
        return this.numeroVentas;
    }
    public double getComisionProVentas() {
        return this.comisionPorVenta;
    }

    public void setNumeroVentas(int numeroVentas) {
        if (numeroVentas < 0) {
            System.out.println("\nEl número de ventas no puede ser negativo, se asignará 0 por defecto");
            this.numeroVentas = 0;
        }else{this.numeroVentas = numeroVentas;}
    }
    public void setComisionPorVenta (double comisionPorVenta) {
        if (comisionPorVenta < 50000) {
            System.out.println("\nLa comision por venta debe ser minimo de $50.000, se asignará este valor por defecto");
            this.comisionPorVenta = 50000;
        }else{this.comisionPorVenta = comisionPorVenta;}
    }

    @Override
    public double calcularSalario() {
        System.out.println("""
            Salario Diario: $%.2f
            Dias trabajados: %d
            Numero de Ventas: %d
            """.formatted(getSalarioDiario(),getDiasTrabajados(),getNumeroVentas()));
        return ((getSalarioDiario() * getDiasTrabajados()) + (getNumeroVentas() * getComisionProVentas()));
    }

}
