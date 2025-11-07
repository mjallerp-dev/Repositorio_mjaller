package unidad4_poo.taller_15.ejercicio_1;

public class ReporteFunction {

    public void generarReporte(Libro libro) {
        System.out.println("""
        Reporte del Libro:

        Título: %s
        Autor: %s
        Año de Publicación: %d
        """.formatted(libro.getTitulo(), libro.getAutor(), libro.getañoDePublicacion()));
    }

}
