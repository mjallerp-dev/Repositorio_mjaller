package taller_14.ejercicio_2;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + getNombre() + ", tengo " + getEdad() + " años y enseño " + getAsignatura() + ".");
    }

}
