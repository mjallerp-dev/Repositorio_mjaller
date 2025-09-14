package repositorio_mjaller.poo_taller_protocoloindividual;

public class Estudiante {
    //Propiedades
    private String nombre;
    private int edad;
    private int curso;

    public static int contador = 0;

    //1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Juan Pérez";
        this.edad = 20;
        this.curso = 10;
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
        this.curso = 1; // Curso por defecto
    }

    //3. Constructor con todos los parametros y uso de this()
    public Estudiante(String nombre, int edad, int curso) {
        this(nombre, edad); // Llama al constructor anterior
        if (curso < 0 || curso > 11) {
            System.out.println("Curso no válido, se asignará '1' por defecto\n");
            this.curso = 1;
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
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }

    //Metodos para mostrar datos

    @Override
    public String toString() {
        contador+=1;
        return
            "Nombre: " + getNombre() + "\n" +
            "Edad: " + getEdad() + "\n" +
            "Curso: " + getCurso() + "º Grado" + "\n";
    }
}
