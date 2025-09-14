package repositorio_mjaller.poo_taller_protocoloindividual;

public class Libro{
    //En los atributos aplico el encapsulamiento poniendolos como privados
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //Este es un contador estatico para llevar la cuenta de los libros creados

    //1. Constructor por defecto
    public Libro() {
        this.titulo = "Cien años de soledad";
        this.autor = "Gabriel García Márquez";
        this.numeroPaginas = 471;
    }

    //2. Constructor parametrizado
    public Libro(String titulo,String autor, int numeroPaginas) {
    
        //Validaciones: Se comprueba si la variable es nula o vacia

        if (titulo==null || titulo.trim().isEmpty()){ //Se comprueba si la variable es nula o vacia
            System.out.println("Título no especificado, se asignará 'Título Desconocido'\n");
            this.titulo="Título Desconocido";
        }
        else {this.titulo = titulo;
        }
        if (autor==null || autor.trim().isEmpty()){
            System.out.println("Autor no especificado, se asignará 'Autor Desconocido'\n");
            this.autor="Autor Desconocido";
        }
        else {this.autor = autor;
        }
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

    @Override
    public String toString() {
        return 
            "Título del Libro: " + getTitulo() + "\n" +
            "Autor: " + getAutor() + "\n" +
            "Número de páginas: " + getNumeroPaginas() + "\n";
    
    }    

}
