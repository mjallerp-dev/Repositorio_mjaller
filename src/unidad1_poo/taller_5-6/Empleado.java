package repositorio_mjaller.poo_actividad_unidad1;

class Empleado {
  
    protected String nombre;
    protected double salario;

    Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    protected void mostrarInformacion() {
        System.out.println("\nNombre: " + nombre + 
                        "\nSalario: " + salario);
    }
}
