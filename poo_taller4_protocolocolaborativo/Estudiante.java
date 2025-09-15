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
        if (nombre==null || nombre.trim().isEmpty()){
            System.out.println("Nombre no especificado o inválido, se le asignará 'Desconocido'");
            this.nombre = "Desconocido";
        }
        else{
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad){
        if (edad<1){
            System.out.println("Edad no especificada o inválida, se le asignara '1' por defecto");
            this.edad = 1;
        }
        else{
        this.edad = edad;
        }
    }
    public void setNotaPromedio(float notaPromedio){
        if (notaPromedio<0.0f){
            System.out.println("Nota Promedio no especificada o inválida, se le asignará '0.0' por defecto");
            this.notaPromedio = 0.0f;
        }
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
