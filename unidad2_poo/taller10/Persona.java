package repositorio_mjaller.unidad2_poo.taller10;

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

    public void presentarse() {
        System.out.println("\nHola, mi nombre es " + getNombre() + " y tengo " + getEdad() + " años.");
    }
}
