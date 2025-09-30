package repositorio_mjaller.unidad2_poo.taller9;

public class HijaPrivate extends ClasePrivate {
    private String apellido;

    public HijaPrivate(String nombrePrivado, String apellido) {
        super(nombrePrivado);
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void mostrarDetalles() {
        //System.out.println("Nombre Privado: " + this.nombrePrivado); nombrePrivado has private access in ClasePrivate
        //No es posible acceder a un atributo privado de la clase padre
        //Solucion: Crear un metodo get en la clase padre para acceder al atributo privado
        System.out.println("Nombre Privado: " + getNombrePrivado());
        System.out.println("Apellido: " + getApellido());
    }

}
