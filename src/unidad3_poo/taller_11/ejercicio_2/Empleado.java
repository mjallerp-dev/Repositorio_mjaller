package taller_11.ejercicio_2;

public abstract class Empleado {
    private String nombre;
    private String departamento;

    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.nombre = "Desconocido";}
        else {this.nombre = nombre;}
    }
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            System.out.println("El departamento no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.departamento = "Desconocido";}
        else {this.departamento = departamento;}
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("El salario del empleado es: " + calcularSalario());
    }   
}
