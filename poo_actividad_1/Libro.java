package repositorio_mjaller.poo_actividad_1;

public class Libro{
    //En los atributos aplico el encapsulamiento poniendolos como privados
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //1. Constructor por defecto
    public Libro() {
        this.titulo = "Cien años de soledad";
        this.autor = "Gabriel García Márquez";
        this.numeroPaginas = 471;
    }

    //2. Constructor parametrizado
    public Libro(String titulo,String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
}
