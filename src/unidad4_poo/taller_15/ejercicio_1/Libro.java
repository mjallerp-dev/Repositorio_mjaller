package unidad4_poo.taller_15.ejercicio_1;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
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
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("El título no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.titulo = "Desconocido";
        } else {this.titulo = titulo;}
    }
    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("El autor no puede estar vacío, se asignará 'Desconocido' por defecto");
            this.autor = "Desconocido";
        } else {this.autor = autor;}
    }
    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 0) {
            System.out.println("El número de páginas es inválido, se asignará 1 por defecto");
            this.numeroPaginas = 1;
        } else {this.numeroPaginas = numeroPaginas;}
    }


    public void mostrarInfo(Libro libro) {
        System.out.println("""
        Información del Libro:

        Título: %s
        Autor: %s
        Numero de Paginas: %d

        """.formatted(libro.getTitulo(), libro.getAutor(), libro.getNumeroPaginas()));
    }

}
