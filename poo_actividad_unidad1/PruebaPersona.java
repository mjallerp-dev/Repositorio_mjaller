package repositorio_mjaller.poo_actividad_unidad1;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona p = new Persona();

        p.edad = 25;
        //p.nombre = "Miguel"; nombre has private acces in Persona

        System.out.println("\nEdad: " + p.edad);
        //System.out.println("Nombre: " + p.nombre); nombre has private acces in Persona

        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Andrés");
        System.out.println("Nuevo Nombre: " + p.getNombre());

        //Si el atributo nombre es private solo se puede acceder mediante los metodos get y set
    }
}   

