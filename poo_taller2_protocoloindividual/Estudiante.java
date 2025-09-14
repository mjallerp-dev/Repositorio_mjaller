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


}
