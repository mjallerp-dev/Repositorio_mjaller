package unidad4_poo.taller_19.ejercicio_2;

public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void generar(String tipoReporte, String carpetaDestino){
        almacenamiento.generarReporte(tipoReporte, carpetaDestino);
    }
}
