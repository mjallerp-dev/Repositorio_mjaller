package unidad4_poo.taller_19.ejercicio_3;

public class Main {

    public static void main(String[] args) {
        
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorReportes = new GestorReportes(reportePDF);
        gestorReportes.generar("Ventas");

        GeneradorReporte reporteExcel = new ReporteExcel();
        gestorReportes = new GestorReportes(reporteExcel);
        gestorReportes.generar("Inventarios");

            
    }

    
}


