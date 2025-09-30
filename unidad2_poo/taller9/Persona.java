package repositorio_mjaller.unidad2_poo.taller9;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles de la Persona: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
