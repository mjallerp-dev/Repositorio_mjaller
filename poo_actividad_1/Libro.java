package repositorio_mjaller.poo_actividad_1;

public class Libro{
    //En los atributos aplico el encapsulamiento poniendolos como privados
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //Este es un contador estatico para llevar la cuenta de los libros creados
    private static int contadorlibros = 0;

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

    //Metodo set

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    //Metodo get

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    //Metodo para mostrar la informacion del libro

    public void mostrarlibro() {
        System.out.println(
            "Libro Numero: " + contadorlibros + "\n" +
            "Título: " + this.titulo + "\n" +
            "Autor: " + this.autor + "\n" +
            "Número de páginas: " + this.numeroPaginas + "\n"
        );
    }    

    public static void main(String[] args) {
        
        //Creo un objeto libro usando el constructor por defecto

        Libro libro1 = new Libro();
        libro1.mostrarlibro();
    }
}
