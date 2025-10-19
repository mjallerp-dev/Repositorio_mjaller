package taller_11.ejercicio_2;

public class Gerente extends Empleado {
    private double salarioDiario;
    private double diasTrabajados;
    private double bono;

    public Gerente(double salarioDiario, double diasTrabajados, double bono) {
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return (this.salarioDiario * this.diasTrabajados) + this.bono;
    }

}
