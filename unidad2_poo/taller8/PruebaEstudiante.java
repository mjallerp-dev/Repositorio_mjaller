package repositorio_mjaller.unidad2_poo.taller8;

public class PruebaEstudiante {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel", 26);
        persona1.mostrarDatos();
        Estudiante estudiante1 = new Estudiante("Angel", 27, "7502520037");
        estudiante1.mostrarDatos();
        Estudiante estudiante2 = new Estudiante("Ronald", 18, "7502520001");
        estudiante2.mostrarDatos();
    }

}
