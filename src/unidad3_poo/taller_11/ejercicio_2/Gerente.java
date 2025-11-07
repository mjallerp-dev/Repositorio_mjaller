package taller_11.ejercicio_2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String departamento, double salarioDiario, int diasTrabajados, double bono) {
        super(nombre,departamento, salarioDiario, diasTrabajados);
        this.bono = bono;
    }

    public double getBono() {
        return this.bono;
    }
    public void setBono(double bono){
        if (bono < 1000000) {
            System.out.println("\nEl bono minimo es de $1.000.000, se asignará este valor por defecto");
            this.bono = 1000000;
        } else{this.bono = bono;}
    }

    @Override
    public double calcularSalario() {
        System.out.println("""
            Salario Diario: $%.2f
            Dias trabajados: %d
            Bono: $%.2f
            
            """.formatted(getSalarioDiario(),getDiasTrabajados(),getBono()));
        return ((getSalarioDiario() * getDiasTrabajados()) + getBono());
    }

}
