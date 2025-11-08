package unidad4_poo.taller_19.ejercicio_3;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generarReporte(String nombreReporte){
        System.out.println("\nReporte " + nombreReporte + ".xlsx generado con éxito");
    }

}
