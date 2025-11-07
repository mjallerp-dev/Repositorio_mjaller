package taller_14.ejercicio_3;

public class Main {

    public static void main(String[] args) {

        //Persona persona1 = new Empleado("Ana", 20, "Ingeniería");
        //persona1.mostrarDetalles();

        Empleado empleado1 = new Empleado("Ana", 20, "Ingeniería");
        empleado1.mostrarDetalles();

        Persona persona2 = new Estudiante("Luis", 22, "Matemáticas");
        persona2.presentarse();
    }
}
