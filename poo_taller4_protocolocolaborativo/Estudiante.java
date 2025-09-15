package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class Estudiante {
    private String nombre;
    private int edad;
    private float notaPromedio;

    public Estudiante(String nombre, int edad, float notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public float getNotaPromedio(){
        return this.notaPromedio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNotaPromedio(float notaPromedio){
        this.notaPromedio = notaPromedio;
    }

    public void mostrarNota(){
        System.out.println("""
        
            Datos del Estudiante:

            Nombre: %s
            Edad: %d
            Nota Promedio: %f

            """.formatted(getNombre(),getEdad(),getNotaPromedio()));
    }


}
