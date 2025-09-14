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

    //3.Metodos

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
        contadorlibros+=1;
        System.out.println(
            //Uso los metodos get para obtener los valores de los atributos
            "Libro Numero: " + contadorlibros + "\n" +
            "Título: " + getTitulo() + "\n" +
            "Autor: " + getAutor() + "\n" +
            "Número de páginas: " + getNumeroPaginas() + "\n"
        );
    }    

    public static void main(String[] args) {

        //Creo un objeto libro usando el constructor por defecto

        Libro libro1 = new Libro();
        libro1.mostrarlibro();

        //Creo un objeto libro usando el constructor parametrizado
        Libro libro2 = new Libro("Viaje al Centro de la Tierra", "Julio Verne", 360);
        libro2.mostrarlibro();

        //Uso los metodos set para cambiar los atributos del libro2
        
        libro2.setTitulo("La vuelta al mundo en 80 días");
        libro2.setNumeroPaginas(400);
        libro2.mostrarlibro();

    }
}
