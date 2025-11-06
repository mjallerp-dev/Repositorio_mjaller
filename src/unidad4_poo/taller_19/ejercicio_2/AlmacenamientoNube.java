package unidad4_poo.taller_19.ejercicio_2;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo, String carpetaOrigen){
        System.out.println("\nArchivo " + nombreArchivo + " guardado en " + carpetaOrigen + " de Almacenamiento en la nube");
    }

    @Override
    public void recuperarArchivo(String nombreArchivo, String carpetaOrigen){
        System.out.println("\nArchivo " + nombreArchivo + " restaurado desde " + carpetaOrigen + " de Almacenamiento en la nube");
    }    

}
