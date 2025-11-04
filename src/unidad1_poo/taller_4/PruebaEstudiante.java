package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class PruebaEstudiante {
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante("Miguel Jaller",26,4.6f);
        Estudiante e2 = new Estudiante("Anger Piñeres", 18, 3.5f);

        System.out.println("Datos de los estudiantes en 2024: ");
        e.mostrarNota();
        e2.mostrarNota();
        e.setEdad(27);
        e2.setEdad(19);
        System.out.println("Datos de los estudiantes en primer corte de 2025: ");
        e.mostrarNota();
        e2.mostrarNota();
        e.setNotaPromedio(3.8f);
        e2.setNotaPromedio(4.8f);
        System.out.println("Nota Actualizada hasta 2do Corte de 2025: ");
        e.mostrarNota();
        e2.mostrarNota();

    }
}
