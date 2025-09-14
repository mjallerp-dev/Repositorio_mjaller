package repositorio_mjaller.poo_taller_protocoloindividual;

public class Estudiante {
    //Propiedades
    private String nombre;
    private int edad;
    private String curso;

    //1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Juan Pérez";
        this.edad = 20;
        this.curso = "10º Grado";
    }

    //2. Constructor parametrizado con 2 parametros (nombre, edad)
    public Estudiante(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Nombre no especificado, se asignará 'Nombre Desconocido'\n");
            this.nombre = "Nombre Desconocido";
        } else {
            this.nombre = nombre;
        }
        if (edad <= 4) {
            System.out.println("Edad no válida, se asignará '5' por defecto\n");
            this.edad = 5;
        } else {
            this.edad = edad;
        }
    }

    //3. Constructor con todos los parametros y uso de this()
    public Estudiante(String nombre, int edad, String curso) {
    this(nombre, edad); // Llama al constructor anterior
        if (curso == null || curso.trim().isEmpty()) {
            System.out.println("Curso no especificado, se asignará 'Curso Desconocido'\n");
            this.curso = "Curso Desconocido";
        } else {
            this.curso = curso;
        }
    this.curso = curso;
    }

}
