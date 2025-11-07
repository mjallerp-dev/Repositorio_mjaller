package unidad4_poo.taller_15.ejercicio_1;

public class ReporteFunction {

    public void generarReporte(Libro libro) {
        System.out.println("""
        Reporte del Libro:

        Título: %s
        Autor: %s
        Numero de Paginas: %d

        """.formatted(libro.getTitulo(), libro.getAutor(), libro.getNumeroPaginas()));
    }

}
