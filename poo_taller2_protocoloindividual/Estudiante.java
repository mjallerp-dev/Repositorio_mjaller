package repositorio_mjaller.poo_taller2_protocoloindividual;

public class Estudiante {
    private String nombre;
    private int edad;

    
    //contructor parametrizado
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Contructor por defecto
    public Estudiante() {
        this("Desconocido",1);
    }


    public void mostrarDatos() {
        System.out.println("""

            Datos del Estudiante:

            Nombre: %s
            Edad: %s

            """.formatted(nombre, edad));
    }

    //public static void metodoEstatico() {
    //    System.out.println("Nombre del estudiante: " + this.nombre);
    //    System.out.println("Edad: " + this.edad);
    //}

    //Error: "non-static variable this cannot be referenced from a static context"
    //Un metodo static pertenece a la clase y no a un objeto, 'this' hace referencia al obtejo actual, en un contexto estatico no hay objeto asociado

    //Solucion 1: Eliminar 'this' y usar un parametro

        public static void metodoEstatico(Estudiante e){
            System.out.println("Nombre: " + e.nombre);
            System.out.println("Edad: " + e.edad);
        }

    //Solucion 2: Hacer un método no estatico

        public void metodoNoEstatico(){
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + this.edad);
        }

}
