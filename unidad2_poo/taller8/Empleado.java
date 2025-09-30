package repositorio_mjaller.unidad2_poo.taller8;

public class Empleado {
    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        if (nombre== null || nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacío, se asigna 'Desconocido' por defecto");
            this.nombre = "Desconocido";
        }
        else {this.nombre = nombre;}
    }

    public void mostrarDetalles() {
        System.out.println("Datos del Empleado: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
