package repositorio_mjaller.unidad2_poo.taller9;

public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + getDepartamento());
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Miguel", 26);
        persona.mostrarDetalles();
        Empleado empleado = new Empleado("Angel", 27, "Sistemas");
        empleado.mostrarDetalles();
    }

}
