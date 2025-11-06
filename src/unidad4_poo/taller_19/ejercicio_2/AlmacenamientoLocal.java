package unidad4_poo.taller_19.ejercicio_2;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo, String carpetaDestino){
        System.out.println("\nArchivo " + nombreArchivo + " guardado en " + carpetaDestino + " de Almacenamiento Local");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo, String carpetaDestino){
        System.out.println("\nArchivo " + nombreArchivo + " restaurado desde " + carpetaDestino + " de Almacenamiento Local");
    }    

}
