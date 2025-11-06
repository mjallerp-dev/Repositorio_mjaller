package unidad4_poo.taller_19.ejercicio_3;

public class ReportePDF implements GeneradorReporte {

    @Override
    public void generarReporte(String nombreReporte){
        System.out.println("nReporte " + nombreReporte + ".pdf generado con éxito");
    }

}
