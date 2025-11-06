package unidad4_poo.taller_19.ejercicio_3;

public class GestorReportes {
    private final GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte){
        this.generadorReporte = generadorReporte;
    }

    public void generar(String nombreReporte){
        generadorReporte.generarReporte(nombreReporte);
    }

}
