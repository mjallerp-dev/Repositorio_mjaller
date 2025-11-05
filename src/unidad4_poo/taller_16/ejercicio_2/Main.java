package unidad4_poo.taller_16.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        
        Documento excel = new ExportacionExcel("Reporte_Ventas");
        excel.exportar(excel.getFileName());

        Documento pdf = new ExportacionPDF("Manual_Usuario");
        pdf.exportar(pdf.getFileName());

        Documento word = new ExportacionWord("Contrato_Alquiler");
        word.exportar(word.getFileName());
    }

}
