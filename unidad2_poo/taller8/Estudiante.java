package repositorio_mjaller.unidad2_poo.taller8;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Matrícula: " + this.matricula);
    }
}
