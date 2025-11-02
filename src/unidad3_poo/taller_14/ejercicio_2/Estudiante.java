package taller_14.ejercicio_2;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return this.carrera;
    }
    public void setCarrera(String carrera) {
        if (carrera == null || carrera.trim().isEmpty()) {
            System.out.println("La carrera no puede estar vacía, se asignará 'Desconocida' por defecto");
            this.carrera = "Desconocida";
        } else {this.carrera = carrera;}
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + getNombre() + ", tengo " + getEdad() + " años y estudio " + getCarrera() + ".");
    }



}
