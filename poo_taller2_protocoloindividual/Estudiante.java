package repositorio_mjaller.poo_taller2_protocoloindividual;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this("Desconocido",1);
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
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

    public void mostrarDatos() {
        System.out.println("""
        
        Datos del Estudiante:
        
        Nombre: %s
        Edad: %d
        
        """.formatted(getNombre(), getEdad()));
        }

    //public static void metodoEstatico() {
    //    System.out.println("Nombre del estudiante: " + this.nombre);
    //    System.out.println("Edad: " + this.edad);
    //}

    //Error: "non-static variable this cannot be referenced from a static context"
    //Un metodo static pertenece a la clase y no a un objeto, 'this' hace referencia al obtejo actual, en un contexto estatico no hay objeto asociado

    //Solucion 1: Eliminar 'this' y usar un parametro

        public static void metodoEstatico(Estudiante e){
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Edad: " + e.getEdad());
        }

    //Solucion 2: Hacer un método no estatico

        public void metodoNoEstatico(){
            System.out.println("Nombre: " + getNombre());
            System.out.println("Edad: " + getEdad());
        }

}