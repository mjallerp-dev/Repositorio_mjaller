package taller_14.ejercicio_3;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            System.out.println("El departamento no puede estar vacío, se asignará 'General' por defecto");
            this.departamento = "General";
        } else {this.departamento = departamento;}
    }

    public void mostrarDetalles() {
        System.out.println("""
        
        Empleado: 
        Nombre: %s
        Edad: %d
        Departamento: %s
        
        """.formatted(getNombre(), getEdad(), getDepartamento()));
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, mi nombre es" + getNombre() + " y tengo " + getEdad() + " años.");
    }

}
