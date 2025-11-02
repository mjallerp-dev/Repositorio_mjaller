package unidad4_poo.taller_15.ejercicio_1;

public class Libro {
    private String titulo;
    private String autor;
    private int añoDePublicacion;

    public Libro(String titulo, String autor, int añoDePublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
    }

    public void generarReporte() {
        System.out.println("""
        Reporte del Libro:

        Título: %s
        Autor: %s
        Año de Publicación: %d
        """.formatted(this.titulo, this.autor, this.añoDePublicacion));
    }

    public void persistir() {
        System.out.println("El libro " + this.titulo + " ha sido guardado en la base de datos.");
    }

}
