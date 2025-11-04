package repositorio_mjaller.unidad2_poo.taller8;

public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            System.out.println("El departamento no puede estar vacío, se asigna 'Desconocido' por defecto");
            this.departamento = "Desconocido";
        } else {this.departamento = departamento;}
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + getDepartamento());
    }
}
