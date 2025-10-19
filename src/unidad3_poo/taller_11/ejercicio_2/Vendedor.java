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

    public double getSalarioDiario() {
        return this.salarioDiario;
    }
    public int getNumeroVentas() {
        return this.numeroVentas;
    }
    public int getDiasTrabajados() {
        return this.diasTrabajados;
    }

    public void setSalarioDiario(double salarioDiario) {
        if (salarioDiario < 47450) {
            System.out.println("El salario diario minimo diario es de 47450, se asignará este valor por defecto");
            this.salarioDiario = 47450;
        }else{this.salarioDiario = salarioDiario;}
    }
    public void setNumeroVentas(int numeroVentas) {
        if (numeroVentas < 0) {
            System.out.println("El número de ventas no puede ser negativo, se asignará 0 por defecto");
            this.numeroVentas = 0;
        }else{this.numeroVentas = numeroVentas;}
    }
    public void setDiasTrabajados(int diasTrabajados) {
        if (diasTrabajados < 0) {
            System.out.println("Los días trabajados no pueden ser negativos, se asignará 1 por defecto");
            this.diasTrabajados = 1;
        }else{this.diasTrabajados = diasTrabajados;}
    }

    @Override
    public double calcularSalario() {
        return ((getSalarioDiario() * getDiasTrabajados()) + (getNumeroVentas() * comisionPorVenta));
    }

}
