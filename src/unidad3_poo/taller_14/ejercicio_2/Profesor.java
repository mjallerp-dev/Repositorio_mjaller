package taller_14.ejercicio_2;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return this.asignatura;
    }
    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.trim().isEmpty()){
            System.out.println("La asignatura no puede estar vacía, se asiganará 'Desconocida' en su lugar");
            this.asignatura = "Desconocida";
        } else {
        this.asignatura = asignatura;}
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + getNombre() + ", tengo " + getEdad() + " años y enseño " + getAsignatura() + ".");
    }

}
