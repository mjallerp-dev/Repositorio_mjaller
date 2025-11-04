package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class Perro {
    private String raza;
    private String color;
    private int edad;

    public Perro(String raza, String color, int edad){
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public void mostrarPerro(){
        System.out.println("""
                
                Datos del perro:
                Raza: %s
                Color: %s
                Edad: %d Años

                """.formatted(raza,color,edad));
    }

    //Si el metodo Main esta dentro de la misma clase no habra error de compilación
    //Se puede acceder a las propiedades aunque estas sean privadas.
}
