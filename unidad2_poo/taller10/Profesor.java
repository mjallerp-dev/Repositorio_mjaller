package repositorio_mjaller.unidad2_poo.taller10;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return this.asignatura;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy profesor de " + getAsignatura() + ".");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel", 26);
        persona1.presentarse();
        Profesor profesor1 = new Profesor("Jhon", 45, "Programación Orientada a Objetos");
        profesor1.presentarse();
    }
}
