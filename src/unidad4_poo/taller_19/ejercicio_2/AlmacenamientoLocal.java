package unidad4_poo.taller_19.ejercicio_2;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void generarReporte(String tipoReporte, String carpetaDestino){
        System.out.println("Reporte en formato " + tipoReporte + " guardado en " + carpetaDestino + " de Almacenamiento Local");
    }

}
