package repositorio_mjaller.poo_taller_protocoloindividual;

public class Estudiante {
    //Propiedades
    private String nombre;
    private int edad;
    private String curso;

    public static int contador = 0;

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
        if (edad <= 1) {
            System.out.println("Edad no válida, se asignará '1' por defecto\n");
            this.edad = 1;
        } else {
            this.edad = edad;
        }
        this.curso = "Cuso Desconocido"; // Curso por defecto
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
    }

    //4. Metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodos para mostrar datos

    @Override
    public String toString() {
        contador+=1;
        return
            "Datos del Estudiante " + contador + ":\n" +
            "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Edad: " + getEdad() + "\n" +
            "Curso: " + getCurso() + "\n";
    }
}
