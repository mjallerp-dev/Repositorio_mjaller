package taller_11.ejercicio_2;

public class Vendedor extends Empleado {
    private double salarioDiario;
    private int numeroVentas;
    private int diasTrabajados;
    double comisionPorVenta = 50000;

    public Vendedor(double salarioDiario, int numeroVentas, int diasTrabajados) {
        this.salarioDiario = salarioDiario;
        this.numeroVentas = numeroVentas;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularSalario() {
        return (this.salarioDiario * this.diasTrabajados) + (this.numeroVentas * this.comisionPorVenta);
    }

}
