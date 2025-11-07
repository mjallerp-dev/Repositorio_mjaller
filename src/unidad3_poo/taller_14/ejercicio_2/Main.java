package taller_14.ejercicio_2;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Estudiante("Miguel Jaller", 20, "Ingeniería de Software");
        Persona persona2 = new Profesor("John Arrieta", 45, "Programación Orientada a Objetos");
        Persona persona3 = new Persona("Angel Piñeres", 27);

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
        
    }

}
