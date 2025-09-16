package repositorio_mjaller.poo_taller_protocoloindividual;

public class Libro{
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Cien años de soledad";
        this.autor = "Gabriel García Márquez";
        this.numeroPaginas = 471;
    }

    public Libro(String titulo,String autor, int numeroPaginas) {
        if (titulo==null || titulo.trim().isEmpty()){ //Se comprueba si la variable es nula o vacia
            System.out.println("Título no especificado, se asignará 'Título Desconocido'\n");
            this.titulo="Título Desconocido";
        }
        else {this.titulo = titulo;
        }
        if (autor==null || autor.trim().isEmpty()){
            System.out.println("Autor no especificado, se asignará 'Autor Desconocido'\n");
            this.autor = "Autor Desconocido";
        }
        else {this.autor = autor;
        }
        if (numeroPaginas<1){
            System.out.println("Numero de paginas no especificado o inválido, se asignará '1' por defecto\n");
            this.numeroPaginas = 1;
        }
        else {this.numeroPaginas = numeroPaginas;
        }
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setTitulo(String titulo) {
        if (titulo==null || titulo.trim().isEmpty()){ //Se comprueba si la variable es nula o vacia
            System.out.println("Título no especificado, se asignará 'Título Desconocido'\n");
            this.titulo="Título Desconocido";
        }
        else {this.titulo = titulo;
        }
    }
    public void setAutor(String autor) {
        if (autor==null || autor.trim().isEmpty()){
            System.out.println("Autor no especificado, se asignará 'Autor Desconocido'\n");
            this.autor = "Autor Desconocido";
        }
        else {this.autor = autor;
        }
    }
    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas<1){
            System.out.println("Numero de paginas no especificado o inválido, se asignará '1' por defecto\n");
            this.numeroPaginas = 1;
        }
        else {this.numeroPaginas = numeroPaginas;
        }
    }

    @Override
    public String toString() {
        return 
            "Título del Libro: " + getTitulo() + "\n" +
            "Autor: " + getAutor() + "\n" +
            "Número de páginas: " + getNumeroPaginas() + "\n";
    
    }    

}
