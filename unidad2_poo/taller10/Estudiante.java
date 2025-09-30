package repositorio_mjaller.unidad2_poo.taller10;

public class Estudiante extends Persona {
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    public String getPrograma() {
        return this.programa;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy estudiante de " + getPrograma() + ".");
    }
}
