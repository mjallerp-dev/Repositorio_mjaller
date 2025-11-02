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

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getañoDePublicacion() {
        return this.añoDePublicacion;
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
    public void setañoDePublicacion(int añoDePublicacion) {
        if (añoDePublicacion < 1) {
            System.out.println("El número de páginas es inválido, se asignará 100 por defecto");
            this.añoDePublicacion = 100;
        } else {this.añoDePublicacion = añoDePublicacion;}
    }
    
}
