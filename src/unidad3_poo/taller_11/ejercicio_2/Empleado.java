package taller_11.ejercicio_2;

public abstract class Empleado {
    private String nombre;
    private String departamento;
    private double salarioDiario;
    private int diasTrabajados;

    public Empleado(String nombre, String departamento, double salarioDiario, int diasTrabajados) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    public double getSalarioDiario() {
        return this.salarioDiario;
    }
    public int getDiasTrabajados() {
        return this.diasTrabajados;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("\nEl nombre no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.nombre = "Desconocido";}
        else {this.nombre = nombre;}
    }
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            System.out.println("\nEl departamento no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.departamento = "Desconocido";}
        else {this.departamento = departamento;}
    }
    public void setSalarioDiario(double salarioDiario) {
        if (salarioDiario < 47450) {
            System.out.println("\nEl salario minimo diario es de $47450, se asignará este valor por defecto");
            this.salarioDiario = 47450;
        }else{this.salarioDiario = salarioDiario;}
    }
    public void setDiasTrabajados(int diasTrabajados) {
        if (diasTrabajados < 0) {
            System.out.println("\nLos días trabajados no pueden ser negativos, se asignará 1 por defecto");
            this.diasTrabajados = 1;
        }else{this.diasTrabajados = diasTrabajados;}
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("El salario del empleado es: $" + calcularSalario());
        System.out.println("_____________________________");
    }   
}
