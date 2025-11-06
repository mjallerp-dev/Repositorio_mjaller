package unidad4_poo.taller_19.ejercicio_2;

public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo, String carpetaDestino){
        almacenamiento.guardarArchivo(nombreArchivo, carpetaDestino);
    }

    public void recuperar(String nombreArchivo, String carpetaOrigen){
        almacenamiento.recuperarArchivo(nombreArchivo, carpetaOrigen);
    }
}
