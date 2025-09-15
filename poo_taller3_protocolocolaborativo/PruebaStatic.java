package repositorio_mjaller.poo_taller3_protocolocolaborativo;

public class PruebaStatic {
    private static String nombre = "Miguel";
    private static int edad = 26;
    private static String programa = "Ing. de Software";
    static int contador = 0;

    //public PruebaStatic(String nombre, int edad, String programa) {
    //    this.nombre = nombre;
    //    this.edad = edad;
    //    this.programa = programa;
    //}

    //public PruebaStatic(String nombre,int edad, String programa){
    //    this.nombre = nombre;
    //    this.edad = edad;
    //    this.programa = programa;
    //}

    //public String getNombre(){
    //    return this.nombre;
    //}
    //public int getEdad() {
    //    return this.edad;
    //}
    //public String getPrograma(){
    //    return this.programa;
    //}
    
    public static void mostrarDatos() {
        contador++;
        System.out.println("\nDatos del Estudiante " + contador);
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Programa: " + programa);
    }

    public static void main(String[] args) {

        //Estudiante estudiante = new Estudiante("Jose",24,"Ing. Civil");
        //estudiante.mostrarDatos();
        mostrarDatos();
    }
    
    //Error: non-static variable this cannot be referenced from a static context
    //Este error indica que debido a que la variable no es estática no puede ser referenciada en un contexto Estático
    //Los metódos estáticos solo pueden accedér a variables estáticas

    //Solución 1:
    //Para que la variable pueda ser referenciada debemos convertir la variable a Static

    //Solucion 2:
    //El metodo para mostrar las variable que NO son estáticas tampoco debe ser un método de instancia
    

}
