package taller_14.ejercicio_2;

public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getProfesion() {
        return profesion;
    }

    public void setNombre(String nombre) {
        if (nombre==null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.nombre = "Desconocido";
        } else {this.nombre = nombre;}
    }
    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa, se asignará 0 por defecto");
            this.edad = 0;
        } else {this.edad = edad;}
    }
    public void setProfesion(String profesion) {
        if (profesion==null || profesion.trim().isEmpty()) {
            System.out.println("La profesión no puede estar vacía, se asignará 'Desconocido' por defecto");
            this.profesion = "Desconocido";
        } else {this.profesion = profesion;}
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es" + getNombre() + ", tengo " + getEdad() + " años y soy " + getProfesion() + ".");
    }
}
