package repositorio_mjaller.poo_actividad_unidad1;

class Gerente extends Empleado {
    protected String departamento;

    Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    protected void mostrarInformacion() {
        System.out.println("\nNombre: " + this.nombre + 
                           "\nSalario: " + this.salario + 
                           "\nDepartamento: " + this.departamento);
    }

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Miguel", 1423000);
        Gerente gerente = new Gerente("Angel",2200000,"Ingeniería");
        empleado.mostrarInformacion();
        gerente.mostrarInformacion();
    }

}