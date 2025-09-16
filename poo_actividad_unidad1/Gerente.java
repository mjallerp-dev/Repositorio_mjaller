package repositorio_mjaller.poo_actividad_unidad1;

class Gerente extends Empleado {
    protected String departamento;

    Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + 
                           ", Salario: " + salario + 
                           ", Departamento: " + departamento);
    }

}