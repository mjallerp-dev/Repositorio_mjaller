package repositorio_mjaller.poo_taller_protocoloindividual;

public class Estudiante {
    private String nombre;
    private int edad;
    private int curso;

    public static int contador = 0;

    public Estudiante() {
        this.nombre = "Juan Pérez";
        this.edad = 20;
        this.curso = 10;
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = 1; // 
    }

    public Estudiante(String nombre, int edad, int curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }
        public int getEdad() {
        return edad;
    }
        public int getCurso() {
        return curso;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre no especificado, se asignará 'Nombre Desconocido'\n");
            this.nombre = "Nombre Desconocido";
        } else {
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad) {
        if (edad <= 1) {
            System.out.println("Edad no válida, se asignará '1' por defecto\n");
            this.edad = 1;
        } else {
            this.edad = edad;
        }
    }
    public void setCurso(int curso) {
        if (curso < 0 || curso > 11) {
            System.out.println("Curso no válido, se asignará '1' por defecto\n");
            this.curso = 1;
        } else {
            this.curso = curso;
        }
    }

    @Override
    public String toString() {
        contador+=1;
        return
            "Nombre: " + getNombre() + "\n" +
            "Edad: " + getEdad() + "\n" +
            "Curso: " + getCurso() + "º Grado" + "\n";
    }
}
