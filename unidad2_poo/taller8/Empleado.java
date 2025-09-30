package repositorio_mjaller.unidad2_poo.taller8;

public class Empleado {
    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Datos del Empleado: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
