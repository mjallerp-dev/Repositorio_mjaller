package taller_11.ejercicio_2;

public class Gerente extends Empleado {
    private double salarioDiario;
    private int diasTrabajados;
    double bono = 1000000;

    public Gerente(String nombre, String departamento, double salarioDiario, int diasTrabajados) {
        super(nombre, departamento);
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
    }

    public double getSalarioDiario() {
        return this.salarioDiario;
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
    public void setDiasTrabajados(int diasTrabajados) {
        if (diasTrabajados < 0) {
            System.out.println("Los días trabajados no pueden ser negativos, se asignará 1 por defecto");
            this.diasTrabajados = 1;
        }else{this.diasTrabajados = diasTrabajados;}
    }

    @Override
    public double calcularSalario() {
        return ((getSalarioDiario() * getDiasTrabajados()) + bono);
    }

}
