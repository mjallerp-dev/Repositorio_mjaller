package unidad4_poo.taller_19.ejercicio_2;

public interface Almacenamiento {

    void guardarArchivo(String nombreArchivo, String carpetaDestino);

    void recuperarArchivo(String nombreArchivo, String carpetaOrigen);

}
